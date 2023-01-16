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

public val MaterialDesignIcons.FolderFileOutline: ImageVector
    get() {
        if (_folderFileOutline != null) {
            return _folderFileOutline!!
        }
        _folderFileOutline = Builder(name = "FolderFileOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 6.0f, 22.0f, 6.89f, 22.0f, 8.0f)
                verticalLineTo(10.17f)
                lineTo(20.41f, 8.59f)
                lineTo(20.0f, 8.17f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                moveTo(23.0f, 14.0f)
                verticalLineTo(21.0f)
                curveTo(23.0f, 22.11f, 22.11f, 23.0f, 21.0f, 23.0f)
                horizontalLineTo(15.0f)
                curveTo(13.9f, 23.0f, 13.0f, 22.11f, 13.0f, 21.0f)
                verticalLineTo(12.0f)
                curveTo(13.0f, 10.9f, 13.9f, 10.0f, 15.0f, 10.0f)
                horizontalLineTo(19.0f)
                lineTo(23.0f, 14.0f)
                moveTo(21.0f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _folderFileOutline!!
    }

private var _folderFileOutline: ImageVector? = null
