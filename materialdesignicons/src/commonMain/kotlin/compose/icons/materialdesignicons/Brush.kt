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

public val MaterialDesignIcons.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 4.63f)
                lineTo(19.37f, 3.29f)
                curveTo(19.0f, 2.9f, 18.35f, 2.9f, 17.96f, 3.29f)
                lineTo(9.0f, 12.25f)
                lineTo(11.75f, 15.0f)
                lineTo(20.71f, 6.04f)
                curveTo(21.1f, 5.65f, 21.1f, 5.0f, 20.71f, 4.63f)
                moveTo(7.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 17.0f)
                curveTo(4.0f, 18.31f, 2.84f, 19.0f, 2.0f, 19.0f)
                curveTo(2.92f, 20.22f, 4.5f, 21.0f, 6.0f, 21.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 14.0f)
                close()
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
