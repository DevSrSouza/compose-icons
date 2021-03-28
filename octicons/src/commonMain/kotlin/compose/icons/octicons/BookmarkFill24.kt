package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
                moveTo(6.69f, 2.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, 1.756f)
                lineTo(5.0f, 21.253f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.219f, 0.583f)
                lineTo(12.0f, 17.21f)
                lineToRelative(5.782f, 4.625f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 19.0f, 21.25f)
                verticalLineTo(3.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 17.25f, 2.0f)
                horizontalLineTo(6.69f)
                close()
            }
        }
        .build()
        return _bookmarkFill24!!
    }

private var _bookmarkFill24: ImageVector? = null
