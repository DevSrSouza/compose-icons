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

public val MaterialDesignIcons.MicrophoneMinus: ImageVector
    get() {
        if (_microphoneMinus != null) {
            return _microphoneMinus!!
        }
        _microphoneMinus = Builder(name = "MicrophoneMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 5.0f)
                verticalLineTo(11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 11.0f)
                verticalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 2.0f)
                moveTo(16.0f, 11.0f)
                curveTo(16.0f, 14.5f, 13.44f, 17.43f, 10.0f, 17.93f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.93f)
                curveTo(4.56f, 17.43f, 2.0f, 14.5f, 2.0f, 11.0f)
                horizontalLineTo(4.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 9.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 14.0f, 11.0f)
                horizontalLineTo(16.0f)
                moveTo(15.0f, 5.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _microphoneMinus!!
    }

private var _microphoneMinus: ImageVector? = null
