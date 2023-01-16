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

public val MaterialDesignIcons.PacMan: ImageVector
    get() {
        if (_pacMan != null) {
            return _pacMan!!
        }
        _pacMan = Builder(name = "PacMan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                lineTo(19.07f, 19.07f)
                curveTo(15.17f, 23.0f, 8.83f, 23.0f, 4.93f, 19.07f)
                curveTo(1.0f, 15.17f, 1.0f, 8.84f, 4.93f, 4.93f)
                curveTo(8.83f, 1.0f, 15.16f, 1.0f, 19.07f, 4.93f)
                lineTo(12.0f, 12.0f)
                moveTo(19.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 10.0f)
                close()
            }
        }
        .build()
        return _pacMan!!
    }

private var _pacMan: ImageVector? = null
