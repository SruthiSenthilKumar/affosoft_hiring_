from collections import Counter
import string


def word_count(content):
    words = Counter(content.split())
    count = len(words)
    return count
   
   
def main():
    f = open("File.txt", "r")
    contents = f.read()
   
    #Remove punctuations
    contents = contents.translate(str.maketrans('', '', string.punctuation))
   
    #Print the number of unique words
    print(word_count(contents))
   
   
if __name__ == '__main__':
    main()
