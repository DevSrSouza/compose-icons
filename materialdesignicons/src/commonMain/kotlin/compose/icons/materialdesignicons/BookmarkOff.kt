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

public val MaterialDesignIcons.BookmarkOff: ImageVector
    get() {
        if (_bookmarkOff != null) {
            return _bookmarkOff!!
        }
        _bookmarkOff = Builder(name = "BookmarkOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(16.78f, 20.05f)
                lineTo(12.0f, 18.0f)
                lineTo(5.0f, 21.0f)
                verticalLineTo(8.27f)
                lineTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                moveTo(19.0f, 17.16f)
                verticalLineTo(5.0f)
                curveTo(19.0f, 3.89f, 18.1f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(6.41f, 3.0f, 5.89f, 3.27f, 5.5f, 3.68f)
                lineTo(19.0f, 17.16f)
                close()
            }
        }
        .build()
        return _bookmarkOff!!
    }

private var _bookmarkOff: ImageVector? = null
