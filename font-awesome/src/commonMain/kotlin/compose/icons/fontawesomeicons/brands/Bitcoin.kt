package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Bitcoin: ImageVector
    get() {
        if (_bitcoin != null) {
            return _bitcoin!!
        }
        _bitcoin = Builder(name = "Bitcoin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 136.97f, -111.03f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 392.97f, 8.0f, 256.0f)
                reflectiveCurveTo(119.03f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.03f, 248.0f, 248.0f)
                close()
                moveTo(362.35f, 220.67f)
                curveToRelative(4.94f, -33.0f, -20.19f, -50.74f, -54.55f, -62.57f)
                lineToRelative(11.15f, -44.7f)
                lineToRelative(-27.21f, -6.78f)
                lineToRelative(-10.85f, 43.52f)
                curveToRelative(-7.15f, -1.78f, -14.5f, -3.46f, -21.8f, -5.13f)
                lineToRelative(10.93f, -43.81f)
                lineToRelative(-27.2f, -6.78f)
                lineToRelative(-11.15f, 44.69f)
                curveToRelative(-5.92f, -1.35f, -11.73f, -2.68f, -17.38f, -4.08f)
                lineToRelative(0.03f, -0.14f)
                lineToRelative(-37.53f, -9.37f)
                lineToRelative(-7.24f, 29.06f)
                reflectiveCurveToRelative(20.19f, 4.63f, 19.76f, 4.91f)
                curveToRelative(11.02f, 2.75f, 13.01f, 10.04f, 12.68f, 15.82f)
                lineToRelative(-12.7f, 50.92f)
                curveToRelative(0.76f, 0.19f, 1.74f, 0.47f, 2.83f, 0.91f)
                curveToRelative(-0.91f, -0.22f, -1.88f, -0.47f, -2.88f, -0.71f)
                lineToRelative(-17.8f, 71.34f)
                curveToRelative(-1.35f, 3.35f, -4.77f, 8.37f, -12.47f, 6.46f)
                curveToRelative(0.27f, 0.4f, -19.78f, -4.94f, -19.78f, -4.94f)
                lineToRelative(-13.51f, 31.15f)
                lineToRelative(35.41f, 8.83f)
                curveToRelative(6.59f, 1.65f, 13.05f, 3.38f, 19.4f, 5.01f)
                lineToRelative(-11.26f, 45.21f)
                lineToRelative(27.18f, 6.78f)
                lineToRelative(11.15f, -44.73f)
                arcToRelative(1038.21f, 1038.21f, 0.0f, false, false, 21.69f, 5.63f)
                lineToRelative(-11.11f, 44.52f)
                lineToRelative(27.21f, 6.78f)
                lineToRelative(11.26f, -45.13f)
                curveToRelative(46.4f, 8.78f, 81.3f, 5.24f, 95.99f, -36.73f)
                curveToRelative(11.84f, -33.79f, -0.59f, -53.28f, -25.0f, -65.99f)
                curveToRelative(17.78f, -4.1f, 31.17f, -15.79f, 34.75f, -39.95f)
                close()
                moveTo(300.17f, 307.85f)
                curveToRelative(-8.41f, 33.79f, -65.31f, 15.52f, -83.75f, 10.94f)
                lineToRelative(14.94f, -59.9f)
                curveToRelative(18.45f, 4.6f, 77.6f, 13.72f, 68.81f, 48.96f)
                close()
                moveTo(308.59f, 220.18f)
                curveToRelative(-7.67f, 30.74f, -55.03f, 15.12f, -70.39f, 11.29f)
                lineToRelative(13.55f, -54.33f)
                curveToRelative(15.36f, 3.83f, 64.84f, 10.97f, 56.85f, 43.03f)
                close()
            }
        }
        .build()
        return _bitcoin!!
    }

private var _bitcoin: ImageVector? = null
