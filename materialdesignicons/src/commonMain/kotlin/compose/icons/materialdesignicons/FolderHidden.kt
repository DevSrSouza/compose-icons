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

public val MaterialDesignIcons.FolderHidden: ImageVector
    get() {
        if (_folderHidden != null) {
            return _folderHidden!!
        }
        _folderHidden = Builder(name = "FolderHidden", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                moveTo(4.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                moveTo(2.0f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                moveTo(18.0f, 8.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 6.89f, 21.1f, 6.0f, 20.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                moveTo(22.0f, 13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                moveTo(20.0f, 9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                moveTo(9.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                moveTo(5.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.11f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                moveTo(20.0f, 17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 20.0f, 22.0f, 19.11f, 22.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                moveTo(4.0f, 8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                moveTo(17.0f, 18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                moveTo(13.0f, 18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                moveTo(17.0f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                moveTo(10.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 4.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _folderHidden!!
    }

private var _folderHidden: ImageVector? = null
