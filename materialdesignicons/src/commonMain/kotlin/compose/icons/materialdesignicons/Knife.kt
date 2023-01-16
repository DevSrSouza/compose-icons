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

public val MaterialDesignIcons.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.62f, 2.0f)
                curveTo(23.97f, 7.61f, 12.47f, 20.15f, 12.47f, 20.15f)
                lineTo(9.6f, 17.28f)
                lineTo(4.91f, 22.0f)
                lineTo(2.77f, 19.86f)
                lineTo(20.62f, 2.0f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null
