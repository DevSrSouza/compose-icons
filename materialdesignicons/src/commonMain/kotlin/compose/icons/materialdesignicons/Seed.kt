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

public val MaterialDesignIcons.Seed: ImageVector
    get() {
        if (_seed != null) {
            return _seed!!
        }
        _seed = Builder(name = "Seed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7f, 3.3f)
                curveTo(20.7f, 3.3f, 19.3f, 3.0f, 17.2f, 3.0f)
                curveTo(11.7f, 3.0f, 1.6f, 5.1f, 3.2f, 20.8f)
                curveTo(4.3f, 20.9f, 5.4f, 21.0f, 6.4f, 21.0f)
                curveTo(24.3f, 21.0f, 20.7f, 3.3f, 20.7f, 3.3f)
                moveTo(7.0f, 17.0f)
                curveTo(7.0f, 17.0f, 7.0f, 7.0f, 17.0f, 7.0f)
                curveTo(17.0f, 7.0f, 11.0f, 9.0f, 7.0f, 17.0f)
                close()
            }
        }
        .build()
        return _seed!!
    }

private var _seed: ImageVector? = null
