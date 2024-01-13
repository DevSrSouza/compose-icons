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

public val SolidGroup.PowerOff: ImageVector
    get() {
        if (_powerOff != null) {
            return _powerOff!!
        }
        _powerOff = Builder(name = "PowerOff", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineTo(256.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(32.0f)
                close()
                moveTo(143.5f, 120.6f)
                curveToRelative(13.6f, -11.3f, 15.4f, -31.5f, 4.1f, -45.1f)
                reflectiveCurveToRelative(-31.5f, -15.4f, -45.1f, -4.1f)
                curveTo(49.7f, 115.4f, 16.0f, 181.8f, 16.0f, 256.0f)
                curveToRelative(0.0f, 132.5f, 107.5f, 240.0f, 240.0f, 240.0f)
                reflectiveCurveToRelative(240.0f, -107.5f, 240.0f, -240.0f)
                curveToRelative(0.0f, -74.2f, -33.8f, -140.6f, -86.6f, -184.6f)
                curveToRelative(-13.6f, -11.3f, -33.8f, -9.4f, -45.1f, 4.1f)
                reflectiveCurveToRelative(-9.4f, 33.8f, 4.1f, 45.1f)
                curveToRelative(38.9f, 32.3f, 63.5f, 81.0f, 63.5f, 135.4f)
                curveToRelative(0.0f, 97.2f, -78.8f, 176.0f, -176.0f, 176.0f)
                reflectiveCurveToRelative(-176.0f, -78.8f, -176.0f, -176.0f)
                curveToRelative(0.0f, -54.4f, 24.7f, -103.1f, 63.5f, -135.4f)
                close()
            }
        }
        .build()
        return _powerOff!!
    }

private var _powerOff: ImageVector? = null
