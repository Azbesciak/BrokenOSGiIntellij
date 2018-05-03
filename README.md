# BrokenOSGiIntellij
Shows that project ('minimal') which works fine in eclipse, does not in Intellij - cannot resolve imported and exported by other module dependencies.

### Screenshots
#### Intellij IDEA 2017.3.4
 ![Intellij fail][intellij]

#### Eclipse Oxygen.2 December
 ![Eclipse OK][eclipse]

[intellij]: https://raw.githubusercontent.com/Azbesciak/BrokenOSGiIntellij/master/screenshots/intellij.png "Intellij fail"
[eclipse]: https://raw.githubusercontent.com/Azbesciak/BrokenOSGiIntellij/master/screenshots/eclipse.png "Eclipse OK"

#### Update - Export imported bundles
When some of your bundles export imported dependencies, their consumers don't see those dependencies. Some poor diagram:
![Import-Export error][ie-err]

#### Intellij IDEA 2018.1.2
 ![Intellij fail][intellij-ie]

#### Eclipse Oxygen.3a March (4.7.3a)
 ![Eclipse OK][eclipse-ie]

[intellij-ie]: https://raw.githubusercontent.com/Azbesciak/BrokenOSGiIntellij/import-export/screenshots/intellij_import_export.png "Intellij fail"
[eclipse-ie]: https://raw.githubusercontent.com/Azbesciak/BrokenOSGiIntellij/import-export/screenshots/eclipse_import_export.png "Eclipse OK"
[ie-err]: https://raw.githubusercontent.com/Azbesciak/BrokenOSGiIntellij/import-export/screenshots/import_export_err.png "Eclipse OK"
