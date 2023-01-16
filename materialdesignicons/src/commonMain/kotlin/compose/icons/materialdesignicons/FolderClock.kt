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

public val MaterialDesignIcons.FolderClock: ImageVector
    get() {
        if (_folderClock != null) {
            return _folderClock!!
        }
        _folderClock = Builder(name = "FolderClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                curveTo(1.89f, 4.0f, 1.0f, 4.89f, 1.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 20.0f)
                horizontalLineTo(10.26f)
                curveTo(11.57f, 21.88f, 13.71f, 23.0f, 16.0f, 23.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 23.0f, 16.0f)
                curveTo(23.0f, 14.17f, 22.28f, 12.42f, 21.0f, 11.11f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 6.89f, 20.1f, 6.0f, 19.0f, 6.0f)
                horizontalLineTo(11.0f)
                lineTo(9.0f, 4.0f)
                horizontalLineTo(3.0f)
                moveTo(16.0f, 11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 21.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.0f, 21.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 11.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.0f, 11.0f)
                moveTo(15.0f, 12.0f)
                verticalLineTo(17.0f)
                lineTo(18.61f, 19.16f)
                lineTo(19.36f, 17.94f)
                lineTo(16.5f, 16.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _folderClock!!
    }

private var _folderClock: ImageVector? = null
