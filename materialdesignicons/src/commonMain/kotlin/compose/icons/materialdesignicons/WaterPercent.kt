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

public val MaterialDesignIcons.WaterPercent: ImageVector
    get() {
        if (_waterPercent != null) {
            return _waterPercent!!
        }
        _waterPercent = Builder(name = "WaterPercent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.25f)
                curveTo(12.0f, 3.25f, 6.0f, 10.0f, 6.0f, 14.0f)
                curveTo(6.0f, 17.32f, 8.69f, 20.0f, 12.0f, 20.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 14.0f)
                curveTo(18.0f, 10.0f, 12.0f, 3.25f, 12.0f, 3.25f)
                moveTo(14.47f, 9.97f)
                lineTo(15.53f, 11.03f)
                lineTo(9.53f, 17.03f)
                lineTo(8.47f, 15.97f)
                moveTo(9.75f, 10.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 11.0f, 11.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 9.75f, 12.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 8.5f, 11.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 9.75f, 10.0f)
                moveTo(14.25f, 14.5f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 15.5f, 15.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 14.25f, 17.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 13.0f, 15.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 14.25f, 14.5f)
                close()
            }
        }
        .build()
        return _waterPercent!!
    }

private var _waterPercent: ImageVector? = null
