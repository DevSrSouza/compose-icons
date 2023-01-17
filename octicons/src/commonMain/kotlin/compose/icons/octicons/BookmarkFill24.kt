package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.BookmarkFill24: ImageVector
    get() {
        if (_bookmarkFill24 != null) {
            return _bookmarkFill24!!
        }
        _bookmarkFill24 = Builder(name = "BookmarkFill24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.69f, 2.0f)
                horizontalLineToRelative(10.56f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.218f, 0.585f)
                lineTo(12.0f, 17.21f)
                lineToRelative(-5.781f, 4.626f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.0f, 21.253f)
                lineTo(4.94f, 3.756f)
                arcTo(1.748f, 1.748f, 0.0f, false, true, 6.69f, 2.0f)
                close()
            }
        }
        .build()
        return _bookmarkFill24!!
    }

private var _bookmarkFill24: ImageVector? = null
