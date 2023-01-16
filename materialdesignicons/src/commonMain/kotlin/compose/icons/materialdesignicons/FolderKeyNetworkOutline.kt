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

public val MaterialDesignIcons.FolderKeyNetworkOutline: ImageVector
    get() {
        if (_folderKeyNetworkOutline != null) {
            return _folderKeyNetworkOutline!!
        }
        _folderKeyNetworkOutline = Builder(name = "FolderKeyNetworkOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 8.0f)
                curveTo(7.3f, 8.0f, 6.0f, 9.3f, 6.0f, 11.0f)
                reflectiveCurveTo(7.3f, 14.0f, 9.0f, 14.0f)
                curveTo(10.3f, 14.0f, 11.4f, 13.2f, 11.8f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.8f)
                curveTo(11.4f, 8.8f, 10.3f, 8.0f, 9.0f, 8.0f)
                moveTo(9.0f, 12.0f)
                curveTo(8.4f, 12.0f, 8.0f, 11.6f, 8.0f, 11.0f)
                reflectiveCurveTo(8.4f, 10.0f, 9.0f, 10.0f)
                reflectiveCurveTo(10.0f, 10.4f, 10.0f, 11.0f)
                reflectiveCurveTo(9.6f, 12.0f, 9.0f, 12.0f)
                moveTo(15.0f, 20.0f)
                curveTo(15.0f, 19.5f, 14.6f, 19.0f, 14.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 17.0f, 21.0f, 16.1f, 21.0f, 15.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 5.9f, 20.1f, 5.0f, 19.0f, 5.0f)
                horizontalLineTo(13.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 16.1f, 3.9f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4f, 19.0f, 9.0f, 19.5f, 9.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 22.5f, 9.4f, 23.0f, 10.0f, 23.0f)
                horizontalLineTo(14.0f)
                curveTo(14.6f, 23.0f, 15.0f, 22.5f, 15.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                moveTo(5.0f, 15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _folderKeyNetworkOutline!!
    }

private var _folderKeyNetworkOutline: ImageVector? = null
