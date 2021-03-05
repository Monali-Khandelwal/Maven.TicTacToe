package rocks.zipcodewilmington.tictactoe;


/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] game; // create a character array.

    public Board(Character[][] matrix) {
        this.game = matrix;
    }
        public Boolean isInFavorOfX () {
            //Condtions to check if player 1 wins (X) - retrun true
            if (game[0][0] == 'X' && game[0][1] == 'X' && game[0][2] =='X') {
                return true;
            }
            else if (game[1][0] == 'X' && game[1][1] == 'X' && game[1][2] == 'X')
            {
                return true;
            } else if (game[2][0] == 'X' && game[2][1] == 'X' && game[2][2] == 'X')
            {
                return true;
            } else if (game[0][0] == 'X' && game[1][0] == 'X' && game[2][0] == 'X')
            {
                return true;
            } else if (game[0][1] == 'X' && game[1][1] == 'X' && game[2][1] == 'X')
            {
                return true;
            } else if (game[0][2] == 'X' && game[1][2] == 'X' && game[2][2] == 'X')
            {
                return true;
            } else if (game[0][0] == 'X' && game[1][1] == 'X' && game[2][2] == 'X')
            {
                return true;
            } else if (game[2][0] == 'X' && game[1][1] == 'X' && game[0][2] == 'X')
            {
                return true;
            } else
                return false;
        }

        public Boolean isInFavorOfO () {

            //Condtions to check if player 2 wins (Y) - retrun true
            if (game[0][0] == 'O' && game[0][1] == 'O' && game[0][2] == 'O') {
                return true;
            }
            else if (game[1][0] == 'O' && game[1][1] == 'O' && game[1][2] == 'O')
            {
                return true;
            } else if (game[2][0] == 'O' && game[2][1] == 'O' && game[2][2] == 'O')
            {
                return true;
            } else if (game[0][0] == 'O' && game[1][0] == 'O' && game[2][0] == 'O')
            {
                return true;
            } else if (game[0][1] == 'O' && game[1][1] == 'O' && game[2][1] == 'O')
            {
                return true;
            } else if (game[0][2] == 'O' && game[1][2] == 'O' && game[2][2] == 'O')
            {
                return true;
            } else if (game[0][0] == 'O' && game[1][1] == 'O' && game[2][2] == 'O')
            {
                return true;
            } else if (game[2][0] == 'O' && game[1][1] == 'O' && game[0][2] == 'O')
            {
                return true;
            } else
            return false;
        }

        public Boolean isTie () {
        // its a tie if no one wins
            if (isInFavorOfX() == isInFavorOfO())
                return true;
            else
                return false;
        }

        public String getWinner () {
            // retrun X if player 1 wins or retrun O if player 2 wins else retrun space
            if (this.isInFavorOfX()) {
                return "X";
            } else if (this.isInFavorOfO()) {
                return "O";
            } else
                return "";
        }
    }

