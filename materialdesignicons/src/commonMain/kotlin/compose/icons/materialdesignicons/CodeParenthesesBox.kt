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

public val MaterialDesignIcons.CodeParenthesesBox: ImageVector
    get() {
        if (_codeParenthesesBox != null) {
            return _codeParenthesesBox!!
        }
        _codeParenthesesBox = Builder(name = "CodeParenthesesBox", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(10.0f, 17.3f)
                lineTo(8.4f, 18.0f)
                curveTo(6.9f, 16.5f, 6.0f, 14.3f, 6.0f, 12.0f)
                reflectiveCurveTo(6.9f, 7.5f, 8.4f, 6.0f)
                lineTo(10.0f, 6.7f)
                curveTo(8.7f, 7.9f, 8.0f, 9.9f, 8.0f, 12.0f)
                reflectiveCurveTo(8.7f, 16.1f, 10.0f, 17.3f)
                moveTo(15.6f, 18.0f)
                lineTo(14.0f, 17.3f)
                curveTo(15.3f, 16.0f, 16.0f, 14.1f, 16.0f, 12.0f)
                reflectiveCurveTo(15.3f, 7.9f, 14.0f, 6.7f)
                lineTo(15.6f, 6.0f)
                curveTo(17.1f, 7.5f, 18.0f, 9.7f, 18.0f, 12.0f)
                curveTo(18.0f, 14.3f, 17.1f, 16.5f, 15.6f, 18.0f)
                close()
            }
        }
        .build()
        return _codeParenthesesBox!!
    }

private var _codeParenthesesBox: ImageVector? = null
