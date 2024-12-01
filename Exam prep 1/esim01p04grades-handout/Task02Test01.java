// Do not modify this file!

class Task02Test01 {
    public static void main(String[] args) {
        var examGrades = new String[][] { {"s123456", "12"},
                                          {"s654321", "10"},
                                          {"s357732", "7"},
                                          {"s368373", "4"},
                                          {"s368333", "02"},
                                          {"s318373", "00"},
                                          {"s168551", "-3"},
                                          {"s168553", ""},
                                          {"s368673", "11"},
                                          {"s368333", "1a"},
                                          {"s123456", "b"},
                                          {"s357732", "536"},
                                          {"s168z55", null}   };

        TestUtils.tryCreateExamGrades(examGrades);
    }
}
