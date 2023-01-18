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

public val RegularGroup.ClipboardLetter: ImageVector
    get() {
        if (_clipboardLetter != null) {
            return _clipboardLetter!!
        }
        _clipboardLetter = Builder(name = "ClipboardLetter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 2.0f)
                curveTo(14.9084f, 2.0f, 15.8623f, 2.8754f, 15.9863f, 4.0007f)
                lineTo(15.9862f, 3.9994f)
                lineTo(17.75f, 4.0f)
                curveTo(18.9926f, 4.0f, 20.0f, 5.0074f, 20.0f, 6.25f)
                verticalLineTo(14.522f)
                lineTo(18.5f, 11.1942f)
                verticalLineTo(6.25f)
                curveTo(18.5f, 5.8358f, 18.1642f, 5.5f, 17.75f, 5.5f)
                lineTo(15.621f, 5.5002f)
                curveTo(15.2174f, 6.1031f, 14.53f, 6.5f, 13.75f, 6.5f)
                horizontalLineTo(10.25f)
                curveTo(9.47f, 6.5f, 8.7827f, 6.1031f, 8.379f, 5.5002f)
                lineTo(6.25f, 5.5f)
                curveTo(5.8358f, 5.5f, 5.5f, 5.8358f, 5.5f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.1642f, 5.8358f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(11.3005f)
                lineTo(11.1275f, 20.8848f)
                curveTo(10.9626f, 21.2513f, 10.9571f, 21.6489f, 11.0813f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(4.0f, 5.0074f, 5.0074f, 4.0f, 6.25f, 4.0f)
                lineTo(8.0138f, 3.9994f)
                curveTo(8.1384f, 2.8747f, 9.092f, 2.0f, 10.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(15.9948f, 4.096f)
                lineTo(16.0f, 4.25f)
                curveTo(16.0f, 4.1982f, 15.9983f, 4.1469f, 15.9948f, 4.096f)
                close()
                moveTo(13.75f, 3.5f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 3.5f, 9.5f, 3.8358f, 9.5f, 4.25f)
                curveTo(9.5f, 4.6642f, 9.8358f, 5.0f, 10.25f, 5.0f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 5.0f, 14.5f, 4.6642f, 14.5f, 4.25f)
                curveTo(14.5f, 3.8358f, 14.1642f, 3.5f, 13.75f, 3.5f)
                close()
                moveTo(17.4483f, 11.2945f)
                curveTo(17.3675f, 11.1152f, 17.189f, 10.9999f, 16.9923f, 11.0f)
                curveTo(16.7956f, 11.0001f, 16.6172f, 11.1155f, 16.5365f, 11.2949f)
                lineTo(13.8427f, 17.2851f)
                curveTo(13.8395f, 17.2918f, 13.8365f, 17.2985f, 13.8336f, 17.3053f)
                lineTo(12.0395f, 21.2949f)
                curveTo(11.9262f, 21.5468f, 12.0386f, 21.8428f, 12.2904f, 21.956f)
                curveTo(12.5423f, 22.0693f, 12.8382f, 21.9569f, 12.9515f, 21.7051f)
                lineTo(14.6177f, 18.0f)
                horizontalLineTo(19.3739f)
                lineTo(21.0441f, 21.7055f)
                curveTo(21.1576f, 21.9572f, 21.4537f, 22.0693f, 21.7054f, 21.9558f)
                curveTo(21.9572f, 21.8424f, 22.0693f, 21.5463f, 21.9558f, 21.2945f)
                lineTo(20.1575f, 17.3049f)
                curveTo(20.1546f, 17.2981f, 20.1516f, 17.2914f, 20.1484f, 17.2847f)
                lineTo(17.4483f, 11.2945f)
                close()
                moveTo(18.9232f, 17.0f)
                horizontalLineTo(15.0674f)
                lineTo(16.993f, 12.7179f)
                lineTo(18.9232f, 17.0f)
                close()
            }
        }
        .build()
        return _clipboardLetter!!
    }

private var _clipboardLetter: ImageVector? = null
