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

public val MaterialDesignIcons.Rollerblade: ImageVector
    get() {
        if (_rollerblade != null) {
            return _rollerblade!!
        }
        _rollerblade = Builder(name = "Rollerblade", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 18.0f)
                curveTo(3.12f, 18.0f, 2.0f, 19.12f, 2.0f, 20.5f)
                reflectiveCurveTo(3.12f, 23.0f, 4.5f, 23.0f)
                reflectiveCurveTo(7.0f, 21.88f, 7.0f, 20.5f)
                reflectiveCurveTo(5.88f, 18.0f, 4.5f, 18.0f)
                moveTo(18.5f, 18.0f)
                curveTo(17.12f, 18.0f, 16.0f, 19.12f, 16.0f, 20.5f)
                reflectiveCurveTo(17.12f, 23.0f, 18.5f, 23.0f)
                reflectiveCurveTo(21.0f, 21.88f, 21.0f, 20.5f)
                reflectiveCurveTo(19.88f, 18.0f, 18.5f, 18.0f)
                moveTo(20.0f, 17.0f)
                curveTo(20.0f, 15.63f, 20.09f, 13.81f, 19.5f, 12.95f)
                curveTo(18.55f, 10.9f, 15.82f, 10.56f, 13.91f, 10.05f)
                curveTo(13.0f, 10.0f, 12.0f, 9.0f, 11.82f, 8.0f)
                horizontalLineTo(9.0f)
                curveTo(8.71f, 8.0f, 8.5f, 7.78f, 8.5f, 7.5f)
                curveTo(8.5f, 7.22f, 8.71f, 7.0f, 9.0f, 7.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                curveTo(8.71f, 6.0f, 8.5f, 5.78f, 8.5f, 5.5f)
                curveTo(8.5f, 5.22f, 8.71f, 5.0f, 9.0f, 5.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                moveTo(11.5f, 18.0f)
                curveTo(10.12f, 18.0f, 9.0f, 19.12f, 9.0f, 20.5f)
                reflectiveCurveTo(10.12f, 23.0f, 11.5f, 23.0f)
                reflectiveCurveTo(14.0f, 21.88f, 14.0f, 20.5f)
                reflectiveCurveTo(12.88f, 18.0f, 11.5f, 18.0f)
                close()
            }
        }
        .build()
        return _rollerblade!!
    }

private var _rollerblade: ImageVector? = null
