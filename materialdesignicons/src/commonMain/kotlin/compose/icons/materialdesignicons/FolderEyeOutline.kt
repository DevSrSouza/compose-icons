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

public val MaterialDesignIcons.FolderEyeOutline: ImageVector
    get() {
        if (_folderEyeOutline != null) {
            return _folderEyeOutline!!
        }
        _folderEyeOutline = Builder(name = "FolderEyeOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.1f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.9f, 2.9f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 6.0f, 22.0f, 6.9f, 22.0f, 8.0f)
                verticalLineTo(14.6f)
                curveTo(21.4f, 14.2f, 20.7f, 13.8f, 20.0f, 13.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.3f)
                curveTo(9.3f, 18.1f, 9.2f, 18.2f, 9.2f, 18.3f)
                lineTo(8.8f, 19.0f)
                lineTo(9.1f, 19.7f)
                curveTo(9.2f, 19.8f, 9.2f, 19.9f, 9.3f, 20.0f)
                moveTo(23.0f, 19.0f)
                curveTo(22.1f, 21.3f, 19.7f, 23.0f, 17.0f, 23.0f)
                reflectiveCurveTo(11.9f, 21.3f, 11.0f, 19.0f)
                curveTo(11.9f, 16.7f, 14.3f, 15.0f, 17.0f, 15.0f)
                reflectiveCurveTo(22.1f, 16.7f, 23.0f, 19.0f)
                moveTo(19.5f, 19.0f)
                curveTo(19.5f, 17.6f, 18.4f, 16.5f, 17.0f, 16.5f)
                reflectiveCurveTo(14.5f, 17.6f, 14.5f, 19.0f)
                reflectiveCurveTo(15.6f, 21.5f, 17.0f, 21.5f)
                reflectiveCurveTo(19.5f, 20.4f, 19.5f, 19.0f)
                moveTo(17.0f, 18.0f)
                curveTo(16.4f, 18.0f, 16.0f, 18.4f, 16.0f, 19.0f)
                reflectiveCurveTo(16.4f, 20.0f, 17.0f, 20.0f)
                reflectiveCurveTo(18.0f, 19.6f, 18.0f, 19.0f)
                reflectiveCurveTo(17.6f, 18.0f, 17.0f, 18.0f)
            }
        }
        .build()
        return _folderEyeOutline!!
    }

private var _folderEyeOutline: ImageVector? = null
