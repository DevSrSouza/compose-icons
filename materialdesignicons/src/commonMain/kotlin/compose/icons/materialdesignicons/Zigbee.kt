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

public val MaterialDesignIcons.Zigbee: ImageVector
    get() {
        if (_zigbee != null) {
            return _zigbee!!
        }
        _zigbee = Builder(name = "Zigbee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.06f, 6.15f)
                curveTo(3.97f, 6.17f, 3.88f, 6.22f, 3.8f, 6.28f)
                curveTo(2.66f, 7.9f, 2.0f, 9.87f, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                curveTo(15.0f, 22.0f, 17.68f, 20.68f, 19.5f, 18.6f)
                lineTo(17.0f, 18.85f)
                curveTo(14.25f, 19.15f, 11.45f, 19.19f, 8.66f, 18.96f)
                curveTo(7.95f, 18.94f, 7.24f, 18.76f, 6.59f, 18.45f)
                curveTo(5.73f, 18.06f, 5.15f, 17.23f, 5.07f, 16.29f)
                curveTo(5.06f, 16.13f, 5.12f, 16.0f, 5.23f, 15.87f)
                lineTo(7.42f, 13.6f)
                lineTo(15.03f, 5.7f)
                verticalLineTo(5.6f)
                horizontalLineTo(10.84f)
                curveTo(8.57f, 5.64f, 6.31f, 5.82f, 4.06f, 6.15f)
                moveTo(20.17f, 17.5f)
                curveTo(20.26f, 17.47f, 20.35f, 17.44f, 20.43f, 17.39f)
                curveTo(21.42f, 15.83f, 22.0f, 14.0f, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                curveTo(9.22f, 2.0f, 6.7f, 3.13f, 4.89f, 4.97f)
                horizontalLineTo(5.17f)
                curveTo(8.28f, 4.57f, 11.43f, 4.47f, 14.56f, 4.65f)
                curveTo(15.5f, 4.64f, 16.45f, 4.82f, 17.33f, 5.17f)
                curveTo(18.25f, 5.53f, 18.89f, 6.38f, 19.0f, 7.37f)
                curveTo(19.0f, 7.53f, 18.93f, 7.7f, 18.82f, 7.82f)
                lineTo(9.71f, 17.19f)
                lineTo(9.0f, 17.95f)
                verticalLineTo(18.06f)
                horizontalLineTo(13.14f)
                curveTo(15.5f, 18.0f, 17.84f, 17.81f, 20.17f, 17.5f)
                close()
            }
        }
        .build()
        return _zigbee!!
    }

private var _zigbee: ImageVector? = null
