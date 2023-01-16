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

public val MaterialDesignIcons.FolderMultiplePlus: ImageVector
    get() {
        if (_folderMultiplePlus != null) {
            return _folderMultiplePlus!!
        }
        _folderMultiplePlus = Builder(name = "FolderMultiplePlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(20.0f)
                curveTo(0.0f, 21.1f, 0.9f, 22.0f, 2.0f, 22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                moveTo(22.0f, 4.0f)
                horizontalLineTo(14.0f)
                lineTo(12.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(5.6f, 2.0f, 5.2f, 2.1f, 4.9f, 2.3f)
                lineTo(4.3f, 2.9f)
                curveTo(4.1f, 3.2f, 4.0f, 3.6f, 4.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 16.4f, 4.1f, 16.8f, 4.3f, 17.1f)
                curveTo(4.4f, 17.2f, 4.5f, 17.3f, 4.5f, 17.4f)
                curveTo(5.0f, 17.8f, 5.5f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(22.0f)
                curveTo(23.1f, 18.0f, 24.0f, 17.1f, 24.0f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(24.0f, 4.9f, 23.1f, 4.0f, 22.0f, 4.0f)
                moveTo(22.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _folderMultiplePlus!!
    }

private var _folderMultiplePlus: ImageVector? = null
