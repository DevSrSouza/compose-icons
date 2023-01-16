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

public val MaterialDesignIcons.FileLink: ImageVector
    get() {
        if (_fileLink != null) {
            return _fileLink!!
        }
        _fileLink = Builder(name = "FileLink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 22.0f, 20.0f, 21.11f, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(11.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(8.39f, 20.0f, 6.0f, 18.94f, 6.0f, 16.0f)
                curveTo(6.0f, 13.07f, 8.39f, 12.0f, 10.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                curveTo(9.54f, 14.0f, 8.0f, 14.17f, 8.0f, 16.0f)
                curveTo(8.0f, 17.9f, 9.67f, 18.0f, 10.0f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                moveTo(15.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                moveTo(14.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                curveTo(14.46f, 18.0f, 16.0f, 17.83f, 16.0f, 16.0f)
                curveTo(16.0f, 14.1f, 14.33f, 14.0f, 14.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                curveTo(15.61f, 12.0f, 18.0f, 13.07f, 18.0f, 16.0f)
                curveTo(18.0f, 18.94f, 15.61f, 20.0f, 14.0f, 20.0f)
                moveTo(13.0f, 9.0f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _fileLink!!
    }

private var _fileLink: ImageVector? = null
