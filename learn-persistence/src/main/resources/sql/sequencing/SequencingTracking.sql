SELECT * FROM SequencingTracking
WHERE 1=1
<#if id??>
AND id = :id
</#if>
<#if sequencingID??>
AND sequencingID = :sequencingID
</#if>