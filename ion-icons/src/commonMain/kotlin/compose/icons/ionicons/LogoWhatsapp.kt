package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoWhatsapp: ImageVector
    get() {
        if (_logoWhatsapp != null) {
            return _logoWhatsapp!!
        }
        _logoWhatsapp = Builder(name = "LogoWhatsapp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(414.73f, 97.1f)
                arcTo(222.14f, 222.14f, 0.0f, false, false, 256.94f, 32.0f)
                curveTo(134.0f, 32.0f, 33.92f, 131.58f, 33.87f, 254.0f)
                arcTo(220.61f, 220.61f, 0.0f, false, false, 63.65f, 365.0f)
                lineTo(32.0f, 480.0f)
                lineToRelative(118.25f, -30.87f)
                arcToRelative(223.63f, 223.63f, 0.0f, false, false, 106.6f, 27.0f)
                horizontalLineToRelative(0.09f)
                curveToRelative(122.93f, 0.0f, 223.0f, -99.59f, 223.06f, -222.0f)
                arcTo(220.18f, 220.18f, 0.0f, false, false, 414.73f, 97.1f)
                close()
                moveTo(256.94f, 438.66f)
                horizontalLineToRelative(-0.08f)
                arcToRelative(185.75f, 185.75f, 0.0f, false, true, -94.36f, -25.72f)
                lineToRelative(-6.77f, -4.0f)
                lineTo(85.56f, 427.26f)
                lineToRelative(18.73f, -68.09f)
                lineToRelative(-4.41f, -7.0f)
                arcTo(183.46f, 183.46f, 0.0f, false, true, 71.53f, 254.0f)
                curveToRelative(0.0f, -101.73f, 83.21f, -184.5f, 185.48f, -184.5f)
                arcTo(185.0f, 185.0f, 0.0f, false, true, 442.34f, 254.14f)
                curveTo(442.3f, 355.88f, 359.13f, 438.66f, 256.94f, 438.66f)
                close()
                moveTo(358.63f, 300.47f)
                curveToRelative(-5.57f, -2.78f, -33.0f, -16.2f, -38.08f, -18.05f)
                reflectiveCurveToRelative(-8.83f, -2.78f, -12.54f, 2.78f)
                reflectiveCurveToRelative(-14.4f, 18.0f, -17.65f, 21.75f)
                reflectiveCurveToRelative(-6.5f, 4.16f, -12.07f, 1.38f)
                reflectiveCurveToRelative(-23.54f, -8.63f, -44.83f, -27.53f)
                curveToRelative(-16.57f, -14.71f, -27.75f, -32.87f, -31.0f, -38.42f)
                reflectiveCurveToRelative(-0.35f, -8.56f, 2.44f, -11.32f)
                curveToRelative(2.51f, -2.49f, 5.57f, -6.48f, 8.36f, -9.72f)
                reflectiveCurveToRelative(3.72f, -5.56f, 5.57f, -9.26f)
                reflectiveCurveToRelative(0.93f, -6.94f, -0.46f, -9.71f)
                reflectiveCurveToRelative(-12.54f, -30.08f, -17.18f, -41.19f)
                curveToRelative(-4.53f, -10.82f, -9.12f, -9.35f, -12.54f, -9.52f)
                curveToRelative(-3.25f, -0.16f, -7.0f, -0.2f, -10.69f, -0.2f)
                arcToRelative(20.53f, 20.53f, 0.0f, false, false, -14.86f, 6.94f)
                curveToRelative(-5.11f, 5.56f, -19.51f, 19.0f, -19.51f, 46.28f)
                reflectiveCurveToRelative(20.0f, 53.68f, 22.76f, 57.38f)
                reflectiveCurveToRelative(39.3f, 59.73f, 95.21f, 83.76f)
                arcToRelative(323.11f, 323.11f, 0.0f, false, false, 31.78f, 11.68f)
                curveToRelative(13.35f, 4.22f, 25.5f, 3.63f, 35.1f, 2.2f)
                curveToRelative(10.71f, -1.59f, 33.0f, -13.42f, 37.63f, -26.38f)
                reflectiveCurveToRelative(4.64f, -24.06f, 3.25f, -26.37f)
                reflectiveCurveTo(364.21f, 303.24f, 358.63f, 300.47f)
                close()
            }
        }
        .build()
        return _logoWhatsapp!!
    }

private var _logoWhatsapp: ImageVector? = null
