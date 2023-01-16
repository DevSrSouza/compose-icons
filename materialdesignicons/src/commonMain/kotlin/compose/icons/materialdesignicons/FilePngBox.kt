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

public val MaterialDesignIcons.FilePngBox: ImageVector
    get() {
        if (_filePngBox != null) {
            return _filePngBox!!
        }
        _filePngBox = Builder(name = "FilePngBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(9.0f, 11.5f)
                curveTo(9.0f, 12.3f, 8.3f, 13.0f, 7.5f, 13.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.5f)
                curveTo(8.3f, 9.0f, 9.0f, 9.7f, 9.0f, 10.5f)
                verticalLineTo(11.5f)
                moveTo(14.0f, 15.0f)
                horizontalLineTo(12.5f)
                lineTo(11.5f, 12.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.5f)
                lineTo(12.5f, 11.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                moveTo(19.0f, 10.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.7f)
                curveTo(19.0f, 14.4f, 18.5f, 15.0f, 17.7f, 15.0f)
                horizontalLineTo(16.4f)
                curveTo(15.6f, 15.0f, 15.1f, 14.3f, 15.1f, 13.7f)
                verticalLineTo(10.4f)
                curveTo(15.0f, 9.7f, 15.5f, 9.0f, 16.3f, 9.0f)
                horizontalLineTo(17.6f)
                curveTo(18.4f, 9.0f, 18.9f, 9.7f, 18.9f, 10.3f)
                verticalLineTo(10.5f)
                horizontalLineTo(19.0f)
                moveTo(6.5f, 10.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _filePngBox!!
    }

private var _filePngBox: ImageVector? = null
