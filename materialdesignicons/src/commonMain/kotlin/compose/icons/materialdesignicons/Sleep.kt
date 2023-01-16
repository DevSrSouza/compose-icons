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

public val MaterialDesignIcons.Sleep: ImageVector
    get() {
        if (_sleep != null) {
            return _sleep!!
        }
        _sleep = Builder(name = "Sleep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                lineTo(20.39f, 6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(6.0f)
                lineTo(19.62f, 10.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(12.0f)
                moveTo(15.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                lineTo(12.39f, 10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                lineTo(11.62f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                moveTo(7.0f, 20.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(18.0f)
                lineTo(4.39f, 14.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                lineTo(3.62f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _sleep!!
    }

private var _sleep: ImageVector? = null
