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

public val SimpleIcons.Taichilang: ImageVector
    get() {
        if (_taichilang != null) {
            return _taichilang!!
        }
        _taichilang = Builder(name = "Taichilang", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.526f, 4.6782f)
                curveToRelative(-0.0196f, 1.6052f, -0.8167f, 2.8963f, -2.211f, 3.8542f)
                curveToRelative(-1.2176f, 0.8371f, -2.47f, 1.627f, -3.6316f, 2.5398f)
                curveToRelative(-1.8976f, 1.4954f, -3.1392f, 3.4337f, -3.1784f, 5.9263f)
                curveToRelative(-0.0415f, 2.7115f, 1.1753f, 4.7975f, 3.4344f, 6.274f)
                curveToRelative(0.0415f, 0.0276f, 0.0888f, 0.0502f, 0.1302f, 0.0756f)
                curveToRelative(0.2f, 0.123f, 0.3637f, 0.3055f, 0.2197f, 0.5237f)
                curveToRelative(-0.0698f, 0.1033f, -0.3273f, 0.1542f, -0.4728f, 0.115f)
                curveToRelative(-1.2168f, -0.2975f, -2.3856f, -0.731f, -3.4556f, -1.395f)
                curveToRelative(-3.462f, -2.1486f, -5.484f, -5.2623f, -5.9517f, -9.318f)
                curveTo(-0.2542f, 7.4683f, 3.1934f, 2.0903f, 8.6833f, 0.3542f)
                curveToRelative(1.3558f, -0.4313f, 2.7224f, -0.5266f, 4.0731f, 0.0422f)
                curveToRelative(1.7223f, 0.72f, 2.8257f, 2.3806f, 2.7697f, 4.2818f)
                close()
                moveTo(23.6722f, 13.943f)
                curveToRelative(-0.0276f, 1.0699f, -0.328f, 2.2693f, -1.4445f, 3.1115f)
                curveToRelative(-1.3004f, 0.9805f, -2.9755f, 0.9165f, -3.9981f, -0.1483f)
                arcToRelative(2.8359f, 2.8359f, 0.0f, false, true, -0.6444f, -1.0809f)
                arcToRelative(2.9144f, 2.9144f, 0.0f, false, true, -0.12f, -1.2546f)
                arcToRelative(2.8788f, 2.8788f, 0.0f, false, true, 0.4334f, -1.1856f)
                arcToRelative(2.8439f, 2.8439f, 0.0f, false, true, 0.8976f, -0.8786f)
                curveToRelative(0.1389f, -0.0873f, 0.2807f, -0.171f, 0.4218f, -0.2524f)
                curveToRelative(1.1674f, -0.6582f, 1.6925f, -1.6889f, 1.731f, -3.0053f)
                arcToRelative(1.9547f, 1.9547f, 0.0f, false, true, 0.0895f, -0.3804f)
                curveToRelative(0.131f, 0.056f, 0.28f, 0.0836f, 0.3884f, 0.1709f)
                curveToRelative(1.4336f, 1.126f, 2.2453f, 2.8148f, 2.2453f, 4.9037f)
                close()
            }
        }
        .build()
        return _taichilang!!
    }

private var _taichilang: ImageVector? = null
