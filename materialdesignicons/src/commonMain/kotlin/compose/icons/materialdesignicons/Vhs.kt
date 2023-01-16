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

public val MaterialDesignIcons.Vhs: ImageVector
    get() {
        if (_vhs != null) {
            return _vhs!!
        }
        _vhs = Builder(name = "Vhs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 8.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 18.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 16.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 6.0f)
                horizontalLineTo(4.0f)
                moveTo(4.54f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.54f)
                curveTo(4.19f, 13.39f, 4.0f, 12.7f, 4.0f, 12.0f)
                curveTo(4.0f, 11.3f, 4.19f, 10.61f, 4.54f, 10.0f)
                moveTo(9.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                moveTo(17.0f, 10.0f)
                horizontalLineTo(19.46f)
                curveTo(19.81f, 10.61f, 20.0f, 11.3f, 20.0f, 12.0f)
                curveTo(20.0f, 12.7f, 19.81f, 13.39f, 19.46f, 14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _vhs!!
    }

private var _vhs: ImageVector? = null
