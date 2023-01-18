package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BookmarksSharp: ImageVector
    get() {
        if (_bookmarksSharp != null) {
            return _bookmarksSharp!!
        }
        _bookmarksSharp = Builder(name = "BookmarksSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(304.0f, 0.0f)
                lineToRelative(0.0f, 368.0f)
                lineToRelative(48.0f, 32.0f)
                lineToRelative(0.0f, -448.0f)
                lineToRelative(-352.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 80.0f)
                lineToRelative(0.0f, 432.0f)
                lineToRelative(168.0f, -124.0f)
                lineToRelative(168.0f, 124.0f)
                lineToRelative(0.0f, -432.0f)
                lineToRelative(-336.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bookmarksSharp!!
    }

private var _bookmarksSharp: ImageVector? = null
