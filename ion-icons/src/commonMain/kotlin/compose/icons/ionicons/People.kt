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

public val IonIcons.People: ImageVector
    get() {
        if (_people != null) {
            return _people!!
        }
        _people = Builder(name = "People", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 256.0f)
                curveToRelative(-20.56f, 0.0f, -40.44f, -9.18f, -56.0f, -25.84f)
                curveToRelative(-15.13f, -16.25f, -24.37f, -37.92f, -26.0f, -61.0f)
                curveToRelative(-1.74f, -24.62f, 5.77f, -47.26f, 21.14f, -63.76f)
                reflectiveCurveTo(312.0f, 80.0f, 336.0f, 80.0f)
                curveToRelative(23.83f, 0.0f, 45.38f, 9.06f, 60.7f, 25.52f)
                curveToRelative(15.47f, 16.62f, 23.0f, 39.22f, 21.26f, 63.63f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.67f, 23.11f, -10.9f, 44.77f, -26.0f, 61.0f)
                curveTo(376.44f, 246.82f, 356.57f, 256.0f, 336.0f, 256.0f)
                close()
                moveTo(402.0f, 168.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(467.83f, 432.0f)
                horizontalLineTo(204.18f)
                arcToRelative(27.71f, 27.71f, 0.0f, false, true, -22.0f, -10.67f)
                arcToRelative(30.22f, 30.22f, 0.0f, false, true, -5.26f, -25.79f)
                curveToRelative(8.42f, -33.81f, 29.28f, -61.85f, 60.32f, -81.08f)
                curveTo(264.79f, 297.4f, 299.86f, 288.0f, 336.0f, 288.0f)
                curveToRelative(36.85f, 0.0f, 71.0f, 9.0f, 98.71f, 26.05f)
                curveToRelative(31.11f, 19.13f, 52.0f, 47.33f, 60.38f, 81.55f)
                arcToRelative(30.27f, 30.27f, 0.0f, false, true, -5.32f, 25.78f)
                arcTo(27.68f, 27.68f, 0.0f, false, true, 467.83f, 432.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.0f, 260.0f)
                curveToRelative(-35.19f, 0.0f, -66.13f, -32.72f, -69.0f, -72.93f)
                curveTo(76.58f, 166.47f, 83.0f, 147.42f, 96.0f, 133.45f)
                curveTo(108.86f, 119.62f, 127.0f, 112.0f, 147.0f, 112.0f)
                reflectiveCurveToRelative(38.0f, 7.66f, 50.93f, 21.57f)
                curveToRelative(13.1f, 14.08f, 19.5f, 33.09f, 18.0f, 53.52f)
                curveTo(213.06f, 227.29f, 182.13f, 260.0f, 147.0f, 260.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.66f, 291.45f)
                curveToRelative(-17.59f, -8.6f, -40.42f, -12.9f, -65.65f, -12.9f)
                curveToRelative(-29.46f, 0.0f, -58.07f, 7.68f, -80.57f, 21.62f)
                curveTo(40.93f, 316.0f, 23.77f, 339.05f, 16.84f, 366.88f)
                arcToRelative(27.39f, 27.39f, 0.0f, false, false, 4.79f, 23.36f)
                arcTo(25.32f, 25.32f, 0.0f, false, false, 41.72f, 400.0f)
                horizontalLineToRelative(111.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.87f, -6.57f)
                curveToRelative(0.11f, -0.63f, 0.25f, -1.26f, 0.41f, -1.88f)
                curveToRelative(8.48f, -34.06f, 28.35f, -62.84f, 57.71f, -83.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.63f, -13.39f)
                curveTo(216.51f, 293.42f, 214.71f, 292.45f, 212.66f, 291.45f)
                close()
            }
        }
        .build()
        return _people!!
    }

private var _people: ImageVector? = null
