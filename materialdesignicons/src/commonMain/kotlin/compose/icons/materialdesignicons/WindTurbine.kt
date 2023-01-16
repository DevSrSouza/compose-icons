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

public val MaterialDesignIcons.WindTurbine: ImageVector
    get() {
        if (_windTurbine != null) {
            return _windTurbine!!
        }
        _windTurbine = Builder(name = "WindTurbine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.33f, 11.67f)
                lineTo(16.21f, 14.58f)
                curveTo(17.62f, 13.16f, 16.21f, 11.75f, 16.21f, 11.75f)
                lineTo(14.72f, 10.24f)
                curveTo(14.9f, 9.86f, 15.0f, 9.44f, 15.0f, 9.0f)
                curveTo(15.0f, 7.95f, 14.46f, 7.03f, 13.64f, 6.5f)
                lineTo(15.0f, 2.11f)
                curveTo(13.09f, 1.53f, 12.5f, 3.44f, 12.5f, 3.44f)
                lineTo(11.69f, 6.03f)
                curveTo(10.46f, 6.16f, 9.46f, 7.0f, 9.13f, 8.18f)
                lineTo(4.67f, 9.63f)
                curveTo(5.31f, 11.53f, 7.2f, 10.9f, 7.2f, 10.9f)
                lineTo(9.27f, 10.23f)
                curveTo(9.61f, 10.97f, 10.23f, 11.54f, 11.0f, 11.82f)
                verticalLineTo(19.0f)
                curveTo(11.0f, 19.0f, 9.0f, 19.0f, 9.0f, 21.0f)
                curveTo(9.0f, 21.5f, 9.0f, 21.81f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                curveTo(15.0f, 21.0f, 15.0f, 19.0f, 13.0f, 19.0f)
                verticalLineTo(11.82f)
                curveTo(13.12f, 11.78f, 13.23f, 11.72f, 13.33f, 11.67f)
                moveTo(10.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 9.0f)
                close()
            }
        }
        .build()
        return _windTurbine!!
    }

private var _windTurbine: ImageVector? = null
