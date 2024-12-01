// Do not modify this file!

class Task01Test01 {
    public static void main(String[] args) {
        var examGrades = new String[][] { {"s123456", "12"},
                                          {"s654321", "10"},
                                          {"s357732", "7"},
                                          {"s368373", "4"},
                                          {"s4683337", "02"},
                                          {"s318373", "00"},
                                          {"s552373", "-3"},
                                          {"s16855", "12"},
                                          {"f343686", "10"},
                                          {"16855", "12"},
                                          {"", "10"},
                                          {null, "-3"},
                                          {"s16 855", "12"},
                                          {"s168z55", "12"}  };

        TestUtils.tryCreateExamGrades(examGrades);
    }
}
