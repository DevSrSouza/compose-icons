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

public val MaterialDesignIcons.VolumeHigh: ImageVector
    get() {
        if (_volumeHigh != null) {
            return _volumeHigh!!
        }
        _volumeHigh = Builder(name = "VolumeHigh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.23f)
                verticalLineTo(5.29f)
                curveTo(16.89f, 6.15f, 19.0f, 8.83f, 19.0f, 12.0f)
                curveTo(19.0f, 15.17f, 16.89f, 17.84f, 14.0f, 18.7f)
                verticalLineTo(20.77f)
                curveTo(18.0f, 19.86f, 21.0f, 16.28f, 21.0f, 12.0f)
                curveTo(21.0f, 7.72f, 18.0f, 4.14f, 14.0f, 3.23f)
                moveTo(16.5f, 12.0f)
                curveTo(16.5f, 10.23f, 15.5f, 8.71f, 14.0f, 7.97f)
                verticalLineTo(16.0f)
                curveTo(15.5f, 15.29f, 16.5f, 13.76f, 16.5f, 12.0f)
                moveTo(3.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                lineTo(12.0f, 20.0f)
                verticalLineTo(4.0f)
                lineTo(7.0f, 9.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _volumeHigh!!
    }

private var _volumeHigh: ImageVector? = null
