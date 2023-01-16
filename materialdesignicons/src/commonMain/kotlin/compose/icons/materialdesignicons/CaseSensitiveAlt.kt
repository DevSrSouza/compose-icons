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

public val MaterialDesignIcons.CaseSensitiveAlt: ImageVector
    get() {
        if (_caseSensitiveAlt != null) {
            return _caseSensitiveAlt!!
        }
        _caseSensitiveAlt = Builder(name = "CaseSensitiveAlt", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.0f)
                curveTo(20.0f, 12.5f, 19.5f, 12.0f, 18.0f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                curveTo(16.0f, 10.0f, 16.0f, 10.0f, 14.0f, 10.0f)
                verticalLineTo(15.4f)
                lineTo(14.0f, 19.0f)
                horizontalLineTo(16.0f)
                lineTo(18.0f, 19.0f)
                curveTo(19.5f, 19.0f, 20.0f, 18.47f, 20.0f, 17.0f)
                verticalLineTo(14.0f)
                moveTo(12.0f, 12.0f)
                curveTo(12.0f, 10.5f, 11.47f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(6.0f)
                curveTo(4.5f, 10.0f, 4.0f, 10.5f, 4.0f, 12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                moveTo(10.0f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                moveTo(22.0f, 9.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 21.11f, 21.11f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 7.89f, 2.89f, 7.0f, 4.0f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineTo(14.0f)
                lineTo(16.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 9.0f)
                horizontalLineTo(22.0f)
                moveTo(16.0f, 17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                moveTo(6.0f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _caseSensitiveAlt!!
    }

private var _caseSensitiveAlt: ImageVector? = null
