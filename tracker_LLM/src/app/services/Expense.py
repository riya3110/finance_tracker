from pydantic import BaseModel, Field
from typing import Optional

class Expense(BaseModel):
    amount: Optional[str]= Field(title="expense", description="Expense made in the transaction")
    merchant: Optional[str]= Field(title="merchant", description="Merchant name whom the transaction has been made")
    currency: Optional[str]= Field(title="currency", description="currency of the transaction")