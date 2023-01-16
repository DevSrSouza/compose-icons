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

public val MaterialDesignIcons.FolderLockOpen: ImageVector
    get() {
        if (_folderLockOpen != null) {
            return _folderLockOpen!!
        }
        _folderLockOpen = Builder(name = "FolderLockOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2f, 13.5f)
                verticalLineTo(14.74f)
                curveTo(13.5f, 15.34f, 13.0f, 16.24f, 13.0f, 17.2f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 6.0f, 22.0f, 6.89f, 22.0f, 8.0f)
                verticalLineTo(10.04f)
                curveTo(21.17f, 9.4f, 20.13f, 9.0f, 19.0f, 9.0f)
                curveTo(16.4f, 9.0f, 14.2f, 11.06f, 14.2f, 13.5f)
                moveTo(21.8f, 16.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.5f)
                curveTo(17.5f, 12.7f, 18.2f, 12.2f, 19.0f, 12.2f)
                reflectiveCurveTo(20.5f, 12.7f, 20.5f, 13.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.8f)
                verticalLineTo(13.5f)
                curveTo(21.8f, 12.1f, 20.4f, 11.0f, 19.0f, 11.0f)
                reflectiveCurveTo(16.2f, 12.1f, 16.2f, 13.5f)
                verticalLineTo(16.0f)
                curveTo(15.6f, 16.0f, 15.0f, 16.6f, 15.0f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15.0f, 21.4f, 15.6f, 22.0f, 16.2f, 22.0f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22.0f, 23.0f, 21.4f, 23.0f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23.0f, 16.6f, 22.4f, 16.0f, 21.8f, 16.0f)
                close()
            }
        }
        .build()
        return _folderLockOpen!!
    }

private var _folderLockOpen: ImageVector? = null
