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

public val CssGgIcons.CornerDoubleLeftDown: ImageVector
    get() {
        if (_cornerDoubleLeftDown != null) {
            return _cornerDoubleLeftDown!!
        }
        _cornerDoubleLeftDown = Builder(name = "CornerDoubleLeftDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.299f, 7.761f)
                lineTo(16.28f, 12.641f)
                lineTo(14.886f, 11.207f)
                lineTo(17.322f, 8.838f)
                lineTo(11.302f, 8.853f)
                curveTo(9.976f, 8.857f, 8.904f, 9.934f, 8.908f, 11.259f)
                lineTo(8.922f, 17.159f)
                lineTo(11.19f, 14.903f)
                lineTo(12.6f, 16.321f)
                lineTo(7.638f, 21.258f)
                lineTo(2.701f, 16.296f)
                lineTo(4.119f, 14.885f)
                lineTo(6.522f, 17.301f)
                lineTo(6.508f, 11.265f)
                curveTo(6.501f, 8.614f, 8.645f, 6.46f, 11.296f, 6.453f)
                lineTo(17.224f, 6.439f)
                lineTo(14.986f, 4.136f)
                lineTo(16.42f, 2.742f)
                lineTo(21.299f, 7.761f)
                close()
            }
        }
        .build()
        return _cornerDoubleLeftDown!!
    }

private var _cornerDoubleLeftDown: ImageVector? = null
