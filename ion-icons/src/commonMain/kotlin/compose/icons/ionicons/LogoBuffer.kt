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

public val IonIcons.LogoBuffer: ImageVector
    get() {
        if (_logoBuffer != null) {
            return _logoBuffer!!
        }
        _logoBuffer = Builder(name = "LogoBuffer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.93f, 149.25f)
                lineToRelative(197.4f, 95.32f)
                curveToRelative(5.14f, 2.45f, 12.0f, 3.73f, 18.79f, 3.73f)
                reflectiveCurveToRelative(13.65f, -1.28f, 18.78f, -3.73f)
                lineToRelative(197.4f, -95.32f)
                curveToRelative(10.38f, -5.0f, 10.38f, -13.18f, 0.0f, -18.2f)
                lineTo(274.9f, 35.73f)
                curveToRelative(-5.13f, -2.45f, -12.0f, -3.73f, -18.78f, -3.73f)
                reflectiveCurveToRelative(-13.65f, 1.28f, -18.79f, 3.73f)
                lineTo(39.93f, 131.05f)
                curveTo(29.55f, 136.07f, 29.55f, 144.23f, 39.93f, 149.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(472.3f, 246.9f)
                reflectiveCurveToRelative(-36.05f, -17.38f, -40.83f, -19.72f)
                reflectiveCurveToRelative(-6.07f, -2.21f, -11.09f, 0.12f)
                reflectiveCurveToRelative(-145.6f, 70.23f, -145.6f, 70.23f)
                arcTo(45.71f, 45.71f, 0.0f, false, true, 256.0f, 301.27f)
                curveToRelative(-6.77f, 0.0f, -13.65f, -1.29f, -18.78f, -3.74f)
                curveToRelative(0.0f, 0.0f, -136.85f, -66.0f, -143.27f, -69.18f)
                curveTo(87.0f, 225.0f, 85.0f, 225.0f, 78.67f, 228.0f)
                lineToRelative(-39.0f, 18.78f)
                curveToRelative(-10.38f, 5.0f, -10.38f, 13.19f, 0.0f, 18.2f)
                lineTo(237.1f, 360.3f)
                curveToRelative(5.13f, 2.45f, 12.0f, 3.73f, 18.78f, 3.73f)
                reflectiveCurveToRelative(13.65f, -1.28f, 18.79f, -3.73f)
                lineTo(472.07f, 265.0f)
                curveTo(482.68f, 260.08f, 482.68f, 251.92f, 472.3f, 246.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(472.3f, 362.75f)
                reflectiveCurveTo(436.25f, 345.37f, 431.47f, 343.0f)
                reflectiveCurveToRelative(-6.07f, -2.21f, -11.09f, 0.12f)
                reflectiveCurveTo(274.9f, 413.5f, 274.9f, 413.5f)
                arcToRelative(45.74f, 45.74f, 0.0f, false, true, -18.78f, 3.73f)
                curveToRelative(-6.77f, 0.0f, -13.65f, -1.28f, -18.79f, -3.73f)
                curveToRelative(0.0f, 0.0f, -136.85f, -66.0f, -143.26f, -69.18f)
                curveToRelative(-7.0f, -3.39f, -9.0f, -3.39f, -15.29f, -0.35f)
                lineToRelative(-39.0f, 18.78f)
                curveToRelative(-10.39f, 5.0f, -10.39f, 13.18f, 0.0f, 18.2f)
                lineToRelative(197.4f, 95.32f)
                curveToRelative(5.13f, 2.56f, 12.0f, 3.73f, 18.78f, 3.73f)
                reflectiveCurveToRelative(13.65f, -1.28f, 18.78f, -3.73f)
                lineTo(472.18f, 381.0f)
                curveTo(482.68f, 375.93f, 482.68f, 367.77f, 472.3f, 362.75f)
                close()
            }
        }
        .build()
        return _logoBuffer!!
    }

private var _logoBuffer: ImageVector? = null
