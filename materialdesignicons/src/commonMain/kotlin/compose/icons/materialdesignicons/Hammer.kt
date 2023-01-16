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

public val MaterialDesignIcons.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 19.63f)
                lineTo(13.43f, 8.2f)
                lineTo(12.72f, 7.5f)
                lineTo(14.14f, 6.07f)
                lineTo(12.0f, 3.89f)
                curveTo(13.2f, 2.7f, 15.09f, 2.7f, 16.27f, 3.89f)
                lineTo(19.87f, 7.5f)
                lineTo(18.45f, 8.91f)
                horizontalLineTo(21.29f)
                lineTo(22.0f, 9.62f)
                lineTo(18.45f, 13.21f)
                lineTo(17.74f, 12.5f)
                verticalLineTo(9.62f)
                lineTo(16.27f, 11.04f)
                lineTo(15.56f, 10.33f)
                lineTo(4.13f, 21.76f)
                lineTo(2.0f, 19.63f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
