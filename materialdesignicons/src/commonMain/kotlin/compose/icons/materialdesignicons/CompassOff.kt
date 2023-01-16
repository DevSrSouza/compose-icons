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

public val MaterialDesignIcons.CompassOff: ImageVector
    get() {
        if (_compassOff != null) {
            return _compassOff!!
        }
        _compassOff = Builder(name = "CompassOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 3.5f)
                lineTo(2.28f, 2.25f)
                lineTo(21.75f, 21.72f)
                lineTo(20.5f, 23.0f)
                lineTo(17.7f, 20.22f)
                curveTo(16.08f, 21.34f, 14.12f, 22.0f, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 9.88f, 2.66f, 7.92f, 3.78f, 6.3f)
                lineTo(1.0f, 3.5f)
                moveTo(6.0f, 18.0f)
                lineTo(12.47f, 15.0f)
                lineTo(9.0f, 11.53f)
                lineTo(6.0f, 18.0f)
                moveTo(18.0f, 6.0f)
                lineTo(11.56f, 9.0f)
                lineTo(6.33f, 3.76f)
                curveTo(7.94f, 2.65f, 9.9f, 2.0f, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                curveTo(22.0f, 14.1f, 21.35f, 16.06f, 20.24f, 17.67f)
                lineTo(15.0f, 12.44f)
                lineTo(18.0f, 6.0f)
                close()
            }
        }
        .build()
        return _compassOff!!
    }

private var _compassOff: ImageVector? = null
