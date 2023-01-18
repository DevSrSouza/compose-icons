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

public val RemixIcons.CodeSLine: ImageVector
    get() {
        if (_codeSLine != null) {
            return _codeSLine!!
        }
        _codeSLine = Builder(name = "CodeSLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                lineToRelative(-5.657f, 5.657f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(21.172f, 12.0f)
                lineToRelative(-4.243f, -4.243f)
                lineToRelative(1.414f, -1.414f)
                lineTo(24.0f, 12.0f)
                close()
                moveTo(2.828f, 12.0f)
                lineToRelative(4.243f, 4.243f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.0f, 12.0f)
                lineToRelative(5.657f, -5.657f)
                lineTo(7.07f, 7.757f)
                lineTo(2.828f, 12.0f)
                close()
            }
        }
        .build()
        return _codeSLine!!
    }

private var _codeSLine: ImageVector? = null
