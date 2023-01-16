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

public val MaterialDesignIcons.BookmarkCheckOutline: ImageVector
    get() {
        if (_bookmarkCheckOutline != null) {
            return _bookmarkCheckOutline!!
        }
        _bookmarkCheckOutline = Builder(name = "BookmarkCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.47f, 9.65f)
                lineTo(8.06f, 11.07f)
                lineTo(11.0f, 14.0f)
                lineTo(16.19f, 8.82f)
                lineTo(14.78f, 7.4f)
                lineTo(11.0f, 11.18f)
                moveTo(17.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f)
                lineTo(5.0f, 21.0f)
                lineTo(12.0f, 18.0f)
                lineTo(19.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(19.0f, 3.9f, 18.1f, 3.0f, 17.0f, 3.0f)
                moveTo(17.0f, 18.0f)
                lineTo(12.0f, 15.82f)
                lineTo(7.0f, 18.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _bookmarkCheckOutline!!
    }

private var _bookmarkCheckOutline: ImageVector? = null
