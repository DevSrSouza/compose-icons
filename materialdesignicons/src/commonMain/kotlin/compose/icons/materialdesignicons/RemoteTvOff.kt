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

public val MaterialDesignIcons.RemoteTvOff: ImageVector
    get() {
        if (_remoteTvOff != null) {
            return _remoteTvOff!!
        }
        _remoteTvOff = Builder(name = "RemoteTvOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(17.0f, 20.25f)
                curveTo(16.86f, 21.24f, 16.0f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 20.0f)
                verticalLineTo(10.27f)
                lineTo(2.0f, 5.27f)
                moveTo(9.0f, 2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 4.0f)
                verticalLineTo(15.18f)
                lineTo(13.0f, 11.18f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.82f)
                lineTo(7.0f, 5.18f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 2.0f)
                moveTo(9.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                moveTo(13.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.27f)
                lineTo(14.73f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                moveTo(9.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.27f)
                lineTo(10.73f, 14.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _remoteTvOff!!
    }

private var _remoteTvOff: ImageVector? = null
