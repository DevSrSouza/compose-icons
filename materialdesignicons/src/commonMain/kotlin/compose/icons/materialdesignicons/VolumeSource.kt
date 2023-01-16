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

public val MaterialDesignIcons.VolumeSource: ImageVector
    get() {
        if (_volumeSource != null) {
            return _volumeSource!!
        }
        _volumeSource = Builder(name = "VolumeSource", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                lineTo(12.0f, 20.0f)
                verticalLineTo(4.0f)
                lineTo(7.0f, 9.0f)
                horizontalLineTo(3.0f)
                moveTo(16.0f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                moveTo(20.0f, 19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _volumeSource!!
    }

private var _volumeSource: ImageVector? = null
