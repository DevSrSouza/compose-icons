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

public val FilledGroup.ClipboardMore: ImageVector
    get() {
        if (_clipboardMore != null) {
            return _clipboardMore!!
        }
        _clipboardMore = Builder(name = "ClipboardMore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 3.5f, 14.5f, 3.8358f, 14.5f, 4.25f)
                curveTo(14.5f, 4.6642f, 14.1642f, 5.0f, 13.75f, 5.0f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 5.0f, 9.5f, 4.6642f, 9.5f, 4.25f)
                curveTo(9.5f, 3.8358f, 9.8358f, 3.5f, 10.25f, 3.5f)
                close()
                moveTo(13.75f, 2.0f)
                horizontalLineTo(10.25f)
                curveTo(9.092f, 2.0f, 8.1384f, 2.8747f, 8.0138f, 3.9994f)
                lineTo(6.25f, 4.0f)
                curveTo(5.0074f, 4.0f, 4.0f, 5.0074f, 4.0f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(4.0f, 20.9926f, 5.0074f, 22.0f, 6.25f, 22.0f)
                horizontalLineTo(8.4998f)
                curveTo(8.186f, 21.5822f, 8.0f, 21.0628f, 8.0f, 20.5f)
                curveTo(8.0f, 19.1193f, 9.1193f, 18.0f, 10.5f, 18.0f)
                curveTo(11.8807f, 18.0f, 13.0f, 19.1193f, 13.0f, 20.5f)
                curveTo(13.0f, 19.1193f, 14.1193f, 18.0f, 15.5f, 18.0f)
                curveTo(16.8807f, 18.0f, 18.0f, 19.1193f, 18.0f, 20.5f)
                curveTo(18.0f, 19.2905f, 18.8589f, 18.2816f, 20.0f, 18.05f)
                verticalLineTo(6.25f)
                curveTo(20.0f, 5.0074f, 18.9926f, 4.0f, 17.75f, 4.0f)
                lineTo(15.9862f, 3.9994f)
                curveTo(15.8616f, 2.8747f, 14.9079f, 2.0f, 13.75f, 2.0f)
                close()
                moveTo(12.0f, 20.5f)
                curveTo(12.0f, 21.3284f, 11.3284f, 22.0f, 10.5f, 22.0f)
                curveTo(9.6716f, 22.0f, 9.0f, 21.3284f, 9.0f, 20.5f)
                curveTo(9.0f, 19.6716f, 9.6716f, 19.0f, 10.5f, 19.0f)
                curveTo(11.3284f, 19.0f, 12.0f, 19.6716f, 12.0f, 20.5f)
                close()
                moveTo(15.5f, 22.0f)
                curveTo(16.3284f, 22.0f, 17.0f, 21.3284f, 17.0f, 20.5f)
                curveTo(17.0f, 19.6716f, 16.3284f, 19.0f, 15.5f, 19.0f)
                curveTo(14.6716f, 19.0f, 14.0f, 19.6716f, 14.0f, 20.5f)
                curveTo(14.0f, 21.3284f, 14.6716f, 22.0f, 15.5f, 22.0f)
                close()
                moveTo(20.5f, 22.0f)
                curveTo(21.3284f, 22.0f, 22.0f, 21.3284f, 22.0f, 20.5f)
                curveTo(22.0f, 19.6716f, 21.3284f, 19.0f, 20.5f, 19.0f)
                curveTo(19.6716f, 19.0f, 19.0f, 19.6716f, 19.0f, 20.5f)
                curveTo(19.0f, 21.3284f, 19.6716f, 22.0f, 20.5f, 22.0f)
                close()
            }
        }
        .build()
        return _clipboardMore!!
    }

private var _clipboardMore: ImageVector? = null
