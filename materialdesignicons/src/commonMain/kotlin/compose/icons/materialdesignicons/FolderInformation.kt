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

public val MaterialDesignIcons.FolderInformation: ImageVector
    get() {
        if (_folderInformation != null) {
            return _folderInformation!!
        }
        _folderInformation = Builder(name = "FolderInformation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                horizontalLineTo(10.3f)
                curveTo(11.6f, 21.9f, 13.8f, 23.0f, 16.0f, 23.0f)
                curveTo(19.9f, 23.0f, 23.0f, 19.9f, 23.0f, 16.0f)
                curveTo(23.0f, 14.2f, 22.3f, 12.4f, 21.0f, 11.1f)
                moveTo(16.0f, 21.0f)
                curveTo(13.2f, 21.0f, 11.0f, 18.8f, 11.0f, 16.0f)
                reflectiveCurveTo(13.2f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(21.0f, 13.2f, 21.0f, 16.0f)
                reflectiveCurveTo(18.8f, 21.0f, 16.0f, 21.0f)
                moveTo(17.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                moveTo(17.0f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _folderInformation!!
    }

private var _folderInformation: ImageVector? = null
