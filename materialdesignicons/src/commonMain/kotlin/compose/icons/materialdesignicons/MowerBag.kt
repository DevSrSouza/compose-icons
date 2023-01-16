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

public val MaterialDesignIcons.MowerBag: ImageVector
    get() {
        if (_mowerBag != null) {
            return _mowerBag!!
        }
        _mowerBag = Builder(name = "MowerBag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.95f, 14.0f)
                lineTo(10.82f, 12.0f)
                horizontalLineTo(14.76f)
                curveTo(15.5f, 12.0f, 16.21f, 12.43f, 16.55f, 13.11f)
                lineTo(17.0f, 14.0f)
                horizontalLineTo(11.95f)
                moveTo(23.0f, 18.0f)
                curveTo(23.0f, 19.66f, 21.66f, 21.0f, 20.0f, 21.0f)
                curveTo(18.7f, 21.0f, 17.6f, 20.16f, 17.18f, 19.0f)
                horizontalLineTo(11.65f)
                curveTo(11.09f, 20.18f, 9.89f, 21.0f, 8.5f, 21.0f)
                reflectiveCurveTo(5.91f, 20.18f, 5.35f, 19.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 19.0f, 1.0f, 18.55f, 1.0f, 18.0f)
                verticalLineTo(11.0f)
                curveTo(1.0f, 10.67f, 1.17f, 10.36f, 1.44f, 10.17f)
                curveTo(1.71f, 10.0f, 2.06f, 9.95f, 2.37f, 10.07f)
                lineTo(7.43f, 12.09f)
                lineTo(3.42f, 5.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.58f)
                lineTo(11.37f, 15.0f)
                horizontalLineTo(20.0f)
                curveTo(21.66f, 15.0f, 23.0f, 16.34f, 23.0f, 18.0f)
                moveTo(7.34f, 14.21f)
                lineTo(3.0f, 12.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.05f)
                curveTo(5.24f, 15.7f, 6.13f, 14.64f, 7.34f, 14.21f)
                moveTo(10.0f, 17.5f)
                curveTo(10.0f, 16.67f, 9.33f, 16.0f, 8.5f, 16.0f)
                reflectiveCurveTo(7.0f, 16.67f, 7.0f, 17.5f)
                reflectiveCurveTo(7.67f, 19.0f, 8.5f, 19.0f)
                reflectiveCurveTo(10.0f, 18.33f, 10.0f, 17.5f)
                moveTo(21.0f, 18.0f)
                curveTo(21.0f, 17.45f, 20.55f, 17.0f, 20.0f, 17.0f)
                reflectiveCurveTo(19.0f, 17.45f, 19.0f, 18.0f)
                reflectiveCurveTo(19.45f, 19.0f, 20.0f, 19.0f)
                reflectiveCurveTo(21.0f, 18.55f, 21.0f, 18.0f)
                close()
            }
        }
        .build()
        return _mowerBag!!
    }

private var _mowerBag: ImageVector? = null
