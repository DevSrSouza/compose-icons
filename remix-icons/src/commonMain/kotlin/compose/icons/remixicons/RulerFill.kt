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

public val RemixIcons.RulerFill: ImageVector
    get() {
        if (_rulerFill != null) {
            return _rulerFill!!
        }
        _rulerFill = Builder(name = "RulerFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 13.207f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.12f, -2.121f)
                lineToRelative(2.12f, -2.121f)
                lineToRelative(2.829f, 2.828f)
                lineToRelative(1.414f, -1.414f)
                lineTo(9.88f, 8.257f)
                lineTo(12.0f, 6.136f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(-2.122f, -2.121f)
                lineToRelative(2.829f, -2.829f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(4.95f, 4.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-14.85f, 14.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-4.95f, -4.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineToRelative(3.536f, -3.536f)
                close()
            }
        }
        .build()
        return _rulerFill!!
    }

private var _rulerFill: ImageVector? = null
