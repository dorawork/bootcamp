## Getting Started

9 type array


    // Searching
    char[] characters = new char[] {'a', 'b', 'e', '!'};
    // check if the array contains char '!' -> true/ false
    boolean result = false;

    
    // break
    for (int i = 0; i < characters.length; i++) {
      if (characters[i] == '!') {
        result = true;
        break;
      }
    }
    System.out.println(result);
