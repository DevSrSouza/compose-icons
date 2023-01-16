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

public val MaterialDesignIcons.GradientHorizontal: ImageVector
    get() {
        if (_gradientHorizontal != null) {
            return _gradientHorizontal!!
        }
        _gradientHorizontal = Builder(name = "GradientHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                moveTo(11.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                moveTo(11.0f, 11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                moveTo(9.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                moveTo(9.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                moveTo(3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                moveTo(18.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                moveTo(18.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                moveTo(18.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                moveTo(11.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _gradientHorizontal!!
    }

private var _gradientHorizontal: ImageVector? = null
