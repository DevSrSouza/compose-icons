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

public val MaterialDesignIcons.WaterCircle: ImageVector
    get() {
        if (_waterCircle != null) {
            return _waterCircle!!
        }
        _waterCircle = Builder(name = "WaterCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 19.0f)
                curveTo(9.24f, 19.0f, 7.0f, 16.76f, 7.0f, 14.0f)
                curveTo(7.0f, 10.67f, 12.0f, 5.04f, 12.0f, 5.04f)
                reflectiveCurveTo(17.0f, 10.67f, 17.0f, 14.0f)
                curveTo(17.0f, 16.76f, 14.76f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _waterCircle!!
    }

private var _waterCircle: ImageVector? = null
