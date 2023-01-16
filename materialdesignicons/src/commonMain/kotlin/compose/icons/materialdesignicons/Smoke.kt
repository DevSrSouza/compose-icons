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

public val MaterialDesignIcons.Smoke: ImageVector
    get() {
        if (_smoke != null) {
            return _smoke!!
        }
        _smoke = Builder(name = "Smoke", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                curveTo(15.0f, 17.9f, 14.1f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(10.0f)
                curveTo(7.2f, 17.0f, 5.0f, 14.8f, 5.0f, 12.0f)
                curveTo(5.0f, 10.8f, 5.4f, 9.8f, 6.1f, 8.9f)
                curveTo(3.8f, 8.5f, 2.0f, 6.4f, 2.0f, 4.0f)
                curveTo(2.0f, 3.3f, 2.2f, 2.6f, 2.4f, 2.0f)
                horizontalLineTo(4.8f)
                curveTo(4.3f, 2.5f, 4.0f, 3.2f, 4.0f, 4.0f)
                curveTo(4.0f, 5.7f, 5.3f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                curveTo(8.3f, 9.0f, 7.0f, 10.3f, 7.0f, 12.0f)
                reflectiveCurveTo(8.3f, 15.0f, 10.0f, 15.0f)
                horizontalLineTo(13.0f)
                curveTo(15.2f, 15.0f, 17.0f, 16.8f, 17.0f, 19.0f)
                moveTo(17.9f, 8.9f)
                curveTo(20.2f, 8.5f, 22.0f, 6.4f, 22.0f, 4.0f)
                curveTo(22.0f, 3.3f, 21.8f, 2.6f, 21.6f, 2.0f)
                horizontalLineTo(19.2f)
                curveTo(19.7f, 2.5f, 20.0f, 3.2f, 20.0f, 4.0f)
                curveTo(20.0f, 5.7f, 18.7f, 7.0f, 17.0f, 7.0f)
                horizontalLineTo(15.8f)
                curveTo(15.9f, 7.3f, 16.0f, 7.6f, 16.0f, 8.0f)
                curveTo(16.0f, 9.7f, 14.7f, 11.0f, 13.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(15.8f, 13.0f, 18.0f, 15.2f, 18.0f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                curveTo(20.0f, 15.3f, 18.5f, 13.0f, 16.2f, 11.8f)
                curveTo(17.1f, 11.1f, 17.7f, 10.1f, 17.9f, 8.9f)
                close()
            }
        }
        .build()
        return _smoke!!
    }

private var _smoke: ImageVector? = null
