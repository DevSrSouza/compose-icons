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

public val MaterialDesignIcons.LightbulbCflOff: ImageVector
    get() {
        if (_lightbulbCflOff != null) {
            return _lightbulbCflOff!!
        }
        _lightbulbCflOff = Builder(name = "LightbulbCflOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.47f)
                curveTo(14.0f, 3.56f, 13.63f, 2.7f, 13.0f, 2.05f)
                curveTo(13.17f, 2.0f, 13.33f, 2.0f, 13.5f, 2.0f)
                curveTo(14.88f, 2.0f, 16.0f, 3.12f, 16.0f, 4.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.18f)
                lineTo(14.0f, 12.18f)
                verticalLineTo(4.5f)
                lineTo(14.0f, 4.47f)
                moveTo(10.0f, 4.5f)
                curveTo(10.0f, 4.22f, 10.22f, 4.0f, 10.5f, 4.0f)
                reflectiveCurveTo(11.0f, 4.22f, 11.0f, 4.5f)
                verticalLineTo(9.18f)
                lineTo(13.0f, 11.18f)
                verticalLineTo(4.5f)
                curveTo(13.0f, 3.12f, 11.88f, 2.0f, 10.5f, 2.0f)
                reflectiveCurveTo(8.0f, 3.12f, 8.0f, 4.5f)
                verticalLineTo(6.18f)
                lineTo(10.0f, 8.18f)
                verticalLineTo(4.5f)
                moveTo(9.0f, 21.0f)
                curveTo(9.0f, 21.55f, 9.45f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(14.55f, 22.0f, 15.0f, 21.55f, 15.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                moveTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(14.73f, 18.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 18.0f, 7.0f, 17.55f, 7.0f, 17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.27f)
                lineTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                close()
            }
        }
        .build()
        return _lightbulbCflOff!!
    }

private var _lightbulbCflOff: ImageVector? = null
