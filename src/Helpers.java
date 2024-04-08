public class Helpers {
    public String cleanCPForCNPJ(String data) {
        return data.replaceAll("[^0-9]", "");

    }

    public boolean cpfOrCnpj(String data) {
        return data.length() == 11 ? true : false;
    }

    public boolean validateCNPJOrCPFBoolean(String data) {
        // remove todos os caractreres nãu numericos
        String onlyNumberData = cleanCPForCNPJ(data);

        if (onlyNumberData.length() == 11) {
            if (validarCPF(onlyNumberData)) {
                return false;
            } else {
                return true;
            }
        } else if (onlyNumberData.length() == 14) {
            if (validarCNPJ(onlyNumberData)) {
                return false;
            } else {
                return true;
            }
        } else {
            System.out.println("Documento inválido.");
            return true;
        }
    }

    public boolean validarCPF(String cpf) {
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (cpf.charAt(i) - '0') * (10 - i);
        }
        int remainder = sum % 11;
        int digit1 = (remainder < 2) ? 0 : (11 - remainder);
        if ((cpf.charAt(9) - '0') != digit1) {
            return false;
        }

        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (cpf.charAt(i) - '0') * (11 - i);
        }
        remainder = sum % 11;
        int digit2 = (remainder < 2) ? 0 : (11 - remainder);
        if ((cpf.charAt(10) - '0') != digit2) {
            return false;
        }

        return true;
    }

    public static boolean validarCNPJ(String cnpj) {
        if (cnpj.matches("(\\d)\\1{13}")) {
            return false;
        }

        int sum = 0;
        int weight = 5;
        for (int i = 0; i < 12; i++) {
            sum += (cnpj.charAt(i) - '0') * weight;
            weight = (weight == 2) ? 9 : (weight - 1);
        }
        int remainder = sum % 11;
        int digit1 = (remainder < 2) ? 0 : (11 - remainder);
        if ((cnpj.charAt(12) - '0') != digit1) {
            return false;
        }

        sum = 0;
        weight = 6;
        for (int i = 0; i < 13; i++) {
            sum += (cnpj.charAt(i) - '0') * weight;
            weight = (weight == 2) ? 9 : (weight - 1);
        }
        remainder = sum % 11;
        int digit2 = (remainder < 2) ? 0 : (11 - remainder);
        if ((cnpj.charAt(13) - '0') != digit2) {
            return false;
        }

        return true;
    }
}
