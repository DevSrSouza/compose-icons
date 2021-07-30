package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 1.5f)
                curveTo(2.8954f, 1.5f, 2.0f, 2.3954f, 2.0f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(2.0f, 4.5567f, 2.0024f, 4.6128f, 2.007f, 4.6683f)
                curveTo(0.8381f, 5.0781f, 0.0f, 6.1912f, 0.0f, 7.5f)
                verticalLineTo(19.5f)
                curveTo(0.0f, 21.1569f, 1.3432f, 22.5f, 3.0f, 22.5f)
                horizontalLineTo(21.0f)
                curveTo(22.6569f, 22.5f, 24.0f, 21.1569f, 24.0f, 19.5f)
                verticalLineTo(7.5f)
                curveTo(24.0f, 5.8432f, 22.6569f, 4.5f, 21.0f, 4.5f)
                horizontalLineTo(11.874f)
                curveTo(11.4299f, 2.7748f, 9.8638f, 1.5f, 8.0f, 1.5f)
                horizontalLineTo(4.0f)
                close()
                moveTo(9.7324f, 4.5f)
                curveTo(9.3866f, 3.9022f, 8.7403f, 3.5f, 8.0f, 3.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(9.7324f)
                close()
                moveTo(3.0f, 6.5f)
                curveTo(2.4477f, 6.5f, 2.0f, 6.9477f, 2.0f, 7.5f)
                verticalLineTo(19.5f)
                curveTo(2.0f, 20.0523f, 2.4477f, 20.5f, 3.0f, 20.5f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 20.5f, 22.0f, 20.0523f, 22.0f, 19.5f)
                verticalLineTo(7.5f)
                curveTo(22.0f, 6.9477f, 21.5523f, 6.5f, 21.0f, 6.5f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
