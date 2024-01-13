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

public val SimpleIcons.Aboutdotme: ImageVector
    get() {
        if (_aboutdotme != null) {
            return _aboutdotme!!
        }
        _aboutdotme = Builder(name = "Aboutdotme", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.427f, 16.615f)
                verticalLineToRelative(-6.042f)
                curveToRelative(0.0f, -0.997f, -0.444f, -1.669f, -1.541f, -1.669f)
                curveToRelative(-0.906f, 0.0f, -1.754f, 0.614f, -2.159f, 1.228f)
                verticalLineToRelative(6.483f)
                lineTo(5.704f, 16.615f)
                verticalLineToRelative(-6.042f)
                curveToRelative(0.0f, -0.997f, -0.423f, -1.669f, -1.523f, -1.669f)
                curveToRelative(-0.905f, 0.0f, -1.734f, 0.633f, -2.158f, 1.228f)
                verticalLineToRelative(6.483f)
                lineTo(0.0f, 16.615f)
                lineTo(0.0f, 7.351f)
                horizontalLineToRelative(2.023f)
                verticalLineToRelative(1.247f)
                curveTo(2.428f, 8.04f, 3.642f, 7.12f, 5.068f, 7.12f)
                curveToRelative(1.386f, 0.0f, 2.235f, 0.69f, 2.543f, 1.688f)
                curveToRelative(0.52f, -0.825f, 1.754f, -1.688f, 3.16f, -1.688f)
                curveToRelative(1.697f, 0.0f, 2.68f, 0.92f, 2.68f, 2.8f)
                verticalLineToRelative(6.694f)
                horizontalLineToRelative(-2.024f)
                close()
                moveTo(24.0f, 12.163f)
                curveToRelative(0.0f, -2.925f, -1.788f, -5.042f, -4.604f, -5.042f)
                curveToRelative(-2.777f, 0.0f, -4.759f, 2.174f, -4.759f, 4.869f)
                curveToRelative(0.0f, 2.945f, 2.079f, 4.888f, 4.913f, 4.89f)
                curveToRelative(1.476f, 0.0f, 2.855f, -0.482f, 3.807f, -1.368f)
                lineToRelative(-0.932f, -1.328f)
                curveToRelative(-0.68f, 0.673f, -1.747f, 1.04f, -2.68f, 1.04f)
                curveToRelative(-1.768f, 0.0f, -2.815f, -1.174f, -2.971f, -2.56f)
                lineTo(24.0f, 12.664f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(16.755f, 11.22f)
                curveToRelative(0.077f, -1.116f, 0.893f, -2.444f, 2.622f, -2.444f)
                curveToRelative(1.845f, 0.0f, 2.602f, 1.347f, 2.66f, 2.444f)
                horizontalLineToRelative(-5.282f)
                close()
            }
        }
        .build()
        return _aboutdotme!!
    }

private var _aboutdotme: ImageVector? = null
