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

public val MaterialDesignIcons.FolderAccountOutline: ImageVector
    get() {
        if (_folderAccountOutline != null) {
            return _folderAccountOutline!!
        }
        _folderAccountOutline = Builder(name = "FolderAccountOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                curveTo(16.33f, 14.0f, 19.0f, 14.67f, 19.0f, 16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                curveTo(11.0f, 14.67f, 13.67f, 14.0f, 15.0f, 14.0f)
                moveTo(15.0f, 13.0f)
                curveTo(16.11f, 13.0f, 17.0f, 12.11f, 17.0f, 11.0f)
                reflectiveCurveTo(16.11f, 9.0f, 15.0f, 9.0f)
                curveTo(13.9f, 9.0f, 13.0f, 9.89f, 13.0f, 11.0f)
                curveTo(13.0f, 12.11f, 13.9f, 13.0f, 15.0f, 13.0f)
                moveTo(22.0f, 8.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.11f, 21.11f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.9f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 6.0f, 22.0f, 6.9f, 22.0f, 8.0f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _folderAccountOutline!!
    }

private var _folderAccountOutline: ImageVector? = null
