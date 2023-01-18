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

public val RemixIcons.Edit2Fill: ImageVector
    get() {
        if (_edit2Fill != null) {
            return _edit2Fill!!
        }
        _edit2Fill = Builder(name = "Edit2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.243f, 19.0f)
                lineTo(21.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-4.243f)
                lineToRelative(9.9f, -9.9f)
                lineToRelative(4.242f, 4.244f)
                lineTo(9.242f, 19.0f)
                close()
                moveTo(14.313f, 5.444f)
                lineToRelative(2.122f, -2.122f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(2.829f, 2.829f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-2.122f, 2.121f)
                lineToRelative(-4.242f, -4.242f)
                close()
            }
        }
        .build()
        return _edit2Fill!!
    }

private var _edit2Fill: ImageVector? = null
