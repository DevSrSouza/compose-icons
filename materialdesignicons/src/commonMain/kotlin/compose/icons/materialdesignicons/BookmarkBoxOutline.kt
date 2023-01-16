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

public val MaterialDesignIcons.BookmarkBoxOutline: ImageVector
    get() {
        if (_bookmarkBoxOutline != null) {
            return _bookmarkBoxOutline!!
        }
        _bookmarkBoxOutline = Builder(name = "BookmarkBoxOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.89f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 19.53f, 20.79f, 20.04f, 20.41f, 20.41f)
                curveTo(20.04f, 20.79f, 19.53f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.47f, 21.0f, 3.96f, 20.79f, 3.59f, 20.41f)
                curveTo(3.21f, 20.04f, 3.0f, 19.53f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                moveTo(19.0f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                moveTo(17.0f, 7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                lineTo(14.5f, 13.5f)
                lineTo(17.0f, 15.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _bookmarkBoxOutline!!
    }

private var _bookmarkBoxOutline: ImageVector? = null
