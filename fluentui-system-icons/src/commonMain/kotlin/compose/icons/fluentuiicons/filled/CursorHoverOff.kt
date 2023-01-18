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

public val FilledGroup.CursorHoverOff: ImageVector
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
                verticalLineTo(10.75f)
                curveTo(9.0f, 10.5463f, 9.0354f, 10.348f, 9.1016f, 10.1624f)
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
                moveTo(7.182f, 4.0f)
                lineTo(20.8109f, 17.6292f)
                curveTo(21.5244f, 17.1889f, 22.0f, 16.4f, 22.0f, 15.5f)
                verticalLineTo(6.5f)
                curveTo(22.0f, 5.1193f, 20.8807f, 4.0f, 19.5f, 4.0f)
                horizontalLineTo(7.182f)
                close()
            }
        }
        .build()
        return _cursorHoverOff!!
    }

private var _cursorHoverOff: ImageVector? = null
