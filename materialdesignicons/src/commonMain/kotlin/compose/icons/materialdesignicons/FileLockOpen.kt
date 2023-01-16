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

public val MaterialDesignIcons.FileLockOpen: ImageVector
    get() {
        if (_fileLockOpen != null) {
            return _fileLockOpen!!
        }
        _fileLockOpen = Builder(name = "FileLockOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.3f)
                verticalLineTo(21.8f)
                curveTo(22.0f, 22.4f, 21.4f, 23.0f, 20.7f, 23.0f)
                horizontalLineTo(15.2f)
                curveTo(14.6f, 23.0f, 14.0f, 22.4f, 14.0f, 21.7f)
                verticalLineTo(18.2f)
                curveTo(14.0f, 17.6f, 14.6f, 17.0f, 15.2f, 17.0f)
                verticalLineTo(14.5f)
                curveTo(15.2f, 13.1f, 16.6f, 12.0f, 18.0f, 12.0f)
                reflectiveCurveTo(20.8f, 13.1f, 20.8f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(14.5f)
                curveTo(19.5f, 13.7f, 18.8f, 13.2f, 18.0f, 13.2f)
                reflectiveCurveTo(16.5f, 13.7f, 16.5f, 14.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.8f)
                curveTo(21.4f, 17.0f, 22.0f, 17.6f, 22.0f, 18.3f)
                moveTo(6.0f, 2.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.2f)
                curveTo(12.0f, 17.2f, 12.4f, 16.5f, 13.0f, 16.0f)
                curveTo(13.1f, 15.9f, 13.2f, 15.9f, 13.2f, 15.8f)
                verticalLineTo(14.5f)
                curveTo(13.2f, 11.8f, 15.6f, 10.0f, 18.0f, 10.0f)
                curveTo(18.7f, 10.0f, 19.4f, 10.2f, 20.0f, 10.4f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                moveTo(13.0f, 3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _fileLockOpen!!
    }

private var _fileLockOpen: ImageVector? = null
