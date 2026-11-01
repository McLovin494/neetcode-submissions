class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        for el in tokens:
            if el not in ["+", "-", "/", "*"]:
                stack.append(int(el))
            else:
                first = stack.pop()
                second = stack.pop()

                match el:
                    case "+":
                        res = second + first
                    case "-":
                        res = second - first
                    case "*":
                        res = second * first
                    case "/":
                        res = abs(second) // abs(first)
                        if (second < 0) != (first < 0):
                            res = -res

                stack.append(res)

        return stack.pop()