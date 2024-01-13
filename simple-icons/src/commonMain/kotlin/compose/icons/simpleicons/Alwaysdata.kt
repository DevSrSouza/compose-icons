package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Alwaysdata: ImageVector
    get() {
        if (_alwaysdata != null) {
            return _alwaysdata!!
        }
        _alwaysdata = Builder(name = "Alwaysdata", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0536f, 15.2543f)
                curveToRelative(1.2615f, 1.2625f, 1.2622f, 3.3114f, 0.0f, 4.5728f)
                curveToRelative(-1.2617f, 1.2621f, -3.3068f, 1.2607f, -4.5687f, -0.0018f)
                curveToRelative(-0.9599f, -0.9598f, -1.1874f, -2.3713f, -0.6878f, -3.5476f)
                lineTo(12.97f, 8.9472f)
                arcToRelative(2.903f, 2.903f, 0.0f, false, true, -0.765f, -0.0068f)
                lineToRelative(-4.6071f, 6.2009f)
                curveToRelative(0.2567f, 0.7533f, 0.0937f, 1.6183f, -0.5072f, 2.2176f)
                curveToRelative(-0.8397f, 0.8413f, -2.2063f, 0.8399f, -3.0474f, -0.0017f)
                curveToRelative(-0.6534f, -0.6533f, -0.7916f, -1.622f, -0.428f, -2.4164f)
                lineToRelative(-2.0027f, -2.9336f)
                curveToRelative(-0.0585f, 0.0072f, -0.116f, 0.0176f, -0.1766f, 0.0176f)
                curveToRelative(-0.7923f, 0.0f, -1.4359f, -0.642f, -1.4359f, -1.4356f)
                curveToRelative(0.0f, -0.7928f, 0.6436f, -1.4359f, 1.436f, -1.4359f)
                curveToRelative(0.7936f, 0.0f, 1.4358f, 0.6431f, 1.4358f, 1.436f)
                curveToRelative(0.0f, 0.2516f, -0.0703f, 0.485f, -0.1838f, 0.6904f)
                lineToRelative(2.0731f, 2.5544f)
                curveToRelative(0.5163f, -0.2096f, 1.069f, -0.191f, 1.5494f, -0.0132f)
                lineToRelative(3.8572f, -6.2123f)
                curveToRelative(-0.686f, -1.107f, -0.5521f, -2.5782f, 0.4096f, -3.5401f)
                curveToRelative(1.1215f, -1.1218f, 2.9412f, -1.1218f, 4.0608f, -7.0E-4f)
                curveToRelative(0.8791f, 0.8786f, 1.0666f, 2.1881f, 0.5676f, 3.2539f)
                lineToRelative(5.24f, 7.0044f)
                curveToRelative(0.9312f, -0.0937f, 1.8947f, 0.215f, 2.608f, 0.9282f)
                close()
            }
        }
        .build()
        return _alwaysdata!!
    }

private var _alwaysdata: ImageVector? = null
