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

public val MaterialDesignIcons.Shovel: ImageVector
    get() {
        if (_shovel != null) {
            return _shovel!!
        }
        _shovel = Builder(name = "Shovel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1f, 1.81f)
                lineTo(12.27f, 4.64f)
                curveTo(11.5f, 5.42f, 11.5f, 6.69f, 12.27f, 7.47f)
                lineTo(13.68f, 8.88f)
                lineTo(9.13f, 13.43f)
                lineTo(6.31f, 10.6f)
                lineTo(4.89f, 12.0f)
                curveTo(-0.06f, 17.0f, 3.5f, 20.5f, 3.5f, 20.5f)
                curveTo(3.5f, 20.5f, 7.0f, 24.0f, 12.0f, 19.09f)
                lineTo(13.41f, 17.68f)
                lineTo(10.61f, 14.88f)
                lineTo(15.15f, 10.34f)
                lineTo(16.54f, 11.73f)
                curveTo(17.32f, 12.5f, 18.59f, 12.5f, 19.37f, 11.73f)
                lineTo(22.2f, 8.9f)
                lineTo(15.1f, 1.81f)
                moveTo(17.93f, 10.28f)
                lineTo(16.55f, 8.9f)
                lineTo(15.11f, 7.46f)
                lineTo(13.71f, 6.06f)
                lineTo(15.12f, 4.65f)
                lineTo(19.35f, 8.88f)
                lineTo(17.93f, 10.28f)
                close()
            }
        }
        .build()
        return _shovel!!
    }

private var _shovel: ImageVector? = null
