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

public val IonIcons.CallSharp: ImageVector
    get() {
        if (_callSharp != null) {
            return _callSharp!!
        }
        _callSharp = Builder(name = "CallSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(478.94f, 370.14f)
                curveToRelative(-5.22f, -5.56f, -23.65f, -22.0f, -57.53f, -43.75f)
                curveToRelative(-34.13f, -21.94f, -59.3f, -35.62f, -66.52f, -38.81f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, false, -3.92f, 0.49f)
                curveToRelative(-11.63f, 9.07f, -31.21f, 25.73f, -32.26f, 26.63f)
                curveToRelative(-6.78f, 5.81f, -6.78f, 5.81f, -12.33f, 4.0f)
                curveToRelative(-9.76f, -3.2f, -40.08f, -19.3f, -66.5f, -45.78f)
                reflectiveCurveToRelative(-43.35f, -57.55f, -46.55f, -67.3f)
                curveToRelative(-1.83f, -5.56f, -1.83f, -5.56f, 4.0f, -12.34f)
                curveToRelative(0.9f, -1.05f, 17.57f, -20.63f, 26.64f, -32.25f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, false, 0.49f, -3.92f)
                curveToRelative(-3.19f, -7.23f, -16.87f, -32.39f, -38.81f, -66.52f)
                curveToRelative(-21.78f, -33.87f, -38.2f, -52.3f, -43.76f, -57.52f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 138.0f, 32.2f)
                arcTo(322.35f, 322.35f, 0.0f, false, false, 82.0f, 57.65f)
                arcTo(338.0f, 338.0f, 0.0f, false, false, 33.35f, 92.0f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, false, -1.26f, 3.74f)
                curveToRelative(2.09f, 9.74f, 12.08f, 50.4f, 43.08f, 106.72f)
                curveToRelative(31.63f, 57.48f, 53.55f, 86.93f, 100.0f, 133.22f)
                reflectiveCurveTo(252.0f, 405.21f, 309.54f, 436.84f)
                curveToRelative(56.32f, 31.0f, 97.0f, 41.0f, 106.72f, 43.07f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, 3.75f, -1.26f)
                arcTo(337.73f, 337.73f, 0.0f, false, false, 454.35f, 430.0f)
                arcToRelative(322.7f, 322.7f, 0.0f, false, false, 25.45f, -56.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 478.94f, 370.14f)
                close()
            }
        }
        .build()
        return _callSharp!!
    }

private var _callSharp: ImageVector? = null
