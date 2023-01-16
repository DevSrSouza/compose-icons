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

public val MaterialDesignIcons.ImageOffOutline: ImageVector
    get() {
        if (_imageOffOutline != null) {
            return _imageOffOutline!!
        }
        _imageOffOutline = Builder(name = "ImageOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.7f)
                lineTo(3.3f, 2.0f)
                lineTo(2.0f, 3.3f)
                lineTo(3.0f, 4.3f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.7f)
                lineTo(20.7f, 22.0f)
                lineTo(22.0f, 20.7f)
                moveTo(5.0f, 19.0f)
                verticalLineTo(6.3f)
                lineTo(12.6f, 13.9f)
                lineTo(11.1f, 15.8f)
                lineTo(9.0f, 13.1f)
                lineTo(6.0f, 17.0f)
                horizontalLineTo(15.7f)
                lineTo(17.7f, 19.0f)
                horizontalLineTo(5.0f)
                moveTo(8.8f, 5.0f)
                lineTo(6.8f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(17.2f)
                lineTo(19.0f, 15.2f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.8f)
            }
        }
        .build()
        return _imageOffOutline!!
    }

private var _imageOffOutline: ImageVector? = null
