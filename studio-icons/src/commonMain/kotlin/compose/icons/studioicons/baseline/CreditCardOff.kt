package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.CreditCardOff: ImageVector
    get() {
        if (_creditCardOff != null) {
            return _creditCardOff!!
        }
        _creditCardOff = Builder(name = "CreditCardOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9f, 21.9f)
                lineTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineToRelative(1.55f, 1.55f)
                curveTo(2.09f, 5.34f, 2.01f, 5.66f, 2.01f, 6.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.17f)
                lineToRelative(3.31f, 3.31f)
                lineTo(21.9f, 21.9f)
                close()
                moveTo(4.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.17f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(6.83f, 4.0f)
                horizontalLineTo(20.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.34f, -0.08f, 0.66f, -0.23f, 0.94f)
                lineTo(14.83f, 12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-9.17f)
                lineTo(6.83f, 4.0f)
                close()
            }
        }
        .build()
        return _creditCardOff!!
    }

private var _creditCardOff: ImageVector? = null
