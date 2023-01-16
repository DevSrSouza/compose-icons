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

public val MaterialDesignIcons.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                moveTo(2.26f, 16.83f)
                lineTo(5.09f, 14.0f)
                lineTo(2.26f, 11.17f)
                lineTo(3.67f, 9.76f)
                lineTo(6.5f, 12.59f)
                lineTo(9.33f, 9.76f)
                lineTo(10.74f, 11.17f)
                lineTo(7.91f, 14.0f)
                lineTo(10.74f, 16.83f)
                lineTo(9.33f, 18.24f)
                lineTo(6.5f, 15.41f)
                lineTo(3.67f, 18.24f)
                lineTo(2.26f, 16.83f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
