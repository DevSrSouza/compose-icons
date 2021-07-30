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

public val SimpleIcons.Octopusdeploy: ImageVector
    get() {
        if (_octopusdeploy != null) {
            return _octopusdeploy!!
        }
        _octopusdeploy = Builder(name = "Octopusdeploy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.18f, 18.212f)
                curveToRelative(1.805f, -1.162f, 3.928f, -3.162f, 3.122f, -5.51f)
                curveToRelative(-0.437f, -1.282f, -1.046f, -2.379f, -1.127f, -3.762f)
                arcToRelative(8.478f, 8.478f, 0.0f, false, true, 0.515f, -3.46f)
                curveTo(6.31f, 1.14f, 11.126f, -0.917f, 15.481f, 0.389f)
                curveToRelative(4.03f, 1.216f, 6.808f, 5.893f, 5.119f, 9.973f)
                curveToRelative(-0.965f, 2.356f, -1.395f, 4.173f, 0.755f, 6.006f)
                curveToRelative(0.582f, 0.496f, 2.0f, 1.24f, 1.992f, 2.123f)
                curveToRelative(0.0f, 1.163f, -2.27f, -0.244f, -2.522f, -0.445f)
                curveToRelative(0.286f, 0.503f, 3.138f, 3.487f, 1.325f, 3.688f)
                curveToRelative(-1.67f, 0.194f, -3.147f, -2.139f, -4.15f, -3.142f)
                curveToRelative(-1.686f, -1.682f, -1.395f, 2.042f, -1.403f, 2.81f)
                curveToRelative(0.0f, 1.212f, -0.868f, 3.676f, -2.41f, 2.072f)
                curveToRelative(-1.27f, -1.321f, -0.775f, -3.433f, -1.674f, -4.905f)
                curveToRelative(-0.968f, -1.612f, -2.58f, 1.612f, -2.983f, 2.2f)
                curveToRelative(-0.45f, 0.66f, -2.713f, 3.844f, -3.596f, 2.147f)
                curveToRelative(-0.725f, -1.38f, 0.434f, -3.538f, 1.007f, -4.785f)
                curveToRelative(-0.209f, 0.453f, -1.685f, 1.123f, -2.115f, 1.34f)
                arcToRelative(5.738f, 5.738f, 0.0f, false, true, -3.057f, 0.706f)
                curveToRelative(-2.267f, -0.163f, -0.527f, -1.368f, 0.387f, -1.96f)
                lineToRelative(0.023f, -0.005f)
                close()
            }
        }
        .build()
        return _octopusdeploy!!
    }

private var _octopusdeploy: ImageVector? = null
