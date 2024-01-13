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

public val SolidGroup.CandyCane: ImageVector
    get() {
        if (_candyCane != null) {
            return _candyCane!!
        }
        _candyCane = Builder(name = "CandyCane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(348.8f, 131.5f)
                curveToRelative(3.7f, -2.3f, 7.9f, -3.5f, 12.2f, -3.5f)
                curveToRelative(12.7f, 0.0f, 23.0f, 10.3f, 23.0f, 23.0f)
                verticalLineToRelative(5.6f)
                curveToRelative(0.0f, 9.9f, -5.1f, 19.1f, -13.5f, 24.3f)
                lineTo(30.1f, 393.7f)
                curveTo(0.1f, 412.5f, -9.0f, 451.9f, 9.7f, 481.9f)
                reflectiveCurveToRelative(58.2f, 39.1f, 88.2f, 20.4f)
                lineTo(438.4f, 289.5f)
                curveToRelative(45.8f, -28.6f, 73.6f, -78.8f, 73.6f, -132.8f)
                lineTo(512.0f, 151.0f)
                curveTo(512.0f, 67.6f, 444.4f, 0.0f, 361.0f, 0.0f)
                curveToRelative(-28.3f, 0.0f, -56.0f, 8.0f, -80.1f, 23.0f)
                lineTo(254.1f, 39.7f)
                curveToRelative(-30.0f, 18.7f, -39.1f, 58.2f, -20.4f, 88.2f)
                reflectiveCurveToRelative(58.2f, 39.1f, 88.2f, 20.4f)
                lineToRelative(26.8f, -16.8f)
                close()
                moveTo(298.4f, 49.8f)
                curveToRelative(9.2f, -5.7f, 19.1f, -10.1f, 29.4f, -13.1f)
                lineTo(348.0f, 97.5f)
                curveToRelative(-5.7f, 1.4f, -11.2f, 3.7f, -16.3f, 6.8f)
                lineToRelative(-12.6f, 7.9f)
                lineTo(298.4f, 49.8f)
                close()
                moveTo(386.9f, 102.5f)
                lineToRelative(46.2f, -46.2f)
                curveToRelative(8.5f, 6.5f, 16.1f, 14.1f, 22.6f, 22.6f)
                lineToRelative(-46.2f, 46.2f)
                curveToRelative(-5.1f, -9.6f, -13.0f, -17.5f, -22.6f, -22.6f)
                close()
                moveTo(415.8f, 161.8f)
                lineToRelative(61.6f, 20.5f)
                curveToRelative(-2.2f, 10.5f, -5.8f, 20.7f, -10.5f, 30.2f)
                lineToRelative(-62.0f, -20.7f)
                curveToRelative(6.2f, -8.8f, 10.1f, -19.1f, 11.0f, -30.1f)
                close()
                moveTo(329.7f, 244.3f)
                lineToRelative(60.4f, 37.7f)
                lineToRelative(-30.2f, 18.9f)
                lineToRelative(-60.4f, -37.7f)
                lineToRelative(30.2f, -18.9f)
                close()
                moveTo(222.5f, 311.3f)
                lineToRelative(60.4f, 37.7f)
                lineToRelative(-30.2f, 18.9f)
                lineToRelative(-60.4f, -37.7f)
                lineToRelative(30.2f, -18.9f)
                close()
                moveTo(119.3f, 375.7f)
                lineToRelative(60.4f, 37.7f)
                lineToRelative(-30.2f, 18.9f)
                lineTo(89.1f, 394.6f)
                lineToRelative(30.2f, -18.9f)
                close()
            }
        }
        .build()
        return _candyCane!!
    }

private var _candyCane: ImageVector? = null
