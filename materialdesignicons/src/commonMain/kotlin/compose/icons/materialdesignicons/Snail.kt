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

public val MaterialDesignIcons.Snail: ImageVector
    get() {
        if (_snail != null) {
            return _snail!!
        }
        _snail = Builder(name = "Snail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.31f, 8.03f)
                lineTo(21.24f, 4.95f)
                curveTo(21.67f, 4.85f, 22.0f, 4.47f, 22.0f, 4.0f)
                curveTo(22.0f, 3.45f, 21.55f, 3.0f, 21.0f, 3.0f)
                reflectiveCurveTo(20.0f, 3.45f, 20.0f, 4.0f)
                curveTo(20.0f, 4.26f, 20.11f, 4.5f, 20.27f, 4.68f)
                lineTo(19.5f, 7.26f)
                lineTo(18.73f, 4.68f)
                curveTo(18.89f, 4.5f, 19.0f, 4.26f, 19.0f, 4.0f)
                curveTo(19.0f, 3.45f, 18.55f, 3.0f, 18.0f, 3.0f)
                reflectiveCurveTo(17.0f, 3.45f, 17.0f, 4.0f)
                curveTo(17.0f, 4.47f, 17.33f, 4.85f, 17.76f, 4.95f)
                lineTo(18.69f, 8.03f)
                curveTo(17.73f, 8.18f, 17.0f, 9.0f, 17.0f, 10.0f)
                verticalLineTo(12.25f)
                curveTo(15.65f, 9.16f, 12.63f, 7.0f, 9.11f, 7.0f)
                curveTo(5.19f, 7.0f, 2.0f, 10.26f, 2.0f, 14.26f)
                curveTo(2.0f, 16.1f, 2.82f, 17.75f, 4.1f, 18.85f)
                lineTo(2.88f, 19.0f)
                curveTo(2.38f, 19.06f, 2.0f, 19.5f, 2.0f, 20.0f)
                curveTo(2.0f, 20.55f, 2.45f, 21.0f, 3.0f, 21.0f)
                lineTo(19.12f, 21.0f)
                curveTo(20.16f, 21.0f, 21.0f, 20.16f, 21.0f, 19.12f)
                verticalLineTo(11.72f)
                curveTo(21.6f, 11.38f, 22.0f, 10.74f, 22.0f, 10.0f)
                curveTo(22.0f, 9.0f, 21.27f, 8.18f, 20.31f, 8.03f)
                moveTo(15.6f, 17.41f)
                lineTo(12.07f, 17.86f)
                curveTo(12.5f, 17.1f, 12.8f, 16.21f, 12.8f, 15.26f)
                curveTo(12.8f, 12.94f, 10.95f, 11.06f, 8.67f, 11.06f)
                curveTo(8.14f, 11.06f, 7.62f, 11.18f, 7.14f, 11.41f)
                curveTo(6.65f, 11.66f, 6.44f, 12.26f, 6.69f, 12.75f)
                curveTo(6.93f, 13.25f, 7.53f, 13.45f, 8.03f, 13.21f)
                curveTo(8.23f, 13.11f, 8.45f, 13.06f, 8.67f, 13.06f)
                curveTo(9.85f, 13.06f, 10.8f, 14.04f, 10.8f, 15.26f)
                curveTo(10.8f, 16.92f, 9.5f, 18.27f, 7.89f, 18.27f)
                curveTo(5.75f, 18.27f, 4.0f, 16.47f, 4.0f, 14.26f)
                curveTo(4.0f, 11.36f, 6.29f, 9.0f, 9.11f, 9.0f)
                curveTo(12.77f, 9.0f, 15.75f, 12.06f, 15.75f, 15.82f)
                curveTo(15.75f, 16.36f, 15.69f, 16.89f, 15.6f, 17.41f)
                close()
            }
        }
        .build()
        return _snail!!
    }

private var _snail: ImageVector? = null
