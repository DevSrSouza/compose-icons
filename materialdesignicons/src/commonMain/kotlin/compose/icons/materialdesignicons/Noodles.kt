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

public val MaterialDesignIcons.Noodles: ImageVector
    get() {
        if (_noodles != null) {
            return _noodles!!
        }
        _noodles = Builder(name = "Noodles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                lineTo(10.0f, 4.41f)
                verticalLineTo(6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 13.81f, 21.43f, 15.46f, 20.32f, 16.95f)
                reflectiveCurveTo(17.77f, 19.53f, 16.0f, 20.25f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.25f)
                curveTo(6.24f, 19.53f, 4.79f, 18.43f, 3.68f, 16.95f)
                reflectiveCurveTo(2.0f, 13.81f, 2.0f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                lineTo(22.0f, 2.0f)
                verticalLineTo(3.0f)
                moveTo(6.0f, 4.88f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.78f)
                lineTo(6.0f, 4.88f)
                moveTo(6.0f, 7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                moveTo(9.0f, 12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                moveTo(9.0f, 6.0f)
                verticalLineTo(4.55f)
                lineTo(8.0f, 4.64f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _noodles!!
    }

private var _noodles: ImageVector? = null
