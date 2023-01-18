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

public val RegularGroup.CursorHover: ImageVector
    get() {
        if (_cursorHover != null) {
            return _cursorHover!!
        }
        _cursorHover = Builder(name = "CursorHover", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 5.5f)
                horizontalLineTo(4.5f)
                curveTo(3.9477f, 5.5f, 3.5f, 5.9477f, 3.5f, 6.5f)
                verticalLineTo(15.5f)
                curveTo(3.5f, 16.0523f, 3.9477f, 16.5f, 4.5f, 16.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.5f)
                curveTo(3.1193f, 18.0f, 2.0f, 16.8807f, 2.0f, 15.5f)
                verticalLineTo(6.5f)
                curveTo(2.0f, 5.1193f, 3.1193f, 4.0f, 4.5f, 4.0f)
                horizontalLineTo(19.5f)
                curveTo(20.8807f, 4.0f, 22.0f, 5.1193f, 22.0f, 6.5f)
                verticalLineTo(15.5f)
                curveTo(22.0f, 16.7183f, 21.1285f, 17.7331f, 19.975f, 17.9549f)
                curveTo(19.9f, 17.5176f, 19.6598f, 17.1137f, 19.2849f, 16.8388f)
                lineTo(18.9461f, 16.5f)
                horizontalLineTo(19.5f)
                curveTo(20.0523f, 16.5f, 20.5f, 16.0523f, 20.5f, 15.5f)
                verticalLineTo(6.5f)
                curveTo(20.5f, 5.9477f, 20.0523f, 5.5f, 19.5f, 5.5f)
                close()
                moveTo(11.2803f, 10.2197f)
                curveTo(11.0658f, 10.0052f, 10.7432f, 9.941f, 10.463f, 10.0571f)
                curveTo(10.1827f, 10.1732f, 10.0f, 10.4467f, 10.0f, 10.75f)
                verticalLineTo(21.25f)
                curveTo(10.0f, 21.5785f, 10.2138f, 21.8688f, 10.5275f, 21.9663f)
                curveTo(10.8413f, 22.0637f, 11.1819f, 21.9456f, 11.368f, 21.6749f)
                lineTo(13.8348f, 18.0869f)
                lineTo(18.0955f, 18.9839f)
                curveTo(18.4203f, 19.0523f, 18.7514f, 18.8991f, 18.9095f, 18.6073f)
                curveTo(19.0675f, 18.3154f, 19.015f, 17.9544f, 18.7803f, 17.7197f)
                lineTo(11.2803f, 10.2197f)
                close()
                moveTo(11.5f, 18.8353f)
                verticalLineTo(12.5607f)
                lineTo(15.9357f, 16.9964f)
                lineTo(13.6545f, 16.5161f)
                curveTo(13.3582f, 16.4537f, 13.0535f, 16.5756f, 12.882f, 16.8251f)
                lineTo(11.5f, 18.8353f)
                close()
            }
        }
        .build()
        return _cursorHover!!
    }

private var _cursorHover: ImageVector? = null
