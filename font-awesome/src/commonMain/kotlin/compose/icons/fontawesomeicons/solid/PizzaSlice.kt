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
                moveTo(158.87f, 0.15f)
                curveToRelative(-16.16f, -1.52f, -31.2f, 8.42f, -35.33f, 24.12f)
                lineToRelative(-14.81f, 56.27f)
                curveToRelative(187.62f, 5.49f, 314.54f, 130.61f, 322.48f, 317.0f)
                lineToRelative(56.94f, -15.78f)
                curveToRelative(15.72f, -4.36f, 25.49f, -19.68f, 23.62f, -35.9f)
                curveTo(490.89f, 165.08f, 340.78f, 17.32f, 158.87f, 0.15f)
                close()
                moveTo(100.4f, 112.15f)
                lineTo(0.55f, 491.64f)
                arcToRelative(16.21f, 16.21f, 0.0f, false, false, 20.0f, 19.75f)
                lineToRelative(379.0f, -105.1f)
                curveToRelative(-4.27f, -174.89f, -123.08f, -292.14f, -299.15f, -294.1f)
                close()
                moveTo(128.0f, 416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                close()
                moveTo(176.0f, 264.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                close()
                moveTo(280.0f, 368.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _pizzaSlice!!
    }

private var _pizzaSlice: ImageVector? = null
