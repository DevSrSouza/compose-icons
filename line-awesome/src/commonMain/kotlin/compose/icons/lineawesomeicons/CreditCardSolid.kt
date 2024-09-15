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

public val LineAwesomeIcons.CreditCardSolid: ImageVector
    get() {
        if (_creditCardSolid != null) {
            return _creditCardSolid!!
        }
        _creditCardSolid = Builder(name = "CreditCardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(3.355f, 6.0f, 2.0f, 7.355f, 2.0f, 9.0f)
                lineTo(2.0f, 23.0f)
                curveTo(2.0f, 24.645f, 3.355f, 26.0f, 5.0f, 26.0f)
                lineTo(27.0f, 26.0f)
                curveTo(28.645f, 26.0f, 30.0f, 24.645f, 30.0f, 23.0f)
                lineTo(30.0f, 9.0f)
                curveTo(30.0f, 7.355f, 28.645f, 6.0f, 27.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.566f, 8.0f, 28.0f, 8.434f, 28.0f, 9.0f)
                lineTo(28.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                lineTo(5.0f, 13.0f)
                lineTo(28.0f, 13.0f)
                lineTo(28.0f, 23.0f)
                curveTo(28.0f, 23.566f, 27.566f, 24.0f, 27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveTo(4.434f, 24.0f, 4.0f, 23.566f, 4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 8.434f, 4.434f, 8.0f, 5.0f, 8.0f)
                close()
            }
        }
        .build()
        return _creditCardSolid!!
    }

private var _creditCardSolid: ImageVector? = null
