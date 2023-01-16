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

public val MaterialDesignIcons.VideoCheck: ImageVector
    get() {
        if (_videoCheck != null) {
            return _videoCheck!!
        }
        _videoCheck = Builder(name = "VideoCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.5f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 6.45f, 16.55f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 6.0f, 3.0f, 6.45f, 3.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(3.0f, 17.55f, 3.45f, 18.0f, 4.0f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(16.55f, 18.0f, 17.0f, 17.55f, 17.0f, 17.0f)
                verticalLineTo(13.5f)
                lineTo(21.0f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(17.0f, 10.5f)
                moveTo(8.93f, 15.0f)
                lineTo(6.0f, 11.8f)
                lineTo(7.24f, 10.56f)
                lineTo(8.93f, 12.26f)
                lineTo(12.76f, 8.43f)
                lineTo(14.0f, 9.93f)
                lineTo(8.93f, 15.0f)
                close()
            }
        }
        .build()
        return _videoCheck!!
    }

private var _videoCheck: ImageVector? = null
