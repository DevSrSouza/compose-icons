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

public val RemixIcons.MarkPenLine: ImageVector
    get() {
        if (_markPenLine != null) {
            return _markPenLine!!
        }
        _markPenLine = Builder(name = "MarkPenLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.243f, 4.515f)
                lineToRelative(-6.738f, 6.737f)
                lineToRelative(-0.707f, 2.121f)
                lineToRelative(-1.04f, 1.041f)
                lineToRelative(2.828f, 2.829f)
                lineToRelative(1.04f, -1.041f)
                lineToRelative(2.122f, -0.707f)
                lineToRelative(6.737f, -6.738f)
                lineToRelative(-4.242f, -4.242f)
                close()
                moveTo(21.607f, 8.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-7.779f, 7.779f)
                lineToRelative(-2.12f, 0.707f)
                lineToRelative(-1.415f, 1.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-4.243f, -4.243f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(0.707f, -2.121f)
                lineToRelative(7.779f, -7.779f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(5.657f, 5.657f)
                close()
                moveTo(15.243f, 7.343f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(4.95f, -4.95f)
                close()
                moveTo(4.283f, 16.89f)
                lineToRelative(2.828f, 2.829f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-4.243f, -1.414f)
                lineToRelative(2.828f, -2.829f)
                close()
            }
        }
        .build()
        return _markPenLine!!
    }

private var _markPenLine: ImageVector? = null
