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

public val RegularGroup.CursorHoverOff: ImageVector
    get() {
        if (_cursorHoverOff != null) {
            return _cursorHoverOff!!
        }
        _cursorHoverOff = Builder(name = "CursorHoverOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(3.2651f, 4.3258f)
                curveTo(2.5095f, 4.7559f, 2.0f, 5.5684f, 2.0f, 6.5f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 16.8807f, 3.1193f, 18.0f, 4.5f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(4.5f)
                curveTo(3.9477f, 16.5f, 3.5f, 16.0523f, 3.5f, 15.5f)
                verticalLineTo(6.5f)
                curveTo(3.5f, 5.9675f, 3.9162f, 5.5322f, 4.441f, 5.5017f)
                lineTo(10.0f, 11.0608f)
                verticalLineTo(21.25f)
                curveTo(10.0f, 21.5786f, 10.2138f, 21.8688f, 10.5275f, 21.9663f)
                curveTo(10.8413f, 22.0637f, 11.1819f, 21.9456f, 11.368f, 21.6749f)
                lineTo(13.8348f, 18.0869f)
                lineTo(17.877f, 18.9379f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(11.5f, 12.5608f)
                lineTo(15.9354f, 16.9963f)
                lineTo(13.6545f, 16.5161f)
                curveTo(13.3582f, 16.4537f, 13.0535f, 16.5756f, 12.882f, 16.8251f)
                lineTo(11.5f, 18.8353f)
                verticalLineTo(12.5608f)
                close()
                moveTo(20.5f, 15.5f)
                curveTo(20.5f, 15.9951f, 20.1401f, 16.4062f, 19.6677f, 16.486f)
                lineTo(20.8109f, 17.6292f)
                curveTo(21.5244f, 17.1889f, 22.0f, 16.4f, 22.0f, 15.5f)
                verticalLineTo(6.5f)
                curveTo(22.0f, 5.1193f, 20.8807f, 4.0f, 19.5f, 4.0f)
                horizontalLineTo(7.182f)
                lineTo(8.6819f, 5.5f)
                horizontalLineTo(19.5f)
                curveTo(20.0523f, 5.5f, 20.5f, 5.9477f, 20.5f, 6.5f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _cursorHoverOff!!
    }

private var _cursorHoverOff: ImageVector? = null
