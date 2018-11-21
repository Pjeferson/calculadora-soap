var soap = require('soap');

class Calculadora {
    constructor(cliente){
        this.cliente = cliente;        
    }

    chamar(operacao, args, callback) {
        switch (operacao) {
            case 'somar':
                this.cliente.somar(args, callback);
                break;
            case 'subtrair':
                this.cliente.subtrair(args, callback);
                break;
            case 'multiplicar':
                this.cliente.multiplicar(args, callback);
                break;
            case 'dividir':
                this.cliente.dividir(args, callback);
                break;
        }
    }
}

let url = 'http://localhost:8080/Calculadora/Calculadora?WSDL';
let op = process.argv[2];
let args = {num1:process.argv[3], num2:process.argv[4]};

soap.createClient(url, (err, cliente) => {
    if(err) {
        console.log(err);
        return;
    }


    calculadora = new Calculadora(cliente);
    calculadora.chamar(op, args, (err,result) => {
        if(!err) console.log(result.return);
        else console.log(err);
        
    })
        
});



