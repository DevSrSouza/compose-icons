package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowLongRightL: ImageVector
    get() {
        if (_arrowLongRightL != null) {
            return _arrowLongRightL!!
        }
        _arrowLongRightL = Builder(name = "ArrowLongRightL", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.916f, 7.757f)
                lineTo(23.166f, 11.993f)
                lineTo(18.931f, 16.243f)
                lineTo(17.514f, 14.831f)
                lineTo(19.333f, 13.006f)
                lineTo(2.834f, 13.028f)
                verticalLineTo(15.03f)
                horizontalLineTo(0.834f)
                verticalLineTo(9.03f)
                horizontalLineTo(2.834f)
                verticalLineTo(11.028f)
                lineTo(19.343f, 11.006f)
                lineTo(17.505f, 9.174f)
                lineTo(18.916f, 7.757f)
                close()
            }
        }
        .build()
        return _arrowLongRightL!!
    }

private var _arrowLongRightL: ImageVector? = null
