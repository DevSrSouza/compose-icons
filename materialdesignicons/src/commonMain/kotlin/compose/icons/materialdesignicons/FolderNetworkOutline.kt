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

public val MaterialDesignIcons.FolderNetworkOutline: ImageVector
    get() {
        if (_folderNetworkOutline != null) {
            return _folderNetworkOutline!!
        }
        _folderNetworkOutline = Builder(name = "FolderNetworkOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 20.0f)
                curveTo(15.0f, 19.45f, 14.55f, 19.0f, 14.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 17.0f, 21.0f, 16.11f, 21.0f, 15.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 5.9f, 20.11f, 5.0f, 19.0f, 5.0f)
                horizontalLineTo(13.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 16.11f, 3.9f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                curveTo(9.45f, 19.0f, 9.0f, 19.45f, 9.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 22.55f, 9.45f, 23.0f, 10.0f, 23.0f)
                horizontalLineTo(14.0f)
                curveTo(14.55f, 23.0f, 15.0f, 22.55f, 15.0f, 22.0f)
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
        return _folderNetworkOutline!!
    }

private var _folderNetworkOutline: ImageVector? = null
