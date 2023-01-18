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

public val RegularGroup.ClipboardSearch: ImageVector
    get() {
        if (_clipboardSearch != null) {
            return _clipboardSearch!!
        }
        _clipboardSearch = Builder(name = "ClipboardSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9862f, 3.9994f)
                curveTo(15.8616f, 2.8747f, 14.9079f, 2.0f, 13.75f, 2.0f)
                horizontalLineTo(10.25f)
                curveTo(9.092f, 2.0f, 8.1384f, 2.8747f, 8.0138f, 3.9994f)
                lineTo(6.25f, 4.0f)
                curveTo(5.0074f, 4.0f, 4.0f, 5.0074f, 4.0f, 6.25f)
                verticalLineTo(10.0997f)
                curveTo(4.4655f, 9.8617f, 4.9694f, 9.6881f, 5.5f, 9.5907f)
                verticalLineTo(6.25f)
                curveTo(5.5f, 5.8358f, 5.8358f, 5.5f, 6.25f, 5.5f)
                lineTo(8.379f, 5.5002f)
                curveTo(8.7827f, 6.1031f, 9.47f, 6.5f, 10.25f, 6.5f)
                horizontalLineTo(13.75f)
                curveTo(14.53f, 6.5f, 15.2174f, 6.1031f, 15.621f, 5.5002f)
                lineTo(17.75f, 5.5f)
                curveTo(18.1642f, 5.5f, 18.5f, 5.8358f, 18.5f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(18.5f, 20.1642f, 18.1642f, 20.5f, 17.75f, 20.5f)
                horizontalLineTo(13.8316f)
                curveTo(14.0561f, 20.9734f, 14.0561f, 21.5266f, 13.8316f, 22.0f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 22.0f, 20.0f, 20.9926f, 20.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(20.0f, 5.0074f, 18.9926f, 4.0f, 17.75f, 4.0f)
                lineTo(15.9862f, 3.9994f)
                close()
                moveTo(15.9948f, 4.096f)
                lineTo(16.0f, 4.25f)
                curveTo(16.0f, 4.1982f, 15.9983f, 4.1469f, 15.9948f, 4.096f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 3.5f, 14.5f, 3.8358f, 14.5f, 4.25f)
                curveTo(14.5f, 4.6642f, 14.1642f, 5.0f, 13.75f, 5.0f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 5.0f, 9.5f, 4.6642f, 9.5f, 4.25f)
                curveTo(9.5f, 3.8358f, 9.8358f, 3.5f, 10.25f, 3.5f)
                close()
                moveTo(9.95f, 17.8894f)
                curveTo(10.6054f, 17.1076f, 11.0f, 16.0999f, 11.0f, 15.0f)
                curveTo(11.0f, 12.5147f, 8.9853f, 10.5f, 6.5f, 10.5f)
                curveTo(4.0147f, 10.5f, 2.0f, 12.5147f, 2.0f, 15.0f)
                curveTo(2.0f, 17.4853f, 4.0147f, 19.5f, 6.5f, 19.5f)
                curveTo(7.3425f, 19.5f, 8.1308f, 19.2685f, 8.805f, 18.8656f)
                lineTo(11.7197f, 21.7803f)
                curveTo(12.0126f, 22.0732f, 12.4874f, 22.0732f, 12.7803f, 21.7803f)
                curveTo(13.0732f, 21.4874f, 13.0732f, 21.0126f, 12.7803f, 20.7197f)
                lineTo(9.95f, 17.8894f)
                close()
                moveTo(6.5f, 18.0f)
                curveTo(4.8432f, 18.0f, 3.5f, 16.6569f, 3.5f, 15.0f)
                curveTo(3.5f, 13.3431f, 4.8432f, 12.0f, 6.5f, 12.0f)
                curveTo(8.1568f, 12.0f, 9.5f, 13.3431f, 9.5f, 15.0f)
                curveTo(9.5f, 16.6569f, 8.1568f, 18.0f, 6.5f, 18.0f)
                close()
            }
        }
        .build()
        return _clipboardSearch!!
    }

private var _clipboardSearch: ImageVector? = null
