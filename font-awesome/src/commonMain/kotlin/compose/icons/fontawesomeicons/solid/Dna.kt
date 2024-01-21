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

public val SolidGroup.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(name = "Dna", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                curveToRelative(0.0f, 59.8f, -30.3f, 107.5f, -69.4f, 146.6f)
                curveToRelative(-28.0f, 28.0f, -62.5f, 53.5f, -97.3f, 77.4f)
                lineToRelative(-2.5f, 1.7f)
                curveToRelative(-11.9f, 8.1f, -23.8f, 16.1f, -35.5f, 23.9f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-1.6f, 1.0f)
                curveToRelative(-6.0f, 4.0f, -11.9f, 7.9f, -17.8f, 11.9f)
                curveToRelative(-20.9f, 14.0f, -40.8f, 27.7f, -59.3f, 41.5f)
                lineTo(283.3f, 336.0f)
                curveToRelative(-9.8f, -7.4f, -20.1f, -14.7f, -30.7f, -22.1f)
                lineToRelative(7.0f, -4.7f)
                lineToRelative(3.0f, -2.0f)
                curveToRelative(15.1f, -10.1f, 30.9f, -20.6f, 46.7f, -31.6f)
                curveToRelative(25.0f, 18.1f, 48.9f, 37.3f, 69.4f, 57.7f)
                curveTo(417.7f, 372.5f, 448.0f, 420.2f, 448.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                curveToRelative(0.0f, -59.8f, 30.3f, -107.5f, 69.4f, -146.6f)
                curveToRelative(28.0f, -28.0f, 62.5f, -53.5f, 97.3f, -77.4f)
                curveToRelative(-34.8f, -23.9f, -69.3f, -49.3f, -97.3f, -77.4f)
                curveTo(30.3f, 139.5f, 0.0f, 91.8f, 0.0f, 32.0f)
                curveTo(0.0f, 14.3f, 14.3f, 0.0f, 32.0f, 0.0f)
                reflectiveCurveTo(64.0f, 14.3f, 64.0f, 32.0f)
                lineTo(384.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(338.6f, 384.0f)
                lineTo(109.4f, 384.0f)
                curveToRelative(-10.1f, 10.6f, -18.6f, 21.3f, -25.5f, 32.0f)
                lineTo(364.1f, 416.0f)
                curveToRelative(-6.8f, -10.7f, -15.3f, -21.4f, -25.5f, -32.0f)
                close()
                moveTo(109.4f, 128.0f)
                lineTo(338.6f, 128.0f)
                curveToRelative(10.1f, -10.7f, 18.6f, -21.3f, 25.5f, -32.0f)
                lineTo(83.9f, 96.0f)
                curveToRelative(6.8f, 10.7f, 15.3f, 21.3f, 25.5f, 32.0f)
                close()
                moveTo(164.8f, 176.0f)
                curveToRelative(18.4f, 13.8f, 38.4f, 27.5f, 59.3f, 41.5f)
                curveToRelative(20.9f, -14.0f, 40.8f, -27.7f, 59.3f, -41.5f)
                lineTo(164.7f, 176.0f)
                close()
            }
        }
        .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
