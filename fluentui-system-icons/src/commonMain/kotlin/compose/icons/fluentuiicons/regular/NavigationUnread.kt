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

public val RegularGroup.NavigationUnread: ImageVector
    get() {
        if (_navigationUnread != null) {
            return _navigationUnread!!
        }
        _navigationUnread = Builder(name = "NavigationUnread", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.25f, 8.5f)
                curveTo(20.7688f, 8.5f, 22.0f, 7.2688f, 22.0f, 5.75f)
                curveTo(22.0f, 4.2312f, 20.7688f, 3.0f, 19.25f, 3.0f)
                curveTo(17.7312f, 3.0f, 16.5f, 4.2312f, 16.5f, 5.75f)
                curveTo(16.5f, 7.2688f, 17.7312f, 8.5f, 19.25f, 8.5f)
                close()
                moveTo(15.5757f, 6.5032f)
                curveTo(15.5261f, 6.2599f, 15.5f, 6.008f, 15.5f, 5.75f)
                curveTo(15.5f, 5.4943f, 15.5256f, 5.2446f, 15.5744f, 5.0032f)
                horizontalLineTo(2.752f)
                lineTo(2.6502f, 5.0101f)
                curveTo(2.2841f, 5.0598f, 2.002f, 5.3735f, 2.002f, 5.7532f)
                curveTo(2.002f, 6.1675f, 2.3377f, 6.5032f, 2.752f, 6.5032f)
                horizontalLineTo(15.5757f)
                close()
                moveTo(21.2528f, 18.0f)
                horizontalLineTo(2.7528f)
                lineTo(2.651f, 18.0069f)
                curveTo(2.285f, 18.0565f, 2.0028f, 18.3703f, 2.0028f, 18.75f)
                curveTo(2.0028f, 19.1642f, 2.3386f, 19.5f, 2.7528f, 19.5f)
                horizontalLineTo(21.2528f)
                lineTo(21.3546f, 19.4932f)
                curveTo(21.7207f, 19.4435f, 22.0028f, 19.1297f, 22.0028f, 18.75f)
                curveTo(22.0028f, 18.3358f, 21.667f, 18.0f, 21.2528f, 18.0f)
                close()
                moveTo(2.7528f, 11.503f)
                horizontalLineTo(21.2528f)
                curveTo(21.667f, 11.503f, 22.0028f, 11.8388f, 22.0028f, 12.253f)
                curveTo(22.0028f, 12.6327f, 21.7207f, 12.9465f, 21.3546f, 12.9962f)
                lineTo(21.2528f, 13.003f)
                horizontalLineTo(2.7528f)
                curveTo(2.3386f, 13.003f, 2.0028f, 12.6672f, 2.0028f, 12.253f)
                curveTo(2.0028f, 11.8733f, 2.285f, 11.5595f, 2.651f, 11.5099f)
                lineTo(2.7528f, 11.503f)
                close()
            }
        }
        .build()
        return _navigationUnread!!
    }

private var _navigationUnread: ImageVector? = null
