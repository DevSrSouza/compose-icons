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

public val MaterialDesignIcons.EggOffOutline: ImageVector
    get() {
        if (_eggOffOutline != null) {
            return _eggOffOutline!!
        }
        _eggOffOutline = Builder(name = "EggOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(6.1f, 8.0f)
                curveTo(5.1f, 10.28f, 4.5f, 12.76f, 4.5f, 14.5f)
                curveTo(4.5f, 18.64f, 7.86f, 22.0f, 12.0f, 22.0f)
                curveTo(14.23f, 22.0f, 16.22f, 21.0f, 17.59f, 19.5f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12.0f, 20.0f)
                curveTo(8.97f, 20.0f, 6.5f, 17.53f, 6.5f, 14.5f)
                curveTo(6.5f, 13.08f, 6.95f, 11.25f, 7.63f, 9.5f)
                lineTo(16.17f, 18.06f)
                curveTo(15.16f, 19.24f, 13.67f, 20.0f, 12.0f, 20.0f)
                moveTo(9.36f, 6.16f)
                lineTo(7.92f, 4.72f)
                curveTo(9.1f, 3.11f, 10.5f, 2.0f, 12.0f, 2.0f)
                curveTo(16.14f, 2.0f, 19.5f, 10.36f, 19.5f, 14.5f)
                curveTo(19.5f, 15.06f, 19.43f, 15.6f, 19.32f, 16.12f)
                lineTo(17.5f, 14.29f)
                curveTo(17.38f, 10.46f, 14.28f, 4.0f, 12.0f, 4.0f)
                curveTo(11.17f, 4.0f, 10.22f, 4.87f, 9.36f, 6.16f)
                close()
            }
        }
        .build()
        return _eggOffOutline!!
    }

private var _eggOffOutline: ImageVector? = null
