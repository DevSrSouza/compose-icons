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

public val MaterialDesignIcons.InvertColors: ImageVector
    get() {
        if (_invertColors != null) {
            return _invertColors!!
        }
        _invertColors = Builder(name = "InvertColors", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.58f)
                verticalLineTo(19.58f)
                curveTo(10.4f, 19.58f, 8.89f, 18.96f, 7.76f, 17.83f)
                curveTo(6.62f, 16.69f, 6.0f, 15.19f, 6.0f, 13.58f)
                curveTo(6.0f, 12.0f, 6.62f, 10.47f, 7.76f, 9.34f)
                lineTo(12.0f, 5.1f)
                moveTo(17.66f, 7.93f)
                lineTo(12.0f, 2.27f)
                verticalLineTo(2.27f)
                lineTo(6.34f, 7.93f)
                curveTo(3.22f, 11.05f, 3.22f, 16.12f, 6.34f, 19.24f)
                curveTo(7.9f, 20.8f, 9.95f, 21.58f, 12.0f, 21.58f)
                curveTo(14.05f, 21.58f, 16.1f, 20.8f, 17.66f, 19.24f)
                curveTo(20.78f, 16.12f, 20.78f, 11.05f, 17.66f, 7.93f)
                close()
            }
        }
        .build()
        return _invertColors!!
    }

private var _invertColors: ImageVector? = null
