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

public val MaterialDesignIcons.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) {
            return _volumeOff!!
        }
        _volumeOff = Builder(name = "VolumeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                lineTo(9.91f, 6.09f)
                lineTo(12.0f, 8.18f)
                moveTo(4.27f, 3.0f)
                lineTo(3.0f, 4.27f)
                lineTo(7.73f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                lineTo(12.0f, 20.0f)
                verticalLineTo(13.27f)
                lineTo(16.25f, 17.53f)
                curveTo(15.58f, 18.04f, 14.83f, 18.46f, 14.0f, 18.7f)
                verticalLineTo(20.77f)
                curveTo(15.38f, 20.45f, 16.63f, 19.82f, 17.68f, 18.96f)
                lineTo(19.73f, 21.0f)
                lineTo(21.0f, 19.73f)
                lineTo(12.0f, 10.73f)
                moveTo(19.0f, 12.0f)
                curveTo(19.0f, 12.94f, 18.8f, 13.82f, 18.46f, 14.64f)
                lineTo(19.97f, 16.15f)
                curveTo(20.62f, 14.91f, 21.0f, 13.5f, 21.0f, 12.0f)
                curveTo(21.0f, 7.72f, 18.0f, 4.14f, 14.0f, 3.23f)
                verticalLineTo(5.29f)
                curveTo(16.89f, 6.15f, 19.0f, 8.83f, 19.0f, 12.0f)
                moveTo(16.5f, 12.0f)
                curveTo(16.5f, 10.23f, 15.5f, 8.71f, 14.0f, 7.97f)
                verticalLineTo(10.18f)
                lineTo(16.45f, 12.63f)
                curveTo(16.5f, 12.43f, 16.5f, 12.21f, 16.5f, 12.0f)
                close()
            }
        }
        .build()
        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
