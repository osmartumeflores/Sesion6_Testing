package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String result = "";
        int n = string.length();

        for (int i = 0; i < n; i++) {
            // Comparamos el carácter en i con su opuesto al final (n - 1 - i)
            if (string.charAt(i) == string.charAt(n - 1 - i)) {
                result += string.charAt(i);
            } else {
                // En el momento que no coinciden, paramos
                break;
            }
        }
        return result;
    }
}