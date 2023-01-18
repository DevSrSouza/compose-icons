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

public val IonIcons.LogoJavascript: ImageVector
    get() {
        if (_logoJavascript != null) {
            return _logoJavascript!!
        }
        _logoJavascript = Builder(name = "LogoJavascript", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                lineTo(32.0f, 480.0f)
                lineTo(480.0f, 480.0f)
                lineTo(480.0f, 32.0f)
                close()
                moveTo(272.0f, 380.0f)
                curveToRelative(0.0f, 43.61f, -25.76f, 64.87f, -63.05f, 64.87f)
                curveToRelative(-33.68f, 0.0f, -53.23f, -17.44f, -63.15f, -38.49f)
                horizontalLineToRelative(0.0f)
                lineToRelative(34.28f, -20.75f)
                curveToRelative(6.61f, 11.73f, 11.63f, 21.65f, 26.06f, 21.65f)
                curveToRelative(12.0f, 0.0f, 21.86f, -5.41f, 21.86f, -26.46f)
                lineTo(228.0f, 240.0f)
                horizontalLineToRelative(44.0f)
                close()
                moveTo(371.35f, 443.87f)
                curveToRelative(-39.09f, 0.0f, -64.35f, -17.64f, -76.68f, -42.0f)
                horizontalLineToRelative(0.0f)
                lineTo(329.0f, 382.0f)
                curveToRelative(9.0f, 14.74f, 20.75f, 24.56f, 41.5f, 24.56f)
                curveToRelative(17.44f, 0.0f, 27.57f, -7.72f, 27.57f, -19.75f)
                curveToRelative(0.0f, -14.43f, -10.43f, -19.54f, -29.68f, -28.0f)
                lineToRelative(-10.52f, -4.52f)
                curveToRelative(-30.38f, -12.92f, -50.52f, -29.16f, -50.52f, -63.45f)
                curveToRelative(0.0f, -31.57f, 24.05f, -54.63f, 61.64f, -54.63f)
                curveToRelative(26.77f, 0.0f, 46.0f, 8.32f, 59.85f, 32.68f)
                lineTo(396.0f, 290.0f)
                curveToRelative(-7.22f, -12.93f, -15.0f, -18.0f, -27.06f, -18.0f)
                curveToRelative(-12.33f, 0.0f, -20.15f, 7.82f, -20.15f, 18.0f)
                curveToRelative(0.0f, 12.63f, 7.82f, 17.74f, 25.86f, 25.56f)
                lineToRelative(10.52f, 4.51f)
                curveToRelative(35.79f, 15.34f, 55.94f, 31.0f, 55.94f, 66.16f)
                curveTo(441.12f, 424.13f, 411.35f, 443.87f, 371.35f, 443.87f)
                close()
            }
        }
        .build()
        return _logoJavascript!!
    }

private var _logoJavascript: ImageVector? = null
