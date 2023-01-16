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

public val MaterialDesignIcons.HdrOff: ImageVector
    get() {
        if (_hdrOff != null) {
            return _hdrOff!!
        }
        _hdrOff = Builder(name = "HdrOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.6f)
                lineTo(19.5f, 15.0f)
                horizontalLineTo(21.0f)
                lineTo(20.1f, 12.9f)
                curveTo(20.6f, 12.7f, 21.0f, 12.1f, 21.0f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(21.0f, 9.7f, 20.3f, 9.0f, 19.5f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.9f)
                lineTo(17.1f, 15.0f)
                horizontalLineTo(17.5f)
                moveTo(17.5f, 10.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.5f)
                moveTo(13.0f, 10.5f)
                verticalLineTo(10.9f)
                lineTo(14.5f, 12.4f)
                verticalLineTo(10.5f)
                curveTo(14.5f, 9.7f, 13.8f, 9.0f, 13.0f, 9.0f)
                horizontalLineTo(11.1f)
                lineTo(12.6f, 10.5f)
                horizontalLineTo(13.0f)
                moveTo(9.5f, 9.5f)
                lineTo(2.5f, 2.5f)
                lineTo(1.4f, 3.5f)
                lineTo(6.9f, 9.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.1f)
                lineTo(9.5f, 11.6f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.9f)
                lineTo(20.5f, 22.6f)
                lineTo(21.6f, 21.5f)
                lineTo(9.5f, 9.5f)
                close()
            }
        }
        .build()
        return _hdrOff!!
    }

private var _hdrOff: ImageVector? = null
