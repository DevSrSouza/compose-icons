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

public val MaterialDesignIcons.CreditCardOff: ImageVector
    get() {
        if (_creditCardOff != null) {
            return _creditCardOff!!
        }
        _creditCardOff = Builder(name = "CreditCardOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2f, 8.0f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(1.91f, 1.91f, 0.0f, false, true, 21.88f, 18.68f)
                lineTo(14.2f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                moveTo(20.84f, 22.73f)
                lineTo(18.11f, 20.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.65f, 4.54f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(9.11f, 11.0f)
                lineTo(6.11f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _creditCardOff!!
    }

private var _creditCardOff: ImageVector? = null
