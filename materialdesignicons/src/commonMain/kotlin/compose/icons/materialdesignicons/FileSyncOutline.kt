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

public val MaterialDesignIcons.FileSyncOutline: ImageVector
    get() {
        if (_fileSyncOutline != null) {
            return _fileSyncOutline!!
        }
        _fileSyncOutline = Builder(name = "FileSyncOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.9f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(14.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(11.5f)
                curveTo(19.4f, 11.2f, 18.7f, 11.1f, 18.0f, 11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.5f)
                curveTo(11.8f, 20.7f, 12.3f, 21.4f, 12.8f, 22.0f)
                moveTo(17.0f, 12.0f)
                lineTo(14.8f, 14.2f)
                lineTo(17.0f, 16.4f)
                verticalLineTo(15.0f)
                curveTo(18.4f, 15.0f, 19.5f, 16.1f, 19.5f, 17.5f)
                curveTo(19.5f, 17.9f, 19.4f, 18.3f, 19.2f, 18.6f)
                lineTo(20.3f, 19.7f)
                curveTo(20.7f, 19.1f, 21.0f, 18.3f, 21.0f, 17.5f)
                curveTo(21.0f, 15.3f, 19.2f, 13.5f, 17.0f, 13.5f)
                verticalLineTo(12.0f)
                moveTo(19.2f, 20.8f)
                lineTo(17.0f, 18.5f)
                verticalLineTo(20.0f)
                curveTo(15.6f, 20.0f, 14.5f, 18.9f, 14.5f, 17.5f)
                curveTo(14.5f, 17.1f, 14.6f, 16.7f, 14.8f, 16.4f)
                lineTo(13.7f, 15.3f)
                curveTo(13.3f, 15.9f, 13.0f, 16.7f, 13.0f, 17.5f)
                curveTo(13.0f, 19.7f, 14.8f, 21.5f, 17.0f, 21.5f)
                verticalLineTo(23.0f)
                lineTo(19.2f, 20.8f)
                close()
            }
        }
        .build()
        return _fileSyncOutline!!
    }

private var _fileSyncOutline: ImageVector? = null
