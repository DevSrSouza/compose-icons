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

public val MaterialDesignIcons.ThermometerLines: ImageVector
    get() {
        if (_thermometerLines != null) {
            return _thermometerLines!!
        }
        _thermometerLines = Builder(name = "ThermometerLines", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                moveTo(17.0f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                moveTo(17.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.75f)
                lineTo(17.0f, 12.1f)
                verticalLineTo(11.0f)
                moveTo(21.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 16.31f, 18.9f, 15.63f, 18.71f, 15.0f)
                horizontalLineTo(21.0f)
                moveTo(7.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 11.0f)
                verticalLineTo(12.1f)
                lineTo(6.25f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                moveTo(3.0f, 15.0f)
                horizontalLineTo(5.29f)
                curveTo(5.1f, 15.63f, 5.0f, 16.31f, 5.0f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                moveTo(15.0f, 13.0f)
                verticalLineTo(5.0f)
                curveTo(15.0f, 3.34f, 13.66f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(9.0f, 3.34f, 9.0f, 5.0f)
                verticalLineTo(13.0f)
                curveTo(6.79f, 14.66f, 6.34f, 17.79f, 8.0f, 20.0f)
                reflectiveCurveTo(12.79f, 22.66f, 15.0f, 21.0f)
                reflectiveCurveTo(17.66f, 16.21f, 16.0f, 14.0f)
                curveTo(15.72f, 13.62f, 15.38f, 13.28f, 15.0f, 13.0f)
                moveTo(12.0f, 4.0f)
                curveTo(12.55f, 4.0f, 13.0f, 4.45f, 13.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                curveTo(11.0f, 4.45f, 11.45f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _thermometerLines!!
    }

private var _thermometerLines: ImageVector? = null
