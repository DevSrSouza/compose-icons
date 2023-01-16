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

public val MaterialDesignIcons.CubeOff: ImageVector
    get() {
        if (_cubeOff != null) {
            return _cubeOff!!
        }
        _cubeOff = Builder(name = "CubeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(17.28f, 19.17f)
                lineTo(12.57f, 21.82f)
                curveTo(12.41f, 21.94f, 12.21f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(11.59f, 21.94f, 11.43f, 21.82f)
                lineTo(3.53f, 17.38f)
                curveTo(3.21f, 17.21f, 3.0f, 16.88f, 3.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 7.12f, 3.21f, 6.79f, 3.53f, 6.62f)
                lineTo(4.3f, 6.19f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(12.0f, 4.15f)
                lineTo(17.96f, 7.5f)
                lineTo(13.31f, 10.11f)
                lineTo(20.53f, 17.33f)
                curveTo(20.82f, 17.16f, 21.0f, 16.85f, 21.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(21.0f, 7.12f, 20.79f, 6.79f, 20.47f, 6.62f)
                lineTo(12.57f, 2.18f)
                curveTo(12.41f, 2.06f, 12.21f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(11.59f, 2.06f, 11.43f, 2.18f)
                lineTo(7.56f, 4.36f)
                lineTo(9.0f, 5.82f)
                lineTo(12.0f, 4.15f)
                close()
            }
        }
        .build()
        return _cubeOff!!
    }

private var _cubeOff: ImageVector? = null
