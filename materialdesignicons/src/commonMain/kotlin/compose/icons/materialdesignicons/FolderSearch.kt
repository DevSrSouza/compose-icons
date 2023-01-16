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

public val MaterialDesignIcons.FolderSearch: ImageVector
    get() {
        if (_folderSearch != null) {
            return _folderSearch!!
        }
        _folderSearch = Builder(name = "FolderSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 12.0f)
                curveTo(19.0f, 12.0f, 21.0f, 14.0f, 21.0f, 16.5f)
                curveTo(21.0f, 17.38f, 20.75f, 18.21f, 20.31f, 18.9f)
                lineTo(23.39f, 22.0f)
                lineTo(22.0f, 23.39f)
                lineTo(18.88f, 20.32f)
                curveTo(18.19f, 20.75f, 17.37f, 21.0f, 16.5f, 21.0f)
                curveTo(14.0f, 21.0f, 12.0f, 19.0f, 12.0f, 16.5f)
                curveTo(12.0f, 14.0f, 14.0f, 12.0f, 16.5f, 12.0f)
                moveTo(16.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 14.0f)
                moveTo(9.0f, 4.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 8.0f)
                verticalLineTo(11.81f)
                curveTo(19.83f, 10.69f, 18.25f, 10.0f, 16.5f, 10.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 10.0f, 16.5f)
                curveTo(10.0f, 17.79f, 10.37f, 19.0f, 11.0f, 20.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 20.0f, 1.0f, 19.1f, 1.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 4.89f, 1.89f, 4.0f, 3.0f, 4.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _folderSearch!!
    }

private var _folderSearch: ImageVector? = null
