proc(proc) ::= <<
\<update id="<proc.procedureName>" parameterType="hashmap" statementType="CALLABLE"\>
		{ CALL
			<proc.schema>.<proc.packageName>.<proc.procedureName>( <proc.parameter :{ p  |	<p.name> => #{<p.mapKey>, mode=<p.mode>, <p.typeHandler>\} <p.komma>	} ; wrap>
			)  
		}
\</update\>
>>