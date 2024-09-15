package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerDoubleUpRight: ImageVector
    get() {
        if (_cornerDoubleUpRight != null) {
            return _cornerDoubleUpRight!!
        }
        _cornerDoubleUpRight = Builder(name = "CornerDoubleUpRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.75f, 7.784f)
                lineTo(16.164f, 6.369f)
                lineTo(20.406f, 10.612f)
                lineTo(16.164f, 14.855f)
                lineTo(14.75f, 13.441f)
                lineTo(17.578f, 10.612f)
                lineTo(14.75f, 7.784f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.507f, 13.441f)
                lineTo(11.921f, 14.855f)
                lineTo(16.164f, 10.612f)
                lineTo(11.921f, 6.369f)
                lineTo(10.507f, 7.784f)
                lineTo(12.354f, 9.63f)
                lineTo(7.594f, 9.63f)
                curveTo(5.385f, 9.63f, 3.594f, 11.421f, 3.594f, 13.63f)
                lineTo(3.594f, 17.631f)
                lineTo(5.594f, 17.631f)
                lineTo(5.594f, 13.63f)
                curveTo(5.594f, 12.526f, 6.489f, 11.63f, 7.594f, 11.63f)
                lineTo(12.317f, 11.63f)
                lineTo(10.507f, 13.441f)
                close()
            }
        }
        .build()
        return _cornerDoubleUpRight!!
    }

private var _cornerDoubleUpRight: ImageVector? = null
