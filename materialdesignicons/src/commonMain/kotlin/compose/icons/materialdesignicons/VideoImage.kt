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

public val MaterialDesignIcons.VideoImage: ImageVector
    get() {
        if (_videoImage != null) {
            return _videoImage!!
        }
        _videoImage = Builder(name = "VideoImage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.5f)
                lineTo(21.0f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(17.0f, 13.5f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 18.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 17.0f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 6.0f)
                horizontalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 7.0f)
                verticalLineTo(10.5f)
                moveTo(10.91f, 9.55f)
                lineTo(9.2f, 11.82f)
                lineTo(10.5f, 13.55f)
                lineTo(9.77f, 14.09f)
                lineTo(7.73f, 11.36f)
                lineTo(5.0f, 15.0f)
                horizontalLineTo(15.0f)
                lineTo(10.91f, 9.55f)
                close()
            }
        }
        .build()
        return _videoImage!!
    }

private var _videoImage: ImageVector? = null
