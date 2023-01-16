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

public val MaterialDesignIcons.FlaskEmpty: ImageVector
    get() {
        if (_flaskEmpty != null) {
            return _flaskEmpty!!
        }
        _flaskEmpty = Builder(name = "FlaskEmpty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 19.0f)
                curveTo(3.0f, 18.4f, 3.18f, 17.84f, 3.5f, 17.37f)
                lineTo(9.0f, 7.81f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 5.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 4.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 6.0f)
                verticalLineTo(7.81f)
                lineTo(20.5f, 17.37f)
                curveTo(20.82f, 17.84f, 21.0f, 18.4f, 21.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _flaskEmpty!!
    }

private var _flaskEmpty: ImageVector? = null
