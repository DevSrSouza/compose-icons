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

public val CssGgIcons.ArrowLongLeftL: ImageVector
    get() {
        if (_arrowLongLeftL != null) {
            return _arrowLongLeftL!!
        }
        _arrowLongLeftL = Builder(name = "ArrowLongLeftL", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2084f, 7.7572f)
                lineTo(0.9691f, 12.0033f)
                lineTo(5.2151f, 16.2428f)
                lineTo(6.6282f, 14.8274f)
                lineTo(4.8095f, 13.0116f)
                lineTo(21.0229f, 13.0298f)
                lineTo(21.0189f, 15.0297f)
                lineTo(23.0189f, 15.0338f)
                lineTo(23.0309f, 9.0338f)
                lineTo(21.0309f, 9.0298f)
                lineTo(21.0249f, 12.019f)
                lineTo(21.0261f, 11.0298f)
                lineTo(4.7854f, 11.0115f)
                lineTo(6.6237f, 9.1703f)
                lineTo(5.2084f, 7.7572f)
                close()
            }
        }
        .build()
        return _arrowLongLeftL!!
    }

private var _arrowLongLeftL: ImageVector? = null
