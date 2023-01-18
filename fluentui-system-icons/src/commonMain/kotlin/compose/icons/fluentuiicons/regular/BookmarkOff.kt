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

public val RegularGroup.BookmarkOff: ImageVector
    get() {
        if (_bookmarkOff != null) {
            return _bookmarkOff!!
        }
        _bookmarkOff = Builder(name = "BookmarkOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(5.0075f, 6.0682f)
                curveTo(5.0042f, 6.1281f, 5.0026f, 6.1885f, 5.0026f, 6.2492f)
                verticalLineTo(21.2451f)
                curveTo(5.0026f, 21.8563f, 5.6944f, 22.2109f, 6.1906f, 21.8539f)
                lineTo(12.0018f, 17.673f)
                lineTo(17.8129f, 21.8539f)
                curveTo(18.3091f, 22.2109f, 19.001f, 21.8563f, 19.001f, 21.2451f)
                verticalLineTo(20.062f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(17.501f, 18.5619f)
                verticalLineTo(19.7816f)
                lineTo(12.4398f, 16.1402f)
                curveTo(12.1781f, 15.952f, 11.8254f, 15.952f, 11.5637f, 16.1402f)
                lineTo(6.5026f, 19.7816f)
                verticalLineTo(7.5633f)
                lineTo(17.501f, 18.5619f)
                close()
                moveTo(17.501f, 6.2492f)
                verticalLineTo(14.3192f)
                lineTo(19.001f, 15.8192f)
                verticalLineTo(6.2492f)
                curveTo(19.001f, 4.4543f, 17.5459f, 2.9992f, 15.751f, 2.9992f)
                horizontalLineTo(8.2526f)
                curveTo(7.6576f, 2.9992f, 7.0999f, 3.1591f, 6.6202f, 3.4382f)
                lineTo(7.7534f, 4.5714f)
                curveTo(7.9116f, 4.5244f, 8.0791f, 4.4992f, 8.2526f, 4.4992f)
                horizontalLineTo(15.751f)
                curveTo(16.7175f, 4.4992f, 17.501f, 5.2827f, 17.501f, 6.2492f)
                close()
            }
        }
        .build()
        return _bookmarkOff!!
    }

private var _bookmarkOff: ImageVector? = null
