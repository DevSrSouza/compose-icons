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

public val FilledGroup.ClipboardImage: ImageVector
    get() {
        if (_clipboardImage != null) {
            return _clipboardImage!!
        }
        _clipboardImage = Builder(name = "ClipboardImage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.25f, 2.0f)
                horizontalLineTo(13.75f)
                curveTo(14.9079f, 2.0f, 15.8616f, 2.8747f, 15.9862f, 3.9994f)
                lineTo(17.75f, 4.0f)
                curveTo(18.9926f, 4.0f, 20.0f, 5.0074f, 20.0f, 6.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                curveTo(12.7909f, 11.0f, 11.0f, 12.7909f, 11.0f, 15.0f)
                verticalLineTo(20.0f)
                curveTo(11.0f, 20.7286f, 11.1948f, 21.4117f, 11.5351f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4.0f, 5.0074f, 5.0074f, 4.0f, 6.25f, 4.0f)
                lineTo(8.0138f, 3.9994f)
                curveTo(8.1384f, 2.8747f, 9.092f, 2.0f, 10.25f, 2.0f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(13.3431f, 12.0f, 12.0f, 13.3431f, 12.0f, 15.0f)
                verticalLineTo(20.0f)
                curveTo(12.0f, 20.5564f, 12.1514f, 21.0773f, 12.4154f, 21.524f)
                lineTo(15.909f, 18.0303f)
                curveTo(16.7877f, 17.1516f, 18.2123f, 17.1517f, 19.091f, 18.0303f)
                lineTo(22.5846f, 21.524f)
                curveTo(22.8486f, 21.0773f, 23.0f, 20.5564f, 23.0f, 20.0f)
                verticalLineTo(15.0f)
                curveTo(23.0f, 13.3431f, 21.6569f, 12.0f, 20.0f, 12.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(15.0f, 23.0f)
                curveTo(14.4436f, 23.0f, 13.9227f, 22.8486f, 13.476f, 22.5846f)
                lineTo(16.9697f, 19.091f)
                curveTo(17.2626f, 18.7981f, 17.7374f, 18.7981f, 18.0303f, 19.091f)
                lineTo(21.524f, 22.5846f)
                curveTo(21.0773f, 22.8486f, 20.5564f, 23.0f, 20.0f, 23.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(20.0f, 16.0f)
                curveTo(19.4477f, 16.0f, 19.0f, 15.5523f, 19.0f, 15.0f)
                curveTo(19.0f, 14.4477f, 19.4477f, 14.0f, 20.0f, 14.0f)
                curveTo(20.5523f, 14.0f, 21.0f, 14.4477f, 21.0f, 15.0f)
                curveTo(21.0f, 15.5523f, 20.5523f, 16.0f, 20.0f, 16.0f)
                close()
            }
        }
        .build()
        return _clipboardImage!!
    }

private var _clipboardImage: ImageVector? = null
