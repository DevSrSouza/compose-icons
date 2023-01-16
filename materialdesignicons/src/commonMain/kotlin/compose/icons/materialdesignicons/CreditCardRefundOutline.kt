package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.CreditCardRefundOutline: ImageVector
    get() {
        if (_creditCardRefundOutline != null) {
            return _creditCardRefundOutline!!
        }
        _creditCardRefundOutline = Builder(name = "CreditCardRefundOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 13.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 23.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 21.0f)
                verticalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 11.0f)
                moveTo(18.0f, 21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                moveTo(18.0f, 15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                moveTo(17.0f, 5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(9.88f)
                lineTo(12.3f, 8.93f)
                lineTo(11.24f, 10.0f)
                lineTo(7.0f, 5.75f)
                lineTo(11.24f, 1.5f)
                lineTo(12.3f, 2.57f)
                lineTo(9.88f, 5.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _creditCardRefundOutline!!
    }

private var _creditCardRefundOutline: ImageVector? = null
