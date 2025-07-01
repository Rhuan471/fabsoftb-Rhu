export class medicamento {
    nome: String;
    principioAtivo: String;
    codigoBarras: String;
    preco: number;
    quantidade: number;
    validade: Date;
}
export class Medicamento extends medicamento {
    id: number;
    fabricante: String;
    categoria: String;
    descricao: String;
    imagemUrl: String;

    constructor() {
        super();
        this.id = 0;
        this.nome = '';
        this.principioAtivo = '';
        this.codigoBarras = '';
        this.preco = 0;
        this.quantidade = 0;
        this.validade = new Date();
        this.fabricante = '';
        this.categoria = '';
        this.descricao = '';
        this.imagemUrl = '';
    }
}