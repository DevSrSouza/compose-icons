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

public val MaterialDesignIcons.FolderKey: ImageVector
    get() {
        if (_folderKey != null) {
            return _folderKey!!
        }
        _folderKey = Builder(name = "FolderKey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 20.0f, 22.0f, 19.1f, 22.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 4.0f)
                moveTo(11.0f, 10.0f)
                curveTo(12.3f, 10.0f, 13.4f, 10.8f, 13.8f, 12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.8f)
                curveTo(13.4f, 15.2f, 12.3f, 16.0f, 11.0f, 16.0f)
                curveTo(9.3f, 16.0f, 8.0f, 14.7f, 8.0f, 13.0f)
                reflectiveCurveTo(9.3f, 10.0f, 11.0f, 10.0f)
                moveTo(11.0f, 12.0f)
                curveTo(10.4f, 12.0f, 10.0f, 12.4f, 10.0f, 13.0f)
                curveTo(10.0f, 13.6f, 10.4f, 14.0f, 11.0f, 14.0f)
                curveTo(11.6f, 14.0f, 12.0f, 13.6f, 12.0f, 13.0f)
                reflectiveCurveTo(11.6f, 12.0f, 11.0f, 12.0f)
                close()
            }
        }
        .build()
        return _folderKey!!
    }

private var _folderKey: ImageVector? = null
