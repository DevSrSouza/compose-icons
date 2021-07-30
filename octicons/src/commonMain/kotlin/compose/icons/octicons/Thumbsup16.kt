package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
                    pathFillType = EvenOdd) {
                moveTo(8.834f, 0.066f)
                curveTo(7.494f, -0.087f, 6.5f, 1.048f, 6.5f, 2.25f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.329f, -0.647f, 2.124f, -1.318f, 2.614f)
                curveToRelative(-0.328f, 0.24f, -0.66f, 0.403f, -0.918f, 0.508f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 2.75f, 5.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 6.75f)
                verticalLineToRelative(7.5f)
                curveTo(0.0f, 15.216f, 0.784f, 16.0f, 1.75f, 16.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.662f, -1.201f)
                curveToRelative(0.525f, 0.075f, 1.067f, 0.229f, 1.725f, 0.415f)
                curveToRelative(0.152f, 0.043f, 0.31f, 0.088f, 0.475f, 0.133f)
                curveToRelative(1.154f, 0.32f, 2.54f, 0.653f, 4.388f, 0.653f)
                curveToRelative(1.706f, 0.0f, 2.97f, -0.153f, 3.722f, -1.14f)
                curveToRelative(0.353f, -0.463f, 0.537f, -1.042f, 0.668f, -1.672f)
                curveToRelative(0.118f, -0.56f, 0.208f, -1.243f, 0.313f, -2.033f)
                lineToRelative(0.04f, -0.306f)
                curveToRelative(0.25f, -1.869f, 0.265f, -3.318f, -0.188f, -4.316f)
                arcToRelative(2.418f, 2.418f, 0.0f, false, false, -1.137f, -1.2f)
                curveTo(13.924f, 5.085f, 13.353f, 5.0f, 12.75f, 5.0f)
                horizontalLineToRelative(-1.422f)
                lineToRelative(0.015f, -0.113f)
                curveToRelative(0.07f, -0.518f, 0.157f, -1.17f, 0.157f, -1.637f)
                curveToRelative(0.0f, -0.922f, -0.151f, -1.719f, -0.656f, -2.3f)
                curveToRelative(-0.51f, -0.589f, -1.247f, -0.797f, -2.01f, -0.884f)
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
                arcToRelative(0.922f, 0.922f, 0.0f, false, false, -0.442f, -0.48f)
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
                arcToRelative(5.861f, 5.861f, 0.0f, false, true, -1.567f, 0.81f)
                verticalLineTo(13.3f)
                close()
                moveTo(2.75f, 6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _thumbsup16!!
    }

private var _thumbsup16: ImageVector? = null
