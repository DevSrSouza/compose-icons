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

public val IonIcons.Accessibility: ImageVector
    get() {
        if (_accessibility != null) {
            return _accessibility!!
        }
        _accessibility = Builder(name = "Accessibility", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 256.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 112.8f)
                lineToRelative(-0.45f, 0.12f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.42f, 0.13f)
                curveToRelative(-1.0f, 0.28f, -2.0f, 0.58f, -3.0f, 0.89f)
                curveToRelative(-18.61f, 5.46f, -108.93f, 30.92f, -172.56f, 30.92f)
                curveToRelative(-59.13f, 0.0f, -141.28f, -22.0f, -167.56f, -29.47f)
                arcToRelative(73.79f, 73.79f, 0.0f, false, false, -8.0f, -2.58f)
                curveToRelative(-19.0f, -5.0f, -32.0f, 14.3f, -32.0f, 31.94f)
                curveToRelative(0.0f, 17.47f, 15.7f, 25.79f, 31.55f, 31.76f)
                verticalLineToRelative(0.28f)
                lineToRelative(95.22f, 29.74f)
                curveToRelative(9.73f, 3.73f, 12.33f, 7.54f, 13.6f, 10.84f)
                curveToRelative(4.13f, 10.59f, 0.83f, 31.56f, -0.34f, 38.88f)
                lineToRelative(-5.8f, 45.0f)
                lineTo(150.05f, 477.44f)
                quadToRelative(-0.15f, 0.72f, -0.27f, 1.47f)
                lineToRelative(-0.23f, 1.27f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-2.32f, 16.15f, 9.54f, 31.82f, 32.0f, 31.82f)
                curveToRelative(19.6f, 0.0f, 28.25f, -13.53f, 32.0f, -31.94f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(28.0f, -157.57f, 42.0f, -157.57f)
                reflectiveCurveToRelative(42.84f, 157.57f, 42.84f, 157.57f)
                horizontalLineToRelative(0.0f)
                curveToRelative(3.75f, 18.41f, 12.4f, 31.94f, 32.0f, 31.94f)
                curveToRelative(22.52f, 0.0f, 34.38f, -15.74f, 32.0f, -31.94f)
                curveToRelative(-0.21f, -1.38f, -0.46f, -2.74f, -0.76f, -4.06f)
                lineTo(329.0f, 301.27f)
                lineToRelative(-5.79f, -45.0f)
                curveToRelative(-4.19f, -26.21f, -0.82f, -34.87f, 0.32f, -36.9f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, 0.08f, -0.15f)
                curveToRelative(1.08f, -2.0f, 6.0f, -6.48f, 17.48f, -10.79f)
                lineToRelative(89.28f, -31.21f)
                arcToRelative(16.9f, 16.9f, 0.0f, false, false, 1.62f, -0.52f)
                curveToRelative(16.0f, -6.0f, 32.0f, -14.3f, 32.0f, -31.93f)
                reflectiveCurveTo(451.0f, 107.81f, 432.0f, 112.8f)
                close()
            }
        }
        .build()
        return _accessibility!!
    }

private var _accessibility: ImageVector? = null
