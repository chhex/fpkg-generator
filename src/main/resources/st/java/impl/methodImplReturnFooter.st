methodImplReturnFooter(nameSpace, procedureName, returnType) ::= << 

    @SuppressWarnings("unchecked")
    Map\<String, Object\> returnParameterMap = (Map\<String, Object\>) dataAccessFacade
                .call("<nameSpace>.<procedureName>", parameters);
    return (<returnType>) returnParameterMap.get("RESULT");
} 

>>