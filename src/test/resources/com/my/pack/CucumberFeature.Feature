Feature: Test Amazon products

Scenario Outline: check some products
Given launch amazon site
Then username is "deevivivek@gmail.com" and password is "abcd1234"
Then search for product "<productname>"
And close browser

Examples:
| productname |
| Apple Digital Black Dial Unisex Watch-Apple-42mm-space-Black |
| SS Master 9000 English Willow Cricket Bat |
| Sony 164 cm (65 inches) BRAVIA KD-65X9300D  4K HDR Android LED TV |
| Factorywala Tourmaline Party Wear Necklace For Women's/Girls |
