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

public val RemixIcons.ArrowDropLeftLine: ImageVector
    get() {
        if (_arrowDropLeftLine != null) {
            return _arrowDropLeftLine!!
        }
        _arrowDropLeftLine = Builder(name = "ArrowDropLeftLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.828f, 12.0f)
                lineToRelative(2.829f, 2.828f)
                lineToRelative(-1.414f, 1.415f)
                lineTo(9.0f, 12.0f)
                lineToRelative(4.243f, -4.243f)
                lineToRelative(1.414f, 1.415f)
                lineTo(11.828f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowDropLeftLine!!
    }

private var _arrowDropLeftLine: ImageVector? = null
