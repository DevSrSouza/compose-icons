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

public val SolidGroup.FeatherPointed: ImageVector
    get() {
        if (_featherPointed != null) {
            return _featherPointed!!
        }
        _featherPointed = Builder(name = "FeatherPointed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(278.5f, 215.6f)
                lineTo(23.0f, 471.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(74.8f, -74.8f)
                curveToRelative(7.4f, 4.6f, 15.3f, 8.2f, 23.8f, 10.5f)
                curveTo(200.3f, 452.8f, 270.0f, 454.5f, 338.0f, 409.4f)
                curveToRelative(12.2f, -8.1f, 5.8f, -25.4f, -8.8f, -25.4f)
                lineToRelative(-16.1f, 0.0f)
                curveToRelative(-5.1f, 0.0f, -9.2f, -4.1f, -9.2f, -9.2f)
                curveToRelative(0.0f, -4.1f, 2.7f, -7.6f, 6.5f, -8.8f)
                lineToRelative(97.7f, -29.3f)
                curveToRelative(3.4f, -1.0f, 6.4f, -3.1f, 8.4f, -6.1f)
                curveToRelative(4.4f, -6.4f, 8.6f, -12.9f, 12.6f, -19.6f)
                curveToRelative(6.2f, -10.3f, -1.5f, -23.0f, -13.5f, -23.0f)
                lineToRelative(-38.6f, 0.0f)
                curveToRelative(-5.1f, 0.0f, -9.2f, -4.1f, -9.2f, -9.2f)
                curveToRelative(0.0f, -4.1f, 2.7f, -7.6f, 6.5f, -8.8f)
                lineToRelative(80.9f, -24.3f)
                curveToRelative(4.6f, -1.4f, 8.4f, -4.8f, 10.2f, -9.3f)
                curveTo(494.5f, 163.0f, 507.8f, 86.1f, 511.9f, 36.8f)
                curveToRelative(0.8f, -9.9f, -3.0f, -19.6f, -10.0f, -26.6f)
                reflectiveCurveToRelative(-16.7f, -10.8f, -26.6f, -10.0f)
                curveTo(391.5f, 7.0f, 228.5f, 40.5f, 137.4f, 131.6f)
                curveTo(57.3f, 211.7f, 56.7f, 302.3f, 71.3f, 356.4f)
                curveToRelative(2.1f, 7.9f, 12.0f, 9.6f, 17.8f, 3.8f)
                lineTo(253.6f, 195.8f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                curveToRelative(5.4f, 5.4f, 6.1f, 13.6f, 2.2f, 19.8f)
                close()
            }
        }
        .build()
        return _featherPointed!!
    }

private var _featherPointed: ImageVector? = null
