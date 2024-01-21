package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 24.0f)
                curveTo(48.0f, 10.7f, 37.3f, 0.0f, 24.0f, 0.0f)
                reflectiveCurveTo(0.0f, 10.7f, 0.0f, 24.0f)
                lineTo(0.0f, 64.0f)
                lineTo(0.0f, 350.5f)
                lineTo(0.0f, 400.0f)
                verticalLineToRelative(88.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(48.0f, 388.0f)
                lineToRelative(80.3f, -20.1f)
                curveToRelative(41.1f, -10.3f, 84.6f, -5.5f, 122.5f, 13.4f)
                curveToRelative(44.2f, 22.1f, 95.5f, 24.8f, 141.7f, 7.4f)
                lineToRelative(34.7f, -13.0f)
                curveToRelative(12.5f, -4.7f, 20.8f, -16.6f, 20.8f, -30.0f)
                lineTo(448.0f, 66.1f)
                curveToRelative(0.0f, -23.0f, -24.2f, -38.0f, -44.8f, -27.7f)
                lineToRelative(-9.6f, 4.8f)
                curveToRelative(-46.3f, 23.2f, -100.8f, 23.2f, -147.1f, 0.0f)
                curveToRelative(-35.1f, -17.6f, -75.4f, -22.0f, -113.5f, -12.5f)
                lineTo(48.0f, 52.0f)
                lineTo(48.0f, 24.0f)
                close()
                moveTo(48.0f, 101.5f)
                lineToRelative(96.6f, -24.2f)
                curveToRelative(27.0f, -6.7f, 55.5f, -3.6f, 80.4f, 8.8f)
                curveToRelative(54.9f, 27.4f, 118.7f, 29.7f, 175.0f, 6.8f)
                lineTo(400.0f, 334.7f)
                lineToRelative(-24.4f, 9.1f)
                curveToRelative(-33.7f, 12.6f, -71.2f, 10.7f, -103.4f, -5.4f)
                curveToRelative(-48.2f, -24.1f, -103.3f, -30.1f, -155.6f, -17.1f)
                lineTo(48.0f, 338.5f)
                verticalLineToRelative(-237.0f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
