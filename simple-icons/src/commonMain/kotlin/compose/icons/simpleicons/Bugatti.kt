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

public val SimpleIcons.Bugatti: ImageVector
    get() {
        if (_bugatti != null) {
            return _bugatti!!
        }
        _bugatti = Builder(name = "Bugatti", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.168f)
                verticalLineToRelative(2.194f)
                horizontalLineToRelative(2.92f)
                lineToRelative(0.004f, -0.73f)
                lineToRelative(0.006f, -0.73f)
                lineToRelative(3.498f, -0.005f)
                lineToRelative(3.496f, -0.004f)
                verticalLineToRelative(4.103f)
                lineTo(7.157f, 9.996f)
                lineTo(7.157f, 8.851f)
                lineToRelative(-1.464f, 0.004f)
                lineToRelative(-1.466f, 0.006f)
                verticalLineToRelative(5.744f)
                lineToRelative(1.466f, 0.006f)
                lineToRelative(1.464f, 0.004f)
                lineTo(7.157f, 13.47f)
                horizontalLineToRelative(2.767f)
                verticalLineToRelative(4.618f)
                lineTo(2.92f, 18.088f)
                verticalLineToRelative(-1.45f)
                lineTo(0.0f, 16.638f)
                verticalLineToRelative(4.39f)
                horizontalLineToRelative(9.31f)
                curveToRelative(6.06f, 0.0f, 9.405f, -0.008f, 9.584f, -0.02f)
                arcToRelative(5.482f, 5.482f, 0.0f, false, false, 3.73f, -1.842f)
                arcToRelative(5.567f, 5.567f, 0.0f, false, false, 1.341f, -2.904f)
                curveToRelative(0.048f, -0.325f, 0.046f, -1.184f, -0.002f, -1.504f)
                arcToRelative(5.537f, 5.537f, 0.0f, false, false, -1.36f, -2.922f)
                arcToRelative(1.478f, 1.478f, 0.0f, false, true, -0.14f, -0.17f)
                curveToRelative(0.0f, -0.008f, 0.054f, -0.08f, 0.12f, -0.16f)
                arcToRelative(5.255f, 5.255f, 0.0f, false, false, 1.13f, -2.693f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, 0.01f, -1.122f)
                arcToRelative(5.297f, 5.297f, 0.0f, false, false, -1.172f, -2.81f)
                arcToRelative(5.328f, 5.328f, 0.0f, false, false, -1.884f, -1.443f)
                arcToRelative(5.297f, 5.297f, 0.0f, false, false, -1.2f, -0.38f)
                curveToRelative(-0.515f, -0.09f, -0.038f, -0.085f, -10.052f, -0.085f)
                lineTo(0.0f, 2.973f)
                close()
                moveTo(18.656f, 5.912f)
                curveToRelative(0.557f, 0.044f, 0.958f, 0.214f, 1.305f, 0.555f)
                curveToRelative(0.536f, 0.529f, 0.73f, 1.414f, 0.475f, 2.193f)
                arcToRelative(1.933f, 1.933f, 0.0f, false, true, -0.494f, 0.794f)
                arcToRelative(1.884f, 1.884f, 0.0f, false, true, -1.055f, 0.513f)
                curveToRelative(-0.147f, 0.025f, -0.561f, 0.03f, -2.63f, 0.03f)
                horizontalLineToRelative(-2.458f)
                verticalLineToRelative(-2.04f)
                curveToRelative(0.0f, -1.121f, 0.005f, -2.045f, 0.013f, -2.05f)
                curveToRelative(0.02f, -0.022f, 4.569f, -0.016f, 4.844f, 0.005f)
                close()
                moveTo(18.923f, 13.498f)
                curveToRelative(1.078f, 0.174f, 1.807f, 0.977f, 1.876f, 2.065f)
                curveToRelative(0.057f, 0.888f, -0.246f, 1.613f, -0.87f, 2.088f)
                curveToRelative(-0.159f, 0.12f, -0.5f, 0.288f, -0.691f, 0.342f)
                curveToRelative(-0.35f, 0.095f, -0.342f, 0.095f, -2.977f, 0.095f)
                horizontalLineToRelative(-2.462f)
                lineTo(13.799f, 13.47f)
                horizontalLineToRelative(2.477f)
                curveToRelative(2.082f, 0.0f, 2.502f, 0.003f, 2.647f, 0.028f)
                close()
            }
        }
        .build()
        return _bugatti!!
    }

private var _bugatti: ImageVector? = null
