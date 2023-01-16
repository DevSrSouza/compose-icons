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

public val MaterialDesignIcons.GreasePencil: ImageVector
    get() {
        if (_greasePencil != null) {
            return _greasePencil!!
        }
        _greasePencil = Builder(name = "GreasePencil", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.62f, 1.5f)
                curveTo(18.11f, 1.5f, 17.6f, 1.69f, 17.21f, 2.09f)
                lineTo(10.75f, 8.55f)
                lineTo(14.95f, 12.74f)
                lineTo(21.41f, 6.29f)
                curveTo(22.2f, 5.5f, 22.2f, 4.24f, 21.41f, 3.46f)
                lineTo(20.04f, 2.09f)
                curveTo(19.65f, 1.69f, 19.14f, 1.5f, 18.62f, 1.5f)
                moveTo(9.8f, 9.5f)
                lineTo(3.23f, 16.07f)
                lineTo(3.93f, 16.77f)
                curveTo(3.4f, 17.24f, 2.89f, 17.78f, 2.38f, 18.29f)
                curveTo(1.6f, 19.08f, 1.6f, 20.34f, 2.38f, 21.12f)
                curveTo(3.16f, 21.9f, 4.42f, 21.9f, 5.21f, 21.12f)
                curveTo(5.72f, 20.63f, 6.25f, 20.08f, 6.73f, 19.58f)
                lineTo(7.43f, 20.27f)
                lineTo(14.0f, 13.7f)
            }
        }
        .build()
        return _greasePencil!!
    }

private var _greasePencil: ImageVector? = null
