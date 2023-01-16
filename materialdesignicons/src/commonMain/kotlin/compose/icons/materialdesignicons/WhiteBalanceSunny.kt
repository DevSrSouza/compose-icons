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

public val MaterialDesignIcons.WhiteBalanceSunny: ImageVector
    get() {
        if (_whiteBalanceSunny != null) {
            return _whiteBalanceSunny!!
        }
        _whiteBalanceSunny = Builder(name = "WhiteBalanceSunny", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.55f, 19.09f)
                lineTo(4.96f, 20.5f)
                lineTo(6.76f, 18.71f)
                lineTo(5.34f, 17.29f)
                moveTo(12.0f, 6.0f)
                curveTo(8.69f, 6.0f, 6.0f, 8.69f, 6.0f, 12.0f)
                reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveTo(18.0f, 15.31f, 18.0f, 12.0f)
                curveTo(18.0f, 8.68f, 15.31f, 6.0f, 12.0f, 6.0f)
                moveTo(20.0f, 13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                moveTo(17.24f, 18.71f)
                lineTo(19.04f, 20.5f)
                lineTo(20.45f, 19.09f)
                lineTo(18.66f, 17.29f)
                moveTo(20.45f, 5.0f)
                lineTo(19.04f, 3.6f)
                lineTo(17.24f, 5.39f)
                lineTo(18.66f, 6.81f)
                moveTo(13.0f, 1.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                moveTo(6.76f, 5.39f)
                lineTo(4.96f, 3.6f)
                lineTo(3.55f, 5.0f)
                lineTo(5.34f, 6.81f)
                lineTo(6.76f, 5.39f)
                moveTo(1.0f, 13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                moveTo(13.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
            }
        }
        .build()
        return _whiteBalanceSunny!!
    }

private var _whiteBalanceSunny: ImageVector? = null
