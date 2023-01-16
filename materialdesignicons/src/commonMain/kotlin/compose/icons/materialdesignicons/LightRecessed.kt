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

public val MaterialDesignIcons.LightRecessed: ImageVector
    get() {
        if (_lightRecessed != null) {
            return _lightRecessed!!
        }
        _lightRecessed = Builder(name = "LightRecessed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveTo(6.5f, 7.0f, 2.0f, 9.46f, 2.0f, 12.5f)
                reflectiveCurveTo(6.5f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveTo(22.0f, 15.54f, 22.0f, 12.5f)
                reflectiveCurveTo(17.5f, 7.0f, 12.0f, 7.0f)
                moveTo(16.5f, 10.0f)
                curveTo(16.5f, 10.4f, 14.9f, 11.54f, 12.0f, 11.54f)
                reflectiveCurveTo(7.5f, 10.4f, 7.5f, 10.0f)
                curveTo(7.5f, 9.91f, 7.65f, 9.74f, 7.9f, 9.55f)
                curveTo(9.06f, 9.21f, 10.44f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(14.94f, 9.21f, 16.1f, 9.55f)
                curveTo(16.35f, 9.74f, 16.5f, 9.91f, 16.5f, 10.0f)
                moveTo(12.0f, 16.0f)
                curveTo(7.12f, 16.0f, 4.0f, 13.93f, 4.0f, 12.5f)
                curveTo(4.0f, 11.81f, 4.73f, 11.0f, 6.03f, 10.29f)
                curveTo(6.3f, 11.83f, 8.87f, 13.04f, 12.0f, 13.04f)
                curveTo(15.13f, 13.04f, 17.7f, 11.83f, 17.97f, 10.29f)
                curveTo(19.27f, 11.0f, 20.0f, 11.81f, 20.0f, 12.5f)
                curveTo(20.0f, 13.93f, 16.88f, 16.0f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _lightRecessed!!
    }

private var _lightRecessed: ImageVector? = null
