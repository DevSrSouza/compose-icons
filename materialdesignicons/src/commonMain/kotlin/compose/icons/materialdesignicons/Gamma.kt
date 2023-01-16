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

public val MaterialDesignIcons.Gamma: ImageVector
    get() {
        if (_gamma != null) {
            return _gamma!!
        }
        _gamma = Builder(name = "Gamma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.76f, 19.0f)
                curveTo(12.92f, 19.0f, 13.58f, 18.0f, 13.58f, 16.29f)
                curveTo(13.58f, 15.2f, 13.5f, 13.88f, 13.3f, 12.67f)
                lineTo(18.0f, 5.0f)
                horizontalLineTo(15.28f)
                lineTo(12.71f, 9.82f)
                lineTo(12.55f, 9.33f)
                curveTo(11.83f, 7.19f, 10.82f, 5.0f, 8.68f, 5.0f)
                curveTo(8.0f, 5.0f, 7.45f, 5.18f, 7.0f, 5.54f)
                curveTo(6.0f, 6.39f, 6.0f, 8.0f, 6.0f, 8.5f)
                horizontalLineTo(6.91f)
                curveTo(6.97f, 8.06f, 7.21f, 6.83f, 8.25f, 6.83f)
                curveTo(10.0f, 6.83f, 10.8f, 10.0f, 11.4f, 12.42f)
                curveTo(10.5f, 14.58f, 10.0f, 16.14f, 10.0f, 16.97f)
                curveTo(10.0f, 17.95f, 10.56f, 19.0f, 11.76f, 19.0f)
            }
        }
        .build()
        return _gamma!!
    }

private var _gamma: ImageVector? = null
