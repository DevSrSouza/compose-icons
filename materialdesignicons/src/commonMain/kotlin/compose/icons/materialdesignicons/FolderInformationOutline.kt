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

public val MaterialDesignIcons.FolderInformationOutline: ImageVector
    get() {
        if (_folderInformationOutline != null) {
            return _folderInformationOutline!!
        }
        _folderInformationOutline = Builder(name = "FolderInformationOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.1f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 6.9f, 20.1f, 6.0f, 19.0f, 6.0f)
                horizontalLineTo(11.0f)
                lineTo(9.0f, 4.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 19.1f, 1.9f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(10.2f)
                curveTo(11.4f, 21.8f, 13.6f, 23.0f, 16.0f, 23.0f)
                curveTo(19.9f, 23.0f, 23.0f, 19.9f, 23.0f, 16.0f)
                curveTo(23.0f, 14.1f, 22.2f, 12.4f, 21.0f, 11.1f)
                moveTo(9.3f, 18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.7f)
                curveTo(18.1f, 9.2f, 17.1f, 9.0f, 16.0f, 9.0f)
                curveTo(12.1f, 9.0f, 9.0f, 12.1f, 9.0f, 16.0f)
                curveTo(9.0f, 16.7f, 9.1f, 17.4f, 9.3f, 18.0f)
                moveTo(16.0f, 21.0f)
                curveTo(13.2f, 21.0f, 11.0f, 18.8f, 11.0f, 16.0f)
                reflectiveCurveTo(13.2f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(21.0f, 13.2f, 21.0f, 16.0f)
                reflectiveCurveTo(18.8f, 21.0f, 16.0f, 21.0f)
                moveTo(17.0f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                moveTo(17.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _folderInformationOutline!!
    }

private var _folderInformationOutline: ImageVector? = null
