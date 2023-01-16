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

public val MaterialDesignIcons.FolderKeyNetwork: ImageVector
    get() {
        if (_folderKeyNetwork != null) {
            return _folderKeyNetwork!!
        }
        _folderKeyNetwork = Builder(name = "FolderKeyNetwork", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                curveTo(4.9f, 5.0f, 4.0f, 5.9f, 4.0f, 7.0f)
                verticalLineTo(15.0f)
                curveTo(4.0f, 16.1f, 4.9f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4f, 19.0f, 9.0f, 19.4f, 9.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 22.6f, 9.4f, 23.0f, 10.0f, 23.0f)
                horizontalLineTo(14.0f)
                curveTo(14.6f, 23.0f, 15.0f, 22.6f, 15.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 19.4f, 14.6f, 19.0f, 14.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 17.0f, 20.0f, 16.1f, 20.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(20.0f, 7.9f, 19.1f, 7.0f, 18.0f, 7.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 5.0f)
                horizontalLineTo(6.0f)
                moveTo(9.0f, 9.0f)
                curveTo(10.3f, 9.0f, 11.4f, 9.8f, 11.8f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.8f)
                curveTo(11.4f, 14.2f, 10.3f, 15.0f, 9.0f, 15.0f)
                curveTo(7.3f, 15.0f, 6.0f, 13.7f, 6.0f, 12.0f)
                reflectiveCurveTo(7.3f, 9.0f, 9.0f, 9.0f)
                moveTo(9.0f, 11.0f)
                curveTo(8.4f, 11.0f, 8.0f, 11.4f, 8.0f, 12.0f)
                curveTo(8.0f, 12.6f, 8.4f, 13.0f, 9.0f, 13.0f)
                curveTo(9.6f, 13.0f, 10.0f, 12.6f, 10.0f, 12.0f)
                reflectiveCurveTo(9.6f, 11.0f, 9.0f, 11.0f)
                close()
            }
        }
        .build()
        return _folderKeyNetwork!!
    }

private var _folderKeyNetwork: ImageVector? = null
