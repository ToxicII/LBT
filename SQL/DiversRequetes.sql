/******  ******/
SELECT TOP 1000 
ip.ingredients_NOM,
ip.produits_REFERENCE,
pr.NOM,
pr.DESCRIPTION,
pr.PRIXHT--,
--pr.CATEGORIECARTE_NOM
FROM [LBT].[dbo].[PRODUIT_INGREDIENT] ip 
join [LBT].[dbo].[PRODUIT] pr
on pr.[REFERENCE]= ip.[produits_REFERENCE]
order by pr.NOM

/******  ******/
SELECT TOP 1000 [NUMERO]
      ,[SECTEUR]
      ,[PARAMETRE_ID]
  FROM [LBT].[dbo].[EMPLACEMENT]
/******  ******/
SELECT TOP 1000 [ID]
      ,[DATEDEBUT]
      ,[DATEFIN]
      ,[DESCRIPTION]
      ,[IMAGE]
      ,[REMISE]
  FROM [LBT].[dbo].[PROMOTION]
/******  ******/
SELECT * FROM PRODUIT
/********************/
SELECT * FROM TVA