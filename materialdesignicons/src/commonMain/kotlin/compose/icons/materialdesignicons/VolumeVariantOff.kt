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

public val MaterialDesignIcons.VolumeVariantOff: ImageVector
    get() {
        if (_volumeVariantOff != null) {
            return _volumeVariantOff!!
        }
        _volumeVariantOff = Builder(name = "VolumeVariantOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.64f, 3.64f)
                lineTo(21.36f, 19.36f)
                lineTo(19.95f, 20.78f)
                lineTo(16.0f, 16.83f)
                verticalLineTo(20.0f)
                lineTo(11.0f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.17f)
                lineTo(4.22f, 5.05f)
                lineTo(5.64f, 3.64f)
                moveTo(16.0f, 4.0f)
                verticalLineTo(11.17f)
                lineTo(12.41f, 7.58f)
                lineTo(16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _volumeVariantOff!!
    }

private var _volumeVariantOff: ImageVector? = null
