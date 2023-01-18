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

public val RemixIcons.MarkPenFill: ImageVector
    get() {
        if (_markPenFill != null) {
            return _markPenFill!!
        }
        _markPenFill = Builder(name = "MarkPenFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.95f, 2.393f)
                lineToRelative(5.657f, 5.657f)
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
                close()
                moveTo(16.657f, 5.929f)
                lineToRelative(-6.364f, 6.364f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(6.364f, -6.364f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(4.282f, 16.889f)
                lineToRelative(2.829f, 2.829f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-4.243f, -1.414f)
                lineToRelative(2.828f, -2.829f)
                close()
            }
        }
        .build()
        return _markPenFill!!
    }

private var _markPenFill: ImageVector? = null
