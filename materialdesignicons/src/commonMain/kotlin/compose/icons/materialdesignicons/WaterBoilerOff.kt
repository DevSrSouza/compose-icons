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

public val MaterialDesignIcons.WaterBoilerOff: ImageVector
    get() {
        if (_waterBoilerOff != null) {
            return _waterBoilerOff!!
        }
        _waterBoilerOff = Builder(name = "WaterBoilerOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.82f)
                lineTo(6.25f, 3.05f)
                curveTo(6.59f, 2.42f, 7.24f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(17.11f, 2.0f, 18.0f, 2.89f, 18.0f, 4.0f)
                verticalLineTo(14.8f)
                lineTo(12.16f, 8.96f)
                curveTo(13.19f, 8.87f, 14.0f, 8.0f, 14.0f, 6.97f)
                curveTo(14.0f, 5.87f, 13.11f, 4.97f, 12.0f, 4.97f)
                curveTo(10.95f, 4.97f, 10.1f, 5.78f, 10.0f, 6.82f)
                moveTo(15.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                curveTo(13.89f, 22.0f, 13.0f, 21.11f, 13.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                curveTo(11.0f, 21.11f, 10.11f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                curveTo(6.89f, 18.0f, 6.0f, 17.11f, 6.0f, 16.0f)
                verticalLineTo(7.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(16.1f, 18.0f)
                curveTo(16.06f, 18.0f, 16.03f, 18.0f, 16.0f, 18.0f)
                horizontalLineTo(15.0f)
                moveTo(14.0f, 16.0f)
                verticalLineTo(15.89f)
                lineTo(12.61f, 14.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _waterBoilerOff!!
    }

private var _waterBoilerOff: ImageVector? = null
