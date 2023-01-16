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

public val MaterialDesignIcons.WaterOff: ImageVector
    get() {
        if (_waterOff != null) {
            return _waterOff!!
        }
        _waterOff = Builder(name = "WaterOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(16.29f, 18.18f)
                curveTo(15.2f, 19.3f, 13.69f, 20.0f, 12.0f, 20.0f)
                curveTo(8.69f, 20.0f, 6.0f, 17.31f, 6.0f, 14.0f)
                curveTo(6.0f, 12.67f, 6.67f, 11.03f, 7.55f, 9.44f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(18.0f, 14.0f)
                curveTo(18.0f, 10.0f, 12.0f, 3.25f, 12.0f, 3.25f)
                reflectiveCurveTo(10.84f, 4.55f, 9.55f, 6.35f)
                lineTo(17.95f, 14.75f)
                curveTo(18.0f, 14.5f, 18.0f, 14.25f, 18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _waterOff!!
    }

private var _waterOff: ImageVector? = null
