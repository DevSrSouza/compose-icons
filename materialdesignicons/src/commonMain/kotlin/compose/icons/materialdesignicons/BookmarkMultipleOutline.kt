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

public val MaterialDesignIcons.BookmarkMultipleOutline: ImageVector
    get() {
        if (_bookmarkMultipleOutline != null) {
            return _bookmarkMultipleOutline!!
        }
        _bookmarkMultipleOutline = Builder(name = "BookmarkMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 1.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 3.0f)
                verticalLineTo(19.0f)
                lineTo(19.0f, 18.13f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 1.0f)
                moveTo(15.0f, 20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                lineTo(10.0f, 17.82f)
                lineTo(15.0f, 20.0f)
                moveTo(15.0f, 5.0f)
                curveTo(16.11f, 5.0f, 17.0f, 5.9f, 17.0f, 7.0f)
                verticalLineTo(23.0f)
                lineTo(10.0f, 20.0f)
                lineTo(3.0f, 23.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 5.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _bookmarkMultipleOutline!!
    }

private var _bookmarkMultipleOutline: ImageVector? = null
