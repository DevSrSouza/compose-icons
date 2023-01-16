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

public val MaterialDesignIcons.EngineOffOutline: ImageVector
    get() {
        if (_engineOffOutline != null) {
            return _engineOffOutline!!
        }
        _engineOffOutline = Builder(name = "EngineOffOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 3.77f)
                lineTo(6.87f, 8.14f)
                lineTo(5.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                lineTo(10.0f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.27f)
                lineTo(21.23f, 22.5f)
                lineTo(22.5f, 21.22f)
                lineTo(3.78f, 2.5f)
                lineTo(2.5f, 3.77f)
                moveTo(16.0f, 18.0f)
                horizontalLineTo(11.0f)
                lineTo(9.0f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                lineTo(8.0f, 10.0f)
                horizontalLineTo(8.73f)
                lineTo(16.0f, 17.27f)
                verticalLineTo(18.0f)
                moveTo(23.0f, 9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.82f)
                lineTo(16.0f, 12.18f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.82f)
                lineTo(7.82f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _engineOffOutline!!
    }

private var _engineOffOutline: ImageVector? = null
