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

public val MaterialDesignIcons.VideoOff: ImageVector
    get() {
        if (_videoOff != null) {
            return _videoOff!!
        }
        _videoOff = Builder(name = "VideoOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.27f, 2.0f)
                lineTo(2.0f, 3.27f)
                lineTo(4.73f, 6.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(16.2f, 18.0f, 16.39f, 17.92f, 16.54f, 17.82f)
                lineTo(19.73f, 21.0f)
                lineTo(21.0f, 19.73f)
                moveTo(21.0f, 6.5f)
                lineTo(17.0f, 10.5f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 6.0f)
                horizontalLineTo(9.82f)
                lineTo(21.0f, 17.18f)
                verticalLineTo(6.5f)
                close()
            }
        }
        .build()
        return _videoOff!!
    }

private var _videoOff: ImageVector? = null
