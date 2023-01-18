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

public val FilledGroup.BookmarkOff: ImageVector
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
                moveTo(19.001f, 6.2492f)
                verticalLineTo(15.8192f)
                lineTo(6.6202f, 3.4382f)
                curveTo(7.0999f, 3.1591f, 7.6576f, 2.9992f, 8.2526f, 2.9992f)
                horizontalLineTo(15.751f)
                curveTo(17.5459f, 2.9992f, 19.001f, 4.4543f, 19.001f, 6.2492f)
                close()
            }
        }
        .build()
        return _bookmarkOff!!
    }

private var _bookmarkOff: ImageVector? = null
