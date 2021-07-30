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

public val SolidGroup.Times: ImageVector
    get() {
        if (_times != null) {
            return _times!!
        }
        _times = Builder(name = "Times", defaultWidth = 352.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 352.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.72f, 256.0f)
                lineToRelative(100.07f, -100.07f)
                curveToRelative(12.28f, -12.28f, 12.28f, -32.19f, 0.0f, -44.48f)
                lineToRelative(-22.24f, -22.24f)
                curveToRelative(-12.28f, -12.28f, -32.19f, -12.28f, -44.48f, 0.0f)
                lineTo(176.0f, 189.28f)
                lineTo(75.93f, 89.21f)
                curveToRelative(-12.28f, -12.28f, -32.19f, -12.28f, -44.48f, 0.0f)
                lineTo(9.21f, 111.45f)
                curveToRelative(-12.28f, 12.28f, -12.28f, 32.19f, 0.0f, 44.48f)
                lineTo(109.28f, 256.0f)
                lineTo(9.21f, 356.07f)
                curveToRelative(-12.28f, 12.28f, -12.28f, 32.19f, 0.0f, 44.48f)
                lineToRelative(22.24f, 22.24f)
                curveToRelative(12.28f, 12.28f, 32.2f, 12.28f, 44.48f, 0.0f)
                lineTo(176.0f, 322.72f)
                lineToRelative(100.07f, 100.07f)
                curveToRelative(12.28f, 12.28f, 32.2f, 12.28f, 44.48f, 0.0f)
                lineToRelative(22.24f, -22.24f)
                curveToRelative(12.28f, -12.28f, 12.28f, -32.19f, 0.0f, -44.48f)
                lineTo(242.72f, 256.0f)
                close()
            }
        }
        .build()
        return _times!!
    }

private var _times: ImageVector? = null
