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
                moveTo(12.0321f, 1.0187f)
                lineTo(16.2425f, 5.2933f)
                lineTo(14.8177f, 6.6968f)
                lineTo(13.0192f, 4.8709f)
                lineTo(12.9676f, 20.9813f)
                horizontalLineTo(14.9644f)
                verticalLineTo(22.9813f)
                horizontalLineTo(8.9644f)
                verticalLineTo(20.9813f)
                horizontalLineTo(10.9676f)
                lineTo(11.0194f, 4.8235f)
                lineTo(9.1611f, 6.654f)
                lineTo(7.7576f, 5.2291f)
                lineTo(12.0321f, 1.0187f)
                close()
            }
        }
        .build()
        return _arrowLongUpL!!
    }

private var _arrowLongUpL: ImageVector? = null
