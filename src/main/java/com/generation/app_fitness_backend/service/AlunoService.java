package com.generation.app_fitness_backend.service;

import org.springframework.stereotype.Service;

import com.generation.app_fitness_backend.model.Aluno;
import com.generation.app_fitness_backend.model.AlunoIMC;

@Service
public class AlunoService {
    public AlunoIMC calculaImcAluno(Aluno aluno){
        double imc = calcularIMC(aluno.getPeso(), aluno.getAltura());
        String classificacao = classificarIMC(imc);

        AlunoIMC alunoImc = new AlunoIMC();
        alunoImc.setId(aluno.getId());
        alunoImc.setNome(aluno.getNome());
        alunoImc.setEndereco(aluno.getEndereco());
        alunoImc.setTelefone(aluno.getTelefone());
        alunoImc.setDataMatricula(aluno.getDataMatricula());
        alunoImc.setPeso(aluno.getPeso());
        alunoImc.setAltura(aluno.getAltura());
        alunoImc.setImc(imc);
        alunoImc.setClassificacaoImc(classificacao);

        return alunoImc;
    }

    public double calcularIMC(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        return peso / (altura * altura);
    }

    public String classificarIMC(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25) return "Peso normal";
        else if (imc < 30) return "Sobrepeso";
        else if (imc < 35) return "Obesidade grau I";
        else if (imc < 40) return "Obesidade grau II";
        else return "Obesidade grau III (mórbida)";
    }
}
