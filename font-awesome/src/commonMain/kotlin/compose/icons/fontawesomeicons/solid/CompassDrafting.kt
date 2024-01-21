package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CompassDrafting: ImageVector
    get() {
        if (_compassDrafting != null) {
            return _compassDrafting!!
        }
        _compassDrafting = Builder(name = "CompassDrafting", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 96.0f)
                curveToRelative(0.0f, 14.3f, -3.1f, 27.9f, -8.8f, 40.2f)
                lineTo(396.0f, 227.4f)
                curveToRelative(-23.7f, 25.3f, -54.2f, 44.1f, -88.5f, 53.6f)
                lineTo(256.0f, 192.0f)
                horizontalLineToRelative(0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-68.0f, 117.5f)
                curveToRelative(21.5f, 6.8f, 44.3f, 10.5f, 68.1f, 10.5f)
                curveToRelative(70.7f, 0.0f, 133.8f, -32.7f, 174.9f, -84.0f)
                curveToRelative(11.1f, -13.8f, 31.2f, -16.0f, 45.0f, -5.0f)
                reflectiveCurveToRelative(16.0f, 31.2f, 5.0f, 45.0f)
                curveTo(428.1f, 341.8f, 347.0f, 384.0f, 256.0f, 384.0f)
                curveToRelative(-35.4f, 0.0f, -69.4f, -6.4f, -100.7f, -18.1f)
                lineTo(98.7f, 463.7f)
                curveTo(94.0f, 471.8f, 87.0f, 478.4f, 78.6f, 482.6f)
                lineTo(23.2f, 510.3f)
                curveToRelative(-5.0f, 2.5f, -10.9f, 2.2f, -15.6f, -0.7f)
                reflectiveCurveTo(0.0f, 501.5f, 0.0f, 496.0f)
                lineTo(0.0f, 440.6f)
                curveToRelative(0.0f, -8.4f, 2.2f, -16.7f, 6.5f, -24.1f)
                lineToRelative(60.0f, -103.7f)
                curveTo(53.7f, 301.6f, 41.8f, 289.3f, 31.2f, 276.0f)
                curveToRelative(-11.1f, -13.8f, -8.8f, -33.9f, 5.0f, -45.0f)
                reflectiveCurveToRelative(33.9f, -8.8f, 45.0f, 5.0f)
                curveToRelative(5.7f, 7.1f, 11.8f, 13.8f, 18.2f, 20.1f)
                lineToRelative(69.4f, -119.9f)
                curveToRelative(-5.6f, -12.2f, -8.8f, -25.8f, -8.8f, -40.2f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 43.0f, 96.0f, 96.0f)
                close()
                moveTo(373.0f, 393.9f)
                curveToRelative(32.6f, -12.8f, 62.5f, -30.8f, 88.9f, -52.9f)
                lineToRelative(43.7f, 75.5f)
                curveToRelative(4.2f, 7.3f, 6.5f, 15.6f, 6.5f, 24.1f)
                lineTo(512.1f, 496.0f)
                curveToRelative(0.0f, 5.5f, -2.9f, 10.7f, -7.6f, 13.6f)
                reflectiveCurveToRelative(-10.6f, 3.2f, -15.6f, 0.7f)
                lineToRelative(-55.4f, -27.7f)
                curveToRelative(-8.4f, -4.2f, -15.4f, -10.8f, -20.1f, -18.9f)
                lineTo(373.0f, 393.9f)
                close()
                moveTo(256.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _compassDrafting!!
    }

private var _compassDrafting: ImageVector? = null
