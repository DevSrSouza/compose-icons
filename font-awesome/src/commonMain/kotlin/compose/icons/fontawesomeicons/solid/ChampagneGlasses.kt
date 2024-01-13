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

public val SolidGroup.ChampagneGlasses: ImageVector
    get() {
        if (_champagneGlasses != null) {
            return _champagneGlasses!!
        }
        _champagneGlasses = Builder(name = "ChampagneGlasses", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(155.6f, 17.3f)
                curveTo(163.0f, 3.0f, 179.9f, -3.6f, 195.0f, 1.9f)
                lineTo(320.0f, 47.5f)
                lineToRelative(125.0f, -45.6f)
                curveToRelative(15.1f, -5.5f, 32.0f, 1.1f, 39.4f, 15.4f)
                lineToRelative(78.8f, 152.9f)
                curveToRelative(28.8f, 55.8f, 10.3f, 122.3f, -38.5f, 156.6f)
                lineTo(556.1f, 413.0f)
                lineToRelative(41.0f, -15.0f)
                curveToRelative(16.6f, -6.0f, 35.0f, 2.5f, 41.0f, 19.1f)
                reflectiveCurveToRelative(-2.5f, 35.0f, -19.1f, 41.0f)
                lineToRelative(-71.1f, 25.9f)
                lineTo(476.8f, 510.0f)
                curveToRelative(-16.6f, 6.1f, -35.0f, -2.5f, -41.0f, -19.1f)
                reflectiveCurveToRelative(2.5f, -35.0f, 19.1f, -41.0f)
                lineToRelative(41.0f, -15.0f)
                lineToRelative(-31.3f, -86.2f)
                curveToRelative(-59.4f, 5.2f, -116.2f, -34.0f, -130.0f, -95.2f)
                lineTo(320.0f, 188.8f)
                lineToRelative(-14.6f, 64.7f)
                curveToRelative(-13.8f, 61.3f, -70.6f, 100.4f, -130.0f, 95.2f)
                lineToRelative(-31.3f, 86.2f)
                lineToRelative(41.0f, 15.0f)
                curveToRelative(16.6f, 6.0f, 25.2f, 24.4f, 19.1f, 41.0f)
                reflectiveCurveToRelative(-24.4f, 25.2f, -41.0f, 19.1f)
                lineTo(92.2f, 484.1f)
                lineTo(21.1f, 458.2f)
                curveToRelative(-16.6f, -6.1f, -25.2f, -24.4f, -19.1f, -41.0f)
                reflectiveCurveToRelative(24.4f, -25.2f, 41.0f, -19.1f)
                lineToRelative(41.0f, 15.0f)
                lineToRelative(31.3f, -86.2f)
                curveTo(66.5f, 292.5f, 48.1f, 226.0f, 76.9f, 170.2f)
                lineTo(155.6f, 17.3f)
                close()
                moveTo(199.6f, 71.7f)
                lineToRelative(-27.2f, 52.8f)
                lineTo(261.6f, 157.0f)
                lineToRelative(13.1f, -57.9f)
                lineTo(199.6f, 71.7f)
                close()
                moveTo(440.5f, 71.7f)
                lineTo(365.4f, 99.1f)
                lineTo(378.5f, 157.0f)
                lineToRelative(89.2f, -32.5f)
                lineTo(440.5f, 71.7f)
                close()
            }
        }
        .build()
        return _champagneGlasses!!
    }

private var _champagneGlasses: ImageVector? = null
