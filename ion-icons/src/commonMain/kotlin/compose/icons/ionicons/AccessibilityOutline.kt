package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.AccessibilityOutline: ImageVector
    get() {
        if (_accessibilityOutline != null) {
            return _accessibilityOutline!!
        }
        _accessibilityOutline = Builder(name = "AccessibilityOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 56.0f)
                moveToRelative(-40.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -80.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(204.23f, 274.44f)
                curveToRelative(2.9f, -18.06f, 4.2f, -35.52f, -0.5f, -47.59f)
                curveToRelative(-4.0f, -10.38f, -12.7f, -16.19f, -23.2f, -20.15f)
                lineTo(88.0f, 176.76f)
                curveToRelative(-12.0f, -4.0f, -23.21f, -10.7f, -24.0f, -23.94f)
                curveToRelative(-1.0f, -17.0f, 14.0f, -28.0f, 29.0f, -24.0f)
                curveToRelative(0.0f, 0.0f, 88.0f, 31.14f, 163.0f, 31.14f)
                reflectiveCurveToRelative(162.0f, -31.0f, 162.0f, -31.0f)
                curveToRelative(18.0f, -5.0f, 30.0f, 9.0f, 30.0f, 23.79f)
                curveToRelative(0.0f, 14.21f, -11.0f, 19.21f, -24.0f, 23.94f)
                lineToRelative(-88.0f, 31.91f)
                curveToRelative(-8.0f, 3.0f, -21.0f, 9.0f, -26.0f, 18.18f)
                curveToRelative(-6.0f, 10.75f, -5.0f, 29.53f, -2.1f, 47.59f)
                lineToRelative(5.9f, 29.63f)
                lineTo(351.21f, 467.9f)
                curveToRelative(2.8f, 13.15f, -6.3f, 25.44f, -19.4f, 27.74f)
                reflectiveCurveTo(308.0f, 489.0f, 304.12f, 476.28f)
                lineTo(266.56f, 360.35f)
                quadToRelative(-2.71f, -8.34f, -4.8f, -16.87f)
                lineTo(256.0f, 320.0f)
                lineToRelative(-5.3f, 21.65f)
                quadToRelative(-2.52f, 10.35f, -5.8f, 20.48f)
                lineTo(208.0f, 476.18f)
                curveToRelative(-4.0f, 12.85f, -14.5f, 21.75f, -27.6f, 19.46f)
                reflectiveCurveTo(158.0f, 480.05f, 160.94f, 467.9f)
                lineToRelative(37.39f, -163.83f)
                close()
            }
        }
        .build()
        return _accessibilityOutline!!
    }

private var _accessibilityOutline: ImageVector? = null
