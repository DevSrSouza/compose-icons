package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BookmarkFilled: ImageVector
    get() {
        if (_bookmarkFilled != null) {
            return _bookmarkFilled!!
        }
        _bookmarkFilled = Builder(name = "BookmarkFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.555f, 0.832f)
                lineToRelative(-5.445f, -3.63f)
                lineToRelative(-5.444f, 3.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.55f, -0.72f)
                lineToRelative(-0.006f, -0.112f)
                verticalLineToRelative(-14.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _bookmarkFilled!!
    }

private var _bookmarkFilled: ImageVector? = null
