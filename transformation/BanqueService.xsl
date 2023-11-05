<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <body>
        <h1>Liste des comptes</h1>
        <table border="1">
          <tr>
            <th>Code</th>
            <th>Solde</th>
            <th>Date de Creation</th>
          </tr>
          <xsl:for-each select="/banque/comptes/compte[substring(dateCreation, 7) > 2000]">
            <tr>
              <td><xsl:value-of select="code"/></td>
              <td><xsl:value-of select="solde"/></td>
              <td><xsl:value-of select="dateCreation"/></td>
            </tr>
          </xsl:for-each>
        </table>
        
        <h2>Somme totale des soldes : <xsl:value-of select="sum(/banque/comptes/compte/solde)"/></h2>
        
        <h2>Somme totale des soldes des comptes crees apres 2000 : <xsl:value-of select="sum(/banque/comptes/compte[substring(dateCreation, 7) > 2000]/solde)"/></h2>
        
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
