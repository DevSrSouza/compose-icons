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

public val FilledGroup.ClipboardDataBar: ImageVector
    get() {
        if (_clipboardDataBar != null) {
            return _clipboardDataBar!!
        }
        _clipboardDataBar = Builder(name = "ClipboardDataBar", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 22.0f, 20.0f, 20.9926f, 20.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(20.0f, 5.0074f, 18.9926f, 4.0f, 17.75f, 4.0f)
                lineTo(15.9862f, 3.9994f)
                curveTo(15.8616f, 2.8747f, 14.9079f, 2.0f, 13.75f, 2.0f)
                close()
                moveTo(16.5f, 13.75f)
                verticalLineTo(17.25f)
                curveTo(16.5f, 17.6642f, 16.1642f, 18.0f, 15.75f, 18.0f)
                curveTo(15.3358f, 18.0f, 15.0f, 17.6642f, 15.0f, 17.25f)
                verticalLineTo(13.75f)
                curveTo(15.0f, 13.3358f, 15.3358f, 13.0f, 15.75f, 13.0f)
                curveTo(16.1642f, 13.0f, 16.5f, 13.3358f, 16.5f, 13.75f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(12.4142f, 11.0f, 12.75f, 11.3358f, 12.75f, 11.75f)
                verticalLineTo(17.25f)
                curveTo(12.75f, 17.6642f, 12.4142f, 18.0f, 12.0f, 18.0f)
                curveTo(11.5858f, 18.0f, 11.25f, 17.6642f, 11.25f, 17.25f)
                verticalLineTo(11.75f)
                curveTo(11.25f, 11.3358f, 11.5858f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(9.0f, 9.75f)
                verticalLineTo(17.25f)
                curveTo(9.0f, 17.6642f, 8.6642f, 18.0f, 8.25f, 18.0f)
                curveTo(7.8358f, 18.0f, 7.5f, 17.6642f, 7.5f, 17.25f)
                verticalLineTo(9.75f)
                curveTo(7.5f, 9.3358f, 7.8358f, 9.0f, 8.25f, 9.0f)
                curveTo(8.6642f, 9.0f, 9.0f, 9.3358f, 9.0f, 9.75f)
                close()
            }
        }
        .build()
        return _clipboardDataBar!!
    }

private var _clipboardDataBar: ImageVector? = null
