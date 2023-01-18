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

public val RegularGroup.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2042f, 4.8205f)
                curveTo(8.5796f, 4.6455f, 9.0258f, 4.8079f, 9.2008f, 5.1833f)
                curveTo(9.3759f, 5.5588f, 9.2134f, 6.005f, 8.838f, 6.18f)
                curveTo(6.2138f, 7.4033f, 4.5f, 10.0416f, 4.5f, 12.9914f)
                curveTo(4.5f, 17.1386f, 7.8576f, 20.5002f, 11.9989f, 20.5002f)
                curveTo(16.1403f, 20.5002f, 19.4979f, 17.1386f, 19.4979f, 12.9914f)
                curveTo(19.4979f, 10.0477f, 17.7912f, 7.4139f, 15.1753f, 6.1872f)
                curveTo(14.8002f, 6.0113f, 14.6388f, 5.5647f, 14.8147f, 5.1897f)
                curveTo(14.9905f, 4.8147f, 15.4371f, 4.6532f, 15.8121f, 4.8291f)
                curveTo(18.9502f, 6.3007f, 20.9979f, 9.4607f, 20.9979f, 12.9914f)
                curveTo(20.9979f, 17.9666f, 16.9691f, 22.0002f, 11.9989f, 22.0002f)
                curveTo(7.0288f, 22.0002f, 3.0f, 17.9666f, 3.0f, 12.9914f)
                curveTo(3.0f, 9.4533f, 5.0562f, 6.288f, 8.2042f, 4.8205f)
                close()
                moveTo(11.9989f, 2.4961f)
                curveTo(12.3786f, 2.4961f, 12.6924f, 2.7782f, 12.7421f, 3.1443f)
                lineTo(12.7489f, 3.2461f)
                verticalLineTo(10.746f)
                curveTo(12.7489f, 11.1602f, 12.4132f, 11.496f, 11.9989f, 11.496f)
                curveTo(11.6192f, 11.496f, 11.3055f, 11.2139f, 11.2558f, 10.8478f)
                lineTo(11.2489f, 10.746f)
                verticalLineTo(3.2461f)
                curveTo(11.2489f, 2.8319f, 11.5847f, 2.4961f, 11.9989f, 2.4961f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
