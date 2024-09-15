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

public val CssGgIcons.CornerDoubleDownRight: ImageVector
    get() {
        if (_cornerDoubleDownRight != null) {
            return _cornerDoubleDownRight!!
        }
        _cornerDoubleDownRight = Builder(name = "CornerDoubleDownRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6f, 7.679f)
                lineTo(7.638f, 2.742f)
                lineTo(2.701f, 7.704f)
                lineTo(4.119f, 9.115f)
                lineTo(6.522f, 6.699f)
                lineTo(6.508f, 12.735f)
                curveTo(6.501f, 15.386f, 8.645f, 17.54f, 11.296f, 17.547f)
                lineTo(17.224f, 17.561f)
                lineTo(14.986f, 19.864f)
                lineTo(16.42f, 21.258f)
                lineTo(21.299f, 16.239f)
                lineTo(16.28f, 11.359f)
                lineTo(14.886f, 12.793f)
                lineTo(17.322f, 15.162f)
                lineTo(11.302f, 15.147f)
                curveTo(9.976f, 15.143f, 8.904f, 14.066f, 8.908f, 12.741f)
                lineTo(8.922f, 6.841f)
                lineTo(11.19f, 9.097f)
                lineTo(12.6f, 7.679f)
                close()
            }
        }
        .build()
        return _cornerDoubleDownRight!!
    }

private var _cornerDoubleDownRight: ImageVector? = null
