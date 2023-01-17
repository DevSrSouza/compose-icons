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

public val SolidGroup.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) {
            return _solarPanel!!
        }
        _solarPanel = Builder(name = "SolarPanel", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 0.0f)
                curveTo(80.7f, 0.0f, 67.6f, 10.8f, 64.6f, 25.7f)
                lineToRelative(-64.0f, 320.0f)
                curveToRelative(-1.9f, 9.4f, 0.6f, 19.1f, 6.6f, 26.6f)
                reflectiveCurveTo(22.4f, 384.0f, 32.0f, 384.0f)
                lineTo(288.0f, 384.0f)
                verticalLineToRelative(64.0f)
                lineTo(224.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(416.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(352.0f, 448.0f)
                lineTo(352.0f, 384.0f)
                lineTo(608.0f, 384.0f)
                curveToRelative(9.6f, 0.0f, 18.7f, -4.3f, 24.7f, -11.7f)
                reflectiveCurveToRelative(8.5f, -17.2f, 6.6f, -26.6f)
                lineToRelative(-64.0f, -320.0f)
                curveTo(572.4f, 10.8f, 559.3f, 0.0f, 544.0f, 0.0f)
                lineTo(96.0f, 0.0f)
                close()
                moveTo(101.4f, 168.0f)
                lineTo(122.2f, 64.0f)
                horizontalLineToRelative(90.4f)
                lineTo(202.3f, 168.0f)
                lineTo(101.4f, 168.0f)
                close()
                moveTo(91.8f, 216.0f)
                lineTo(197.5f, 216.0f)
                lineTo(187.1f, 320.0f)
                lineTo(71.0f, 320.0f)
                lineTo(91.8f, 216.0f)
                close()
                moveTo(245.7f, 216.0f)
                lineTo(394.3f, 216.0f)
                lineToRelative(10.4f, 104.0f)
                lineTo(235.3f, 320.0f)
                lineToRelative(10.4f, -104.0f)
                close()
                moveTo(442.5f, 216.0f)
                lineTo(548.2f, 216.0f)
                lineTo(569.0f, 320.0f)
                horizontalLineToRelative(-116.0f)
                lineTo(442.5f, 216.0f)
                close()
                moveTo(538.5f, 168.0f)
                lineTo(437.7f, 168.0f)
                lineTo(427.3f, 64.0f)
                horizontalLineToRelative(90.4f)
                lineToRelative(20.8f, 104.0f)
                close()
                moveTo(389.4f, 168.0f)
                horizontalLineToRelative(-139.0f)
                lineTo(260.9f, 64.0f)
                lineTo(379.1f, 64.0f)
                lineToRelative(10.4f, 104.0f)
                close()
            }
        }
        .build()
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
