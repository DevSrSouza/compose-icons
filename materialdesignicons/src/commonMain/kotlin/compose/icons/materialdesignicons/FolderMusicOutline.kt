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

public val MaterialDesignIcons.FolderMusicOutline: ImageVector
    get() {
        if (_folderMusicOutline != null) {
            return _folderMusicOutline!!
        }
        _folderMusicOutline = Builder(name = "FolderMusicOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.78f)
                curveTo(13.38f, 18.59f, 13.13f, 19.26f, 13.04f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.89f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 6.0f, 22.0f, 6.89f, 22.0f, 8.0f)
                moveTo(18.5f, 13.0f)
                verticalLineTo(18.21f)
                curveTo(18.19f, 18.07f, 17.86f, 18.0f, 17.5f, 18.0f)
                curveTo(16.12f, 18.0f, 15.0f, 19.12f, 15.0f, 20.5f)
                reflectiveCurveTo(16.12f, 23.0f, 17.5f, 23.0f)
                reflectiveCurveTo(20.0f, 21.88f, 20.0f, 20.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _folderMusicOutline!!
    }

private var _folderMusicOutline: ImageVector? = null
