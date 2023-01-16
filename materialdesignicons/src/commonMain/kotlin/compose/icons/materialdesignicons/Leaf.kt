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

public val MaterialDesignIcons.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                curveTo(8.0f, 10.0f, 5.9f, 16.17f, 3.82f, 21.34f)
                lineTo(5.71f, 22.0f)
                lineTo(6.66f, 19.7f)
                curveTo(7.14f, 19.87f, 7.64f, 20.0f, 8.0f, 20.0f)
                curveTo(19.0f, 20.0f, 22.0f, 3.0f, 22.0f, 3.0f)
                curveTo(21.0f, 5.0f, 14.0f, 5.25f, 9.0f, 6.25f)
                curveTo(4.0f, 7.25f, 2.0f, 11.5f, 2.0f, 13.5f)
                curveTo(2.0f, 15.5f, 3.75f, 17.25f, 3.75f, 17.25f)
                curveTo(7.0f, 8.0f, 17.0f, 8.0f, 17.0f, 8.0f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
