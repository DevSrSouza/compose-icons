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

public val MaterialDesignIcons.FolderCancel: ImageVector
    get() {
        if (_folderCancel != null) {
            return _folderCancel!!
        }
        _folderCancel = Builder(name = "FolderCancel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.5f)
                curveTo(12.0f, 19.0f, 12.07f, 19.5f, 12.18f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 6.0f, 22.0f, 6.89f, 22.0f, 8.0f)
                verticalLineTo(13.04f)
                curveTo(21.0f, 12.39f, 19.79f, 12.0f, 18.5f, 12.0f)
                curveTo(14.91f, 12.0f, 12.0f, 14.91f, 12.0f, 18.5f)
                moveTo(23.0f, 18.5f)
                curveTo(23.0f, 21.0f, 21.0f, 23.0f, 18.5f, 23.0f)
                reflectiveCurveTo(14.0f, 21.0f, 14.0f, 18.5f)
                reflectiveCurveTo(16.0f, 14.0f, 18.5f, 14.0f)
                reflectiveCurveTo(23.0f, 16.0f, 23.0f, 18.5f)
                moveTo(20.0f, 21.08f)
                lineTo(15.92f, 17.0f)
                curveTo(15.65f, 17.42f, 15.5f, 17.94f, 15.5f, 18.5f)
                curveTo(15.5f, 20.16f, 16.84f, 21.5f, 18.5f, 21.5f)
                curveTo(19.06f, 21.5f, 19.58f, 21.35f, 20.0f, 21.08f)
                moveTo(21.5f, 18.5f)
                curveTo(21.5f, 16.84f, 20.16f, 15.5f, 18.5f, 15.5f)
                curveTo(17.94f, 15.5f, 17.42f, 15.65f, 17.0f, 15.92f)
                lineTo(21.08f, 20.0f)
                curveTo(21.35f, 19.58f, 21.5f, 19.06f, 21.5f, 18.5f)
                close()
            }
        }
        .build()
        return _folderCancel!!
    }

private var _folderCancel: ImageVector? = null
