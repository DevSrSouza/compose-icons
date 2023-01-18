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

public val RegularGroup.ArrowCircleUp: ImageVector
    get() {
        if (_arrowCircleUp != null) {
            return _arrowCircleUp!!
        }
        _arrowCircleUp = Builder(name = "ArrowCircleUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4703f, 12.2801f)
                lineTo(7.5544f, 12.3527f)
                curveTo(7.848f, 12.5706f, 8.2647f, 12.5464f, 8.5309f, 12.2801f)
                lineTo(11.2503f, 9.5608f)
                lineTo(11.2506f, 16.2505f)
                lineTo(11.2575f, 16.3523f)
                curveTo(11.3071f, 16.7183f, 11.6209f, 17.0005f, 12.0006f, 17.0005f)
                lineTo(12.1024f, 16.9936f)
                curveTo(12.4685f, 16.944f, 12.7506f, 16.6302f, 12.7506f, 16.2505f)
                lineTo(12.7503f, 9.5588f)
                lineTo(15.471f, 12.2807f)
                lineTo(15.5551f, 12.3534f)
                curveTo(15.8487f, 12.5713f, 16.2653f, 12.5471f, 16.5317f, 12.2809f)
                curveTo(16.8246f, 11.9881f, 16.8247f, 11.5132f, 16.5319f, 11.2203f)
                lineTo(12.5319f, 7.2187f)
                lineTo(12.4477f, 7.1461f)
                curveTo(12.1541f, 6.9282f, 11.7374f, 6.9523f, 11.4711f, 7.2186f)
                lineTo(7.4703f, 11.2195f)
                lineTo(7.3977f, 11.3036f)
                curveTo(7.1798f, 11.5972f, 7.204f, 12.0138f, 7.4703f, 12.2801f)
                close()
                moveTo(22.001f, 12.0f)
                curveTo(22.001f, 6.4771f, 17.5238f, 2.0f, 12.001f, 2.0f)
                curveTo(6.4781f, 2.0f, 2.001f, 6.4771f, 2.001f, 12.0f)
                curveTo(2.001f, 17.5228f, 6.4781f, 22.0f, 12.001f, 22.0f)
                curveTo(17.5238f, 22.0f, 22.001f, 17.5228f, 22.001f, 12.0f)
                close()
                moveTo(3.501f, 12.0f)
                curveTo(3.501f, 7.3056f, 7.3066f, 3.5f, 12.001f, 3.5f)
                curveTo(16.6954f, 3.5f, 20.501f, 7.3056f, 20.501f, 12.0f)
                curveTo(20.501f, 16.6944f, 16.6954f, 20.5f, 12.001f, 20.5f)
                curveTo(7.3066f, 20.5f, 3.501f, 16.6944f, 3.501f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowCircleUp!!
    }

private var _arrowCircleUp: ImageVector? = null
