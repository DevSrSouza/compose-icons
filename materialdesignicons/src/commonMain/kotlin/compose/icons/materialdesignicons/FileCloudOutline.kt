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

public val MaterialDesignIcons.FileCloudOutline: ImageVector
    get() {
        if (_fileCloudOutline != null) {
            return _fileCloudOutline!!
        }
        _fileCloudOutline = Builder(name = "FileCloudOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 22.0f, 20.0f, 21.11f, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                moveTo(17.0f, 16.92f)
                curveTo(17.0f, 18.07f, 16.07f, 19.0f, 14.92f, 19.0f)
                horizontalLineTo(9.5f)
                curveTo(8.12f, 19.0f, 7.0f, 17.88f, 7.0f, 16.5f)
                curveTo(7.0f, 15.21f, 8.0f, 14.15f, 9.23f, 14.0f)
                curveTo(9.75f, 13.0f, 10.79f, 12.33f, 12.0f, 12.33f)
                curveTo(13.5f, 12.33f, 14.78f, 13.42f, 15.07f, 14.83f)
                curveTo(16.14f, 14.93f, 17.0f, 15.82f, 17.0f, 16.92f)
                close()
            }
        }
        .build()
        return _fileCloudOutline!!
    }

private var _fileCloudOutline: ImageVector? = null
