package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Thumbsup16: ImageVector
    get() {
        if (_thumbsup16 != null) {
            return _thumbsup16!!
        }
        _thumbsup16 = Builder(name = "Thumbsup16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.834f, 0.066f)
                curveToRelative(0.763f, 0.087f, 1.5f, 0.295f, 2.01f, 0.884f)
                curveToRelative(0.505f, 0.581f, 0.656f, 1.378f, 0.656f, 2.3f)
                curveToRelative(0.0f, 0.467f, -0.087f, 1.119f, -0.157f, 1.637f)
                lineTo(11.328f, 5.0f)
                horizontalLineToRelative(1.422f)
                curveToRelative(0.603f, 0.0f, 1.174f, 0.085f, 1.668f, 0.333f)
                curveToRelative(0.508f, 0.254f, 0.911f, 0.679f, 1.137f, 1.2f)
                curveToRelative(0.453f, 0.998f, 0.438f, 2.447f, 0.188f, 4.316f)
                lineToRelative(-0.04f, 0.306f)
                curveToRelative(-0.105f, 0.79f, -0.195f, 1.473f, -0.313f, 2.033f)
                curveToRelative(-0.131f, 0.63f, -0.315f, 1.209f, -0.668f, 1.672f)
                curveTo(13.97f, 15.847f, 12.706f, 16.0f, 11.0f, 16.0f)
                curveToRelative(-1.848f, 0.0f, -3.234f, -0.333f, -4.388f, -0.653f)
                curveToRelative(-0.165f, -0.045f, -0.323f, -0.09f, -0.475f, -0.133f)
                curveToRelative(-0.658f, -0.186f, -1.2f, -0.34f, -1.725f, -0.415f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.75f, 16.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 14.25f)
                verticalLineToRelative(-7.5f)
                curveTo(0.0f, 5.784f, 0.784f, 5.0f, 1.75f, 5.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.514f, 0.872f)
                curveToRelative(0.258f, -0.105f, 0.59f, -0.268f, 0.918f, -0.508f)
                curveTo(5.853f, 4.874f, 6.5f, 4.079f, 6.5f, 2.75f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.202f, 0.994f, -2.337f, 2.334f, -2.184f)
                close()
                moveTo(4.5f, 13.3f)
                curveToRelative(0.705f, 0.088f, 1.39f, 0.284f, 2.072f, 0.478f)
                lineToRelative(0.441f, 0.125f)
                curveToRelative(1.096f, 0.305f, 2.334f, 0.598f, 3.987f, 0.598f)
                curveToRelative(1.794f, 0.0f, 2.28f, -0.223f, 2.528f, -0.549f)
                curveToRelative(0.147f, -0.193f, 0.276f, -0.505f, 0.394f, -1.07f)
                curveToRelative(0.105f, -0.502f, 0.188f, -1.124f, 0.295f, -1.93f)
                lineToRelative(0.04f, -0.3f)
                curveToRelative(0.25f, -1.882f, 0.189f, -2.933f, -0.068f, -3.497f)
                arcToRelative(0.921f, 0.921f, 0.0f, false, false, -0.442f, -0.48f)
                curveToRelative(-0.208f, -0.104f, -0.52f, -0.174f, -0.997f, -0.174f)
                horizontalLineTo(11.0f)
                curveToRelative(-0.686f, 0.0f, -1.295f, -0.577f, -1.206f, -1.336f)
                curveToRelative(0.023f, -0.192f, 0.05f, -0.39f, 0.076f, -0.586f)
                curveToRelative(0.065f, -0.488f, 0.13f, -0.97f, 0.13f, -1.328f)
                curveToRelative(0.0f, -0.809f, -0.144f, -1.15f, -0.288f, -1.316f)
                curveToRelative(-0.137f, -0.158f, -0.402f, -0.304f, -1.048f, -0.378f)
                curveTo(8.357f, 1.521f, 8.0f, 1.793f, 8.0f, 2.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.922f, -0.978f, 3.128f, -1.933f, 3.825f)
                arcToRelative(5.831f, 5.831f, 0.0f, false, true, -1.567f, 0.81f)
                close()
                moveTo(2.75f, 6.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _thumbsup16!!
    }

private var _thumbsup16: ImageVector? = null
