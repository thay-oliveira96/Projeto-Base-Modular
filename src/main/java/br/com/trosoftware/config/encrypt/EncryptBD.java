package br.com.trosoftware.config.encrypt;

import org.jasypt.util.text.BasicTextEncryptor;

public class EncryptBD {

	public static void main(String[] args) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("#Asdfg1231"); // Substitua por sua chave secreta
        String encryptedText = textEncryptor.encrypt("asdf1231"); // Substitua pela sua senha
        System.out.println("Senha Criptografada: ENC(" + encryptedText + ")");
	}

}
