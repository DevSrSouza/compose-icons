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

public val FilledGroup.ClipboardTextEdit: ImageVector
    get() {
        if (_clipboardTextEdit != null) {
            return _clipboardTextEdit!!
        }
        _clipboardTextEdit = Builder(name = "ClipboardTextEdit", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9795f, 3.9447f)
                curveTo(15.8305f, 2.8465f, 14.8891f, 2.0f, 13.75f, 2.0f)
                horizontalLineTo(10.25f)
                curveTo(9.1109f, 2.0f, 8.1695f, 2.8465f, 8.0205f, 3.9447f)
                lineTo(8.006f, 4.08f)
                lineTo(8.0138f, 3.9994f)
                lineTo(6.25f, 4.0f)
                curveTo(5.0074f, 4.0f, 4.0f, 5.0074f, 4.0f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(4.0f, 20.9926f, 5.0074f, 22.0f, 6.25f, 22.0f)
                horizontalLineTo(11.0014f)
                curveTo(10.9942f, 21.8075f, 11.0139f, 21.6088f, 11.0642f, 21.4075f)
                lineTo(11.5219f, 19.5768f)
                curveTo(11.6176f, 19.1939f, 11.7738f, 18.8306f, 11.983f, 18.5f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 18.5f, 7.25f, 18.1642f, 7.25f, 17.75f)
                curveTo(7.25f, 17.3358f, 7.5858f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(13.356f)
                lineTo(18.3937f, 11.9624f)
                curveTo(18.8517f, 11.5043f, 19.4113f, 11.2098f, 20.0f, 11.0788f)
                verticalLineTo(6.25f)
                curveTo(20.0f, 5.0074f, 18.9926f, 4.0f, 17.75f, 4.0f)
                lineTo(15.9862f, 3.9994f)
                lineTo(15.993f, 4.08f)
                lineTo(15.9795f, 3.9447f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 3.5f, 14.5f, 3.8358f, 14.5f, 4.25f)
                curveTo(14.5f, 4.6642f, 14.1642f, 5.0f, 13.75f, 5.0f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 5.0f, 9.5f, 4.6642f, 9.5f, 4.25f)
                curveTo(9.5f, 3.8358f, 9.8358f, 3.5f, 10.25f, 3.5f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 13.0f, 12.75f, 13.3358f, 12.75f, 13.75f)
                curveTo(12.75f, 14.1642f, 12.4142f, 14.5f, 12.0f, 14.5f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 14.5f, 7.25f, 14.1642f, 7.25f, 13.75f)
                curveTo(7.25f, 13.3358f, 7.5858f, 13.0f, 8.0f, 13.0f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 9.0f, 16.75f, 9.3358f, 16.75f, 9.75f)
                curveTo(16.75f, 10.1642f, 16.4142f, 10.5f, 16.0f, 10.5f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 10.5f, 7.25f, 10.1642f, 7.25f, 9.75f)
                curveTo(7.25f, 9.3358f, 7.5858f, 9.0f, 8.0f, 9.0f)
                close()
                moveTo(19.0999f, 12.6695f)
                lineTo(13.1974f, 18.5719f)
                curveTo(12.8533f, 18.916f, 12.6092f, 19.3472f, 12.4911f, 19.8194f)
                lineTo(12.0334f, 21.6501f)
                curveTo(11.8344f, 22.4462f, 12.5556f, 23.1674f, 13.3517f, 22.9683f)
                lineTo(15.1824f, 22.5106f)
                curveTo(15.6545f, 22.3926f, 16.0857f, 22.1485f, 16.4299f, 21.8043f)
                lineTo(22.3323f, 15.9019f)
                curveTo(23.2249f, 15.0093f, 23.2249f, 13.5621f, 22.3323f, 12.6695f)
                curveTo(21.4397f, 11.7768f, 19.9925f, 11.7768f, 19.0999f, 12.6695f)
                close()
            }
        }
        .build()
        return _clipboardTextEdit!!
    }

private var _clipboardTextEdit: ImageVector? = null
