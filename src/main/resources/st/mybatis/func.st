func(func) ::= <<
\<update id="<func.packageName>_<func.procedureName>" parameterType="hashmap" statementType="CALLABLE"\>
		{ CALL #{RESULT, mode=OUT, jdbcType=<func.resultType>} := CALL
			<func.schema>.<func.packageName>.<func.procedureName>( <func.parameter :{ p  |	<p.name> => #{<p.mapKey>, mode=<p.mode>, <p.typeHandler>\} <p.komma>	} ; wrap>
			)  
		}
\</update\>
>>