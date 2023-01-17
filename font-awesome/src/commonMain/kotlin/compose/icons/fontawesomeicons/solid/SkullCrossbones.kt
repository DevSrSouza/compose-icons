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

public val SolidGroup.SkullCrossbones: ImageVector
    get() {
        if (_skullCrossbones != null) {
            return _skullCrossbones!!
        }
        _skullCrossbones = Builder(name = "SkullCrossbones", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 128.0f)
                curveToRelative(0.0f, 44.4f, -25.4f, 83.5f, -64.0f, 106.4f)
                lineTo(336.0f, 256.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(208.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(176.0f, 234.4f)
                curveToRelative(-38.6f, -23.0f, -64.0f, -62.1f, -64.0f, -106.4f)
                curveTo(112.0f, 57.3f, 176.5f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(144.0f, 57.3f, 144.0f, 128.0f)
                close()
                moveTo(200.0f, 176.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(344.0f, 144.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                close()
                moveTo(35.4f, 273.7f)
                curveToRelative(7.9f, -15.8f, 27.1f, -22.2f, 42.9f, -14.3f)
                lineTo(256.0f, 348.2f)
                lineToRelative(177.7f, -88.8f)
                curveToRelative(15.8f, -7.9f, 35.0f, -1.5f, 42.9f, 14.3f)
                reflectiveCurveToRelative(1.5f, 35.0f, -14.3f, 42.9f)
                lineTo(327.6f, 384.0f)
                lineToRelative(134.8f, 67.4f)
                curveToRelative(15.8f, 7.9f, 22.2f, 27.1f, 14.3f, 42.9f)
                reflectiveCurveToRelative(-27.1f, 22.2f, -42.9f, 14.3f)
                lineTo(256.0f, 419.8f)
                lineTo(78.3f, 508.6f)
                curveToRelative(-15.8f, 7.9f, -35.0f, 1.5f, -42.9f, -14.3f)
                reflectiveCurveToRelative(-1.5f, -35.0f, 14.3f, -42.9f)
                lineTo(184.4f, 384.0f)
                lineTo(49.7f, 316.6f)
                curveToRelative(-15.8f, -7.9f, -22.2f, -27.1f, -14.3f, -42.9f)
                close()
            }
        }
        .build()
        return _skullCrossbones!!
    }

private var _skullCrossbones: ImageVector? = null
