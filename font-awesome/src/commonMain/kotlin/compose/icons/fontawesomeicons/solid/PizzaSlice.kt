package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PizzaSlice: ImageVector
    get() {
        if (_pizzaSlice != null) {
            return _pizzaSlice!!
        }
        _pizzaSlice = Builder(name = "PizzaSlice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(169.7f, 0.9f)
                curveToRelative(-22.8f, -1.6f, -41.9f, 14.0f, -47.5f, 34.7f)
                lineTo(110.4f, 80.0f)
                curveToRelative(0.5f, 0.0f, 1.1f, 0.0f, 1.6f, 0.0f)
                curveToRelative(176.7f, 0.0f, 320.0f, 143.3f, 320.0f, 320.0f)
                curveToRelative(0.0f, 0.5f, 0.0f, 1.1f, 0.0f, 1.6f)
                lineToRelative(44.4f, -11.8f)
                curveToRelative(20.8f, -5.5f, 36.3f, -24.7f, 34.7f, -47.5f)
                curveTo(498.5f, 159.5f, 352.5f, 13.5f, 169.7f, 0.9f)
                close()
                moveTo(399.8f, 410.2f)
                curveToRelative(0.1f, -3.4f, 0.2f, -6.8f, 0.2f, -10.2f)
                curveToRelative(0.0f, -159.1f, -128.9f, -288.0f, -288.0f, -288.0f)
                curveToRelative(-3.4f, 0.0f, -6.8f, 0.1f, -10.2f, 0.2f)
                lineTo(0.5f, 491.9f)
                curveToRelative(-1.5f, 5.5f, 0.1f, 11.4f, 4.1f, 15.4f)
                reflectiveCurveToRelative(9.9f, 5.6f, 15.4f, 4.1f)
                lineTo(399.8f, 410.2f)
                close()
                moveTo(176.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(240.0f, 336.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(96.0f, 384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pizzaSlice!!
    }

private var _pizzaSlice: ImageVector? = null
