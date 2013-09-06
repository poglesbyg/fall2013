removeNonUppercase  :: [Char] -> [Char]
removeNonUppercase  st = [ c | c <- st, c `elem` ['A'..'Z']]

factorial :: Integer -> Integer
factorial n = product [1..n]

factorial' :: (Integral a) => a-> a
factorial' 0 = 1
factorial' n = n * factorial' (n -1)

circumference :: Float -> Float
circumference r = 2 * pi * r

circumference' :: Double -> Double
circumference' r = 2 * pi * r

addThree :: Int -> Int -> Int -> Int
addThree x y z = x + y + z

lucky :: (Integral a) => a-> String
lucky 7 = "Lucky Number Seven"
lucky x = "SOL"

sayMe :: (Integral a) => a-> String
sayMe 1 = "one"
sayMe 2 = "two"
sayMe 3 = "three"
sayMe 4 = "four"
sayMe 5 = "five"
sayMe x = "not between 1 and 5"

charName :: Char -> String
charName 'p' = "Paul"
charName 'i' = "Ingrid"
