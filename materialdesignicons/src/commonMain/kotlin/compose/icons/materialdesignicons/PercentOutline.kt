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

public val MaterialDesignIcons.PercentOutline: ImageVector
    get() {
        if (_percentOutline != null) {
            return _percentOutline!!
        }
        _percentOutline = Builder(name = "PercentOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 3.5f)
                lineTo(20.5f, 5.5f)
                lineTo(5.5f, 20.5f)
                lineTo(3.5f, 18.5f)
                lineTo(18.5f, 3.5f)
                moveTo(7.0f, 4.0f)
                curveTo(8.66f, 4.0f, 10.0f, 5.34f, 10.0f, 7.0f)
                curveTo(10.0f, 8.66f, 8.66f, 10.0f, 7.0f, 10.0f)
                curveTo(5.34f, 10.0f, 4.0f, 8.66f, 4.0f, 7.0f)
                curveTo(4.0f, 5.34f, 5.34f, 4.0f, 7.0f, 4.0f)
                moveTo(17.0f, 14.0f)
                curveTo(18.66f, 14.0f, 20.0f, 15.34f, 20.0f, 17.0f)
                curveTo(20.0f, 18.66f, 18.66f, 20.0f, 17.0f, 20.0f)
                curveTo(15.34f, 20.0f, 14.0f, 18.66f, 14.0f, 17.0f)
                curveTo(14.0f, 15.34f, 15.34f, 14.0f, 17.0f, 14.0f)
                moveTo(7.0f, 6.0f)
                curveTo(6.45f, 6.0f, 6.0f, 6.45f, 6.0f, 7.0f)
                curveTo(6.0f, 7.55f, 6.45f, 8.0f, 7.0f, 8.0f)
                curveTo(7.55f, 8.0f, 8.0f, 7.55f, 8.0f, 7.0f)
                curveTo(8.0f, 6.45f, 7.55f, 6.0f, 7.0f, 6.0f)
                moveTo(17.0f, 16.0f)
                curveTo(16.45f, 16.0f, 16.0f, 16.45f, 16.0f, 17.0f)
                curveTo(16.0f, 17.55f, 16.45f, 18.0f, 17.0f, 18.0f)
                curveTo(17.55f, 18.0f, 18.0f, 17.55f, 18.0f, 17.0f)
                curveTo(18.0f, 16.45f, 17.55f, 16.0f, 17.0f, 16.0f)
                close()
            }
        }
        .build()
        return _percentOutline!!
    }

private var _percentOutline: ImageVector? = null
