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
                moveTo(333.2f, 322.8f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-133.9f, -146.0f)
                lineToRelative(0.0f, 0.0f)
                lineTo(146.0f, 118.6f)
                curveToRelative(7.8f, -5.1f, 37.0f, -22.6f, 78.0f, -22.6f)
                reflectiveCurveToRelative(70.2f, 17.4f, 78.0f, 22.6f)
                lineTo(245.7f, 180.0f)
                lineToRelative(85.6f, 93.4f)
                lineToRelative(27.4f, -29.8f)
                curveToRelative(16.3f, -17.7f, 25.3f, -40.9f, 25.3f, -65.0f)
                verticalLineTo(149.1f)
                curveToRelative(0.0f, -19.0f, -5.6f, -37.5f, -16.1f, -53.3f)
                lineTo(327.8f, 35.6f)
                curveTo(312.9f, 13.4f, 287.9f, 0.0f, 261.2f, 0.0f)
                horizontalLineToRelative(-76.0f)
                curveToRelative(-25.8f, 0.0f, -50.1f, 12.5f, -65.1f, 33.5f)
                lineTo(81.9f, 87.0f)
                curveTo(70.3f, 103.2f, 64.0f, 122.8f, 64.0f, 142.8f)
                verticalLineTo(164.0f)
                curveToRelative(0.0f, 23.2f, 8.4f, 45.6f, 23.6f, 63.1f)
                lineToRelative(56.0f, 64.2f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(83.3f, 95.6f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(91.8f, 105.3f)
                curveToRelative(10.0f, 11.5f, 26.8f, 14.3f, 40.0f, 6.8f)
                lineToRelative(54.5f, -31.1f)
                curveToRelative(17.8f, -10.2f, 21.6f, -34.3f, 7.7f, -49.4f)
                lineToRelative(-87.7f, -95.7f)
                close()
                moveTo(205.2f, 410.6f)
                lineToRelative(-83.3f, -95.6f)
                lineTo(27.1f, 418.5f)
                curveToRelative(-13.9f, 15.1f, -10.1f, 39.2f, 7.7f, 49.4f)
                lineToRelative(55.1f, 31.5f)
                curveToRelative(13.0f, 7.4f, 29.3f, 4.9f, 39.4f, -6.1f)
                lineToRelative(75.9f, -82.6f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
