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

public val IonIcons.LogoBitcoin: ImageVector
    get() {
        if (_logoBitcoin != null) {
            return _logoBitcoin!!
        }
        _logoBitcoin = Builder(name = "LogoBitcoin", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(410.47f, 279.2f)
                curveToRelative(-5.0f, -11.5f, -12.7f, -21.6f, -28.1f, -30.1f)
                arcToRelative(98.15f, 98.15f, 0.0f, false, false, -25.4f, -10.0f)
                arcToRelative(62.22f, 62.22f, 0.0f, false, false, 16.3f, -11.0f)
                arcToRelative(56.37f, 56.37f, 0.0f, false, false, 15.6f, -23.3f)
                arcToRelative(77.11f, 77.11f, 0.0f, false, false, 3.5f, -28.2f)
                curveToRelative(-1.1f, -16.8f, -4.4f, -33.1f, -13.2f, -44.8f)
                reflectiveCurveToRelative(-21.2f, -20.7f, -37.6f, -27.0f)
                curveToRelative(-12.6f, -4.8f, -25.5f, -7.8f, -45.5f, -8.9f)
                lineTo(296.07f, 32.0f)
                horizontalLineToRelative(-40.0f)
                lineTo(256.07f, 96.0f)
                horizontalLineToRelative(-32.0f)
                lineTo(224.07f, 32.0f)
                horizontalLineToRelative(-41.0f)
                lineTo(183.07f, 96.0f)
                lineTo(96.0f, 96.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(27.87f)
                curveToRelative(8.7f, 0.0f, 14.6f, 0.8f, 17.6f, 2.3f)
                arcToRelative(13.22f, 13.22f, 0.0f, false, true, 6.5f, 6.0f)
                curveToRelative(1.3f, 2.5f, 1.9f, 8.4f, 1.9f, 17.5f)
                lineTo(149.87f, 343.0f)
                curveToRelative(0.0f, 9.0f, -0.6f, 14.8f, -1.9f, 17.4f)
                reflectiveCurveToRelative(-2.0f, 4.9f, -5.1f, 6.3f)
                reflectiveCurveToRelative(-3.2f, 1.3f, -11.8f, 1.3f)
                horizontalLineToRelative(-26.4f)
                lineTo(96.0f, 416.0f)
                horizontalLineToRelative(87.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(41.0f)
                lineTo(224.0f, 416.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(40.0f)
                lineTo(296.0f, 415.6f)
                curveToRelative(26.0f, -1.3f, 44.5f, -4.7f, 59.4f, -10.3f)
                curveToRelative(19.3f, -7.2f, 34.1f, -17.7f, 44.7f, -31.5f)
                reflectiveCurveToRelative(14.0f, -34.9f, 14.93f, -51.2f)
                curveTo(415.7f, 308.1f, 415.0f, 289.4f, 410.47f, 279.2f)
                close()
                moveTo(224.0f, 150.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(74.0f)
                lineTo(224.0f, 224.0f)
                close()
                moveTo(224.0f, 362.0f)
                lineTo(224.0f, 272.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(90.0f)
                close()
                moveTo(296.0f, 153.9f)
                curveToRelative(6.0f, 2.5f, 9.9f, 7.5f, 13.8f, 12.7f)
                curveToRelative(4.3f, 5.7f, 6.5f, 13.3f, 6.5f, 21.4f)
                curveToRelative(0.0f, 7.8f, -2.9f, 14.5f, -7.5f, 20.5f)
                curveToRelative(-3.8f, 4.9f, -6.8f, 8.3f, -12.8f, 11.1f)
                close()
                moveTo(324.8f, 340.6f)
                curveToRelative(-7.8f, 6.9f, -12.3f, 10.1f, -22.1f, 13.8f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, -6.7f, 1.9f)
                lineTo(296.0f, 273.5f)
                arcToRelative(40.74f, 40.74f, 0.0f, false, true, 11.3f, 3.4f)
                curveToRelative(7.8f, 3.3f, 15.2f, 6.9f, 19.8f, 13.2f)
                arcToRelative(43.82f, 43.82f, 0.0f, false, true, 8.0f, 24.7f)
                curveTo(335.07f, 325.7f, 332.27f, 334.0f, 324.77f, 340.6f)
                close()
            }
        }
        .build()
        return _logoBitcoin!!
    }

private var _logoBitcoin: ImageVector? = null
