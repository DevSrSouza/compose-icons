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

public val MaterialDesignIcons.VolumeVibrate: ImageVector
    get() {
        if (_volumeVibrate != null) {
            return _volumeVibrate!!
        }
        _volumeVibrate = Builder(name = "VolumeVibrate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                lineTo(13.0f, 20.0f)
                verticalLineTo(4.0f)
                lineTo(8.0f, 9.0f)
                horizontalLineTo(4.0f)
                moveTo(16.55f, 2.47f)
                lineTo(15.5f, 3.53f)
                lineTo(17.93f, 6.0f)
                lineTo(15.0f, 9.0f)
                lineTo(17.93f, 12.0f)
                lineTo(15.0f, 15.0f)
                lineTo(17.93f, 18.0f)
                lineTo(15.5f, 20.47f)
                lineTo(16.55f, 21.53f)
                lineTo(20.0f, 18.0f)
                lineTo(17.07f, 15.0f)
                lineTo(20.0f, 12.0f)
                lineTo(17.07f, 9.0f)
                lineTo(20.0f, 6.0f)
                lineTo(16.55f, 2.47f)
                close()
            }
        }
        .build()
        return _volumeVibrate!!
    }

private var _volumeVibrate: ImageVector? = null
