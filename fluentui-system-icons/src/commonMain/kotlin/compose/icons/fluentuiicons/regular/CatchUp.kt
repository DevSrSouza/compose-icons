package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.CatchUp: ImageVector
    get() {
        if (_catchUp != null) {
            return _catchUp!!
        }
        _catchUp = Builder(name = "CatchUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2777f, 8.1576f)
                curveTo(9.3621f, 7.9511f, 9.6541f, 7.9501f, 9.7399f, 8.156f)
                lineTo(12.9763f, 15.9225f)
                curveTo(13.55f, 17.2992f, 15.4726f, 17.3732f, 16.1505f, 16.0448f)
                lineTo(17.7505f, 12.9091f)
                curveTo(17.8786f, 12.658f, 18.1367f, 12.5f, 18.4186f, 12.5f)
                horizontalLineTo(19.063f)
                curveTo(19.285f, 13.3626f, 20.0681f, 14.0f, 21.0f, 14.0f)
                curveTo(22.1046f, 14.0f, 23.0f, 13.1046f, 23.0f, 12.0f)
                curveTo(23.0f, 10.8954f, 22.1046f, 10.0f, 21.0f, 10.0f)
                curveTo(20.2597f, 10.0f, 19.6134f, 10.4022f, 19.2676f, 11.0f)
                horizontalLineTo(18.4186f)
                curveTo(17.573f, 11.0f, 16.7988f, 11.4741f, 16.4144f, 12.2273f)
                lineTo(14.8144f, 15.363f)
                curveTo(14.7175f, 15.5528f, 14.4429f, 15.5422f, 14.3609f, 15.3455f)
                lineTo(11.1245f, 7.579f)
                curveTo(10.5239f, 6.1378f, 8.4796f, 6.1449f, 7.8891f, 7.5904f)
                lineTo(6.6867f, 10.5336f)
                curveTo(6.5715f, 10.8157f, 6.2971f, 11.0f, 5.9924f, 11.0f)
                horizontalLineTo(4.7324f)
                curveTo(4.3866f, 10.4022f, 3.7403f, 10.0f, 3.0f, 10.0f)
                curveTo(1.8954f, 10.0f, 1.0f, 10.8954f, 1.0f, 12.0f)
                curveTo(1.0f, 13.1046f, 1.8954f, 14.0f, 3.0f, 14.0f)
                curveTo(3.9319f, 14.0f, 4.715f, 13.3626f, 4.937f, 12.5f)
                horizontalLineTo(5.9924f)
                curveTo(6.9065f, 12.5f, 7.7297f, 11.9471f, 8.0753f, 11.1009f)
                lineTo(9.2777f, 8.1576f)
                close()
            }
        }
        .build()
        return _catchUp!!
    }

private var _catchUp: ImageVector? = null
