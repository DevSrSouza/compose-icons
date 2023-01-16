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

public val MaterialDesignIcons.MotionPlayOutline: ImageVector
    get() {
        if (_motionPlayOutline != null) {
            return _motionPlayOutline!!
        }
        _motionPlayOutline = Builder(name = "MotionPlayOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 16.5f)
                lineTo(16.0f, 12.0f)
                lineTo(10.0f, 7.5f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 6.46f, 17.54f, 2.0f, 12.0f, 2.0f)
                curveTo(10.83f, 2.0f, 9.7f, 2.19f, 8.62f, 2.56f)
                lineTo(9.32f, 4.5f)
                curveTo(10.17f, 4.16f, 11.06f, 3.97f, 12.0f, 3.97f)
                curveTo(16.41f, 3.97f, 20.03f, 7.59f, 20.03f, 12.0f)
                curveTo(20.03f, 16.41f, 16.41f, 20.03f, 12.0f, 20.03f)
                curveTo(7.59f, 20.03f, 3.97f, 16.41f, 3.97f, 12.0f)
                curveTo(3.97f, 11.06f, 4.16f, 10.12f, 4.5f, 9.28f)
                lineTo(2.56f, 8.62f)
                curveTo(2.19f, 9.7f, 2.0f, 10.83f, 2.0f, 12.0f)
                curveTo(2.0f, 17.54f, 6.46f, 22.0f, 12.0f, 22.0f)
                curveTo(17.54f, 22.0f, 22.0f, 17.54f, 22.0f, 12.0f)
                moveTo(5.47f, 3.97f)
                curveTo(6.32f, 3.97f, 7.0f, 4.68f, 7.0f, 5.47f)
                curveTo(7.0f, 6.32f, 6.32f, 7.0f, 5.47f, 7.0f)
                curveTo(4.68f, 7.0f, 3.97f, 6.32f, 3.97f, 5.47f)
                curveTo(3.97f, 4.68f, 4.68f, 3.97f, 5.47f, 3.97f)
                close()
            }
        }
        .build()
        return _motionPlayOutline!!
    }

private var _motionPlayOutline: ImageVector? = null
