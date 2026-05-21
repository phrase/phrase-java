

# StyleguideCreateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Style guide title | 
**audience** | **String** | Audience description |  [optional]
**targetAudience** | [**TargetAudienceEnum**](#TargetAudienceEnum) | Target audience for the translations. |  [optional]
**grammaticalPerson** | [**GrammaticalPersonEnum**](#GrammaticalPersonEnum) | Preferred grammatical person. |  [optional]
**vocabularyType** | [**VocabularyTypeEnum**](#VocabularyTypeEnum) | Vocabulary register the translations should use. |  [optional]
**business** | **String** | Description of the business |  [optional]
**companyBranding** | **String** | Company branding to remain consistent. |  [optional]
**formatting** | **String** | Formatting requirements and character limitations. |  [optional]
**glossaryTerms** | **String** | List of terms and/or phrases that need to be translated consistently. |  [optional]
**grammarConsistency** | **String** | Formal or informal pronouns, consistent conjugation, grammatical gender |  [optional]
**literalTranslation** | **String** | Can be one of: Cultural/Conversational, Literal, Neutral. |  [optional]
**overallTone** | **String** | Tone requirement descriptions |  [optional]
**samples** | **String** | Provide links to sample product pages, FAQ pages, etc. to give the translator a point of reference. You can also provide past translations. Even snippets or short paragraphs are helpful for maintaining consistency. |  [optional]



## Enum: TargetAudienceEnum

Name | Value
---- | -----
NOT_SPECIFIED | &quot;not_specified&quot;
CHILDREN | &quot;children&quot;
TEENAGER | &quot;teenager&quot;
YOUNG_ADULTS | &quot;young_adults&quot;
ADULTS | &quot;adults&quot;
OLD_ADULTS | &quot;old_adults&quot;



## Enum: GrammaticalPersonEnum

Name | Value
---- | -----
NOT_SPECIFIED | &quot;not_specified&quot;
FIRST_PERSON_SINGULAR | &quot;first_person_singular&quot;
SECOND_PERSON_SINGULAR | &quot;second_person_singular&quot;
THIRD_PERSON_SINGULAR_MASCULINE | &quot;third_person_singular_masculine&quot;
THIRD_PERSON_SINGULAR_FEMININE | &quot;third_person_singular_feminine&quot;
THIRD_PERSON_SINGULAR_NEUTER | &quot;third_person_singular_neuter&quot;
FIRST_PERSON_PLURAL | &quot;first_person_plural&quot;
SECOND_PERSON_PLURAL | &quot;second_person_plural&quot;
THIRD_PERSON_PLURAL | &quot;third_person_plural&quot;



## Enum: VocabularyTypeEnum

Name | Value
---- | -----
NOT_SPECIFIED | &quot;not_specified&quot;
POPULAR | &quot;popular&quot;
TECHNICAL | &quot;technical&quot;
FICTIONAL | &quot;fictional&quot;



