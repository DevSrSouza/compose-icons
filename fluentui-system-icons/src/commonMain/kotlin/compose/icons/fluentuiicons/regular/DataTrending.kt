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

public val RegularGroup.DataTrending: ImageVector
    get() {
        if (_dataTrending != null) {
            return _dataTrending!!
        }
        _dataTrending = Builder(name = "DataTrending", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.25f)
                curveTo(5.0f, 3.8358f, 4.6642f, 3.5f, 4.25f, 3.5f)
                curveTo(3.8358f, 3.5f, 3.5f, 3.8358f, 3.5f, 4.25f)
                verticalLineTo(18.75f)
                curveTo(3.5f, 19.7165f, 4.2835f, 20.5f, 5.25f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 20.5f, 20.5f, 20.1642f, 20.5f, 19.75f)
                curveTo(20.5f, 19.3358f, 20.1642f, 19.0f, 19.75f, 19.0f)
                horizontalLineTo(5.25f)
                curveTo(5.1119f, 19.0f, 5.0f, 18.8881f, 5.0f, 18.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(14.0f, 6.75f)
                curveTo(14.0f, 6.3358f, 14.3358f, 6.0f, 14.75f, 6.0f)
                horizontalLineTo(19.7515f)
                curveTo(20.1657f, 6.0f, 20.5015f, 6.3358f, 20.5015f, 6.75f)
                lineTo(20.5015f, 11.755f)
                curveTo(20.5015f, 12.1692f, 20.1658f, 12.505f, 19.7515f, 12.505f)
                curveTo(19.3373f, 12.505f, 19.0015f, 12.1692f, 19.0015f, 11.755f)
                lineTo(19.0015f, 8.5592f)
                lineTo(13.7803f, 13.7803f)
                curveTo(13.4874f, 14.0732f, 13.0126f, 14.0732f, 12.7197f, 13.7803f)
                lineTo(10.75f, 11.8107f)
                lineTo(7.5303f, 15.0303f)
                curveTo(7.2374f, 15.3232f, 6.7626f, 15.3232f, 6.4697f, 15.0303f)
                curveTo(6.1768f, 14.7374f, 6.1768f, 14.2626f, 6.4697f, 13.9697f)
                lineTo(10.2197f, 10.2197f)
                curveTo(10.5126f, 9.9268f, 10.9874f, 9.9268f, 11.2803f, 10.2197f)
                lineTo(13.25f, 12.1893f)
                lineTo(17.9393f, 7.5f)
                horizontalLineTo(14.75f)
                curveTo(14.3358f, 7.5f, 14.0f, 7.1642f, 14.0f, 6.75f)
                close()
            }
        }
        .build()
        return _dataTrending!!
    }

private var _dataTrending: ImageVector? = null
