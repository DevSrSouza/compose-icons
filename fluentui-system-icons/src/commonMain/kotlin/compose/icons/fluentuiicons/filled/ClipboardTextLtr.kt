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

public val FilledGroup.ClipboardTextLtr: ImageVector
    get() {
        if (_clipboardTextLtr != null) {
            return _clipboardTextLtr!!
        }
        _clipboardTextLtr = Builder(name = "ClipboardTextLtr", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 3.5f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 3.5f, 9.5f, 3.8358f, 9.5f, 4.25f)
                curveTo(9.5f, 4.6642f, 9.8358f, 5.0f, 10.25f, 5.0f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 5.0f, 14.5f, 4.6642f, 14.5f, 4.25f)
                curveTo(14.5f, 3.8358f, 14.1642f, 3.5f, 13.75f, 3.5f)
                close()
                moveTo(13.75f, 2.0f)
                curveTo(14.8891f, 2.0f, 15.8305f, 2.8465f, 15.9795f, 3.9447f)
                lineTo(15.993f, 4.08f)
                lineTo(15.9862f, 3.9994f)
                lineTo(17.75f, 4.0f)
                curveTo(18.9926f, 4.0f, 20.0f, 5.0074f, 20.0f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(20.0f, 20.9926f, 18.9926f, 22.0f, 17.75f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4.0f, 5.0074f, 5.0074f, 4.0f, 6.25f, 4.0f)
                lineTo(8.0138f, 3.9994f)
                lineTo(8.006f, 4.08f)
                lineTo(8.0205f, 3.9447f)
                curveTo(8.1695f, 2.8465f, 9.1109f, 2.0f, 10.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(14.0f, 17.0f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 17.0f, 7.25f, 17.3358f, 7.25f, 17.75f)
                curveTo(7.25f, 18.1642f, 7.5858f, 18.5f, 8.0f, 18.5f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 18.5f, 14.75f, 18.1642f, 14.75f, 17.75f)
                curveTo(14.75f, 17.3358f, 14.4142f, 17.0f, 14.0f, 17.0f)
                close()
                moveTo(12.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 13.0f, 7.25f, 13.3358f, 7.25f, 13.75f)
                curveTo(7.25f, 14.1642f, 7.5858f, 14.5f, 8.0f, 14.5f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 14.5f, 12.75f, 14.1642f, 12.75f, 13.75f)
                curveTo(12.75f, 13.3358f, 12.4142f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 9.0f, 7.25f, 9.3358f, 7.25f, 9.75f)
                curveTo(7.25f, 10.1642f, 7.5858f, 10.5f, 8.0f, 10.5f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 10.5f, 16.75f, 10.1642f, 16.75f, 9.75f)
                curveTo(16.75f, 9.3358f, 16.4142f, 9.0f, 16.0f, 9.0f)
                close()
            }
        }
        .build()
        return _clipboardTextLtr!!
    }

private var _clipboardTextLtr: ImageVector? = null