public class Translation {
    public int romArab(String args) {
        int arab=0;
        if (args.equalsIgnoreCase("I")) {
            arab = 1;
        }
        if (args.equalsIgnoreCase("II")) {
            arab = 2;
        }
        if (args.equalsIgnoreCase("III")) {
            arab = 3;
        }
        if (args.equalsIgnoreCase("IV")) {
            arab = 4;
        }
        if (args.equalsIgnoreCase("V")) {
            arab = 5;
        }
        if (args.equalsIgnoreCase("VI")) {
            arab = 6;
        }
        if (args.equalsIgnoreCase("VII")) {
            arab = 7;
        }
        if (args.equalsIgnoreCase("VIII")) {
            arab = 8;
        }
        if (args.equalsIgnoreCase("IX")) {
            arab = 9;
        }
        if (args.equalsIgnoreCase("X")) {
            arab = 10;
        }
        return arab;
    }

    public String arabRom10(int arab10) {
        String rom10 = "";
        if (arab10 == 1) {
            rom10 = "I";
        }
        if (arab10 == 2) {
            rom10 = "II";
        }
        if (arab10 == 3) {
            rom10 = "III";
        }
        if (arab10 == 4) {
            rom10 = "IV";
        }
        if (arab10 == 5) {
            rom10 = "V";
        }
        if (arab10 == 6) {
            rom10 = "VI";
        }
        if (arab10 == 7) {
            rom10 = "VII";
        }
        if (arab10 == 8) {
            rom10 = "VIII";
        }
        if (arab10 == 9) {
            rom10 = "IX";
        }
        if (arab10 == 10) {
            rom10 = "X";
        }
        if (arab10 == -1) {
            rom10 = "-I";
        }
        if (arab10 == -2) {
            rom10 = "-II";
        }
        if (arab10 == -3) {
            rom10 = "-III";
        }
        if (arab10 == -4) {
            rom10 = "-IV";
        }
        if (arab10 == -5) {
            rom10 = "-V";
        }
        if (arab10 == -6) {
            rom10 = "-VI";
        }
        if (arab10 == -7) {
            rom10 = "-VII";
        }
        if (arab10 == -8) {
            rom10 = "-VIII";
        }
        if (arab10 == -9) {
            rom10 = "-IX";
        }
        return rom10;
    }

  public String arabRom(int arab) {
      String rom = "";
      if (arab == 100) {
          rom = "C";
      }
      if (arab == 90) {
          rom = "XC";
      }
      if (arab == 80) {
          rom = "LXXX";
      }
      if (arab == 70) {
          rom = "LXX";
      }
      if (arab == 60) {
          rom = "LX";
      }
      if (arab == 50) {
          rom = "L";
      }
      if (arab == 40) {
          rom = "XL";
      }
      if (arab == 30) {
          rom = "XXX";
      }
      if (arab == 20) {
          rom = "XX";
      }
      if (arab == 10) {
          rom = "X";
      }
      return rom;
  }
}

