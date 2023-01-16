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

public val MaterialDesignIcons.EngineOff: ImageVector
    get() {
        if (_engineOff != null) {
            return _engineOff!!
        }
        _engineOff = Builder(name = "EngineOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.78f, 2.5f)
                lineTo(21.5f, 20.22f)
                lineTo(20.23f, 21.5f)
                lineTo(18.0f, 19.27f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                lineTo(8.0f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                lineTo(6.87f, 8.14f)
                lineTo(2.5f, 3.77f)
                lineTo(3.78f, 2.5f)
                moveTo(20.0f, 9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.82f)
                lineTo(22.82f, 19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _engineOff!!
    }

private var _engineOff: ImageVector? = null
