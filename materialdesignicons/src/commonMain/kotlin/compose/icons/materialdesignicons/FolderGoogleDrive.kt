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

public val MaterialDesignIcons.FolderGoogleDrive: ImageVector
    get() {
        if (_folderGoogleDrive != null) {
            return _folderGoogleDrive!!
        }
        _folderGoogleDrive = Builder(name = "FolderGoogleDrive", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 9.0f)
                horizontalLineTo(16.14f)
                lineTo(19.0f, 14.0f)
                horizontalLineTo(16.05f)
                lineTo(13.5f, 9.46f)
                moveTo(18.3f, 17.0f)
                horizontalLineTo(12.75f)
                lineTo(14.15f, 14.5f)
                horizontalLineTo(19.27f)
                lineTo(19.53f, 14.96f)
                moveTo(11.5f, 17.0f)
                lineTo(10.4f, 14.86f)
                lineTo(13.24f, 9.9f)
                lineTo(14.74f, 12.56f)
                lineTo(12.25f, 17.0f)
                moveTo(20.0f, 6.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.89f, 21.1f, 6.0f, 20.0f, 6.0f)
                close()
            }
        }
        .build()
        return _folderGoogleDrive!!
    }

private var _folderGoogleDrive: ImageVector? = null
