import java.util.*;

public class Main {
    public static void main(String[] args) {
        String camel = """
                Switching on the camera in the camel habitat...
                 ___.-''''-.
                /___  @    |
                ',,,,.     |         _.'''''''._
                     '     |        /           \\
                     |     \\    _.-'             \\
                     |      '.-'                  '-.
                     |                               ',
                     |                                '',
                      ',,-,                           ':;
                           ',,| ;,,                 ,' ;;
                              ! ; !'',,,',',,,,'!  ;   ;:
                             : ;  ! !       ! ! ;  ;   :;
                             ; ;   ! !      ! !  ; ;   ;,
                            ; ;    ! !     ! !   ; ;
                            ; ;    ! !    ! !     ; ;
                           ;,,      !,!   !,!     ;,;
                           /_I      L_I   L_I     /_I
                Look at that! Our little camel is sunbathing!""";

        String lion = """
                Switching on the camera in the lion habitat...
                                                               ,w.
                                                             ,YWMMw  ,M  ,
                                        _.---.._   __..---._.'MMMMMw,wMWmW,
                                   _.-""        '''           YP"WMMMMMMMMMb,
                                .-' __.'                   .'     MMMMW^WMMMM;
                    _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
                 ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\\
                ,MM:.    .'.-'   .'     ;     `\\    ;     `,     MMMMMMMW `"=./`-,
                WMMm__,-'.'     /      _.\\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
                "^MP__.-'    ,-' _.--""   `-,   ;       \\  ; ;MMMMMMMMMMW^``; __|
                           /   .'            ; ;         )  )`{  \\ `"^W^`,   \\  :
                          /  .'             /  (       .'  /     Ww._     `.  `"
                         /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
                        (--, )                `,_ / `) \\/"")      ^"      `-, -;"\\:
                The lion is roaring!""";

        String deer = """
                Switching on the camera in the deer habitat...
                   /|       |\\
                `__\\       //__'
                   ||      ||
                 \\__`\\     |'__/
                   `_\\   //_'
                   _.,:---;,._
                   \\_:     :_/
                     |@. .@|
                     |     |
                     ,\\.-./ \\
                     ;;`-'   `---__________-----.-.
                     ;;;                         \\_\\
                     ';;;                         |
                      ;    |                      ;
                       \\   \\     \\        |      /
                        \\_, \\    /        \\     |\\
                          |';|  |,,,,,,,,/ \\    \\ \\_
                          |  |  |           \\   /   |
                          \\  \\  |           |  / \\  |
                           | || |           | |   | |
                           | || |           | |   | |
                           | || |           | |   | |
                           |_||_|           |_|   |_|
                          /_//_/           /_/   /_/
                Our 'Bambi' looks hungry. Let's go to feed it!""";

        String goose = """
                Switching on the camera in the goose habitat...
                            
                                                    _
                                                ,-"" "".
                                              ,'  ____  `.
                                            ,'  ,'    `.  `._
                   (`.         _..--.._   ,'  ,'        \\    \\
                  (`-.\\    .-""        ""'   /          (  d _b
                 (`._  `-"" ,._             (            `-(   \\
                 <_  `     (  <`<            \\              `-._\\
                  <`-       (__< <           :
                   (__        (_<_<          ;
                    `------------------------------------------
                The goose is staring intently at you... Maybe it's time to change the channel?""";

        String bat = """
                Switching on the camera in the bat habitat...
                _________________               _________________
                 ~-.              \\  |\\___/|  /              .-~
                     ~-.           \\ / o o \\ /           .-~
                        >           \\  W  //           <
                       /             /~---~\\             \\
                      /_            |       |            _\\
                         ~-.        |       |        .-~
                            ;        \\     /        i
                           /___      /\\   /\\      ___\\
                                ~-. /  \\_/  \\ .-~
                                   V         V
                This bat looks like it's doing fine.""";

        String rabbit = """
                Switching on the camera in the rabbit habitat...
                         ,
                        /|      __
                       / |   ,-~ /
                      Y :|  //  /
                      | jj /( .^
                      >-"~"-v"
                     /       Y
                    jo  o    |
                   ( ~T~     j
                    >._-' _./
                   /   "~"  |
                  Y     _,  |
                 /| ;-"~ _  l
                / l/ ,-"~    \\
                \\//\\/      .- \\
                 Y        /    Y
                 l       I     !
                 ]\\      _\\    /"\\
                (" ~----( ~   Y.  )
                It looks like we will soon have more rabbits!""";

        String[] animals = {camel, lion, deer, goose, bat, rabbit};

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Please enter the number of the habitat you would like to view:");
                String input = sc.next();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                try {
                    int num = Integer.parseInt(input);

                    if (num >= 0 && num <= 5) {
                        System.out.println(animals[num]);
                    } else {
                        System.out.println("Enter a number from 0 to 4 or 'exit' to quit.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number or 'exit' to quit.");
                }
            }
        }

        System.out.println("See you later!");
    }
}