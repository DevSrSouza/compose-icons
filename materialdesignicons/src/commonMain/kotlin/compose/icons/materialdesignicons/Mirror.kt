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

public val MaterialDesignIcons.Mirror: ImageVector
    get() {
        if (_mirror != null) {
            return _mirror!!
        }
        _mirror = Builder(name = "Mirror", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(16.69f, 1.0f, 20.5f, 5.93f, 20.5f, 12.0f)
                curveTo(20.5f, 18.08f, 16.69f, 23.0f, 12.0f, 23.0f)
                curveTo(7.31f, 23.0f, 3.5f, 18.08f, 3.5f, 12.0f)
                curveTo(3.5f, 5.93f, 7.31f, 1.0f, 12.0f, 1.0f)
                moveTo(12.0f, 3.0f)
                curveTo(8.41f, 3.0f, 5.5f, 7.03f, 5.5f, 12.0f)
                curveTo(5.5f, 16.97f, 8.41f, 21.0f, 12.0f, 21.0f)
                curveTo(15.59f, 21.0f, 18.5f, 16.97f, 18.5f, 12.0f)
                curveTo(18.5f, 7.03f, 15.59f, 3.0f, 12.0f, 3.0f)
                moveTo(8.29f, 10.28f)
                lineTo(11.53f, 7.03f)
                lineTo(12.59f, 8.09f)
                lineTo(9.35f, 11.34f)
                lineTo(8.29f, 10.28f)
                moveTo(8.7f, 14.61f)
                lineTo(14.36f, 8.95f)
                lineTo(15.42f, 10.0f)
                lineTo(9.76f, 15.67f)
                lineTo(8.7f, 14.61f)
                close()
            }
        }
        .build()
        return _mirror!!
    }

private var _mirror: ImageVector? = null
