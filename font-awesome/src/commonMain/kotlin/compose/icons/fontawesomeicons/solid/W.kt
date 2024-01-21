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

public val SolidGroup.W: ImageVector
    get() {
        if (_w != null) {
            return _w!!
        }
        _w = Builder(name = "W", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 34.0f)
                curveToRelative(16.5f, -6.2f, 35.0f, 2.2f, 41.2f, 18.7f)
                lineToRelative(110.2f, 294.0f)
                lineTo(257.3f, 55.0f)
                curveToRelative(4.0f, -13.7f, 16.5f, -23.0f, 30.7f, -23.0f)
                reflectiveCurveToRelative(26.7f, 9.4f, 30.7f, 23.0f)
                lineToRelative(85.1f, 291.7f)
                lineTo(514.0f, 52.8f)
                curveToRelative(6.2f, -16.5f, 24.6f, -24.9f, 41.2f, -18.7f)
                reflectiveCurveToRelative(24.9f, 24.7f, 18.7f, 41.2f)
                lineToRelative(-144.0f, 384.0f)
                curveToRelative(-4.8f, 12.9f, -17.4f, 21.3f, -31.2f, 20.7f)
                reflectiveCurveToRelative(-25.7f, -9.8f, -29.5f, -23.0f)
                lineTo(288.0f, 178.3f)
                lineTo(206.7f, 457.0f)
                curveToRelative(-3.9f, 13.2f, -15.8f, 22.5f, -29.5f, 23.0f)
                reflectiveCurveToRelative(-26.3f, -7.8f, -31.2f, -20.7f)
                lineTo(2.0f, 75.2f)
                curveTo(-4.2f, 58.7f, 4.2f, 40.2f, 20.8f, 34.0f)
                close()
            }
        }
        .build()
        return _w!!
    }

private var _w: ImageVector? = null
