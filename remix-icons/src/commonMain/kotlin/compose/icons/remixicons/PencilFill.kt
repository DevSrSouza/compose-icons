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

public val RemixIcons.PencilFill: ImageVector
    get() {
        if (_pencilFill != null) {
            return _pencilFill!!
        }
        _pencilFill = Builder(name = "PencilFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9f, 6.858f)
                lineToRelative(4.242f, 4.243f)
                lineTo(7.242f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-4.243f)
                lineToRelative(9.9f, -9.9f)
                close()
                moveTo(14.314f, 5.444f)
                lineToRelative(2.121f, -2.122f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(2.829f, 2.829f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-2.122f, 2.121f)
                lineToRelative(-4.242f, -4.242f)
                close()
            }
        }
        .build()
        return _pencilFill!!
    }

private var _pencilFill: ImageVector? = null
