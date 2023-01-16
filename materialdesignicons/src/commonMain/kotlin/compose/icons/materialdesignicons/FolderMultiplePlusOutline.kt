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

public val MaterialDesignIcons.FolderMultiplePlusOutline: ImageVector
    get() {
        if (_folderMultiplePlusOutline != null) {
            return _folderMultiplePlusOutline!!
        }
        _folderMultiplePlusOutline = Builder(name = "FolderMultiplePlusOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                curveTo(23.1f, 4.0f, 24.0f, 4.9f, 24.0f, 6.0f)
                verticalLineTo(16.0f)
                curveTo(24.0f, 17.1f, 23.1f, 18.0f, 22.0f, 18.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 18.0f, 4.0f, 17.1f, 4.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.9f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(12.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineTo(22.0f)
                moveTo(2.0f, 6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                curveTo(0.9f, 22.0f, 0.0f, 21.1f, 0.0f, 20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                moveTo(6.0f, 6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                moveTo(14.0f, 10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _folderMultiplePlusOutline!!
    }

private var _folderMultiplePlusOutline: ImageVector? = null
