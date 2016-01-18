/*
	Test file with error: Nested method
*/

class E1 {
	void print1(string message) {
		void print(string message) {

		}
	}
}