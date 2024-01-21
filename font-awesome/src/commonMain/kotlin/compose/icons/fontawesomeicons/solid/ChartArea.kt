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

public val SolidGroup.ChartArea: ImageVector
    get() {
        if (_chartArea != null) {
            return _chartArea!!
        }
        _chartArea = Builder(name = "ChartArea", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(0.0f, 46.3f, 0.0f, 64.0f)
                lineTo(0.0f, 400.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                lineTo(480.0f, 480.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(80.0f, 416.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(160.0f, 352.0f)
                lineTo(448.0f, 352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(480.0f, 251.8f)
                curveToRelative(0.0f, -7.6f, -2.7f, -15.0f, -7.7f, -20.8f)
                lineToRelative(-65.8f, -76.8f)
                curveToRelative(-12.1f, -14.2f, -33.7f, -15.0f, -46.9f, -1.8f)
                lineToRelative(-21.0f, 21.0f)
                curveToRelative(-10.0f, 10.0f, -26.4f, 9.2f, -35.4f, -1.6f)
                lineToRelative(-39.2f, -47.0f)
                curveToRelative(-12.6f, -15.1f, -35.7f, -15.4f, -48.7f, -0.6f)
                lineTo(135.9f, 215.0f)
                curveToRelative(-5.1f, 5.8f, -7.9f, 13.3f, -7.9f, 21.1f)
                verticalLineToRelative(84.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null
