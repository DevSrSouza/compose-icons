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

public val SimpleIcons.Rye: ImageVector
    get() {
        if (_rye != null) {
            return _rye!!
        }
        _rye = Builder(name = "Rye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.372f, 0.0f, 11.999f)
                curveToRelative(0.0f, 5.422f, 3.597f, 10.003f, 8.536f, 11.49f)
                curveToRelative(0.011f, -0.186f, 0.028f, -0.406f, 0.049f, -0.669f)
                curveToRelative(0.026f, -0.316f, -0.142f, -0.784f, -0.382f, -0.963f)
                curveToRelative(-2.67f, -1.997f, -3.534f, -4.125f, -2.906f, -7.394f)
                arcToRelative(0.197f, 0.197f, 0.0f, false, true, 0.335f, -0.101f)
                curveToRelative(0.72f, 0.747f, 1.234f, 1.218f, 1.988f, 2.094f)
                curveToRelative(1.121f, 1.305f, 1.557f, 2.839f, 1.42f, 4.59f)
                curveToRelative(0.123f, -0.531f, 0.3f, -1.057f, 0.358f, -1.596f)
                curveToRelative(0.242f, -2.222f, 0.775f, -4.326f, 2.426f, -5.958f)
                curveToRelative(0.425f, -0.42f, 0.939f, -0.823f, 1.488f, -1.033f)
                curveToRelative(1.448f, -0.552f, 2.953f, -0.965f, 3.931f, -2.339f)
                curveToRelative(0.08f, 0.049f, -0.451f, 1.869f, -0.541f, 2.263f)
                curveToRelative(-0.645f, 2.193f, -0.42f, 2.3f, -1.186f, 4.45f)
                curveToRelative(-0.506f, 1.417f, -1.596f, 2.404f, -3.125f, 2.798f)
                curveToRelative(-1.504f, 0.386f, -2.349f, 1.4f, -2.56f, 2.898f)
                curveToRelative(-0.077f, 0.558f, -0.123f, 0.947f, -0.149f, 1.246f)
                curveToRelative(0.75f, 0.147f, 1.525f, 0.225f, 2.318f, 0.225f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.372f, 12.0f, -11.999f)
                curveTo(24.0f, 5.374f, 18.629f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(10.842f, 13.463f)
                arcToRelative(1.425f, 1.425f, 0.0f, false, true, -0.306f, 0.689f)
                curveToRelative(-0.578f, 0.658f, -1.105f, 1.844f, -1.418f, 3.425f)
                curveToRelative(-0.567f, -1.75f, -2.556f, -3.304f, -3.273f, -4.606f)
                curveToRelative(-0.247f, -0.448f, -0.051f, -1.963f, 0.281f, -3.223f)
                curveToRelative(0.607f, -1.782f, 0.637f, -2.096f, 0.981f, -3.594f)
                curveToRelative(1.689f, 1.365f, 2.041f, 2.267f, 2.954f, 3.879f)
                curveToRelative(0.456f, 0.804f, 0.957f, 1.904f, 0.782f, 3.43f)
                close()
                moveTo(15.069f, 11.191f)
                curveToRelative(-1.586f, 0.647f, -2.565f, 1.018f, -3.576f, 1.82f)
                curveToRelative(0.252f, -1.354f, -0.602f, -2.944f, -1.137f, -4.146f)
                curveToRelative(-0.079f, -0.177f, 0.948f, -1.858f, 1.13f, -2.14f)
                curveToRelative(1.205f, -1.498f, 1.17f, -1.767f, 2.83f, -2.38f)
                curveToRelative(1.354f, -0.5f, 2.719f, -0.97f, 4.065f, -1.449f)
                curveToRelative(-0.24f, 3.291f, -0.805f, 7.273f, -3.312f, 8.295f)
                close()
            }
        }
        .build()
        return _rye!!
    }

private var _rye: ImageVector? = null
