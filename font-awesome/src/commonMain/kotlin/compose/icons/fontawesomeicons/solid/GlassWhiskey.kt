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

public val SolidGroup.GlassWhiskey: ImageVector
    get() {
        if (_glassWhiskey != null) {
            return _glassWhiskey!!
        }
        _glassWhiskey = Builder(name = "GlassWhiskey", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 32.0f)
                lineTo(32.0f, 32.0f)
                curveTo(12.5f, 32.0f, -2.4f, 49.2f, 0.3f, 68.5f)
                lineToRelative(56.0f, 356.5f)
                curveToRelative(4.5f, 31.5f, 31.5f, 54.9f, 63.4f, 54.9f)
                horizontalLineToRelative(273.0f)
                curveToRelative(31.8f, 0.0f, 58.9f, -23.4f, 63.4f, -54.9f)
                lineToRelative(55.6f, -356.5f)
                curveTo(514.4f, 49.2f, 499.5f, 32.0f, 480.0f, 32.0f)
                close()
                moveTo(442.6f, 96.0f)
                lineToRelative(-30.0f, 192.0f)
                horizontalLineToRelative(-313.0f)
                lineTo(69.4f, 96.0f)
                horizontalLineToRelative(373.2f)
                close()
            }
        }
        .build()
        return _glassWhiskey!!
    }

private var _glassWhiskey: ImageVector? = null
