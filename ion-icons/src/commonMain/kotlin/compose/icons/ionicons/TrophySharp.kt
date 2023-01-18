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

public val IonIcons.TrophySharp: ImageVector
    get() {
        if (_trophySharp != null) {
            return _trophySharp!!
        }
        _trophySharp = Builder(name = "TrophySharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(399.9f, 80.0f)
                reflectiveCurveToRelative(0.0f, -27.88f, 0.0f, -48.0f)
                lineTo(112.0f, 32.0f)
                lineTo(112.0f, 80.0f)
                lineTo(32.0f, 80.0f)
                verticalLineToRelative(38.0f)
                curveToRelative(0.0f, 32.0f, 9.5f, 62.79f, 26.76f, 86.61f)
                curveToRelative(13.33f, 18.4f, 34.17f, 31.1f, 52.91f, 37.21f)
                curveToRelative(5.44f, 29.29f, 20.2f, 57.13f, 50.19f, 79.83f)
                curveToRelative(22.0f, 16.66f, 48.45f, 28.87f, 72.14f, 33.86f)
                lineTo(234.0f, 436.0f)
                lineTo(160.0f, 436.0f)
                verticalLineToRelative(44.0f)
                lineTo(352.0f, 480.0f)
                lineTo(352.0f, 436.0f)
                lineTo(278.0f, 436.0f)
                lineTo(278.0f, 355.51f)
                curveToRelative(23.69f, -5.0f, 50.13f, -17.2f, 72.14f, -33.86f)
                curveToRelative(30.0f, -22.7f, 44.75f, -50.54f, 50.19f, -79.83f)
                curveToRelative(18.74f, -6.11f, 39.58f, -18.81f, 52.91f, -37.21f)
                curveTo(470.5f, 180.79f, 480.0f, 150.0f, 480.0f, 118.0f)
                lineTo(480.0f, 80.0f)
                close()
                moveTo(94.4f, 178.8f)
                curveTo(83.72f, 164.12f, 77.23f, 144.4f, 76.16f, 124.0f)
                lineTo(112.0f, 124.0f)
                verticalLineToRelative(67.37f)
                curveTo(108.06f, 190.23f, 99.08f, 185.25f, 94.4f, 178.8f)
                close()
                moveTo(417.6f, 178.8f)
                curveTo(413.0f, 185.41f, 406.0f, 191.38f, 400.0f, 191.38f)
                curveToRelative(0.0f, -22.4f, 0.0f, -46.29f, -0.05f, -67.38f)
                horizontalLineToRelative(35.9f)
                curveTo(434.77f, 144.4f, 428.0f, 163.9f, 417.6f, 178.8f)
                close()
            }
        }
        .build()
        return _trophySharp!!
    }

private var _trophySharp: ImageVector? = null
