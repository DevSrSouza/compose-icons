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

public val MaterialDesignIcons.VideoBoxOff: ImageVector
    get() {
        if (_videoBoxOff != null) {
            return _videoBoxOff!!
        }
        _videoBoxOff = Builder(name = "VideoBoxOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                horizontalLineTo(6.73f)
                lineTo(14.0f, 15.27f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                moveTo(2.27f, 1.0f)
                lineTo(1.0f, 2.27f)
                lineTo(3.0f, 4.28f)
                curveTo(2.41f, 4.62f, 2.0f, 5.26f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(18.73f)
                lineTo(20.73f, 22.0f)
                lineTo(22.0f, 20.73f)
                moveTo(20.0f, 4.0f)
                horizontalLineTo(7.82f)
                lineTo(11.82f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.18f)
                lineTo(14.57f, 10.75f)
                lineTo(18.0f, 8.0f)
                verticalLineTo(14.18f)
                lineTo(22.0f, 18.17f)
                curveTo(22.0f, 18.11f, 22.0f, 18.06f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 4.0f)
                close()
            }
        }
        .build()
        return _videoBoxOff!!
    }

private var _videoBoxOff: ImageVector? = null
