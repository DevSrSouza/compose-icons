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

public val MaterialDesignIcons.ImageOff: ImageVector
    get() {
        if (_imageOff != null) {
            return _imageOff!!
        }
        _imageOff = Builder(name = "ImageOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.2f)
                lineTo(6.8f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(17.2f)
                moveTo(20.7f, 22.0f)
                lineTo(19.7f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(4.3f)
                lineTo(2.0f, 3.3f)
                lineTo(3.3f, 2.0f)
                lineTo(22.0f, 20.7f)
                lineTo(20.7f, 22.0f)
                moveTo(16.8f, 18.0f)
                lineTo(12.9f, 14.1f)
                lineTo(11.0f, 16.5f)
                lineTo(8.5f, 13.5f)
                lineTo(5.0f, 18.0f)
                horizontalLineTo(16.8f)
                close()
            }
        }
        .build()
        return _imageOff!!
    }

private var _imageOff: ImageVector? = null
