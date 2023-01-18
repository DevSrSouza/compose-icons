package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.QuillPenFill: ImageVector
    get() {
        if (_quillPenFill != null) {
            return _quillPenFill!!
        }
        _quillPenFill = Builder(name = "QuillPenFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                curveTo(6.0f, 2.0f, 4.0f, 16.0f, 3.0f, 22.0f)
                horizontalLineToRelative(1.998f)
                curveToRelative(0.666f, -3.333f, 2.333f, -5.166f, 5.002f, -5.5f)
                curveToRelative(4.0f, -0.5f, 7.0f, -4.0f, 8.0f, -7.0f)
                lineToRelative(-1.5f, -1.0f)
                lineToRelative(1.0f, -1.0f)
                curveToRelative(1.0f, -1.0f, 2.004f, -2.5f, 3.5f, -5.5f)
                close()
            }
        }
        .build()
        return _quillPenFill!!
    }

private var _quillPenFill: ImageVector? = null
