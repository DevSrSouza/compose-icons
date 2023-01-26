package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.BookmarkRemove: ImageVector
    get() {
        if (_bookmarkRemove != null) {
            return _bookmarkRemove!!
        }
        _bookmarkRemove = Builder(name = "BookmarkRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(19.0f, 10.9f)
                curveToRelative(-0.64f, 0.13f, -1.32f, 0.14f, -2.02f, 0.0f)
                curveToRelative(-1.91f, -0.38f, -3.47f, -1.92f, -3.87f, -3.83f)
                curveTo(12.79f, 5.54f, 13.18f, 4.1f, 14.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                verticalLineToRelative(18.0f)
                lineToRelative(7.0f, -3.0f)
                lineToRelative(7.0f, 3.0f)
                verticalLineTo(10.9f)
                close()
            }
        }
        .build()
        return _bookmarkRemove!!
    }

private var _bookmarkRemove: ImageVector? = null