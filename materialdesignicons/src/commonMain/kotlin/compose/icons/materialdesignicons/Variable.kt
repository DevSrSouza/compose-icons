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

public val MaterialDesignIcons.Variable: ImageVector
    get() {
        if (_variable != null) {
            return _variable!!
        }
        _variable = Builder(name = "Variable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.41f, 3.0f)
                curveTo(21.8f, 5.71f, 22.35f, 8.84f, 22.0f, 12.0f)
                curveTo(21.8f, 15.16f, 20.7f, 18.29f, 18.83f, 21.0f)
                lineTo(17.3f, 20.0f)
                curveTo(18.91f, 17.57f, 19.85f, 14.8f, 20.0f, 12.0f)
                curveTo(20.34f, 9.2f, 19.89f, 6.43f, 18.7f, 4.0f)
                lineTo(20.41f, 3.0f)
                moveTo(5.17f, 3.0f)
                lineTo(6.7f, 4.0f)
                curveTo(5.09f, 6.43f, 4.15f, 9.2f, 4.0f, 12.0f)
                curveTo(3.66f, 14.8f, 4.12f, 17.57f, 5.3f, 20.0f)
                lineTo(3.61f, 21.0f)
                curveTo(2.21f, 18.29f, 1.65f, 15.17f, 2.0f, 12.0f)
                curveTo(2.2f, 8.84f, 3.3f, 5.71f, 5.17f, 3.0f)
                moveTo(12.08f, 10.68f)
                lineTo(14.4f, 7.45f)
                horizontalLineTo(16.93f)
                lineTo(13.15f, 12.45f)
                lineTo(15.35f, 17.37f)
                horizontalLineTo(13.09f)
                lineTo(11.71f, 14.0f)
                lineTo(9.28f, 17.33f)
                horizontalLineTo(6.76f)
                lineTo(10.66f, 12.21f)
                lineTo(8.53f, 7.45f)
                horizontalLineTo(10.8f)
                lineTo(12.08f, 10.68f)
                close()
            }
        }
        .build()
        return _variable!!
    }

private var _variable: ImageVector? = null
