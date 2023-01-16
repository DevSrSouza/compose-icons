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

public val MaterialDesignIcons.DivingScuba: ImageVector
    get() {
        if (_divingScuba != null) {
            return _divingScuba!!
        }
        _divingScuba = Builder(name = "DivingScuba", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 13.0f)
                curveTo(1.0f, 11.9f, 1.9f, 11.0f, 3.0f, 11.0f)
                reflectiveCurveTo(5.0f, 11.9f, 5.0f, 13.0f)
                reflectiveCurveTo(4.1f, 15.0f, 3.0f, 15.0f)
                reflectiveCurveTo(1.0f, 14.1f, 1.0f, 13.0f)
                moveTo(8.89f, 10.11f)
                lineTo(13.42f, 8.9f)
                lineTo(12.64f, 6.0f)
                lineTo(8.11f, 7.21f)
                curveTo(7.31f, 7.42f, 6.83f, 8.25f, 7.05f, 9.05f)
                curveTo(7.27f, 9.85f, 8.09f, 10.33f, 8.89f, 10.11f)
                moveTo(20.5f, 5.9f)
                lineTo(23.0f, 3.0f)
                lineTo(22.0f, 2.0f)
                lineTo(19.0f, 5.0f)
                lineTo(17.0f, 9.0f)
                lineTo(7.5f, 11.87f)
                curveTo(6.7f, 12.07f, 6.13f, 12.76f, 6.0f, 13.55f)
                lineTo(5.24f, 18.0f)
                lineTo(2.4f, 21.8f)
                lineTo(4.0f, 23.0f)
                lineTo(7.0f, 19.0f)
                lineTo(8.14f, 15.86f)
                lineTo(14.0f, 14.0f)
                lineTo(19.0f, 10.5f)
                lineTo(20.5f, 5.9f)
                close()
            }
        }
        .build()
        return _divingScuba!!
    }

private var _divingScuba: ImageVector? = null
