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

public val MaterialDesignIcons.FountainPen: ImageVector
    get() {
        if (_fountainPen != null) {
            return _fountainPen!!
        }
        _fountainPen = Builder(name = "FountainPen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.95f, 14.93f)
                lineTo(11.19f, 9.27f)
                lineTo(19.68f, 2.2f)
                curveTo(20.07f, 1.81f, 20.72f, 1.81f, 21.09f, 2.2f)
                lineTo(21.8f, 2.91f)
                curveTo(22.19f, 3.28f, 22.19f, 3.93f, 21.8f, 4.32f)
                lineTo(14.73f, 12.81f)
                lineTo(9.07f, 17.05f)
                lineTo(6.95f, 14.93f)
                moveTo(8.36f, 17.76f)
                lineTo(6.24f, 15.64f)
                lineTo(3.41f, 17.05f)
                lineTo(2.0f, 21.29f)
                lineTo(4.12f, 19.17f)
                curveTo(4.32f, 19.0f, 4.63f, 19.0f, 4.83f, 19.17f)
                curveTo(5.0f, 19.37f, 5.0f, 19.68f, 4.83f, 19.88f)
                lineTo(2.71f, 22.0f)
                lineTo(6.95f, 20.59f)
                lineTo(8.36f, 17.76f)
                close()
            }
        }
        .build()
        return _fountainPen!!
    }

private var _fountainPen: ImageVector? = null
