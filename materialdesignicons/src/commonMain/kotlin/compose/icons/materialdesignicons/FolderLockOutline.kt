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

public val MaterialDesignIcons.FolderLockOutline: ImageVector
    get() {
        if (_folderLockOutline != null) {
            return _folderLockOutline!!
        }
        _folderLockOutline = Builder(name = "FolderLockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 6.0f, 22.0f, 6.89f, 22.0f, 8.0f)
                verticalLineTo(11.04f)
                curveTo(21.42f, 10.6f, 20.75f, 10.26f, 20.0f, 10.11f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                moveTo(23.0f, 17.3f)
                verticalLineTo(20.8f)
                curveTo(23.0f, 21.4f, 22.4f, 22.0f, 21.7f, 22.0f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 22.0f, 15.0f, 21.4f, 15.0f, 20.7f)
                verticalLineTo(17.2f)
                curveTo(15.0f, 16.6f, 15.6f, 16.0f, 16.2f, 16.0f)
                verticalLineTo(14.5f)
                curveTo(16.2f, 13.1f, 17.6f, 12.0f, 19.0f, 12.0f)
                reflectiveCurveTo(21.8f, 13.1f, 21.8f, 14.5f)
                verticalLineTo(16.0f)
                curveTo(22.4f, 16.0f, 23.0f, 16.6f, 23.0f, 17.3f)
                moveTo(20.5f, 14.5f)
                curveTo(20.5f, 13.7f, 19.8f, 13.2f, 19.0f, 13.2f)
                reflectiveCurveTo(17.5f, 13.7f, 17.5f, 14.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _folderLockOutline!!
    }

private var _folderLockOutline: ImageVector? = null
