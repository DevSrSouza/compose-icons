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

public val MaterialDesignIcons.Factory: ImageVector
    get() {
        if (_factory != null) {
            return _factory!!
        }
        _factory = Builder(name = "Factory", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                moveTo(10.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                moveTo(16.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                moveTo(16.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                moveTo(2.0f, 22.0f)
                verticalLineTo(8.0f)
                lineTo(7.0f, 12.0f)
                verticalLineTo(8.0f)
                lineTo(12.0f, 12.0f)
                verticalLineTo(8.0f)
                lineTo(17.0f, 12.0f)
                lineTo(18.0f, 2.0f)
                horizontalLineTo(21.0f)
                lineTo(22.0f, 12.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _factory!!
    }

private var _factory: ImageVector? = null
