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

public val MaterialDesignIcons.FolderMarkerOutline: ImageVector
    get() {
        if (_folderMarkerOutline != null) {
            return _folderMarkerOutline!!
        }
        _folderMarkerOutline = Builder(name = "FolderMarkerOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 12.0f)
                curveTo(20.4f, 12.0f, 22.0f, 13.6f, 22.0f, 15.5f)
                curveTo(22.0f, 18.1f, 18.5f, 22.0f, 18.5f, 22.0f)
                curveTo(18.5f, 22.0f, 15.0f, 18.1f, 15.0f, 15.5f)
                curveTo(15.0f, 13.6f, 16.6f, 12.0f, 18.5f, 12.0f)
                moveTo(18.5f, 16.8f)
                curveTo(19.2f, 16.8f, 19.8f, 16.2f, 19.7f, 15.6f)
                curveTo(19.7f, 15.0f, 19.1f, 14.4f, 18.5f, 14.4f)
                curveTo(17.9f, 14.4f, 17.3f, 14.9f, 17.3f, 15.6f)
                curveTo(17.3f, 16.2f, 17.8f, 16.8f, 18.5f, 16.8f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.5f)
                curveTo(13.79f, 18.68f, 14.13f, 19.35f, 14.5f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 20.0f, 2.0f, 19.1f, 2.0f, 18.0f)
                lineTo(2.0f, 6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 6.0f, 22.0f, 6.89f, 22.0f, 8.0f)
                verticalLineTo(11.34f)
                curveTo(21.42f, 10.84f, 20.74f, 10.45f, 20.0f, 10.23f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _folderMarkerOutline!!
    }

private var _folderMarkerOutline: ImageVector? = null
