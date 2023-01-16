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

public val MaterialDesignIcons.BookmarkMusic: ImageVector
    get() {
        if (_bookmarkMusic != null) {
            return _bookmarkMusic!!
        }
        _bookmarkMusic = Builder(name = "BookmarkMusic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 5.0f)
                verticalLineTo(21.0f)
                lineTo(12.0f, 18.0f)
                lineTo(5.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 3.89f, 5.9f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                moveTo(11.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.27f)
                curveTo(11.71f, 11.1f, 11.36f, 11.0f, 11.0f, 11.0f)
                close()
            }
        }
        .build()
        return _bookmarkMusic!!
    }

private var _bookmarkMusic: ImageVector? = null
