package cha07_exercise;

interface Edible {
	void eat();
}

interface Sweetable {
	void sweet();
}

interface Delicious extends Edible, Sweetable {
	// �������̽� ���
}
