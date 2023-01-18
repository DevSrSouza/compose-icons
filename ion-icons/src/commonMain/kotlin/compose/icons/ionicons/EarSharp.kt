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

public val IonIcons.EarSharp: ImageVector
    get() {
        if (_earSharp != null) {
            return _earSharp!!
        }
        _earSharp = Builder(name = "EarSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(380.48f, 68.09f)
                curveTo(347.09f, 34.5f, 302.88f, 16.0f, 256.0f, 16.0f)
                curveTo(159.0f, 16.0f, 80.0f, 95.0f, 80.0f, 192.0f)
                verticalLineTo(398.57f)
                arcToRelative(97.59f, 97.59f, 0.0f, false, false, 28.0f, 68.49f)
                arcTo(94.49f, 94.49f, 0.0f, false, false, 176.0f, 496.0f)
                curveToRelative(19.93f, 0.0f, 41.06f, -7.69f, 62.8f, -22.87f)
                arcToRelative(181.46f, 181.46f, 0.0f, false, false, 25.88f, -21.86f)
                curveTo(327.37f, 390.16f, 432.0f, 288.06f, 432.0f, 192.0f)
                curveTo(432.0f, 145.51f, 413.71f, 101.51f, 380.48f, 68.09f)
                close()
                moveTo(368.0f, 200.0f)
                horizontalLineTo(336.0f)
                verticalLineTo(184.0f)
                curveToRelative(0.0f, -39.7f, -35.89f, -72.0f, -80.0f, -72.0f)
                reflectiveCurveToRelative(-80.0f, 32.3f, -80.0f, 72.0f)
                verticalLineToRelative(30.41f)
                curveToRelative(27.5f, -7.84f, 59.89f, -6.62f, 64.26f, -6.41f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 38.62f, 75.9f)
                curveToRelative(-0.3f, 0.41f, -0.61f, 0.81f, -0.95f, 1.2f)
                curveToRelative(-16.55f, 19.0f, -36.0f, 45.49f, -38.46f, 55.0f)
                lineToRelative(-4.07f, 15.47f)
                lineToRelative(-30.94f, -8.14f)
                lineToRelative(4.07f, -15.47f)
                curveToRelative(5.51f, -20.94f, 36.93f, -58.2f, 44.66f, -67.15f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 239.82f, 240.0f)
                lineToRelative(-0.88f, 0.0f)
                curveToRelative(-10.67f, -0.58f, -42.66f, -0.25f, -62.12f, 8.0f)
                lineToRelative(-0.82f, 0.35f)
                verticalLineTo(320.0f)
                horizontalLineTo(144.0f)
                verticalLineTo(184.0f)
                curveToRelative(0.0f, -57.35f, 50.24f, -104.0f, 112.0f, -104.0f)
                reflectiveCurveToRelative(112.0f, 46.65f, 112.0f, 104.0f)
                close()
            }
        }
        .build()
        return _earSharp!!
    }

private var _earSharp: ImageVector? = null
