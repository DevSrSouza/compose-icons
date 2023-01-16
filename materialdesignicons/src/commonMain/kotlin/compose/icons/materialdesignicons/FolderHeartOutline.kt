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

public val MaterialDesignIcons.FolderHeartOutline: ImageVector
    get() {
        if (_folderHeartOutline != null) {
            return _folderHeartOutline!!
        }
        _folderHeartOutline = Builder(name = "FolderHeartOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 6.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 20.0f, 22.0f, 19.1f, 22.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.89f, 21.1f, 6.0f, 20.0f, 6.0f)
                moveTo(13.0f, 10.0f)
                curveTo(11.9f, 10.0f, 11.0f, 10.92f, 11.0f, 12.05f)
                curveTo(11.0f, 12.62f, 11.22f, 13.12f, 11.59f, 13.5f)
                lineTo(15.0f, 17.0f)
                lineTo(18.42f, 13.5f)
                curveTo(18.78f, 13.13f, 19.0f, 12.61f, 19.0f, 12.05f)
                curveTo(19.0f, 10.92f, 18.1f, 10.0f, 17.0f, 10.0f)
                curveTo(16.46f, 10.0f, 15.95f, 10.23f, 15.59f, 10.6f)
                lineTo(15.0f, 11.2f)
                lineTo(14.42f, 10.61f)
                curveTo(14.05f, 10.23f, 13.54f, 10.0f, 13.0f, 10.0f)
                close()
            }
        }
        .build()
        return _folderHeartOutline!!
    }

private var _folderHeartOutline: ImageVector? = null
