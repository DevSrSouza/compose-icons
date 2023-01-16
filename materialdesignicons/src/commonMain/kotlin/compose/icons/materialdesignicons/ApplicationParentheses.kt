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

public val MaterialDesignIcons.ApplicationParentheses: ImageVector
    get() {
        if (_applicationParentheses != null) {
            return _applicationParentheses!!
        }
        _applicationParentheses = Builder(name = "ApplicationParentheses", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 2.0f, 1.0f, 2.9f, 1.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.1f, 1.9f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 22.0f, 23.0f, 21.1f, 23.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(23.0f, 2.9f, 22.1f, 2.0f, 21.0f, 2.0f)
                moveTo(10.0f, 19.4f)
                lineTo(8.4f, 20.0f)
                curveTo(6.9f, 18.6f, 6.0f, 16.6f, 6.0f, 14.5f)
                reflectiveCurveTo(6.9f, 10.4f, 8.4f, 9.0f)
                lineTo(10.0f, 9.6f)
                curveTo(8.7f, 10.7f, 8.0f, 12.6f, 8.0f, 14.5f)
                reflectiveCurveTo(8.7f, 18.2f, 10.0f, 19.4f)
                moveTo(15.6f, 20.0f)
                lineTo(14.0f, 19.4f)
                curveTo(15.3f, 18.2f, 16.0f, 16.4f, 16.0f, 14.5f)
                reflectiveCurveTo(15.3f, 10.8f, 14.0f, 9.6f)
                lineTo(15.6f, 9.0f)
                curveTo(17.1f, 10.4f, 18.0f, 12.4f, 18.0f, 14.5f)
                curveTo(18.0f, 16.6f, 17.1f, 18.6f, 15.6f, 20.0f)
                moveTo(21.0f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _applicationParentheses!!
    }

private var _applicationParentheses: ImageVector? = null
