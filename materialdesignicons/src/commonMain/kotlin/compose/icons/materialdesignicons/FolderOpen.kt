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

public val MaterialDesignIcons.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 20.0f, 2.0f, 19.1f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 8.0f)
                horizontalLineTo(21.0f)
                lineTo(4.0f, 8.0f)
                verticalLineTo(18.0f)
                lineTo(6.14f, 10.0f)
                horizontalLineTo(23.21f)
                lineTo(20.93f, 18.5f)
                curveTo(20.7f, 19.37f, 19.92f, 20.0f, 19.0f, 20.0f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
