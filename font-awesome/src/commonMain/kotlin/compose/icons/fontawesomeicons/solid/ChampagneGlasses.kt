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
                moveTo(320.0f, 128.0f)
                lineTo(320.0f, 49.1f)
                lineTo(186.6f, 0.3f)
                curveToRelative(-11.4f, -4.2f, -24.0f, 0.9f, -29.5f, 11.7f)
                lineTo(71.8f, 181.1f)
                curveToRelative(-30.8f, 61.0f, -8.0f, 133.8f, 48.1f, 167.4f)
                lineToRelative(-28.0f, 77.4f)
                lineTo(32.1f, 403.9f)
                curveTo(19.7f, 399.4f, 6.0f, 405.8f, 1.4f, 418.3f)
                reflectiveCurveToRelative(1.9f, 26.3f, 14.3f, 30.8f)
                lineToRelative(164.6f, 60.3f)
                curveToRelative(12.4f, 4.5f, 26.1f, -1.9f, 30.6f, -14.4f)
                reflectiveCurveToRelative(-1.9f, -26.3f, -14.3f, -30.8f)
                lineToRelative(-59.9f, -21.9f)
                lineToRelative(28.0f, -77.3f)
                curveToRelative(68.1f, 11.6f, 135.7f, -32.8f, 150.1f, -103.6f)
                lineToRelative(5.1f, -24.8f)
                lineToRelative(5.1f, 24.8f)
                curveToRelative(14.5f, 70.8f, 82.0f, 115.2f, 150.1f, 103.6f)
                lineToRelative(28.0f, 77.3f)
                lineToRelative(-59.9f, 21.9f)
                curveToRelative(-12.4f, 4.5f, -18.8f, 18.3f, -14.3f, 30.8f)
                reflectiveCurveToRelative(18.2f, 18.9f, 30.6f, 14.4f)
                lineToRelative(164.6f, -60.3f)
                curveToRelative(12.4f, -4.5f, 18.8f, -18.3f, 14.3f, -30.8f)
                reflectiveCurveToRelative(-18.2f, -18.9f, -30.6f, -14.4f)
                lineToRelative(-59.9f, 21.9f)
                lineToRelative(-28.0f, -77.4f)
                curveToRelative(56.1f, -33.6f, 78.8f, -106.4f, 48.1f, -167.4f)
                lineTo(482.9f, 12.0f)
                curveTo(477.4f, 1.1f, 464.7f, -3.9f, 453.4f, 0.3f)
                lineTo(320.0f, 49.1f)
                lineTo(320.0f, 128.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(284.3f, 172.4f)
                lineTo(153.9f, 124.6f)
                lineToRelative(36.3f, -71.9f)
                lineTo(300.6f, 93.1f)
                lineToRelative(-16.2f, 79.3f)
                close()
                moveTo(355.6f, 172.4f)
                lineTo(339.4f, 93.1f)
                lineTo(449.8f, 52.7f)
                lineToRelative(36.3f, 71.9f)
                lineTo(355.7f, 172.4f)
                close()
            }
        }
        .build()
        return _champagneGlasses!!
    }

private var _champagneGlasses: ImageVector? = null
