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

public val MaterialDesignIcons.CubeOffOutline: ImageVector
    get() {
        if (_cubeOffOutline != null) {
            return _cubeOffOutline!!
        }
        _cubeOffOutline = Builder(name = "CubeOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.3f, 6.19f)
                lineTo(3.53f, 6.62f)
                curveTo(3.21f, 6.79f, 3.0f, 7.12f, 3.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3.0f, 16.88f, 3.21f, 17.21f, 3.53f, 17.38f)
                lineTo(11.43f, 21.82f)
                curveTo(11.59f, 21.94f, 11.79f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(12.41f, 21.94f, 12.57f, 21.82f)
                lineTo(17.28f, 19.17f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(5.0f, 15.91f)
                verticalLineTo(9.21f)
                lineTo(10.29f, 12.18f)
                lineTo(11.0f, 12.89f)
                verticalLineTo(19.29f)
                lineTo(5.0f, 15.91f)
                moveTo(13.0f, 19.29f)
                verticalLineTo(14.89f)
                lineTo(15.82f, 17.7f)
                lineTo(13.0f, 19.29f)
                moveTo(9.0f, 5.82f)
                lineTo(7.56f, 4.36f)
                lineTo(11.43f, 2.18f)
                curveTo(11.59f, 2.06f, 11.79f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(12.41f, 2.06f, 12.57f, 2.18f)
                lineTo(20.47f, 6.62f)
                curveTo(20.79f, 6.79f, 21.0f, 7.12f, 21.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 16.85f, 20.82f, 17.16f, 20.53f, 17.33f)
                lineTo(19.0f, 15.8f)
                verticalLineTo(9.21f)
                lineTo(14.78f, 11.58f)
                lineTo(13.31f, 10.11f)
                lineTo(17.96f, 7.5f)
                lineTo(12.0f, 4.15f)
                lineTo(9.0f, 5.82f)
                close()
            }
        }
        .build()
        return _cubeOffOutline!!
    }

private var _cubeOffOutline: ImageVector? = null
