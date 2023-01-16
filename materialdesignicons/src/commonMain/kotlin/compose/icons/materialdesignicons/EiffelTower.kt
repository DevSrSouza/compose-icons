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

public val MaterialDesignIcons.EiffelTower: ImageVector
    get() {
        if (_eiffelTower != null) {
            return _eiffelTower!!
        }
        _eiffelTower = Builder(name = "EiffelTower", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.21f, 17.0f)
                curveTo(8.65f, 16.15f, 9.06f, 15.16f, 9.44f, 14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                curveTo(10.61f, 9.4f, 11.0f, 6.13f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 6.13f, 13.4f, 9.4f, 14.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.56f)
                curveTo(14.94f, 15.16f, 15.35f, 16.15f, 15.79f, 17.0f)
                horizontalLineTo(17.0f)
                lineTo(17.0f, 19.0f)
                lineTo(19.0f, 22.0f)
                horizontalLineTo(16.58f)
                curveTo(15.81f, 20.24f, 14.05f, 19.0f, 12.0f, 19.0f)
                curveTo(9.95f, 19.0f, 8.19f, 20.24f, 7.42f, 22.0f)
                horizontalLineTo(5.0f)
                lineTo(7.0f, 19.0f)
                lineTo(6.97f, 17.0f)
                horizontalLineTo(8.21f)
                moveTo(12.59f, 14.0f)
                horizontalLineTo(11.41f)
                curveTo(11.07f, 15.13f, 10.69f, 16.13f, 10.28f, 17.0f)
                horizontalLineTo(13.72f)
                curveTo(13.32f, 16.13f, 12.93f, 15.13f, 12.59f, 14.0f)
                close()
            }
        }
        .build()
        return _eiffelTower!!
    }

private var _eiffelTower: ImageVector? = null
