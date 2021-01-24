package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Skiing: ImageVector
    get() {
        if (_skiing != null) {
            return _skiing!!
        }
        _skiing = Builder(name = "Skiing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 96.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveTo(458.5f, 0.0f, 432.0f, 0.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                close()
                moveTo(505.0f, 452.1f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                curveToRelative(-12.1f, 12.1f, -30.5f, 15.4f, -45.1f, 8.7f)
                lineToRelative(-135.8f, -70.2f)
                lineToRelative(49.2f, -73.8f)
                curveToRelative(12.7f, -19.0f, 10.2f, -44.5f, -6.0f, -60.6f)
                lineTo(293.0f, 215.7f)
                lineToRelative(-107.0f, -53.1f)
                curveToRelative(-2.9f, 19.9f, 3.4f, 40.0f, 17.7f, 54.4f)
                lineToRelative(75.1f, 75.2f)
                lineToRelative(-45.9f, 68.8f)
                lineTo(35.0f, 258.7f)
                curveToRelative(-11.7f, -6.0f, -26.2f, -1.5f, -32.3f, 10.3f)
                curveToRelative(-6.1f, 11.8f, -1.5f, 26.3f, 10.3f, 32.3f)
                lineToRelative(391.9f, 202.5f)
                curveToRelative(11.9f, 5.5f, 24.5f, 8.1f, 37.1f, 8.1f)
                curveToRelative(23.2f, 0.0f, 46.0f, -9.0f, 63.0f, -26.0f)
                curveToRelative(9.3f, -9.3f, 9.3f, -24.5f, 0.0f, -33.8f)
                close()
                moveTo(120.0f, 91.6f)
                lineToRelative(-11.5f, 22.5f)
                curveToRelative(14.4f, 7.3f, 31.2f, 4.9f, 42.8f, -4.8f)
                lineToRelative(47.2f, 23.4f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.2f, -0.2f, 0.3f)
                lineToRelative(114.5f, 56.8f)
                lineToRelative(32.4f, -13.0f)
                lineToRelative(6.4f, 19.1f)
                curveToRelative(4.0f, 12.1f, 12.6f, 22.0f, 24.0f, 27.7f)
                lineToRelative(58.1f, 29.0f)
                curveToRelative(15.9f, 7.9f, 35.0f, 1.5f, 42.9f, -14.3f)
                curveToRelative(7.9f, -15.8f, 1.5f, -35.0f, -14.3f, -42.9f)
                lineToRelative(-52.1f, -26.1f)
                lineToRelative(-17.1f, -51.2f)
                curveToRelative(-8.1f, -24.2f, -40.9f, -56.6f, -84.5f, -39.2f)
                lineToRelative(-81.2f, 32.5f)
                lineToRelative(-62.5f, -31.0f)
                curveToRelative(0.3f, -14.5f, -7.2f, -28.6f, -20.9f, -35.6f)
                lineToRelative(-11.1f, 21.7f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-34.4f, -7.0f)
                curveToRelative(-1.8f, -0.4f, -3.7f, 0.2f, -5.0f, 1.7f)
                curveToRelative(-1.9f, 2.2f, -1.7f, 5.5f, 0.5f, 7.4f)
                lineToRelative(26.2f, 23.0f)
                close()
            }
        }
        .build()
        return _skiing!!
    }

private var _skiing: ImageVector? = null
