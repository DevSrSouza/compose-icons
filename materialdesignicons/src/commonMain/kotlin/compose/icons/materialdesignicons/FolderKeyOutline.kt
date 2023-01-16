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

public val MaterialDesignIcons.FolderKeyOutline: ImageVector
    get() {
        if (_folderKeyOutline != null) {
            return _folderKeyOutline!!
        }
        _folderKeyOutline = Builder(name = "FolderKeyOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 20.0f, 22.0f, 19.1f, 22.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f)
                moveTo(12.8f, 12.0f)
                curveTo(12.4f, 10.8f, 11.3f, 10.0f, 10.0f, 10.0f)
                curveTo(8.3f, 10.0f, 7.0f, 11.3f, 7.0f, 13.0f)
                reflectiveCurveTo(8.3f, 16.0f, 10.0f, 16.0f)
                curveTo(11.3f, 16.0f, 12.4f, 15.2f, 12.8f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.8f)
                moveTo(10.0f, 14.0f)
                curveTo(9.4f, 14.0f, 9.0f, 13.6f, 9.0f, 13.0f)
                curveTo(9.0f, 12.4f, 9.4f, 12.0f, 10.0f, 12.0f)
                reflectiveCurveTo(11.0f, 12.4f, 11.0f, 13.0f)
                reflectiveCurveTo(10.6f, 14.0f, 10.0f, 14.0f)
                close()
            }
        }
        .build()
        return _folderKeyOutline!!
    }

private var _folderKeyOutline: ImageVector? = null
