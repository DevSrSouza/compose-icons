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
        _skullCrossbones = Builder(name = "SkullCrossbones", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 128.0f)
                curveToRelative(0.0f, 44.4f, -25.4f, 83.5f, -64.0f, 106.4f)
                lineTo(304.0f, 256.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(176.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(144.0f, 234.4f)
                curveToRelative(-38.6f, -23.0f, -64.0f, -62.1f, -64.0f, -106.4f)
                curveTo(80.0f, 57.3f, 144.5f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveToRelative(144.0f, 57.3f, 144.0f, 128.0f)
                close()
                moveTo(168.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(312.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(3.4f, 273.7f)
                curveToRelative(7.9f, -15.8f, 27.1f, -22.2f, 42.9f, -14.3f)
                lineTo(224.0f, 348.2f)
                lineToRelative(177.7f, -88.8f)
                curveToRelative(15.8f, -7.9f, 35.0f, -1.5f, 42.9f, 14.3f)
                reflectiveCurveToRelative(1.5f, 35.0f, -14.3f, 42.9f)
                lineTo(295.6f, 384.0f)
                lineToRelative(134.8f, 67.4f)
                curveToRelative(15.8f, 7.9f, 22.2f, 27.1f, 14.3f, 42.9f)
                reflectiveCurveToRelative(-27.1f, 22.2f, -42.9f, 14.3f)
                lineTo(224.0f, 419.8f)
                lineTo(46.3f, 508.6f)
                curveToRelative(-15.8f, 7.9f, -35.0f, 1.5f, -42.9f, -14.3f)
                reflectiveCurveToRelative(-1.5f, -35.0f, 14.3f, -42.9f)
                lineTo(152.4f, 384.0f)
                lineTo(17.7f, 316.6f)
                curveTo(1.9f, 308.7f, -4.5f, 289.5f, 3.4f, 273.7f)
                close()
            }
        }
        .build()
        return _skullCrossbones!!
    }

private var _skullCrossbones: ImageVector? = null
