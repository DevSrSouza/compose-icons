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

public val MaterialDesignIcons.MoonWaxingGibbous: ImageVector
    get() {
        if (_moonWaxingGibbous != null) {
            return _moonWaxingGibbous!!
        }
        _moonWaxingGibbous = Builder(name = "MoonWaxingGibbous", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                curveTo(6.0f, 7.5f, 7.93f, 3.26f, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(7.93f, 20.74f, 6.0f, 16.5f, 6.0f, 12.0f)
                close()
            }
        }
        .build()
        return _moonWaxingGibbous!!
    }

private var _moonWaxingGibbous: ImageVector? = null