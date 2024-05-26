package com.bichinhos.arraylistpractice;


import com.bichinhos.arraylistpractice.entity.Pessoa;
import java.util.ArrayList;

class ArrayListMain {

	public static void main(String[] args) {
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();

		Pessoa eduardo = new Pessoa("Eduardo", 18, 1.70, 70.00);
		listaPessoas.add(eduardo);
		Pessoa maria = new Pessoa("Maria", 20, 1.60, 50.00);
		listaPessoas.add(maria);
		Pessoa gustavo = new Pessoa("Gustavo", 18, 1.70, 70.00);
		listaPessoas.add(gustavo);

		System.out.println("O tamanho da lista é " + listaPessoas.size());

		System.out.println("----------------------------");

		System.out.println("A primeira pessoa da lista é " + listaPessoas.get(0));

		System.out.println("----------------------------");

		for (Pessoa listaPessoa:listaPessoas) {
			System.out.println(listaPessoa);
		}
	}

}
