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

public val MaterialDesignIcons.CircleOpacity: ImageVector
    get() {
        if (_circleOpacity != null) {
            return _circleOpacity!!
        }
        _circleOpacity = Builder(name = "CircleOpacity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                moveTo(16.0f, 2.84f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                curveTo(17.37f, 3.54f, 16.71f, 3.15f, 16.0f, 2.84f)
                moveTo(18.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                curveTo(19.42f, 5.25f, 18.75f, 4.58f, 18.0f, 4.0f)
                moveTo(20.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.16f)
                curveTo(20.85f, 7.29f, 20.46f, 6.63f, 20.0f, 6.0f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 11.32f, 21.93f, 10.65f, 21.8f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                moveTo(16.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                moveTo(16.0f, 16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                moveTo(18.0f, 18.0f)
                horizontalLineTo(20.0f)
                lineTo(20.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                moveTo(16.0f, 20.0f)
                horizontalLineTo(18.0f)
                lineTo(18.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                moveTo(14.0f, 21.8f)
                curveTo(14.7f, 21.66f, 15.36f, 21.44f, 16.0f, 21.16f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.8f)
                moveTo(18.0f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                moveTo(16.0f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                moveTo(20.0f, 16.0f)
                horizontalLineTo(21.16f)
                curveTo(21.44f, 15.36f, 21.66f, 14.7f, 21.8f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                moveTo(16.0f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                moveTo(12.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.2f)
                curveTo(13.35f, 2.07f, 12.69f, 2.0f, 12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                moveTo(14.0f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _circleOpacity!!
    }

private var _circleOpacity: ImageVector? = null
