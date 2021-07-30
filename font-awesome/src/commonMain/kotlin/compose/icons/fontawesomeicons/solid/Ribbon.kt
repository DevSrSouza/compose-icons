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

public val SolidGroup.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = Builder(name = "Ribbon", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1f, 444.3f)
                curveToRelative(-9.6f, 10.8f, -7.5f, 27.6f, 4.5f, 35.7f)
                lineToRelative(68.8f, 27.9f)
                curveToRelative(9.9f, 6.7f, 23.3f, 5.0f, 31.3f, -3.8f)
                lineToRelative(91.8f, -101.9f)
                lineToRelative(-79.2f, -87.9f)
                lineToRelative(-117.2f, 130.0f)
                close()
                moveTo(441.9f, 444.3f)
                reflectiveCurveToRelative(-292.0f, -324.6f, -295.4f, -330.1f)
                curveToRelative(15.4f, -8.4f, 40.2f, -17.9f, 77.5f, -17.9f)
                reflectiveCurveToRelative(62.1f, 9.5f, 77.5f, 17.9f)
                curveToRelative(-3.3f, 5.6f, -56.0f, 64.6f, -56.0f, 64.6f)
                lineToRelative(79.1f, 87.7f)
                lineToRelative(34.2f, -38.0f)
                curveToRelative(28.7f, -31.9f, 33.3f, -78.6f, 11.4f, -115.5f)
                lineToRelative(-43.7f, -73.5f)
                curveToRelative(-4.3f, -7.2f, -9.9f, -13.3f, -16.8f, -18.0f)
                curveToRelative(-40.7f, -27.6f, -127.4f, -29.7f, -171.4f, 0.0f)
                curveToRelative(-6.9f, 4.7f, -12.5f, 10.8f, -16.8f, 18.0f)
                lineToRelative(-43.6f, 73.2f)
                curveToRelative(-1.5f, 2.5f, -37.1f, 62.2f, 11.5f, 116.0f)
                lineTo(337.5f, 504.0f)
                curveToRelative(8.0f, 8.9f, 21.4f, 10.5f, 31.3f, 3.8f)
                lineToRelative(68.8f, -27.9f)
                curveToRelative(11.9f, -8.0f, 14.0f, -24.8f, 4.3f, -35.6f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
