package Testing;

import java.util.Arrays;

public class Chess {

    int[] int_coordinates_king = {8, 8};
    int[] int_coordinates_eleph = {1, 1};
    int[] int_coordinates_rook = {1, 4};
//    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long start = System.nanoTime();
        Chess chess = new Chess();
        chess.start();
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println(elapsed);
    }

//    void getKingPosition() {
//        System.out.println("Введите координаты Короля через пробел ");
//        String str_coordinates_king = sc.nextLine();
//        int_coordinates_king = Arrays.stream(str_coordinates_king.split(" ")).mapToInt(Integer::parseInt).toArray();
//        if (str_coordinates_king.length() > 3) {
//            System.out.println("Нельзя вводить более 3 символов\nПопробуйте снова");
//            getKingPosition();
//        }
//    }
//
//    void getElephPosition() {
//        System.out.println("Введите координаты Слона через пробел ");
//        String str_coordinates_eleph = sc.nextLine();
//        int_coordinates_eleph = Arrays.stream(str_coordinates_eleph.split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        if (str_coordinates_eleph.length() > 3) {
//            System.out.println("Нельзя вводить более 3 символов\nПопробуйте снова");
//            getElephPosition();
//        }
//    }
//
//    void getRookPosition() {
//        System.out.println("Введите координаты Ладьи через пробел ");
//        String str_coordinates_rook = sc.nextLine();
//        int_coordinates_rook = Arrays.stream(str_coordinates_rook.split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        if (str_coordinates_rook.length() > 3) {
//            System.out.println("Нельзя вводить более 3 символов\nПопробуйте снова");
//            getElephPosition();
//        }
//    }

    void checkPosition(int[] first, int[] second) {
        if (Arrays.equals(first, second)) {
            System.out.println("Фигуры не могут стоять на одной позиции");
            start();
        }
    }

    void shah(int[] first, int[] second, int[] third) {
        if (first[1] == second[1]) {
            if (first[0] < third[0] && second[0] > third[0]) {
                System.out.println("Слон перекрывает атаку Ладьи\nКороль в безопасности");
            } else if (first[0] > third[0] && second[0] > third[0]) {
                System.out.println("Королю шах от Ладьи снизу доски");
            } else if (first[0] < third[0] && second[0] < third[0]) {
                System.out.println("Королю шах от Ладьи сверху доски");
            } else if (first[0] > third[0] && second[0] < third[0]) {
                System.out.println("Слон перекрывает атаку Ладьи\nКороль в безопасности");
            }
        } else if (first[0] == second[0]) {
            if (first[1] < third[1] && second[1] > third[1]) {
                System.out.println("Слон перекрывает атаку Ладьи\nКороль в безопасности");
            } else if (first[1] > third[1] && second[1] > third[1]) {
                System.out.println("Королю шах от Ладьи слева доски");
            } else if (first[1] < third[1] && second[1] < third[1]) {
                System.out.println("Королю шах от Ладьи справа доски");
            } else if (first[1] > third[1] && second[1] < third[1]) {
                System.out.println("Слон перекрывает атаку Ладьи\nКороль в безопасности");
            }
        } else if (Math.abs(first[0] - third[1]) == Math.abs(third[0] - first[1])) {
//            first[0] == first[1] && third[0] == third[1]
            if (first[0] > third[0] && first[1] > third[1]) {

                for (int i = 0; i < 8; i++) {
                    third[0]++;
                    third[1]++;
                    if (second[0] == third[0] && second[1] == third[1]) {
                        System.out.println("Ладья перекрывает атаку Слона\nКороль в безопастности");
                        break;
                    } else if (third[0] == first[0] && third[1] == first[1]) {
                        System.out.println("Королю шах от Слона!");
                        break;
                    }
                }

            } else if (first[0] < third[0] && first[1] > third[1]) {
                for (int i = 0; i < 8; i++) {
                    third[0]--;
                    third[1]++;
                    if (second[0] == third[0] && second[1] == third[1]) {
                        System.out.println("Ладья перекрывает атаку Слона\nКороль в безопастности");
                        break;
                    } else if (third[0] == first[0] && third[1] == first[1]) {
                        System.out.println("Королю шах от Слона!");
                        break;
                    }
                }
            } else if (first[0] > third[0] && first[1] < third[1]) {

                for (int i = 0; i < 8; i++) {
                    third[0]++;
                    third[1]--;
                    if (second[0] == third[0] && second[1] == third[1]) {
                        System.out.println("Ладья перекрывает атаку Слона\nКороль в безопастности");
                        break;
                    } else if (third[0] == first[0] && third[1] == first[1]) {
                        System.out.println("Королю шах от Слона!");
                        break;
                    }
                }
            } else if (first[0] < third[0] && first[1] < third[1]) {

                for (int i = 0; i < 8; i++) {
                    third[0]--;
                    third[1]--;
                    if (second[0] == third[0] && second[1] == third[1]) {
                        System.out.println("Ладья перекрывает атаку Слона\nКороль в безопастности");
                        break;
                    } else if (third[0] == first[0] && third[1] == first[1]) {
                        System.out.println("Королю шах от Слона!");
                        break;
                    }
                }
            }
        }
    }


    void start() {
//        getKingPosition();
//        getRookPosition();
//        checkPosition(int_coordinates_king, int_coordinates_rook);
//        getElephPosition();
//        checkPosition(int_coordinates_king, int_coordinates_eleph);
//        checkPosition(int_coordinates_eleph, int_coordinates_rook);
//        sc.close();
        shah(int_coordinates_king, int_coordinates_rook, int_coordinates_eleph);

    }
}
