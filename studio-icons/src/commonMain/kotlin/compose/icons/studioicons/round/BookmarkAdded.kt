package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.BookmarkAdded: ImageVector
    get() {
        if (_bookmarkAdded != null) {
            return _bookmarkAdded!!
        }
        _bookmarkAdded = Builder(name = "BookmarkAdded", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                lineToRelative(7.0f, 0.0f)
                curveToRelative(-0.63f, 0.84f, -1.0f, 1.87f, -1.0f, 3.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                curveToRelative(0.34f, 0.0f, 0.68f, -0.03f, 1.0f, -0.1f)
                verticalLineToRelative(8.58f)
                curveToRelative(0.0f, 0.72f, -0.73f, 1.2f, -1.39f, 0.92f)
                lineTo(12.0f, 18.0f)
                lineToRelative(-5.61f, 2.4f)
                curveTo(5.73f, 20.69f, 5.0f, 20.2f, 5.0f, 19.48f)
                verticalLineTo(5.0f)
                close()
                moveTo(22.07f, 3.34f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-3.54f, 3.54f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.83f, -2.83f)
                curveTo(21.05f, 2.95f, 21.68f, 2.95f, 22.07f, 3.34f)
                close()
            }
        }
        .build()
        return _bookmarkAdded!!
    }

private var _bookmarkAdded: ImageVector? = null
