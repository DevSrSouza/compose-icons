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

public val MaterialDesignIcons.SoySauce: ImageVector
    get() {
        if (_soySauce != null) {
            return _soySauce!!
        }
        _soySauce = Builder(name = "SoySauce", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9f, 7.5f)
                curveTo(13.9f, 6.8f, 14.1f, 6.3f, 14.2f, 6.0f)
                horizontalLineTo(14.8f)
                lineTo(15.7f, 3.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(8.3f)
                lineTo(9.2f, 6.0f)
                horizontalLineTo(9.8f)
                curveTo(10.0f, 6.3f, 10.1f, 6.8f, 10.1f, 7.5f)
                curveTo(10.1f, 8.8f, 6.0f, 13.7f, 6.0f, 17.6f)
                verticalLineTo(19.6f)
                curveTo(6.0f, 21.0f, 8.7f, 21.9f, 12.0f, 21.9f)
                curveTo(15.3f, 21.9f, 18.0f, 21.0f, 18.0f, 19.6f)
                verticalLineTo(17.6f)
                curveTo(18.0f, 13.7f, 13.9f, 8.8f, 13.9f, 7.5f)
                moveTo(12.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _soySauce!!
    }

private var _soySauce: ImageVector? = null
