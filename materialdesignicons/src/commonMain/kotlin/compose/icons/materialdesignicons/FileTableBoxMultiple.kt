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

public val MaterialDesignIcons.FileTableBoxMultiple: ImageVector
    get() {
        if (_fileTableBoxMultiple != null) {
            return _fileTableBoxMultiple!!
        }
        _fileTableBoxMultiple = Builder(name = "FileTableBoxMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 23.0f, 1.0f, 22.1f, 1.0f, 21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                moveTo(21.0f, 1.0f)
                horizontalLineTo(7.0f)
                curveTo(5.89f, 1.0f, 5.0f, 1.89f, 5.0f, 3.0f)
                verticalLineTo(17.0f)
                curveTo(5.0f, 18.11f, 5.9f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(21.0f)
                curveTo(22.11f, 19.0f, 23.0f, 18.11f, 23.0f, 17.0f)
                verticalLineTo(3.0f)
                curveTo(23.0f, 1.89f, 22.1f, 1.0f, 21.0f, 1.0f)
                moveTo(11.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                moveTo(11.0f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                moveTo(11.0f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                moveTo(15.0f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                moveTo(15.0f, 13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                moveTo(15.0f, 10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _fileTableBoxMultiple!!
    }

private var _fileTableBoxMultiple: ImageVector? = null
