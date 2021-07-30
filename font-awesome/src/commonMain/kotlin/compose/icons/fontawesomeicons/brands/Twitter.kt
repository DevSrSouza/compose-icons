package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(459.37f, 151.716f)
                curveToRelative(0.325f, 4.548f, 0.325f, 9.097f, 0.325f, 13.645f)
                curveToRelative(0.0f, 138.72f, -105.583f, 298.558f, -298.558f, 298.558f)
                curveToRelative(-59.452f, 0.0f, -114.68f, -17.219f, -161.137f, -47.106f)
                curveToRelative(8.447f, 0.974f, 16.568f, 1.299f, 25.34f, 1.299f)
                curveToRelative(49.055f, 0.0f, 94.213f, -16.568f, 130.274f, -44.832f)
                curveToRelative(-46.132f, -0.975f, -84.792f, -31.188f, -98.112f, -72.772f)
                curveToRelative(6.498f, 0.974f, 12.995f, 1.624f, 19.818f, 1.624f)
                curveToRelative(9.421f, 0.0f, 18.843f, -1.3f, 27.614f, -3.573f)
                curveToRelative(-48.081f, -9.747f, -84.143f, -51.98f, -84.143f, -102.985f)
                verticalLineToRelative(-1.299f)
                curveToRelative(13.969f, 7.797f, 30.214f, 12.67f, 47.431f, 13.319f)
                curveToRelative(-28.264f, -18.843f, -46.781f, -51.005f, -46.781f, -87.391f)
                curveToRelative(0.0f, -19.492f, 5.197f, -37.36f, 14.294f, -52.954f)
                curveToRelative(51.655f, 63.675f, 129.3f, 105.258f, 216.365f, 109.807f)
                curveToRelative(-1.624f, -7.797f, -2.599f, -15.918f, -2.599f, -24.04f)
                curveToRelative(0.0f, -57.828f, 46.782f, -104.934f, 104.934f, -104.934f)
                curveToRelative(30.213f, 0.0f, 57.502f, 12.67f, 76.67f, 33.137f)
                curveToRelative(23.715f, -4.548f, 46.456f, -13.32f, 66.599f, -25.34f)
                curveToRelative(-7.798f, 24.366f, -24.366f, 44.833f, -46.132f, 57.827f)
                curveToRelative(21.117f, -2.273f, 41.584f, -8.122f, 60.426f, -16.243f)
                curveToRelative(-14.292f, 20.791f, -32.161f, 39.308f, -52.628f, 54.253f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
