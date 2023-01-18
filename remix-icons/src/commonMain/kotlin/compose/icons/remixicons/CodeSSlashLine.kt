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

public val RemixIcons.CodeSSlashLine: ImageVector
    get() {
        if (_codeSSlashLine != null) {
            return _codeSSlashLine!!
        }
        _codeSSlashLine = Builder(name = "CodeSSlashLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(9.788f, 21.0f)
                lineTo(7.66f, 21.0f)
                lineToRelative(6.552f, -18.0f)
                horizontalLineToRelative(2.128f)
                lineTo(9.788f, 21.0f)
                close()
            }
        }
        .build()
        return _codeSSlashLine!!
    }

private var _codeSSlashLine: ImageVector? = null
