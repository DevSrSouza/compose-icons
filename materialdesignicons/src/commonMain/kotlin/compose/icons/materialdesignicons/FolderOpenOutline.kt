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

public val MaterialDesignIcons.FolderOpenOutline: ImageVector
    get() {
        if (_folderOpenOutline != null) {
            return _folderOpenOutline!!
        }
        _folderOpenOutline = Builder(name = "FolderOpenOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1f, 10.0f)
                lineTo(4.0f, 18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 6.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(19.0f)
                curveTo(19.9f, 20.0f, 20.7f, 19.4f, 20.9f, 18.5f)
                lineTo(23.2f, 10.0f)
                horizontalLineTo(6.1f)
                moveTo(19.0f, 18.0f)
                horizontalLineTo(6.0f)
                lineTo(7.6f, 12.0f)
                horizontalLineTo(20.6f)
                lineTo(19.0f, 18.0f)
                close()
            }
        }
        .build()
        return _folderOpenOutline!!
    }

private var _folderOpenOutline: ImageVector? = null
