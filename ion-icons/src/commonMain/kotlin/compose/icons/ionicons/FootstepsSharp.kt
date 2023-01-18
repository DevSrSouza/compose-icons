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

public val IonIcons.FootstepsSharp: ImageVector
    get() {
        if (_footstepsSharp != null) {
            return _footstepsSharp!!
        }
        _footstepsSharp = Builder(name = "FootstepsSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(130.54f, 358.31f)
                curveToRelative(-12.83f, 1.88f, -33.95f, 5.38f, -48.0f, -10.56f)
                reflectiveCurveTo(56.34f, 293.32f, 51.0f, 258.92f)
                curveToRelative(-7.88f, -50.7f, -0.06f, -93.43f, 22.0f, -120.31f)
                curveToRelative(13.0f, -15.83f, 30.06f, -25.0f, 49.34f, -26.46f)
                curveToRelative(16.51f, -1.27f, 41.18f, 5.19f, 65.0f, 43.19f)
                curveToRelative(14.92f, 23.81f, 26.27f, 55.44f, 31.14f, 86.77f)
                horizontalLineToRelative(0.0f)
                curveToRelative(5.88f, 37.82f, 11.61f, 78.18f, -8.44f, 92.65f)
                curveToRelative(-11.31f, 8.17f, -19.43f, 11.0f, -38.62f, 15.57f)
                curveTo(155.64f, 354.08f, 143.38f, 356.42f, 130.54f, 358.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.72f, 390.84f)
                lineToRelative(108.89f, -22.46f)
                curveToRelative(9.2f, -1.9f, 16.58f, 3.16f, 20.0f, 18.32f)
                curveToRelative(11.22f, 49.76f, -4.86f, 109.3f, -55.22f, 109.3f)
                curveToRelative(-47.69f, 0.0f, -79.47f, -54.36f, -84.66f, -83.58f)
                curveTo(94.36f, 399.17f, 97.74f, 392.89f, 107.72f, 390.84f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(340.59f, 254.34f)
                curveToRelative(-19.19f, -4.55f, -27.31f, -7.4f, -38.62f, -15.57f)
                curveToRelative(-20.05f, -14.47f, -14.32f, -54.83f, -8.44f, -92.65f)
                horizontalLineToRelative(0.0f)
                curveToRelative(4.87f, -31.33f, 16.22f, -63.0f, 31.14f, -86.77f)
                curveToRelative(23.8f, -38.0f, 48.47f, -44.46f, 65.0f, -43.19f)
                curveTo(408.93f, 17.63f, 426.0f, 26.78f, 439.0f, 42.61f)
                curveToRelative(22.08f, 26.88f, 29.9f, 69.61f, 22.0f, 120.31f)
                curveToRelative(-5.35f, 34.4f, -17.46f, 72.76f, -31.59f, 88.83f)
                reflectiveCurveToRelative(-35.13f, 12.44f, -48.0f, 10.56f)
                reflectiveCurveTo(356.36f, 258.08f, 340.59f, 254.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(404.28f, 294.84f)
                lineTo(295.39f, 272.38f)
                curveToRelative(-9.2f, -1.9f, -16.58f, 3.16f, -20.0f, 18.32f)
                curveTo(264.18f, 340.46f, 280.26f, 400.0f, 330.62f, 400.0f)
                curveToRelative(47.69f, 0.0f, 79.47f, -54.36f, 84.66f, -83.58f)
                curveTo(417.64f, 303.17f, 414.26f, 296.89f, 404.28f, 294.84f)
                close()
            }
        }
        .build()
        return _footstepsSharp!!
    }

private var _footstepsSharp: ImageVector? = null
