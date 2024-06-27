PINK = "\033[95m"
CYAN = "\033[96m"
YELLOW = "\033[93m"
GREEN = "\033[92m"
RESET_COLOR = "\033[0m"


def print_colored(text, color):
    print(color + text + RESET_COLOR)


def print_pink(text):
    print_colored(text, PINK)


def print_cyan(text):
    print_colored(text, CYAN)


def print_yellow(text):
    print_colored(text, YELLOW)


def print_green(text):
    print_colored(text, GREEN)
