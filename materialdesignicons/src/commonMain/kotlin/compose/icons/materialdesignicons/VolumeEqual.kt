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

public val MaterialDesignIcons.VolumeEqual: ImageVector
    get() {
        if (_volumeEqual != null) {
            return _volumeEqual!!
        }
        _volumeEqual = Builder(name = "VolumeEqual", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(14.0f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                moveTo(14.0f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _volumeEqual!!
    }

private var _volumeEqual: ImageVector? = null
