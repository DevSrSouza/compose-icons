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

public val MaterialDesignIcons.BatteryClock: ImageVector
    get() {
        if (_batteryClock != null) {
            return _batteryClock!!
        }
        _batteryClock = Builder(name = "BatteryClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                moveTo(23.0f, 16.0f)
                curveTo(23.0f, 19.87f, 19.87f, 23.0f, 16.0f, 23.0f)
                curveTo(14.69f, 23.0f, 13.46f, 22.63f, 12.41f, 22.0f)
                horizontalLineTo(7.33f)
                curveTo(6.6f, 22.0f, 6.0f, 21.4f, 6.0f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(6.0f, 4.6f, 6.6f, 4.0f, 7.33f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.67f)
                curveTo(17.4f, 4.0f, 18.0f, 4.6f, 18.0f, 5.33f)
                verticalLineTo(9.29f)
                curveTo(20.89f, 10.15f, 23.0f, 12.83f, 23.0f, 16.0f)
                moveTo(21.0f, 16.0f)
                curveTo(21.0f, 13.24f, 18.76f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(11.0f, 13.24f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 21.0f, 16.0f, 21.0f)
                reflectiveCurveTo(21.0f, 18.76f, 21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _batteryClock!!
    }

private var _batteryClock: ImageVector? = null
