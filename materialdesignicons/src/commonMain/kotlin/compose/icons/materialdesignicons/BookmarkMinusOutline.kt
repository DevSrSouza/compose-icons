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

public val MaterialDesignIcons.BookmarkMinusOutline: ImageVector
    get() {
        if (_bookmarkMinusOutline != null) {
            return _bookmarkMinusOutline!!
        }
        _bookmarkMinusOutline = Builder(name = "BookmarkMinusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                moveTo(19.0f, 5.0f)
                verticalLineTo(21.0f)
                lineTo(12.0f, 18.0f)
                lineTo(5.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 3.89f, 5.9f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 3.0f, 19.0f, 3.9f, 19.0f, 5.0f)
                moveTo(17.0f, 5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                lineTo(12.0f, 15.82f)
                lineTo(17.0f, 18.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _bookmarkMinusOutline!!
    }

private var _bookmarkMinusOutline: ImageVector? = null
