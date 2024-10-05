class Utils {
    static int count(String s, String[] strings) {
        int i = 0;
        for (String string: strings) {
            if (string.toLowerCase().equals(s.toLowerCase())) {i++;}
        }
        return i;
    }
}
