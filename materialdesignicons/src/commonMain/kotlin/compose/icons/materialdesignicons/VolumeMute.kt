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

public val MaterialDesignIcons.VolumeMute: ImageVector
    get() {
        if (_volumeMute != null) {
            return _volumeMute!!
        }
        _volumeMute = Builder(name = "VolumeMute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 9.0f)
                horizontalLineTo(7.0f)
                lineTo(12.0f, 4.0f)
                verticalLineTo(20.0f)
                lineTo(7.0f, 15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                moveTo(16.59f, 12.0f)
                lineTo(14.0f, 9.41f)
                lineTo(15.41f, 8.0f)
                lineTo(18.0f, 10.59f)
                lineTo(20.59f, 8.0f)
                lineTo(22.0f, 9.41f)
                lineTo(19.41f, 12.0f)
                lineTo(22.0f, 14.59f)
                lineTo(20.59f, 16.0f)
                lineTo(18.0f, 13.41f)
                lineTo(15.41f, 16.0f)
                lineTo(14.0f, 14.59f)
                lineTo(16.59f, 12.0f)
                close()
            }
        }
        .build()
        return _volumeMute!!
    }

private var _volumeMute: ImageVector? = null
