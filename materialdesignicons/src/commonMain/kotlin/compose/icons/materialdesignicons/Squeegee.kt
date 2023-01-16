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

public val MaterialDesignIcons.Squeegee: ImageVector
    get() {
        if (_squeegee != null) {
            return _squeegee!!
        }
        _squeegee = Builder(name = "Squeegee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                moveTo(2.0f, 8.0f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _squeegee!!
    }

private var _squeegee: ImageVector? = null
