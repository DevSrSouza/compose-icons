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

public val MaterialDesignIcons.ApplicationParenthesesOutline: ImageVector
    get() {
        if (_applicationParenthesesOutline != null) {
            return _applicationParenthesesOutline!!
        }
        _applicationParenthesesOutline = Builder(name = "ApplicationParenthesesOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
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
                moveTo(21.0f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                moveTo(15.6f, 8.0f)
                curveTo(17.1f, 9.3f, 18.0f, 11.1f, 18.0f, 13.0f)
                curveTo(18.0f, 14.9f, 17.1f, 16.7f, 15.6f, 18.0f)
                lineTo(14.0f, 17.4f)
                curveTo(15.3f, 16.4f, 16.0f, 14.7f, 16.0f, 13.0f)
                reflectiveCurveTo(15.3f, 9.6f, 14.0f, 8.6f)
                lineTo(15.6f, 8.0f)
                moveTo(8.4f, 8.0f)
                lineTo(10.0f, 8.6f)
                curveTo(8.7f, 9.6f, 8.0f, 11.3f, 8.0f, 13.0f)
                reflectiveCurveTo(8.7f, 16.4f, 10.0f, 17.4f)
                lineTo(8.4f, 18.0f)
                curveTo(6.9f, 16.7f, 6.0f, 14.9f, 6.0f, 13.0f)
                reflectiveCurveTo(6.9f, 9.3f, 8.4f, 8.0f)
                close()
            }
        }
        .build()
        return _applicationParenthesesOutline!!
    }

private var _applicationParenthesesOutline: ImageVector? = null
