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

public val SolidGroup.WonSign: ImageVector
    get() {
        if (_wonSign != null) {
            return _wonSign!!
        }
        _wonSign = Builder(name = "WonSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.4f, 53.9f)
                curveTo(56.8f, 37.1f, 38.6f, 28.1f, 21.9f, 33.6f)
                reflectiveCurveTo(-3.9f, 57.4f, 1.6f, 74.1f)
                lineTo(51.6f, 224.0f)
                lineTo(32.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(72.9f, 288.0f)
                lineToRelative(56.7f, 170.1f)
                curveToRelative(4.5f, 13.5f, 17.4f, 22.4f, 31.6f, 21.9f)
                reflectiveCurveToRelative(26.4f, -10.4f, 29.8f, -24.2f)
                lineTo(233.0f, 288.0f)
                horizontalLineToRelative(46.0f)
                lineTo(321.0f, 455.8f)
                curveToRelative(3.4f, 13.8f, 15.6f, 23.7f, 29.8f, 24.2f)
                reflectiveCurveToRelative(27.1f, -8.4f, 31.6f, -21.9f)
                lineTo(439.1f, 288.0f)
                lineTo(480.0f, 288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(460.4f, 224.0f)
                lineToRelative(50.0f, -149.9f)
                curveToRelative(5.6f, -16.8f, -3.5f, -34.9f, -20.2f, -40.5f)
                reflectiveCurveToRelative(-34.9f, 3.5f, -40.5f, 20.2f)
                lineTo(392.9f, 224.0f)
                lineTo(329.0f, 224.0f)
                lineTo(287.0f, 56.2f)
                curveTo(283.5f, 42.0f, 270.7f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveToRelative(-27.5f, 10.0f, -31.0f, 24.2f)
                lineTo(183.0f, 224.0f)
                horizontalLineToRelative(-64.0f)
                lineTo(62.4f, 53.9f)
                close()
                moveTo(140.4f, 288.0f)
                lineTo(167.0f, 288.0f)
                lineToRelative(-11.4f, 45.6f)
                lineTo(140.4f, 288.0f)
                close()
                moveTo(249.0f, 224.0f)
                lineToRelative(7.0f, -28.1f)
                lineToRelative(7.0f, 28.1f)
                lineTo(249.0f, 224.0f)
                close()
                moveTo(345.0f, 288.0f)
                horizontalLineToRelative(26.6f)
                lineToRelative(-15.2f, 45.6f)
                lineTo(345.0f, 288.0f)
                close()
            }
        }
        .build()
        return _wonSign!!
    }

private var _wonSign: ImageVector? = null
