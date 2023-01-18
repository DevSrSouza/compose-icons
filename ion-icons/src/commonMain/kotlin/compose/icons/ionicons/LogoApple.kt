package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoApple: ImageVector
    get() {
        if (_logoApple != null) {
            return _logoApple!!
        }
        _logoApple = Builder(name = "LogoApple", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(349.13f, 136.86f)
                curveToRelative(-40.32f, 0.0f, -57.36f, 19.24f, -85.44f, 19.24f)
                curveTo(234.9f, 156.1f, 212.94f, 137.0f, 178.0f, 137.0f)
                curveToRelative(-34.2f, 0.0f, -70.67f, 20.88f, -93.83f, 56.45f)
                curveToRelative(-32.52f, 50.16f, -27.0f, 144.63f, 25.67f, 225.11f)
                curveToRelative(18.84f, 28.81f, 44.0f, 61.12f, 77.0f, 61.47f)
                horizontalLineToRelative(0.6f)
                curveToRelative(28.68f, 0.0f, 37.2f, -18.78f, 76.67f, -19.0f)
                horizontalLineToRelative(0.6f)
                curveToRelative(38.88f, 0.0f, 46.68f, 18.89f, 75.24f, 18.89f)
                horizontalLineToRelative(0.6f)
                curveToRelative(33.0f, -0.35f, 59.51f, -36.15f, 78.35f, -64.85f)
                curveToRelative(13.56f, -20.64f, 18.6f, -31.0f, 29.0f, -54.35f)
                curveToRelative(-76.19f, -28.92f, -88.43f, -136.93f, -13.08f, -178.34f)
                curveToRelative(-23.0f, -28.8f, -55.32f, -45.48f, -85.79f, -45.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(340.25f, 32.0f)
                curveToRelative(-24.0f, 1.63f, -52.0f, 16.91f, -68.4f, 36.86f)
                curveToRelative(-14.88f, 18.08f, -27.12f, 44.9f, -22.32f, 70.91f)
                horizontalLineToRelative(1.92f)
                curveToRelative(25.56f, 0.0f, 51.72f, -15.39f, 67.0f, -35.11f)
                curveTo(333.17f, 85.89f, 344.33f, 59.29f, 340.25f, 32.0f)
                close()
            }
        }
        .build()
        return _logoApple!!
    }

private var _logoApple: ImageVector? = null
