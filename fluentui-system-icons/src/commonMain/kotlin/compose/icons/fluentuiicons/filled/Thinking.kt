package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Thinking: ImageVector
    get() {
        if (_thinking != null) {
            return _thinking!!
        }
        _thinking = Builder(name = "Thinking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                curveTo(5.1046f, 18.0f, 6.0f, 18.8954f, 6.0f, 20.0f)
                curveTo(6.0f, 21.1046f, 5.1046f, 22.0f, 4.0f, 22.0f)
                curveTo(2.8954f, 22.0f, 2.0f, 21.1046f, 2.0f, 20.0f)
                curveTo(2.0f, 18.8954f, 2.8954f, 18.0f, 4.0f, 18.0f)
                close()
                moveTo(9.5f, 15.0f)
                curveTo(10.8807f, 15.0f, 12.0f, 16.1193f, 12.0f, 17.5f)
                curveTo(12.0f, 18.8807f, 10.8807f, 20.0f, 9.5f, 20.0f)
                curveTo(8.1193f, 20.0f, 7.0f, 18.8807f, 7.0f, 17.5f)
                curveTo(7.0f, 16.1193f, 8.1193f, 15.0f, 9.5f, 15.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(14.6592f, 2.0f, 16.8838f, 3.9226f, 17.3302f, 6.4706f)
                lineTo(17.4118f, 6.4706f)
                curveTo(19.491f, 6.4706f, 21.1765f, 8.1561f, 21.1765f, 10.2353f)
                curveTo(21.1765f, 12.3145f, 19.491f, 14.0f, 17.4118f, 14.0f)
                horizontalLineTo(6.5882f)
                curveTo(4.509f, 14.0f, 2.8235f, 12.3145f, 2.8235f, 10.2353f)
                curveTo(2.8235f, 8.1561f, 4.509f, 6.4706f, 6.5883f, 6.4706f)
                lineTo(6.6698f, 6.4706f)
                curveTo(7.1162f, 3.9226f, 9.3408f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _thinking!!
    }

private var _thinking: ImageVector? = null
