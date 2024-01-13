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

public val SolidGroup.GaugeHigh: ImageVector
    get() {
        if (_gaugeHigh != null) {
            return _gaugeHigh!!
        }
        _gaugeHigh = Builder(name = "GaugeHigh", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
                moveTo(288.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(256.0f, 416.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                curveToRelative(0.0f, -17.4f, -6.9f, -33.1f, -18.1f, -44.6f)
                lineTo(366.0f, 161.7f)
                curveToRelative(5.3f, -12.1f, -0.2f, -26.3f, -12.3f, -31.6f)
                reflectiveCurveToRelative(-26.3f, 0.2f, -31.6f, 12.3f)
                lineTo(257.9f, 288.0f)
                curveToRelative(-0.6f, 0.0f, -1.3f, 0.0f, -1.9f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                close()
                moveTo(176.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(96.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(448.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _gaugeHigh!!
    }

private var _gaugeHigh: ImageVector? = null
