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

public val MaterialDesignIcons.FileSync: ImageVector
    get() {
        if (_fileSync != null) {
            return _fileSync!!
        }
        _fileSync = Builder(name = "FileSync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.5f)
                curveTo(11.0f, 13.9f, 13.9f, 11.0f, 17.5f, 11.0f)
                curveTo(18.4f, 11.0f, 19.2f, 11.2f, 20.0f, 11.5f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(12.8f)
                curveTo(11.7f, 20.8f, 11.0f, 19.2f, 11.0f, 17.5f)
                moveTo(13.0f, 3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                moveTo(17.0f, 12.0f)
                verticalLineTo(13.5f)
                curveTo(19.2f, 13.5f, 21.0f, 15.3f, 21.0f, 17.5f)
                curveTo(21.0f, 18.3f, 20.8f, 19.1f, 20.3f, 19.7f)
                lineTo(19.2f, 18.6f)
                curveTo(19.4f, 18.3f, 19.5f, 17.9f, 19.5f, 17.5f)
                curveTo(19.5f, 16.1f, 18.4f, 15.0f, 17.0f, 15.0f)
                verticalLineTo(16.5f)
                lineTo(14.8f, 14.3f)
                lineTo(17.0f, 12.0f)
                moveTo(17.0f, 23.0f)
                verticalLineTo(21.5f)
                curveTo(14.8f, 21.5f, 13.0f, 19.7f, 13.0f, 17.5f)
                curveTo(13.0f, 16.7f, 13.2f, 15.9f, 13.7f, 15.3f)
                lineTo(14.8f, 16.4f)
                curveTo(14.6f, 16.7f, 14.5f, 17.1f, 14.5f, 17.5f)
                curveTo(14.5f, 18.9f, 15.6f, 20.0f, 17.0f, 20.0f)
                verticalLineTo(18.5f)
                lineTo(19.2f, 20.7f)
                lineTo(17.0f, 23.0f)
                close()
            }
        }
        .build()
        return _fileSync!!
    }

private var _fileSync: ImageVector? = null
