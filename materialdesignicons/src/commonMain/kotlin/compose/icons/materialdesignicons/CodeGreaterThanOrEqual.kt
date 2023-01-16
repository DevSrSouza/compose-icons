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

public val MaterialDesignIcons.CodeGreaterThanOrEqual: ImageVector
    get() {
        if (_codeGreaterThanOrEqual != null) {
            return _codeGreaterThanOrEqual!!
        }
        _codeGreaterThanOrEqual = Builder(name = "CodeGreaterThanOrEqual", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                moveTo(13.0f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                moveTo(6.91f, 7.41f)
                lineTo(11.5f, 12.0f)
                lineTo(6.91f, 16.6f)
                lineTo(5.5f, 15.18f)
                lineTo(8.68f, 12.0f)
                lineTo(5.5f, 8.82f)
                moveTo(5.0f, 3.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _codeGreaterThanOrEqual!!
    }

private var _codeGreaterThanOrEqual: ImageVector? = null
