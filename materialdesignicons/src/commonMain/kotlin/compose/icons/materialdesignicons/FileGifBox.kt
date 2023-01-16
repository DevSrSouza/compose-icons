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

public val MaterialDesignIcons.FileGifBox: ImageVector
    get() {
        if (_fileGifBox != null) {
            return _fileGifBox!!
        }
        _fileGifBox = Builder(name = "FileGifBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(10.0f, 10.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.7f)
                curveTo(10.0f, 14.4f, 9.5f, 15.0f, 8.7f, 15.0f)
                horizontalLineTo(7.3f)
                curveTo(6.5f, 15.0f, 6.0f, 14.3f, 6.0f, 13.7f)
                verticalLineTo(10.4f)
                curveTo(6.0f, 9.7f, 6.5f, 9.0f, 7.3f, 9.0f)
                horizontalLineTo(8.6f)
                curveTo(9.5f, 9.0f, 10.0f, 9.7f, 10.0f, 10.3f)
                verticalLineTo(10.5f)
                moveTo(13.0f, 15.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                moveTo(17.5f, 10.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _fileGifBox!!
    }

private var _fileGifBox: ImageVector? = null
