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

public val IonIcons.AtCircle: ImageVector
    get() {
        if (_atCircle != null) {
            return _atCircle!!
        }
        _atCircle = Builder(name = "AtCircle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.46f, 48.74f)
                curveToRelative(-114.84f, 0.0f, -208.0f, 93.11f, -208.0f, 208.0f)
                reflectiveCurveToRelative(93.12f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.12f, 208.0f, -208.0f)
                reflectiveCurveTo(370.31f, 48.74f, 255.46f, 48.74f)
                close()
                moveTo(380.28f, 252.0f)
                curveToRelative(-2.85f, 32.63f, -16.79f, 49.7f, -28.0f, 58.26f)
                reflectiveCurveTo(327.61f, 322.58f, 316.0f, 320.5f)
                arcToRelative(41.61f, 41.61f, 0.0f, false, true, -26.82f, -17.19f)
                arcToRelative(62.06f, 62.06f, 0.0f, false, true, -44.0f, 17.57f)
                arcToRelative(51.66f, 51.66f, 0.0f, false, true, -38.55f, -16.83f)
                curveToRelative(-11.38f, -12.42f, -17.0f, -30.36f, -15.32f, -49.23f)
                curveToRelative(3.0f, -35.0f, 30.91f, -57.39f, 56.87f, -61.48f)
                curveToRelative(27.2f, -4.29f, 52.23f, 6.54f, 62.9f, 19.46f)
                lineToRelative(3.85f, 4.66f)
                lineToRelative(-6.34f, 50.38f)
                curveToRelative(-1.19f, 14.34f, 3.28f, 23.48f, 12.29f, 25.1f)
                curveToRelative(2.39f, 0.42f, 8.1f, -0.13f, 14.37f, -4.93f)
                curveToRelative(6.72f, -5.15f, 15.14f, -16.0f, 17.1f, -38.47f)
                curveTo(354.7f, 223.0f, 348.0f, 200.35f, 333.1f, 184.05f)
                curveToRelative(-15.49f, -16.9f, -39.09f, -25.84f, -68.23f, -25.84f)
                curveToRelative(-54.0f, 0.0f, -101.81f, 44.43f, -106.58f, 99.0f)
                curveToRelative(-2.28f, 26.2f, 5.67f, 50.68f, 22.4f, 68.93f)
                curveTo(197.05f, 344.0f, 220.0f, 353.88f, 245.35f, 353.88f)
                curveToRelative(19.0f, 0.0f, 30.61f, -2.05f, 49.48f, -8.78f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 9.4f, 26.38f)
                curveToRelative(-21.82f, 7.77f, -36.68f, 10.4f, -58.88f, 10.4f)
                curveToRelative(-33.28f, 0.0f, -63.57f, -13.06f, -85.3f, -36.77f)
                curveTo(138.0f, 321.0f, 127.42f, 288.94f, 130.4f, 254.82f)
                curveToRelative(2.91f, -33.33f, 18.45f, -64.63f, 43.77f, -88.12f)
                reflectiveCurveToRelative(57.57f, -36.49f, 90.7f, -36.49f)
                curveToRelative(37.2f, 0.0f, 67.93f, 12.08f, 88.87f, 34.93f)
                curveTo(373.83f, 187.05f, 383.25f, 217.89f, 380.28f, 252.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.57f, 221.0f)
                curveToRelative(-14.83f, 2.33f, -31.56f, 15.84f, -33.34f, 36.26f)
                curveToRelative(-1.0f, 11.06f, 2.0f, 21.22f, 8.07f, 27.87f)
                arcToRelative(23.65f, 23.65f, 0.0f, false, false, 17.91f, 7.75f)
                curveToRelative(20.31f, 0.0f, 34.73f, -14.94f, 36.75f, -38.06f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.34f, -2.07f)
                lineToRelative(3.2f, -25.45f)
                arcToRelative(49.61f, 49.61f, 0.0f, false, false, -32.93f, -6.3f)
                close()
            }
        }
        .build()
        return _atCircle!!
    }

private var _atCircle: ImageVector? = null
