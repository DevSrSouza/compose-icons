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

public val MaterialDesignIcons.VideoInputAntenna: ImageVector
    get() {
        if (_videoInputAntenna != null) {
            return _videoInputAntenna!!
        }
        _videoInputAntenna = Builder(name = "VideoInputAntenna", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 5.0f, 12.0f)
                horizontalLineTo(7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 12.0f)
                horizontalLineTo(19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 5.0f)
                moveTo(13.0f, 14.29f)
                curveTo(13.88f, 13.9f, 14.5f, 13.03f, 14.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 12.0f)
                curveTo(9.5f, 13.0f, 10.12f, 13.9f, 11.0f, 14.29f)
                verticalLineTo(17.59f)
                lineTo(7.59f, 21.0f)
                lineTo(9.0f, 22.41f)
                lineTo(12.0f, 19.41f)
                lineTo(15.0f, 22.41f)
                lineTo(16.41f, 21.0f)
                lineTo(13.0f, 17.59f)
                verticalLineTo(14.29f)
                moveTo(12.0f, 1.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 1.0f, 12.0f)
                horizontalLineTo(3.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 3.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 21.0f, 12.0f)
                horizontalLineTo(23.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _videoInputAntenna!!
    }

private var _videoInputAntenna: ImageVector? = null
