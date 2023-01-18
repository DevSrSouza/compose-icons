package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoGithub: ImageVector
    get() {
        if (_logoGithub != null) {
            return _logoGithub!!
        }
        _logoGithub = Builder(name = "LogoGithub", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(132.3f, 32.0f, 32.0f, 134.9f, 32.0f, 261.7f)
                curveToRelative(0.0f, 101.5f, 64.2f, 187.5f, 153.2f, 217.9f)
                arcToRelative(17.56f, 17.56f, 0.0f, false, false, 3.8f, 0.4f)
                curveToRelative(8.3f, 0.0f, 11.5f, -6.1f, 11.5f, -11.4f)
                curveToRelative(0.0f, -5.5f, -0.2f, -19.9f, -0.3f, -39.1f)
                arcToRelative(102.4f, 102.4f, 0.0f, false, true, -22.6f, 2.7f)
                curveToRelative(-43.1f, 0.0f, -52.9f, -33.5f, -52.9f, -33.5f)
                curveToRelative(-10.2f, -26.5f, -24.9f, -33.6f, -24.9f, -33.6f)
                curveToRelative(-19.5f, -13.7f, -0.1f, -14.1f, 1.4f, -14.1f)
                horizontalLineToRelative(0.1f)
                curveToRelative(22.5f, 2.0f, 34.3f, 23.8f, 34.3f, 23.8f)
                curveToRelative(11.2f, 19.6f, 26.2f, 25.1f, 39.6f, 25.1f)
                arcToRelative(63.0f, 63.0f, 0.0f, false, false, 25.6f, -6.0f)
                curveToRelative(2.0f, -14.8f, 7.8f, -24.9f, 14.2f, -30.7f)
                curveToRelative(-49.7f, -5.8f, -102.0f, -25.5f, -102.0f, -113.5f)
                curveToRelative(0.0f, -25.1f, 8.7f, -45.6f, 23.0f, -61.6f)
                curveToRelative(-2.3f, -5.8f, -10.0f, -29.2f, 2.2f, -60.8f)
                arcToRelative(18.64f, 18.64f, 0.0f, false, true, 5.0f, -0.5f)
                curveToRelative(8.1f, 0.0f, 26.4f, 3.1f, 56.6f, 24.1f)
                arcToRelative(208.21f, 208.21f, 0.0f, false, true, 112.2f, 0.0f)
                curveToRelative(30.2f, -21.0f, 48.5f, -24.1f, 56.6f, -24.1f)
                arcToRelative(18.64f, 18.64f, 0.0f, false, true, 5.0f, 0.5f)
                curveToRelative(12.2f, 31.6f, 4.5f, 55.0f, 2.2f, 60.8f)
                curveToRelative(14.3f, 16.1f, 23.0f, 36.6f, 23.0f, 61.6f)
                curveToRelative(0.0f, 88.2f, -52.4f, 107.6f, -102.3f, 113.3f)
                curveToRelative(8.0f, 7.1f, 15.2f, 21.1f, 15.2f, 42.5f)
                curveToRelative(0.0f, 30.7f, -0.3f, 55.5f, -0.3f, 63.0f)
                curveToRelative(0.0f, 5.4f, 3.1f, 11.5f, 11.4f, 11.5f)
                arcToRelative(19.35f, 19.35f, 0.0f, false, false, 4.0f, -0.4f)
                curveTo(415.9f, 449.2f, 480.0f, 363.1f, 480.0f, 261.7f)
                curveTo(480.0f, 134.9f, 379.7f, 32.0f, 256.0f, 32.0f)
                close()
            }
        }
        .build()
        return _logoGithub!!
    }

private var _logoGithub: ImageVector? = null
