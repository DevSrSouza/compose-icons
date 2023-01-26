package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.CreditCardOff: ImageVector
    get() {
        if (_creditCardOff != null) {
            return _creditCardOff!!
        }
        _creditCardOff = Builder(name = "CreditCardOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.83f, 4.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(15.17f)
                lineTo(14.83f, 12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-9.17f)
                lineTo(6.83f, 4.0f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(17.17f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.83f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(9.17f, 12.0f)
                lineToRelative(-4.0f, -4.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(9.17f)
                close()
            }
        }
        .build()
        return _creditCardOff!!
    }

private var _creditCardOff: ImageVector? = null
