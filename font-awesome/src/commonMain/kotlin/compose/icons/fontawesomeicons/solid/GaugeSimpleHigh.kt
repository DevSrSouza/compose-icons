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

public val SolidGroup.GaugeSimpleHigh: ImageVector
    get() {
        if (_gaugeSimpleHigh != null) {
            return _gaugeSimpleHigh!!
        }
        _gaugeSimpleHigh = Builder(name = "GaugeSimpleHigh", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
                moveTo(320.0f, 352.0f)
                curveToRelative(0.0f, -15.9f, -5.8f, -30.4f, -15.3f, -41.6f)
                lineToRelative(76.6f, -147.4f)
                curveToRelative(6.1f, -11.8f, 1.5f, -26.3f, -10.2f, -32.4f)
                reflectiveCurveToRelative(-26.2f, -1.5f, -32.4f, 10.2f)
                lineTo(262.1f, 288.3f)
                curveToRelative(-2.0f, -0.2f, -4.0f, -0.3f, -6.1f, -0.3f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _gaugeSimpleHigh!!
    }

private var _gaugeSimpleHigh: ImageVector? = null
