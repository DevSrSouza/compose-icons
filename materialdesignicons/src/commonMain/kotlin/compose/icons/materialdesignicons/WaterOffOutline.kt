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

public val MaterialDesignIcons.WaterOffOutline: ImageVector
    get() {
        if (_waterOffOutline != null) {
            return _waterOffOutline!!
        }
        _waterOffOutline = Builder(name = "WaterOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(7.65f, 9.54f)
                curveTo(6.74f, 11.03f, 6.0f, 12.65f, 6.0f, 14.23f)
                curveTo(6.0f, 17.54f, 8.69f, 20.23f, 12.0f, 20.23f)
                curveTo(13.74f, 20.23f, 15.3f, 19.5f, 16.4f, 18.29f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12.0f, 18.23f)
                curveTo(9.78f, 18.23f, 8.0f, 16.45f, 8.0f, 14.23f)
                curveTo(8.0f, 13.5f, 8.5f, 12.27f, 9.14f, 11.03f)
                lineTo(15.0f, 16.88f)
                curveTo(14.26f, 17.71f, 13.2f, 18.23f, 12.0f, 18.23f)
                moveTo(11.14f, 7.94f)
                lineTo(9.71f, 6.5f)
                curveTo(10.57f, 5.38f, 11.25f, 4.61f, 11.25f, 4.61f)
                lineTo(12.0f, 3.77f)
                lineTo(12.75f, 4.61f)
                curveTo(12.75f, 4.61f, 14.03f, 6.06f, 15.32f, 7.94f)
                reflectiveCurveTo(18.0f, 12.07f, 18.0f, 14.23f)
                curveTo(18.0f, 14.41f, 18.0f, 14.59f, 17.97f, 14.77f)
                lineTo(15.46f, 12.26f)
                curveTo(15.0f, 11.23f, 14.37f, 10.07f, 13.68f, 9.07f)
                curveTo(12.84f, 7.85f, 12.44f, 7.42f, 12.0f, 6.9f)
                curveTo(11.73f, 7.21f, 11.5f, 7.5f, 11.14f, 7.94f)
                close()
            }
        }
        .build()
        return _waterOffOutline!!
    }

private var _waterOffOutline: ImageVector? = null
