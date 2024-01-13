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

public val SolidGroup.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(name = "Panorama", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(45.6f, 32.0f)
                curveTo(20.4f, 32.0f, 0.0f, 52.4f, 0.0f, 77.6f)
                lineTo(0.0f, 434.4f)
                curveTo(0.0f, 459.6f, 20.4f, 480.0f, 45.6f, 480.0f)
                curveToRelative(5.1f, 0.0f, 10.0f, -0.8f, 14.7f, -2.4f)
                curveTo(74.6f, 472.8f, 177.6f, 440.0f, 320.0f, 440.0f)
                reflectiveCurveToRelative(245.4f, 32.8f, 259.6f, 37.6f)
                curveToRelative(4.7f, 1.6f, 9.7f, 2.4f, 14.7f, 2.4f)
                curveToRelative(25.2f, 0.0f, 45.6f, -20.4f, 45.6f, -45.6f)
                lineTo(639.9f, 77.6f)
                curveTo(640.0f, 52.4f, 619.6f, 32.0f, 594.4f, 32.0f)
                curveToRelative(-5.0f, 0.0f, -10.0f, 0.8f, -14.7f, 2.4f)
                curveTo(565.4f, 39.2f, 462.4f, 72.0f, 320.0f, 72.0f)
                reflectiveCurveTo(74.6f, 39.2f, 60.4f, 34.4f)
                curveTo(55.6f, 32.8f, 50.7f, 32.0f, 45.6f, 32.0f)
                close()
                moveTo(96.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(368.0f, 160.0f)
                curveToRelative(7.9f, 0.0f, 15.4f, 3.9f, 19.8f, 10.5f)
                lineTo(512.3f, 353.0f)
                curveToRelative(5.4f, 8.0f, 5.6f, 18.4f, 0.4f, 26.5f)
                reflectiveCurveToRelative(-14.7f, 12.3f, -24.2f, 10.7f)
                curveTo(442.7f, 382.4f, 385.2f, 376.0f, 320.0f, 376.0f)
                curveToRelative(-65.6f, 0.0f, -123.4f, 6.5f, -169.3f, 14.4f)
                curveToRelative(-9.8f, 1.7f, -19.7f, -2.9f, -24.7f, -11.5f)
                reflectiveCurveToRelative(-4.3f, -19.4f, 1.9f, -27.2f)
                lineTo(197.3f, 265.0f)
                curveToRelative(4.6f, -5.7f, 11.4f, -9.0f, 18.7f, -9.0f)
                reflectiveCurveToRelative(14.2f, 3.3f, 18.7f, 9.0f)
                lineToRelative(26.4f, 33.1f)
                lineToRelative(87.0f, -127.6f)
                curveToRelative(4.5f, -6.6f, 11.9f, -10.5f, 19.8f, -10.5f)
                close()
            }
        }
        .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
