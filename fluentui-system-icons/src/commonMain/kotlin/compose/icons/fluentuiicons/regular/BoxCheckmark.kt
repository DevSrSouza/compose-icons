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

public val RegularGroup.BoxCheckmark: ImageVector
    get() {
        if (_boxCheckmark != null) {
            return _boxCheckmark!!
        }
        _boxCheckmark = Builder(name = "BoxCheckmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5911f, 2.513f)
                curveTo(11.4947f, 2.1467f, 12.5053f, 2.1467f, 13.4089f, 2.513f)
                lineTo(20.9075f, 5.553f)
                curveTo(21.5679f, 5.8207f, 22.0f, 6.4622f, 22.0f, 7.1748f)
                verticalLineTo(12.8105f)
                curveTo(21.5557f, 12.3842f, 21.051f, 12.0204f, 20.5f, 11.7332f)
                verticalLineTo(7.7732f)
                lineTo(12.7503f, 10.7654f)
                verticalLineTo(13.0635f)
                curveTo(12.0581f, 13.8041f, 11.5371f, 14.7067f, 11.2503f, 15.7083f)
                verticalLineTo(10.7641f)
                lineTo(3.5f, 7.75f)
                verticalLineTo(16.8275f)
                curveTo(3.5f, 16.9293f, 3.5617f, 17.0209f, 3.6561f, 17.0592f)
                lineTo(11.1547f, 20.0991f)
                curveTo(11.1863f, 20.112f, 11.2183f, 20.1241f, 11.2503f, 20.1354f)
                verticalLineTo(20.1342f)
                lineTo(11.439f, 20.2109f)
                curveTo(11.4976f, 20.2348f, 11.5575f, 20.2548f, 11.618f, 20.2709f)
                curveTo(11.8663f, 20.7973f, 12.1832f, 21.2849f, 12.5572f, 21.7224f)
                curveTo(11.898f, 21.8214f, 11.2187f, 21.7437f, 10.5911f, 21.4892f)
                lineTo(3.0925f, 18.4493f)
                curveTo(2.4321f, 18.1815f, 2.0f, 17.5401f, 2.0f, 16.8275f)
                verticalLineTo(7.1748f)
                curveTo(2.0f, 6.4622f, 2.4321f, 5.8207f, 3.0925f, 5.553f)
                lineTo(10.5911f, 2.513f)
                close()
                moveTo(12.8453f, 3.9031f)
                curveTo(12.3032f, 3.6833f, 11.6968f, 3.6833f, 11.1547f, 3.9031f)
                lineTo(9.2413f, 4.6788f)
                lineTo(16.7684f, 7.606f)
                lineTo(19.4373f, 6.5755f)
                lineTo(12.8453f, 3.9031f)
                close()
                moveTo(4.59f, 6.5645f)
                lineTo(12.0013f, 9.4467f)
                lineTo(14.6917f, 8.4079f)
                lineTo(7.215f, 5.5003f)
                lineTo(4.59f, 6.5645f)
                close()
                moveTo(17.5f, 23.001f)
                curveTo(20.5376f, 23.001f, 23.0f, 20.5385f, 23.0f, 17.501f)
                curveTo(23.0f, 14.4634f, 20.5376f, 12.001f, 17.5f, 12.001f)
                curveTo(14.4624f, 12.001f, 12.0f, 14.4634f, 12.0f, 17.501f)
                curveTo(12.0f, 20.5385f, 14.4624f, 23.001f, 17.5f, 23.001f)
                close()
                moveTo(16.5f, 18.7939f)
                lineTo(20.1464f, 15.1474f)
                curveTo(20.3417f, 14.9522f, 20.6583f, 14.9522f, 20.8536f, 15.1474f)
                curveTo(21.0488f, 15.3427f, 21.0488f, 15.6593f, 20.8536f, 15.8545f)
                lineTo(16.8536f, 19.8545f)
                curveTo(16.6583f, 20.0498f, 16.3417f, 20.0498f, 16.1464f, 19.8545f)
                lineTo(14.1464f, 17.8545f)
                curveTo(13.9512f, 17.6593f, 13.9512f, 17.3427f, 14.1464f, 17.1474f)
                curveTo(14.3417f, 16.9522f, 14.6583f, 16.9522f, 14.8536f, 17.1474f)
                lineTo(16.5f, 18.7939f)
                close()
            }
        }
        .build()
        return _boxCheckmark!!
    }

private var _boxCheckmark: ImageVector? = null
