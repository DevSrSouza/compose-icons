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

public val MaterialDesignIcons.CylinderOff: ImageVector
    get() {
        if (_cylinderOff != null) {
            return _cylinderOff!!
        }
        _cylinderOff = Builder(name = "CylinderOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.64f, 4.44f)
                lineTo(6.03f, 2.83f)
                curveTo(8.15f, 2.1f, 10.82f, 2.0f, 12.0f, 2.0f)
                curveTo(14.11f, 2.0f, 21.0f, 2.29f, 21.0f, 6.0f)
                verticalLineTo(17.8f)
                lineTo(18.06f, 14.86f)
                curveTo(18.39f, 14.97f, 18.7f, 15.1f, 19.0f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(17.28f, 9.63f, 14.82f, 9.89f, 13.17f, 9.97f)
                lineTo(11.18f, 8.0f)
                curveTo(11.45f, 8.0f, 11.72f, 8.0f, 12.0f, 8.0f)
                curveTo(15.87f, 8.0f, 19.0f, 7.11f, 19.0f, 6.0f)
                reflectiveCurveTo(15.87f, 4.0f, 12.0f, 4.0f)
                curveTo(10.35f, 4.0f, 8.84f, 4.17f, 7.64f, 4.44f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.91f, 20.8f)
                curveTo(16.7f, 21.87f, 13.36f, 22.0f, 12.0f, 22.0f)
                curveTo(9.89f, 22.0f, 3.0f, 21.71f, 3.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 5.66f, 3.08f, 5.36f, 3.18f, 5.07f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(5.0f, 15.25f)
                curveTo(7.2f, 14.13f, 10.62f, 14.0f, 12.0f, 14.0f)
                lineTo(12.11f, 14.0f)
                lineTo(7.73f, 9.62f)
                curveTo(6.76f, 9.43f, 5.8f, 9.15f, 5.0f, 8.75f)
                verticalLineTo(15.25f)
                moveTo(17.39f, 19.28f)
                lineTo(14.21f, 16.1f)
                curveTo(13.5f, 16.04f, 12.78f, 16.0f, 12.0f, 16.0f)
                curveTo(8.13f, 16.0f, 5.0f, 16.9f, 5.0f, 18.0f)
                reflectiveCurveTo(8.13f, 20.0f, 12.0f, 20.0f)
                curveTo(14.17f, 20.0f, 16.1f, 19.72f, 17.39f, 19.28f)
                close()
            }
        }
        .build()
        return _cylinderOff!!
    }

private var _cylinderOff: ImageVector? = null
