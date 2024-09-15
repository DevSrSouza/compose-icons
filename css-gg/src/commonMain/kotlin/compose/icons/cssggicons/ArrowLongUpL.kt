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

public val CssGgIcons.ArrowLongUpL: ImageVector
    get() {
        if (_arrowLongUpL != null) {
            return _arrowLongUpL!!
        }
        _arrowLongUpL = Builder(name = "ArrowLongUpL", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.032f, 1.019f)
                lineTo(16.243f, 5.293f)
                lineTo(14.818f, 6.697f)
                lineTo(13.019f, 4.871f)
                lineTo(12.968f, 20.981f)
                horizontalLineTo(14.964f)
                verticalLineTo(22.981f)
                horizontalLineTo(8.964f)
                verticalLineTo(20.981f)
                horizontalLineTo(10.968f)
                lineTo(11.019f, 4.824f)
                lineTo(9.161f, 6.654f)
                lineTo(7.758f, 5.229f)
                lineTo(12.032f, 1.019f)
                close()
            }
        }
        .build()
        return _arrowLongUpL!!
    }

private var _arrowLongUpL: ImageVector? = null
