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

public val MaterialDesignIcons.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(7.0f, 1.0f, 3.0f, 5.0f, 3.0f, 10.0f)
                verticalLineTo(17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 3.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 5.0f, 16.97f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null
