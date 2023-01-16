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

public val MaterialDesignIcons.AmplifierOff: ImageVector
    get() {
        if (_amplifierOff != null) {
            return _amplifierOff!!
        }
        _amplifierOff = Builder(name = "AmplifierOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(3.0f, 4.9f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 21.6f, 5.4f, 22.0f, 6.0f, 22.0f)
                reflectiveCurveTo(7.0f, 21.6f, 7.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 21.6f, 17.4f, 22.0f, 18.0f, 22.0f)
                reflectiveCurveTo(19.0f, 21.6f, 19.0f, 21.0f)
                horizontalLineTo(19.1f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(5.0f, 9.0f)
                verticalLineTo(6.9f)
                lineTo(7.1f, 9.0f)
                horizontalLineTo(5.0f)
                moveTo(12.0f, 19.0f)
                curveTo(9.8f, 19.0f, 8.0f, 17.2f, 8.0f, 15.0f)
                curveTo(8.0f, 13.6f, 8.7f, 12.4f, 9.8f, 11.7f)
                lineTo(15.3f, 17.2f)
                curveTo(14.6f, 18.3f, 13.4f, 19.0f, 12.0f, 19.0f)
                moveTo(14.0f, 6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                moveTo(10.0f, 6.0f)
                curveTo(10.6f, 6.0f, 11.0f, 6.4f, 11.0f, 7.0f)
                curveTo(11.0f, 7.2f, 10.9f, 7.4f, 10.8f, 7.6f)
                lineTo(9.4f, 6.2f)
                curveTo(9.6f, 6.1f, 9.8f, 6.0f, 10.0f, 6.0f)
                moveTo(8.2f, 5.0f)
                lineTo(6.2f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 2.4f, 9.4f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.6f, 2.0f, 15.0f, 2.4f, 15.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.8f)
                lineTo(12.2f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.2f)
                moveTo(16.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                moveTo(18.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _amplifierOff!!
    }

private var _amplifierOff: ImageVector? = null
