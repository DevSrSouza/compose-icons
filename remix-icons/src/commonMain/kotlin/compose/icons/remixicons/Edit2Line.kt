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

public val RemixIcons.Edit2Line: ImageVector
    get() {
        if (_edit2Line != null) {
            return _edit2Line!!
        }
        _edit2Line = Builder(name = "Edit2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(1.414f)
                lineToRelative(9.314f, -9.314f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(5.0f, 17.586f)
                lineTo(5.0f, 19.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-4.243f)
                lineTo(16.435f, 3.322f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(2.829f, 2.829f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineTo(9.243f, 19.0f)
                lineTo(21.0f, 19.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.728f, 6.858f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _edit2Line!!
    }

private var _edit2Line: ImageVector? = null
