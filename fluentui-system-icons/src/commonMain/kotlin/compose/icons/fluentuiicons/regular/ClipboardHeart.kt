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

public val RegularGroup.ClipboardHeart: ImageVector
    get() {
        if (_clipboardHeart != null) {
            return _clipboardHeart!!
        }
        _clipboardHeart = Builder(name = "ClipboardHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.25f)
                verticalLineTo(11.2317f)
                curveTo(19.4999f, 11.1759f, 18.9923f, 11.2044f, 18.5f, 11.3171f)
                verticalLineTo(6.25f)
                curveTo(18.5f, 5.8358f, 18.1642f, 5.5f, 17.75f, 5.5f)
                lineTo(15.621f, 5.5002f)
                curveTo(15.2173f, 6.1031f, 14.53f, 6.5f, 13.75f, 6.5f)
                horizontalLineTo(10.25f)
                curveTo(9.47f, 6.5f, 8.7826f, 6.1031f, 8.379f, 5.5002f)
                lineTo(6.25f, 5.5f)
                curveTo(5.8358f, 5.5f, 5.5f, 5.8358f, 5.5f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.1642f, 5.8358f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(13.0394f)
                lineTo(14.5394f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4.0f, 5.0074f, 5.0074f, 4.0f, 6.25f, 4.0f)
                lineTo(8.0138f, 3.9994f)
                curveTo(8.1384f, 2.8747f, 9.092f, 2.0f, 10.25f, 2.0f)
                horizontalLineTo(13.75f)
                curveTo(14.9079f, 2.0f, 15.8616f, 2.8747f, 15.9862f, 3.9994f)
                lineTo(17.75f, 4.0f)
                curveTo(18.9926f, 4.0f, 20.0f, 5.0074f, 20.0f, 6.25f)
                close()
                moveTo(15.9948f, 4.096f)
                lineTo(16.0f, 4.25f)
                curveTo(16.0f, 4.1982f, 15.9983f, 4.1469f, 15.9948f, 4.096f)
                close()
                moveTo(10.25f, 3.5f)
                curveTo(9.8358f, 3.5f, 9.5f, 3.8358f, 9.5f, 4.25f)
                curveTo(9.5f, 4.6642f, 9.8358f, 5.0f, 10.25f, 5.0f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 5.0f, 14.5f, 4.6642f, 14.5f, 4.25f)
                curveTo(14.5f, 3.8358f, 14.1642f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(10.25f)
                close()
                moveTo(16.484f, 22.5303f)
                curveTo(16.6304f, 22.6768f, 16.8224f, 22.75f, 17.0144f, 22.75f)
                curveTo(17.2064f, 22.75f, 17.3983f, 22.6768f, 17.5448f, 22.5303f)
                lineTo(21.953f, 18.122f)
                curveTo(23.3069f, 16.7682f, 23.3069f, 14.5732f, 21.953f, 13.2194f)
                curveTo(20.5992f, 11.8655f, 18.4042f, 11.8655f, 17.0504f, 13.2194f)
                lineTo(17.0144f, 13.2554f)
                lineTo(16.9784f, 13.2194f)
                curveTo(15.6245f, 11.8655f, 13.4295f, 11.8655f, 12.0757f, 13.2194f)
                curveTo(10.7218f, 14.5732f, 10.7218f, 16.7682f, 12.0757f, 18.122f)
                lineTo(16.484f, 22.5303f)
                close()
            }
        }
        .build()
        return _clipboardHeart!!
    }

private var _clipboardHeart: ImageVector? = null
