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

public val MaterialDesignIcons.Mower: ImageVector
    get() {
        if (_mower != null) {
            return _mower!!
        }
        _mower = Builder(name = "Mower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 14.0f)
                curveTo(17.55f, 14.0f, 16.69f, 14.38f, 16.06f, 15.0f)
                horizontalLineTo(9.39f)
                lineTo(5.74f, 3.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.26f)
                lineTo(7.0f, 14.05f)
                curveTo(6.85f, 14.03f, 6.68f, 14.0f, 6.5f, 14.0f)
                curveTo(4.57f, 14.0f, 3.0f, 15.57f, 3.0f, 17.5f)
                reflectiveCurveTo(4.57f, 21.0f, 6.5f, 21.0f)
                curveTo(7.89f, 21.0f, 9.09f, 20.18f, 9.65f, 19.0f)
                horizontalLineTo(15.35f)
                curveTo(15.91f, 20.18f, 17.11f, 21.0f, 18.5f, 21.0f)
                curveTo(20.43f, 21.0f, 22.0f, 19.43f, 22.0f, 17.5f)
                reflectiveCurveTo(20.43f, 14.0f, 18.5f, 14.0f)
                moveTo(6.5f, 19.0f)
                curveTo(5.67f, 19.0f, 5.0f, 18.33f, 5.0f, 17.5f)
                reflectiveCurveTo(5.67f, 16.0f, 6.5f, 16.0f)
                reflectiveCurveTo(8.0f, 16.67f, 8.0f, 17.5f)
                reflectiveCurveTo(7.33f, 19.0f, 6.5f, 19.0f)
                moveTo(18.5f, 19.0f)
                curveTo(17.67f, 19.0f, 17.0f, 18.33f, 17.0f, 17.5f)
                reflectiveCurveTo(17.67f, 16.0f, 18.5f, 16.0f)
                reflectiveCurveTo(20.0f, 16.67f, 20.0f, 17.5f)
                reflectiveCurveTo(19.33f, 19.0f, 18.5f, 19.0f)
                moveTo(10.13f, 14.0f)
                lineTo(9.53f, 12.0f)
                horizontalLineTo(12.76f)
                curveTo(13.5f, 12.0f, 14.21f, 12.43f, 14.55f, 13.11f)
                lineTo(15.0f, 14.0f)
                horizontalLineTo(10.13f)
                close()
            }
        }
        .build()
        return _mower!!
    }

private var _mower: ImageVector? = null
