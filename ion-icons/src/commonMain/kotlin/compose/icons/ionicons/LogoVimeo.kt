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

public val IonIcons.LogoVimeo: ImageVector
    get() {
        if (_logoVimeo != null) {
            return _logoVimeo!!
        }
        _logoVimeo = Builder(name = "LogoVimeo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(476.9f, 114.0f)
                curveToRelative(-5.0f, -23.39f, -17.51f, -38.78f, -40.61f, -46.27f)
                reflectiveCurveToRelative(-64.92f, -4.5f, -94.12f, 16.79f)
                curveToRelative(-26.79f, 19.51f, -46.26f, 54.42f, -54.0f, 78.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.13f, 5.0f)
                curveToRelative(10.77f, -3.8f, 21.72f, -7.1f, 34.0f, -6.45f)
                curveToRelative(15.0f, 0.8f, 24.51f, 12.0f, 24.91f, 25.29f)
                curveToRelative(0.3f, 9.79f, -0.2f, 18.69f, -3.6f, 27.68f)
                curveTo(337.87f, 243.0f, 321.0f, 270.78f, 301.06f, 295.07f)
                arcToRelative(72.49f, 72.49f, 0.0f, false, true, -10.0f, 9.89f)
                curveToRelative(-10.21f, 8.29f, -18.81f, 6.1f, -25.41f, -5.2f)
                curveToRelative(-5.4f, -9.29f, -9.0f, -18.88f, -12.2f, -29.08f)
                curveToRelative(-12.4f, -39.67f, -16.81f, -80.84f, -23.81f, -121.52f)
                curveToRelative(-3.3f, -19.48f, -7.0f, -39.77f, -18.0f, -56.86f)
                curveToRelative(-11.6f, -17.79f, -28.61f, -24.58f, -50.0f, -22.0f)
                curveToRelative(-14.7f, 1.8f, -36.91f, 17.49f, -47.81f, 26.39f)
                curveToRelative(0.0f, 0.0f, -56.0f, 46.87f, -81.82f, 71.35f)
                lineToRelative(21.2f, 27.0f)
                reflectiveCurveToRelative(17.91f, -12.49f, 27.51f, -18.29f)
                curveToRelative(5.7f, -3.39f, 12.4f, -4.09f, 17.2f, 0.2f)
                curveToRelative(4.51f, 3.9f, 9.61f, 9.0f, 12.31f, 14.1f)
                curveToRelative(5.7f, 10.69f, 11.2f, 21.88f, 14.7f, 33.37f)
                curveToRelative(13.2f, 44.27f, 25.51f, 88.64f, 37.81f, 133.22f)
                curveToRelative(6.3f, 22.78f, 13.9f, 44.17f, 28.0f, 63.55f)
                curveToRelative(19.31f, 26.59f, 39.61f, 32.68f, 70.92f, 21.49f)
                curveToRelative(25.41f, -9.09f, 46.61f, -26.18f, 66.0f, -43.87f)
                curveToRelative(33.11f, -30.18f, 59.12f, -65.36f, 85.52f, -101.14f)
                curveTo(433.59f, 270.0f, 450.49f, 242.0f, 464.59f, 210.72f)
                curveTo(478.5f, 179.74f, 484.0f, 147.26f, 476.9f, 114.0f)
                close()
            }
        }
        .build()
        return _logoVimeo!!
    }

private var _logoVimeo: ImageVector? = null
