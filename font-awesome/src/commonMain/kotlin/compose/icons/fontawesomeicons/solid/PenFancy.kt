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

public val SolidGroup.PenFancy: ImageVector
    get() {
        if (_penFancy != null) {
            return _penFancy!!
        }
        _penFancy = Builder(name = "PenFancy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(373.5f, 27.1f)
                curveTo(388.5f, 9.9f, 410.2f, 0.0f, 433.0f, 0.0f)
                curveToRelative(43.6f, 0.0f, 79.0f, 35.4f, 79.0f, 79.0f)
                curveToRelative(0.0f, 22.8f, -9.9f, 44.6f, -27.1f, 59.6f)
                lineTo(277.7f, 319.0f)
                lineToRelative(-10.3f, -10.3f)
                lineToRelative(-64.0f, -64.0f)
                lineTo(193.0f, 234.3f)
                lineTo(373.5f, 27.1f)
                close()
                moveTo(170.3f, 256.9f)
                lineToRelative(10.4f, 10.4f)
                lineToRelative(64.0f, 64.0f)
                lineToRelative(10.4f, 10.4f)
                lineToRelative(-19.2f, 83.4f)
                curveToRelative(-3.9f, 17.1f, -16.9f, 30.7f, -33.8f, 35.4f)
                lineTo(24.4f, 510.3f)
                lineToRelative(95.4f, -95.4f)
                curveToRelative(2.6f, 0.7f, 5.4f, 1.1f, 8.3f, 1.1f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                curveToRelative(0.0f, 2.9f, 0.4f, 5.6f, 1.1f, 8.3f)
                lineTo(1.7f, 487.6f)
                lineTo(51.5f, 310.0f)
                curveToRelative(4.7f, -16.9f, 18.3f, -29.9f, 35.4f, -33.8f)
                lineToRelative(83.4f, -19.2f)
                close()
            }
        }
        .build()
        return _penFancy!!
    }

private var _penFancy: ImageVector? = null
