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

public val MaterialDesignIcons.HookOff: ImageVector
    get() {
        if (_hookOff != null) {
            return _hookOff!!
        }
        _hookOff = Builder(name = "HookOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.86f)
                verticalLineTo(11.18f)
                lineTo(15.0f, 13.18f)
                verticalLineTo(9.86f)
                curveTo(17.14f, 9.31f, 18.43f, 7.13f, 17.87f, 5.0f)
                curveTo(17.32f, 2.85f, 15.14f, 1.56f, 13.0f, 2.11f)
                curveTo(10.86f, 2.67f, 9.57f, 4.85f, 10.13f, 7.0f)
                curveTo(10.5f, 8.4f, 11.59f, 9.5f, 13.0f, 9.86f)
                moveTo(14.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 4.0f)
                moveTo(18.73f, 22.0f)
                lineTo(14.86f, 18.13f)
                curveTo(14.21f, 20.81f, 11.5f, 22.46f, 8.83f, 21.82f)
                curveTo(6.6f, 21.28f, 5.0f, 19.29f, 5.0f, 17.0f)
                verticalLineTo(12.0f)
                lineTo(10.0f, 17.0f)
                horizontalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 17.0f)
                verticalLineTo(16.27f)
                lineTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(13.0f, 13.72f)
                lineTo(15.0f, 15.72f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                close()
            }
        }
        .build()
        return _hookOff!!
    }

private var _hookOff: ImageVector? = null
