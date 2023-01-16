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

public val MaterialDesignIcons.FolderOffOutline: ImageVector
    get() {
        if (_folderOffOutline != null) {
            return _folderOffOutline!!
        }
        _folderOffOutline = Builder(name = "FolderOffOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(2.64f, 4.53f)
                curveTo(2.25f, 4.9f, 2.0f, 5.42f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.11f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(4.0f, 18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.11f)
                lineTo(16.11f, 18.0f)
                horizontalLineTo(4.0f)
                moveTo(11.2f, 8.0f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 6.0f, 22.0f, 6.89f, 22.0f, 8.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.24f, 21.96f, 18.47f, 21.88f, 18.68f)
                lineTo(20.0f, 16.8f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.2f)
                close()
            }
        }
        .build()
        return _folderOffOutline!!
    }

private var _folderOffOutline: ImageVector? = null
