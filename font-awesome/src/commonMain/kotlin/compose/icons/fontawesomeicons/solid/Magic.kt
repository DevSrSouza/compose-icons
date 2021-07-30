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

public val SolidGroup.Magic: ImageVector
    get() {
        if (_magic != null) {
            return _magic!!
        }
        _magic = Builder(name = "Magic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                lineToRelative(16.0f, -32.0f)
                lineToRelative(32.0f, -16.0f)
                lineToRelative(-32.0f, -16.0f)
                lineToRelative(-16.0f, -32.0f)
                lineToRelative(-16.0f, 32.0f)
                lineToRelative(-32.0f, 16.0f)
                lineToRelative(32.0f, 16.0f)
                lineToRelative(16.0f, 32.0f)
                close()
                moveTo(80.0f, 160.0f)
                lineToRelative(26.66f, -53.33f)
                lineTo(160.0f, 80.0f)
                lineToRelative(-53.34f, -26.67f)
                lineTo(80.0f, 0.0f)
                lineTo(53.34f, 53.33f)
                lineTo(0.0f, 80.0f)
                lineToRelative(53.34f, 26.67f)
                lineTo(80.0f, 160.0f)
                close()
                moveTo(432.0f, 288.0f)
                lineToRelative(-26.66f, 53.33f)
                lineTo(352.0f, 368.0f)
                lineToRelative(53.34f, 26.67f)
                lineTo(432.0f, 448.0f)
                lineToRelative(26.66f, -53.33f)
                lineTo(512.0f, 368.0f)
                lineToRelative(-53.34f, -26.67f)
                lineTo(432.0f, 288.0f)
                close()
                moveTo(502.62f, 94.23f)
                lineTo(417.77f, 9.38f)
                curveTo(411.53f, 3.12f, 403.34f, 0.0f, 395.15f, 0.0f)
                curveToRelative(-8.19f, 0.0f, -16.38f, 3.12f, -22.63f, 9.38f)
                lineTo(9.38f, 372.52f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.76f, 0.0f, 45.25f)
                lineToRelative(84.85f, 84.85f)
                curveToRelative(6.25f, 6.25f, 14.44f, 9.37f, 22.62f, 9.37f)
                curveToRelative(8.19f, 0.0f, 16.38f, -3.12f, 22.63f, -9.37f)
                lineToRelative(363.14f, -363.15f)
                curveToRelative(12.5f, -12.48f, 12.5f, -32.75f, 0.0f, -45.24f)
                close()
                moveTo(359.45f, 203.46f)
                lineToRelative(-50.91f, -50.91f)
                lineToRelative(86.6f, -86.6f)
                lineToRelative(50.91f, 50.91f)
                lineToRelative(-86.6f, 86.6f)
                close()
            }
        }
        .build()
        return _magic!!
    }

private var _magic: ImageVector? = null
