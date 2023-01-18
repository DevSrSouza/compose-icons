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

public val IonIcons.LogoFoursquare: ImageVector
    get() {
        if (_logoFoursquare != null) {
            return _logoFoursquare!!
        }
        _logoFoursquare = Builder(name = "LogoFoursquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(376.76f, 32.0f)
                lineTo(138.54f, 32.0f)
                curveTo(105.67f, 32.0f, 96.0f, 56.8f, 96.0f, 72.41f)
                lineTo(96.0f, 452.05f)
                curveToRelative(0.0f, 17.59f, 9.42f, 24.12f, 14.72f, 26.27f)
                reflectiveCurveToRelative(19.91f, 4.0f, 28.67f, -6.17f)
                curveToRelative(0.0f, 0.0f, 112.47f, -130.89f, 114.4f, -132.83f)
                curveToRelative(2.92f, -2.93f, 2.92f, -2.93f, 5.84f, -2.93f)
                lineTo(332.4f, 336.39f)
                curveToRelative(30.58f, 0.0f, 35.49f, -21.87f, 38.69f, -34.75f)
                curveToRelative(2.65f, -10.79f, 32.48f, -164.0f, 42.45f, -212.56f)
                curveTo(421.14f, 52.0f, 411.74f, 32.0f, 376.76f, 32.0f)
                close()
                moveTo(371.09f, 301.64f)
                curveToRelative(2.65f, -10.79f, 32.48f, -164.0f, 42.45f, -212.56f)
                moveToRelative(-50.85f, 7.59f)
                lineToRelative(-10.0f, 51.73f)
                curveToRelative(-1.19f, 5.65f, -8.28f, 11.6f, -14.86f, 11.6f)
                lineTo(241.91f, 160.0f)
                curveToRelative(-10.44f, 0.0f, -17.91f, 6.14f, -17.91f, 16.6f)
                verticalLineToRelative(13.45f)
                curveToRelative(0.0f, 10.47f, 7.52f, 17.89f, 18.0f, 17.89f)
                horizontalLineToRelative(81.85f)
                curveToRelative(7.38f, 0.0f, 14.61f, 8.11f, 13.0f, 16.0f)
                reflectiveCurveToRelative(-9.09f, 46.57f, -10.0f, 50.89f)
                reflectiveCurveToRelative(-5.84f, 11.72f, -14.61f, 11.72f)
                lineTo(248.0f, 286.55f)
                curveToRelative(-11.7f, 0.0f, -15.24f, 1.54f, -23.07f, 11.3f)
                reflectiveCurveToRelative(-78.26f, 94.59f, -78.26f, 94.59f)
                curveToRelative(-0.71f, 0.82f, -1.41f, 0.58f, -1.41f, -0.31f)
                lineTo(145.26f, 95.9f)
                curveToRelative(0.0f, -6.69f, 5.8f, -14.53f, 14.48f, -14.53f)
                lineTo(350.88f, 81.37f)
                arcTo(12.42f, 12.42f, 0.0f, false, true, 362.69f, 96.67f)
                close()
            }
        }
        .build()
        return _logoFoursquare!!
    }

private var _logoFoursquare: ImageVector? = null
