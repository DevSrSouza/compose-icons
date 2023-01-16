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

public val MaterialDesignIcons.FileKey: ImageVector
    get() {
        if (_fileKey != null) {
            return _fileKey!!
        }
        _fileKey = Builder(name = "FileKey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 16.6f, 10.6f, 17.0f, 10.0f, 17.0f)
                reflectiveCurveTo(9.0f, 16.6f, 9.0f, 16.0f)
                curveTo(9.0f, 15.4f, 9.4f, 15.0f, 10.0f, 15.0f)
                reflectiveCurveTo(11.0f, 15.4f, 11.0f, 16.0f)
                moveTo(20.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 21.1f, 19.1f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.9f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(14.0f)
                moveTo(18.0f, 15.0f)
                horizontalLineTo(12.8f)
                curveTo(12.2f, 13.4f, 10.5f, 12.6f, 9.0f, 13.2f)
                curveTo(7.4f, 13.8f, 6.6f, 15.5f, 7.2f, 17.0f)
                reflectiveCurveTo(9.5f, 19.4f, 11.0f, 18.8f)
                curveTo(11.9f, 18.5f, 12.5f, 17.8f, 12.8f, 17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                moveTo(18.5f, 9.0f)
                lineTo(13.0f, 3.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _fileKey!!
    }

private var _fileKey: ImageVector? = null
