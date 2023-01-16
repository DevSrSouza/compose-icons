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

public val MaterialDesignIcons.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 6.05f)
                curveTo(17.25f, 3.22f, 14.89f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(6.75f, 3.22f, 6.5f, 6.05f)
                curveTo(5.09f, 6.28f, 4.0f, 7.5f, 4.0f, 9.0f)
                curveTo(4.0f, 10.66f, 5.34f, 12.0f, 7.0f, 12.0f)
                lineTo(12.0f, 22.0f)
                lineTo(17.0f, 12.0f)
                curveTo(18.66f, 12.0f, 20.0f, 10.66f, 20.0f, 9.0f)
                curveTo(20.0f, 7.5f, 18.91f, 6.28f, 17.5f, 6.05f)
                moveTo(12.0f, 17.53f)
                lineTo(8.89f, 11.31f)
                curveTo(8.95f, 11.26f, 9.0f, 11.21f, 9.08f, 11.16f)
                curveTo(9.93f, 11.69f, 10.93f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveTo(14.07f, 11.69f, 14.92f, 11.16f)
                curveTo(15.0f, 11.21f, 15.05f, 11.26f, 15.11f, 11.31f)
                lineTo(12.0f, 17.53f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
