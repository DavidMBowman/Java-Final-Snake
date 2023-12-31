package src.gui;

import src.logic.GameLoop;
import src.logic.Grid;
import src.logic.Snake;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    // The window's height and width
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    private GameLoop loop;
    private Grid grid;
    private GraphicsContext context;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        context = canvas.getGraphicsContext2D();

        canvas.setFocusTraversable(true);
        canvas.setOnKeyPressed(e -> {
            Snake snake = grid.getSnake();
            if (loop.isKeyPressed()) {
                return;
            }
            switch (e.getCode()) {
                case UP:
                    snake.setUp();
                    break;
                case DOWN:
                    snake.setDown();
                    break;
                case LEFT:
                    snake.setLeft();
                    break;
                case RIGHT:
                    snake.setRight();
                    break;
                case ENTER:
                    if (loop.isPaused()) {
                        reset();
                        (new Thread(loop)).start();
                    }
                case A:
                    break;
                case ACCEPT:
                    break;
                case ADD:
                    break;
                case AGAIN:
                    break;
                case ALL_CANDIDATES:
                    break;
                case ALPHANUMERIC:
                    break;
                case ALT:
                    break;
                case ALT_GRAPH:
                    break;
                case AMPERSAND:
                    break;
                case ASTERISK:
                    break;
                case AT:
                    break;
                case B:
                    break;
                case BACK_QUOTE:
                    break;
                case BACK_SLASH:
                    break;
                case BACK_SPACE:
                    break;
                case BEGIN:
                    break;
                case BRACELEFT:
                    break;
                case BRACERIGHT:
                    break;
                case C:
                    break;
                case CANCEL:
                    break;
                case CAPS:
                    break;
                case CHANNEL_DOWN:
                    break;
                case CHANNEL_UP:
                    break;
                case CIRCUMFLEX:
                    break;
                case CLEAR:
                    break;
                case CLOSE_BRACKET:
                    break;
                case CODE_INPUT:
                    break;
                case COLON:
                    break;
                case COLORED_KEY_0:
                    break;
                case COLORED_KEY_1:
                    break;
                case COLORED_KEY_2:
                    break;
                case COLORED_KEY_3:
                    break;
                case COMMA:
                    break;
                case COMMAND:
                    break;
                case COMPOSE:
                    break;
                case CONTEXT_MENU:
                    break;
                case CONTROL:
                    break;
                case CONVERT:
                    break;
                case COPY:
                    break;
                case CUT:
                    break;
                case D:
                    break;
                case DEAD_ABOVEDOT:
                    break;
                case DEAD_ABOVERING:
                    break;
                case DEAD_ACUTE:
                    break;
                case DEAD_BREVE:
                    break;
                case DEAD_CARON:
                    break;
                case DEAD_CEDILLA:
                    break;
                case DEAD_CIRCUMFLEX:
                    break;
                case DEAD_DIAERESIS:
                    break;
                case DEAD_DOUBLEACUTE:
                    break;
                case DEAD_GRAVE:
                    break;
                case DEAD_IOTA:
                    break;
                case DEAD_MACRON:
                    break;
                case DEAD_OGONEK:
                    break;
                case DEAD_SEMIVOICED_SOUND:
                    break;
                case DEAD_TILDE:
                    break;
                case DEAD_VOICED_SOUND:
                    break;
                case DECIMAL:
                    break;
                case DELETE:
                    break;
                case DIGIT0:
                    break;
                case DIGIT1:
                    break;
                case DIGIT2:
                    break;
                case DIGIT3:
                    break;
                case DIGIT4:
                    break;
                case DIGIT5:
                    break;
                case DIGIT6:
                    break;
                case DIGIT7:
                    break;
                case DIGIT8:
                    break;
                case DIGIT9:
                    break;
                case DIVIDE:
                    break;
                case DOLLAR:
                    break;
                case E:
                    break;
                case EJECT_TOGGLE:
                    break;
                case END:
                    break;
                case EQUALS:
                    break;
                case ESCAPE:
                    break;
                case EURO_SIGN:
                    break;
                case EXCLAMATION_MARK:
                    break;
                case F:
                    break;
                case F1:
                    break;
                case F10:
                    break;
                case F11:
                    break;
                case F12:
                    break;
                case F13:
                    break;
                case F14:
                    break;
                case F15:
                    break;
                case F16:
                    break;
                case F17:
                    break;
                case F18:
                    break;
                case F19:
                    break;
                case F2:
                    break;
                case F20:
                    break;
                case F21:
                    break;
                case F22:
                    break;
                case F23:
                    break;
                case F24:
                    break;
                case F3:
                    break;
                case F4:
                    break;
                case F5:
                    break;
                case F6:
                    break;
                case F7:
                    break;
                case F8:
                    break;
                case F9:
                    break;
                case FAST_FWD:
                    break;
                case FINAL:
                    break;
                case FIND:
                    break;
                case FULL_WIDTH:
                    break;
                case G:
                    break;
                case GAME_A:
                    break;
                case GAME_B:
                    break;
                case GAME_C:
                    break;
                case GAME_D:
                    break;
                case GREATER:
                    break;
                case H:
                    break;
                case HALF_WIDTH:
                    break;
                case HELP:
                    break;
                case HIRAGANA:
                    break;
                case HOME:
                    break;
                case I:
                    break;
                case INFO:
                    break;
                case INPUT_METHOD_ON_OFF:
                    break;
                case INSERT:
                    break;
                case INVERTED_EXCLAMATION_MARK:
                    break;
                case J:
                    break;
                case JAPANESE_HIRAGANA:
                    break;
                case JAPANESE_KATAKANA:
                    break;
                case JAPANESE_ROMAN:
                    break;
                case K:
                    break;
                case KANA:
                    break;
                case KANA_LOCK:
                    break;
                case KANJI:
                    break;
                case KATAKANA:
                    break;
                case KP_DOWN:
                    break;
                case KP_LEFT:
                    break;
                case KP_RIGHT:
                    break;
                case KP_UP:
                    break;
                case L:
                    break;
                case LEFT_PARENTHESIS:
                    break;
                case LESS:
                    break;
                case M:
                    break;
                case META:
                    break;
                case MINUS:
                    break;
                case MODECHANGE:
                    break;
                case MULTIPLY:
                    break;
                case MUTE:
                    break;
                case N:
                    break;
                case NONCONVERT:
                    break;
                case NUMBER_SIGN:
                    break;
                case NUMPAD0:
                    break;
                case NUMPAD1:
                    break;
                case NUMPAD2:
                    break;
                case NUMPAD3:
                    break;
                case NUMPAD4:
                    break;
                case NUMPAD5:
                    break;
                case NUMPAD6:
                    break;
                case NUMPAD7:
                    break;
                case NUMPAD8:
                    break;
                case NUMPAD9:
                    break;
                case NUM_LOCK:
                    break;
                case O:
                    break;
                case OPEN_BRACKET:
                    break;
                case P:
                    break;
                case PAGE_DOWN:
                    break;
                case PAGE_UP:
                    break;
                case PASTE:
                    break;
                case PAUSE:
                    break;
                case PERIOD:
                    break;
                case PLAY:
                    break;
                case PLUS:
                    break;
                case POUND:
                    break;
                case POWER:
                    break;
                case PREVIOUS_CANDIDATE:
                    break;
                case PRINTSCREEN:
                    break;
                case PROPS:
                    break;
                case Q:
                    break;
                case QUOTE:
                    break;
                case QUOTEDBL:
                    break;
                case R:
                    break;
                case RECORD:
                    break;
                case REWIND:
                    break;
                case RIGHT_PARENTHESIS:
                    break;
                case ROMAN_CHARACTERS:
                    break;
                case S:
                    break;
                case SCROLL_LOCK:
                    break;
                case SEMICOLON:
                    break;
                case SEPARATOR:
                    break;
                case SHIFT:
                    break;
                case SHORTCUT:
                    break;
                case SLASH:
                    break;
                case SOFTKEY_0:
                    break;
                case SOFTKEY_1:
                    break;
                case SOFTKEY_2:
                    break;
                case SOFTKEY_3:
                    break;
                case SOFTKEY_4:
                    break;
                case SOFTKEY_5:
                    break;
                case SOFTKEY_6:
                    break;
                case SOFTKEY_7:
                    break;
                case SOFTKEY_8:
                    break;
                case SOFTKEY_9:
                    break;
                case SPACE:
                    break;
                case STAR:
                    break;
                case STOP:
                    break;
                case SUBTRACT:
                    break;
                case T:
                    break;
                case TAB:
                    break;
                case TRACK_NEXT:
                    break;
                case TRACK_PREV:
                    break;
                case U:
                    break;
                case UNDEFINED:
                    break;
                case UNDERSCORE:
                    break;
                case UNDO:
                    break;
                case V:
                    break;
                case VOLUME_DOWN:
                    break;
                case VOLUME_UP:
                    break;
                case W:
                    break;
                case WINDOWS:
                    break;
                case X:
                    break;
                case Y:
                    break;
                case Z:
                    break;
                default:
                    break;
            }
        });

        reset();

        root.getChildren().add(canvas);

        Scene scene = new Scene(root);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Snake");
        primaryStage.setOnCloseRequest(e -> System.exit(0));
        primaryStage.setScene(scene);
        primaryStage.show();

        (new Thread(loop)).start();
    }

    private void reset() {
        grid = new Grid(WIDTH, HEIGHT);
        loop = new GameLoop(grid, context);
        Painter.paint(grid, context);
    }
}