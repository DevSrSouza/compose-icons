package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.BookmarkMusicOutline: ImageVector
    get() {
        if (_bookmarkMusicOutline != null) {
            return _bookmarkMusicOutline!!
        }
        _bookmarkMusicOutline = Builder(name = "BookmarkMusicOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f)
                verticalLineTo(21.0f)
                lineTo(12.0f, 18.0f)
                lineTo(19.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(19.0f, 3.89f, 18.1f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                lineTo(12.0f, 15.82f)
                lineTo(7.0f, 18.0f)
                verticalLineTo(5.0f)
                moveTo(12.0f, 6.0f)
                verticalLineTo(11.3f)
                curveTo(11.7f, 11.1f, 11.4f, 11.0f, 11.0f, 11.0f)
                curveTo(9.9f, 11.0f, 9.0f, 11.9f, 9.0f, 13.0f)
                curveTo(9.0f, 14.11f, 9.9f, 15.0f, 11.0f, 15.0f)
                curveTo(12.11f, 15.0f, 13.0f, 14.11f, 13.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _bookmarkMusicOutline!!
    }

private var _bookmarkMusicOutline: ImageVector? = null
