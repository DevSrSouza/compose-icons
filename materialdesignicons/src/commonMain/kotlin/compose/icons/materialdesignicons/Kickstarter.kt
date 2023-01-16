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

public val MaterialDesignIcons.Kickstarter: ImageVector
    get() {
        if (_kickstarter != null) {
            return _kickstarter!!
        }
        _kickstarter = Builder(name = "Kickstarter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.3f, 10.2f)
                lineTo(17.5f, 12.0f)
                lineTo(19.3f, 13.8f)
                curveTo(21.19f, 15.67f, 21.19f, 18.72f, 19.3f, 20.59f)
                curveTo(17.42f, 22.46f, 14.35f, 22.46f, 12.47f, 20.59f)
                lineTo(11.8f, 19.93f)
                curveTo(10.93f, 21.19f, 9.5f, 22.0f, 7.83f, 22.0f)
                curveTo(5.16f, 22.0f, 3.0f, 19.85f, 3.0f, 17.2f)
                verticalLineTo(6.8f)
                curveTo(3.0f, 4.15f, 5.16f, 2.0f, 7.83f, 2.0f)
                curveTo(9.5f, 2.0f, 10.93f, 2.82f, 11.8f, 4.07f)
                lineTo(12.47f, 3.41f)
                curveTo(14.35f, 1.54f, 17.42f, 1.54f, 19.3f, 3.41f)
                curveTo(21.19f, 5.28f, 21.19f, 8.33f, 19.3f, 10.2f)
                close()
            }
        }
        .build()
        return _kickstarter!!
    }

private var _kickstarter: ImageVector? = null
