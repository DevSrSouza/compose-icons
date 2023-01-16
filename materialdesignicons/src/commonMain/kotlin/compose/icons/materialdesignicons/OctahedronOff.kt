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

public val MaterialDesignIcons.OctahedronOff: ImageVector
    get() {
        if (_octahedronOff != null) {
            return _octahedronOff!!
        }
        _octahedronOff = Builder(name = "OctahedronOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.41f)
                verticalLineTo(7.8f)
                lineTo(13.88f, 10.68f)
                lineTo(17.84f, 12.0f)
                lineTo(15.86f, 12.66f)
                lineTo(18.81f, 15.61f)
                lineTo(21.71f, 12.71f)
                horizontalLineTo(21.7f)
                curveTo(22.09f, 12.32f, 22.09f, 11.68f, 21.7f, 11.29f)
                horizontalLineTo(21.71f)
                lineTo(12.71f, 2.29f)
                curveTo(12.5f, 2.1f, 12.26f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(11.5f, 2.1f, 11.29f, 2.29f)
                lineTo(8.39f, 5.19f)
                lineTo(9.81f, 6.61f)
                lineTo(11.0f, 5.41f)
                moveTo(13.0f, 5.41f)
                lineTo(17.3f, 9.71f)
                lineTo(13.0f, 8.28f)
                verticalLineTo(5.41f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(5.85f, 7.74f)
                lineTo(2.29f, 11.29f)
                horizontalLineTo(2.3f)
                curveTo(1.91f, 11.68f, 1.91f, 12.32f, 2.3f, 12.71f)
                horizontalLineTo(2.29f)
                lineTo(11.29f, 21.71f)
                curveTo(11.5f, 21.9f, 11.74f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(12.5f, 21.9f, 12.71f, 21.71f)
                lineTo(16.26f, 18.15f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(7.26f, 9.15f)
                lineTo(7.54f, 9.43f)
                lineTo(6.7f, 9.71f)
                lineTo(7.26f, 9.15f)
                moveTo(11.0f, 18.59f)
                lineTo(6.7f, 14.29f)
                lineTo(11.0f, 15.72f)
                verticalLineTo(18.59f)
                moveTo(12.0f, 13.95f)
                lineTo(6.16f, 12.0f)
                lineTo(9.12f, 11.0f)
                lineTo(12.04f, 13.93f)
                lineTo(12.0f, 13.95f)
                moveTo(13.0f, 18.59f)
                verticalLineTo(15.72f)
                lineTo(13.62f, 15.5f)
                lineTo(14.85f, 16.74f)
                lineTo(13.0f, 18.59f)
                close()
            }
        }
        .build()
        return _octahedronOff!!
    }

private var _octahedronOff: ImageVector? = null
