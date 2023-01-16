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

public val MaterialDesignIcons.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 1.15f)
                curveTo(17.97f, 1.15f, 17.46f, 1.34f, 17.07f, 1.73f)
                lineTo(11.26f, 7.55f)
                lineTo(16.91f, 13.2f)
                lineTo(22.73f, 7.39f)
                curveTo(23.5f, 6.61f, 23.5f, 5.35f, 22.73f, 4.56f)
                lineTo(19.89f, 1.73f)
                curveTo(19.5f, 1.34f, 19.0f, 1.15f, 18.5f, 1.15f)
                moveTo(10.3f, 8.5f)
                lineTo(4.34f, 14.46f)
                curveTo(3.56f, 15.24f, 3.56f, 16.5f, 4.36f, 17.31f)
                curveTo(3.14f, 18.54f, 1.9f, 19.77f, 0.67f, 21.0f)
                horizontalLineTo(6.33f)
                lineTo(7.19f, 20.14f)
                curveTo(7.97f, 20.9f, 9.22f, 20.89f, 10.0f, 20.12f)
                lineTo(15.95f, 14.16f)
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
