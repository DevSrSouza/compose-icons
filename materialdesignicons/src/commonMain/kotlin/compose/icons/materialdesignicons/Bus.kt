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

public val MaterialDesignIcons.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                moveTo(16.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 17.0f)
                moveTo(7.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 17.0f)
                moveTo(4.0f, 16.0f)
                curveTo(4.0f, 16.88f, 4.39f, 17.67f, 5.0f, 18.22f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 21.0f)
                horizontalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 21.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 20.0f)
                verticalLineTo(18.22f)
                curveTo(19.61f, 17.67f, 20.0f, 16.88f, 20.0f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 2.5f, 16.42f, 2.0f, 12.0f, 2.0f)
                curveTo(7.58f, 2.0f, 4.0f, 2.5f, 4.0f, 6.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null
