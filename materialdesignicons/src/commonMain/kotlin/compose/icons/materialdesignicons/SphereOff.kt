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

public val MaterialDesignIcons.SphereOff: ImageVector
    get() {
        if (_sphereOff != null) {
            return _sphereOff!!
        }
        _sphereOff = Builder(name = "SphereOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.06f, 5.95f)
                curveTo(2.77f, 7.63f, 2.0f, 9.72f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(14.28f, 22.0f, 16.37f, 21.23f, 18.05f, 19.94f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(5.5f, 7.39f)
                lineTo(6.58f, 8.47f)
                curveTo(5.87f, 8.62f, 5.18f, 8.8f, 4.57f, 9.05f)
                curveTo(4.81f, 8.45f, 5.13f, 7.9f, 5.5f, 7.39f)
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 11.23f, 5.76f, 10.56f, 8.33f, 10.22f)
                lineTo(12.11f, 14.0f)
                lineTo(12.0f, 14.0f)
                curveTo(7.58f, 14.0f, 4.0f, 13.11f, 4.0f, 12.0f)
                moveTo(12.0f, 20.0f)
                curveTo(8.63f, 20.0f, 5.75f, 17.91f, 4.57f, 14.95f)
                curveTo(6.07f, 15.57f, 8.39f, 16.0f, 12.0f, 16.0f)
                curveTo(12.63f, 16.0f, 13.33f, 16.0f, 14.05f, 15.94f)
                lineTo(16.63f, 18.5f)
                curveTo(15.32f, 19.45f, 13.73f, 20.0f, 12.0f, 20.0f)
                moveTo(8.19f, 5.0f)
                lineTo(6.72f, 3.5f)
                curveTo(8.25f, 2.56f, 10.06f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                curveTo(22.0f, 13.94f, 21.44f, 15.75f, 20.5f, 17.28f)
                lineTo(19.0f, 15.81f)
                curveTo(19.17f, 15.54f, 19.31f, 15.25f, 19.43f, 14.96f)
                curveTo(19.13f, 15.08f, 18.81f, 15.18f, 18.47f, 15.27f)
                lineTo(16.8f, 13.6f)
                curveTo(18.74f, 13.23f, 20.0f, 12.65f, 20.0f, 12.0f)
                curveTo(20.0f, 11.0f, 17.06f, 10.17f, 13.23f, 10.03f)
                lineTo(11.21f, 8.0f)
                curveTo(11.5f, 8.0f, 11.75f, 8.0f, 12.0f, 8.0f)
                curveTo(15.61f, 8.0f, 17.93f, 8.43f, 19.43f, 9.05f)
                curveTo(18.25f, 6.09f, 15.37f, 4.0f, 12.0f, 4.0f)
                curveTo(10.61f, 4.0f, 9.32f, 4.36f, 8.19f, 5.0f)
                close()
            }
        }
        .build()
        return _sphereOff!!
    }

private var _sphereOff: ImageVector? = null
