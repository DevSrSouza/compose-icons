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

public val MaterialDesignIcons.BookmarkRemoveOutline: ImageVector
    get() {
        if (_bookmarkRemoveOutline != null) {
            return _bookmarkRemoveOutline!!
        }
        _bookmarkRemoveOutline = Builder(name = "BookmarkRemoveOutline", defaultWidth = 24.0.dp,
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
                moveTo(9.88f, 7.47f)
                lineTo(8.47f, 8.88f)
                lineTo(10.59f, 11.0f)
                lineTo(8.47f, 13.12f)
                lineTo(9.88f, 14.54f)
                lineTo(12.0f, 12.42f)
                lineTo(14.12f, 14.53f)
                lineTo(15.54f, 13.12f)
                lineTo(13.42f, 11.0f)
                lineTo(15.53f, 8.88f)
                lineTo(14.12f, 7.47f)
                lineTo(12.0f, 9.59f)
                lineTo(9.88f, 7.47f)
                close()
            }
        }
        .build()
        return _bookmarkRemoveOutline!!
    }

private var _bookmarkRemoveOutline: ImageVector? = null
