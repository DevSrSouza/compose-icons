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

public val MaterialDesignIcons.BookmarkOutline: ImageVector
    get() {
        if (_bookmarkOutline != null) {
            return _bookmarkOutline!!
        }
        _bookmarkOutline = Builder(name = "BookmarkOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                lineTo(12.0f, 15.82f)
                lineTo(7.0f, 18.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                moveTo(17.0f, 3.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 5.0f)
                verticalLineTo(21.0f)
                lineTo(12.0f, 18.0f)
                lineTo(19.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(19.0f, 3.89f, 18.1f, 3.0f, 17.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bookmarkOutline!!
    }

private var _bookmarkOutline: ImageVector? = null
