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

public val SimpleIcons.Sonarcloud: ImageVector
    get() {
        if (_sonarcloud != null) {
            return _sonarcloud!!
        }
        _sonarcloud = Builder(name = "Sonarcloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.406f, 10.9f)
                arcToRelative(7.088f, 7.088f, 0.0f, false, false, -3.377f, -2.358f)
                verticalLineToRelative(-0.085f)
                curveToRelative(0.0f, -4.035f, -3.156f, -7.324f, -7.047f, -7.324f)
                curveToRelative(-3.893f, 0.0f, -7.05f, 3.282f, -7.05f, 7.325f)
                verticalLineToRelative(0.1f)
                curveTo(2.081f, 9.492f, 0.0f, 12.268f, 0.0f, 15.542f)
                curveToRelative(0.0f, 4.035f, 3.159f, 7.325f, 7.05f, 7.325f)
                arcToRelative(6.907f, 6.907f, 0.0f, false, false, 4.952f, -2.108f)
                arcToRelative(6.885f, 6.885f, 0.0f, false, false, 4.947f, 2.108f)
                curveToRelative(3.884f, 0.0f, 7.051f, -3.282f, 7.051f, -7.325f)
                arcToRelative(7.572f, 7.572f, 0.0f, false, false, -1.594f, -4.643f)
                close()
                moveTo(16.95f, 21.014f)
                curveToRelative(-2.903f, 0.0f, -5.267f, -2.456f, -5.267f, -5.474f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, -0.89f, -0.924f)
                arcToRelative(0.906f, 0.906f, 0.0f, false, false, -0.892f, 0.925f)
                curveToRelative(0.0f, 1.368f, 0.367f, 2.651f, 0.994f, 3.748f)
                arcToRelative(5.156f, 5.156f, 0.0f, false, true, -3.845f, 1.733f)
                curveToRelative(-2.904f, 0.0f, -5.27f, -2.457f, -5.27f, -5.474f)
                curveToRelative(0.0f, -3.016f, 2.366f, -5.473f, 5.27f, -5.473f)
                curveToRelative(0.63f, 0.0f, 1.241f, 0.117f, 1.827f, 0.335f)
                curveToRelative(0.007f, 0.0f, 0.013f, 0.007f, 0.02f, 0.007f)
                curveToRelative(0.203f, 0.071f, 0.489f, 0.21f, 0.578f, 0.287f)
                arcToRelative(0.858f, 0.858f, 0.0f, false, false, 1.249f, -0.1f)
                arcToRelative(0.942f, 0.942f, 0.0f, false, false, -0.097f, -1.3f)
                curveToRelative(-0.39f, -0.342f, -0.995f, -0.575f, -1.144f, -0.63f)
                arcToRelative(6.814f, 6.814f, 0.0f, false, false, -2.425f, -0.443f)
                curveToRelative(-0.113f, 0.0f, -0.225f, 0.0f, -0.338f, 0.007f)
                curveToRelative(0.12f, -2.916f, 2.433f, -5.247f, 5.27f, -5.247f)
                curveToRelative(2.903f, 0.0f, 5.267f, 2.456f, 5.267f, 5.474f)
                arcToRelative(5.569f, 5.569f, 0.0f, false, true, -2.215f, 4.463f)
                arcToRelative(0.948f, 0.948f, 0.0f, false, false, -0.21f, 1.283f)
                curveToRelative(0.171f, 0.25f, 0.45f, 0.39f, 0.727f, 0.39f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, false, 0.516f, -0.172f)
                arcToRelative(7.381f, 7.381f, 0.0f, false, false, 2.709f, -4.02f)
                curveToRelative(2.035f, 0.785f, 3.449f, 2.829f, 3.449f, 5.139f)
                curveToRelative(-0.007f, 3.01f, -2.371f, 5.466f, -5.283f, 5.466f)
                close()
            }
        }
        .build()
        return _sonarcloud!!
    }

private var _sonarcloud: ImageVector? = null
