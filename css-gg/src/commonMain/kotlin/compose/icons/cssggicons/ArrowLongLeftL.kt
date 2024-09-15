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
                moveTo(5.208f, 7.757f)
                lineTo(0.969f, 12.003f)
                lineTo(5.215f, 16.243f)
                lineTo(6.628f, 14.827f)
                lineTo(4.809f, 13.012f)
                lineTo(21.023f, 13.03f)
                lineTo(21.019f, 15.03f)
                lineTo(23.019f, 15.034f)
                lineTo(23.031f, 9.034f)
                lineTo(21.031f, 9.03f)
                lineTo(21.025f, 12.019f)
                lineTo(21.026f, 11.03f)
                lineTo(4.785f, 11.012f)
                lineTo(6.624f, 9.17f)
                lineTo(5.208f, 7.757f)
                close()
            }
        }
        .build()
        return _arrowLongLeftL!!
    }

private var _arrowLongLeftL: ImageVector? = null
