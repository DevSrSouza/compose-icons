package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CreditCard: ImageVector
    get() {
        if (_creditCard != null) {
            return _creditCard!!
        }
        _creditCard = Builder(name = "CreditCard", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(3.3555f, 6.0f, 2.0f, 7.3555f, 2.0f, 9.0f)
                lineTo(2.0f, 23.0f)
                curveTo(2.0f, 24.6445f, 3.3555f, 26.0f, 5.0f, 26.0f)
                lineTo(27.0f, 26.0f)
                curveTo(28.6445f, 26.0f, 30.0f, 24.6445f, 30.0f, 23.0f)
                lineTo(30.0f, 9.0f)
                curveTo(30.0f, 7.3555f, 28.6445f, 6.0f, 27.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.5664f, 8.0f, 28.0f, 8.4336f, 28.0f, 9.0f)
                lineTo(28.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                lineTo(5.0f, 13.0f)
                lineTo(28.0f, 13.0f)
                lineTo(28.0f, 23.0f)
                curveTo(28.0f, 23.5664f, 27.5664f, 24.0f, 27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveTo(4.4336f, 24.0f, 4.0f, 23.5664f, 4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 8.4336f, 4.4336f, 8.0f, 5.0f, 8.0f)
                close()
            }
        }
        .build()
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
