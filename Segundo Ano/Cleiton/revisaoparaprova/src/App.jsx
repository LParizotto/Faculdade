// Importa o hook useState do React — ele permite criar e gerenciar estados dentro de componentes funcionais.
import {useEffect ,useState } from "react";
import "./App.css";

function App() {

  // Cria um estado para armazenar a descrição digitada no input.
  // 'descricao' é o valor atual, 'setDescricao' é a função usada para atualizar esse valor.
  const [descricao, setDescricao] = useState("");

  // Estado para armazenar a quantidade digitada.
  // Começa vazio (undefined) — será transformada em número mais à frente.
  const [quantidade, setQuantidade] = useState();

  // Estado para armazenar o valor unitário digitado.
  const [valorUnitario, setValorUnitario] = useState();

  // Estado que guarda a lista de itens já adicionados ao orçamento.
  // Começa como um array vazio.
  const [itens, setItens] = useState([]);

  // Calcula o total geral somando os "totais" de cada item da lista.
  // O método reduce percorre o array de itens e acumula a soma.
  // contador = valor acumulado, item = cada objeto do array
  const totalGeral = itens.reduce((contador, item) => contador + item.total, 0);

  
    useEffect(() => {
    localStorage.setItem("LISTA", JSON.stringify(itens));
  });

  useEffect(() => {
    localStorage.setItem("LISTA", JSON.stringify(itens));
  }, [itens]);

  // Função chamada quando o usuário clica no botão "+"
  // Serve para adicionar um novo item à lista de orçamento.
  const adicionarItem = () => {

    // Verifica se a descrição está vazia ou só com espaços.
    // Se estiver, a função retorna (sai) e não adiciona nada.
    if (descricao.trim() == "") {
      return;
    }

    

    // Cria um novo objeto representando um item.
    const novoItem = {
      // Cria um ID único usando a data/hora atual em milissegundos.
      id: Date.now(),
      // Armazena a descrição que foi digitada.
      descricao,
      // Converte quantidade de string para número, para poder fazer cálculos.
      quantidade: Number(quantidade),
      // Converte valor unitário para número também.
      valorUnitario: Number(valorUnitario),
      // Calcula o total do item multiplicando quantidade x valor unitário.
      total: Number(quantidade) * Number(valorUnitario),
    };

    // Atualiza o estado 'itens' com uma nova lista que contém:
    // ...todos os itens anteriores + o novo item no final.
    // O uso do spread operator "..." copia os itens antigos.
    setItens([...itens, novoItem]);

        localStorage.setItem("LISTA", JSON.stringify(itens));

  };

  // Função para excluir um item específico da lista.
  // Recebe o ID do item a ser removido.
  const excluirItem = (id) => {
    // Usa filter para criar um novo array, removendo o item com o ID informado.
    setItens(itens.filter((item) => item.id !== id));

        localStorage.setItem("LISTA", JSON.stringify(itens));

  };

  return (
    <>
      <div className="orcamento-container">
        <div className="titulo-orcamento">
          <h2>Orçamento</h2>
        </div>

        {/* Linha com os campos de preenchimento: descrição, quantidade, valor unitário e botão de adicionar */}
        <div className="linha-preencher">
          {/* Input de texto para descrição */}
          <input
            type="text"
            placeholder="Descrição" // Texto de dica que aparece quando o input está vazio
            value={descricao} // Valor do input vem do estado 'descricao'
            onChange={(e) => setDescricao(e.target.value)} // Atualiza o estado toda vez que o usuário digita algo
          />

          {/* Input numérico para quantidade */}
          <input
            type="number"
            placeholder="Quantidade"
            value={quantidade}
            onChange={(e) => setQuantidade(e.target.value)}
          />

          {/* Input numérico para valor unitário */}
          <input
            type="number"
            placeholder="Valor Unitário"
            value={valorUnitario}
            onChange={(e) => setValorUnitario(e.target.value)}
          />

          {/* Botão para adicionar um novo item à tabela */}
          <button className="button-adicionar" onClick={adicionarItem}>
            +
          </button>
        </div>

        {/* Tabela de exibição dos itens adicionados */}
        <div className="tabela">

          {/* Cabeçalho da tabela */}
          <div className="tabela-informacoes tabela-cabecalho">
            <div className="col descricao">Descrição</div>
            <div className="col quantidade">Qntd</div>
            <div className="col valoruni">Valor Uni.</div>
            <div className="col total">Total</div>
            <div className="col acoes">Ações</div>
          </div>

          {/* Percorre o array de itens e renderiza uma linha para cada um */}
          {itens.map((item) => (
            // Cada elemento precisa de uma 'key' única — usamos o ID gerado com Date.now()
            <div key={item.id} className="tabela-informacoes">
              {/* Coluna da descrição */}
              <div className="col descricao">{item.descricao}</div>

              {/* Coluna da quantidade */}
              <div className="col quantidade">{item.quantidade}</div>

              {/* Coluna do valor unitário */}
              <div className="col valoruni">{item.valorUnitario}</div>

              {/* Coluna do total formatado com 2 casas decimais */}
              <div className="col total">{item.total.toFixed(2)}</div>

              {/* Coluna com botão para remover o item */}
              <div className="col acoes">
                <button
                  className="botao-remover"
                  onClick={() => excluirItem(item.id)} // Chama a função passando o ID do item
                >
                  X
                </button>
              </div>
            </div>
          ))}
        </div>

        {/* Exibe a soma de todos os itens adicionados */}
        <div className="total-geral">
          Total Geral: R$ {totalGeral.toFixed(2)}
        </div>
      </div>
    </>
  );
}

// Exporta o componente App para que ele possa ser usado em index.js (ponto de entrada da aplicação).
export default App;
