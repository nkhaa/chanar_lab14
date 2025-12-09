# Conflict Шийдвэрлэлт


`feature/add-multiplication`-ийг `develop` руу нэгтгэхэд
`src/main/java/lab14/sict/must/edu/mn/Multiplication.java` файл дээр
merge conflict гарсан. Conflict нь `multiply` функцын Javadoc коммент
дээр байсан.

## Шийдвэрлэлтийн алхмууд

1. Онцлогын салбарт `git merge develop` ажиллуулсан.
2. `Multiplication.java` дээрх conflict-ийг тодорхойлсон.
3. Файлыг засварлаж, хоёр салбарын өөрчлөлтийг утгатайгаар нэгтгэсэн.
4. `git add src/main/java/lab14/sict/must/edu/mn/Multiplication.java` ажиллуулсан.
5. `git commit` ажиллуулж merge-ийг дуусгасан.
6. Салбарыг `origin` руу push хийж, PR-ийг шинэчилсэн.
