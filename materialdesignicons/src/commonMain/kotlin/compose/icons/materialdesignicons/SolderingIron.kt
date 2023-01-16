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

public val MaterialDesignIcons.SolderingIron: ImageVector
    get() {
        if (_solderingIron != null) {
            return _solderingIron!!
        }
        _solderingIron = Builder(name = "SolderingIron", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.86f, 4.03f)
                lineTo(2.03f, 6.86f)
                lineTo(5.21f, 10.04f)
                verticalLineTo(12.87f)
                lineTo(6.63f, 14.28f)
                lineTo(12.28f, 8.63f)
                lineTo(10.87f, 7.21f)
                horizontalLineTo(8.04f)
                lineTo(4.86f, 4.03f)
                moveTo(17.0f, 6.0f)
                verticalLineTo(7.5f)
                curveTo(18.0f, 7.5f, 18.85f, 8.33f, 18.85f, 9.35f)
                curveTo(18.85f, 10.37f, 18.0f, 11.2f, 17.0f, 11.2f)
                verticalLineTo(12.7f)
                curveTo(19.24f, 12.7f, 21.0f, 14.53f, 21.0f, 16.77f)
                verticalLineTo(21.0f)
                horizontalLineTo(22.5f)
                verticalLineTo(16.76f)
                curveTo(22.5f, 14.54f, 21.22f, 12.62f, 19.35f, 11.73f)
                curveTo(19.97f, 11.12f, 20.35f, 10.28f, 20.35f, 9.35f)
                curveTo(20.35f, 7.5f, 18.85f, 6.0f, 17.0f, 6.0f)
                moveTo(11.93f, 11.1f)
                lineTo(9.1f, 13.93f)
                lineTo(14.05f, 18.88f)
                lineTo(14.76f, 18.17f)
                lineTo(16.88f, 20.29f)
                lineTo(19.0f, 21.0f)
                lineTo(18.29f, 18.88f)
                lineTo(16.17f, 16.76f)
                lineTo(16.88f, 16.05f)
                lineTo(11.93f, 11.1f)
                close()
            }
        }
        .build()
        return _solderingIron!!
    }

private var _solderingIron: ImageVector? = null
