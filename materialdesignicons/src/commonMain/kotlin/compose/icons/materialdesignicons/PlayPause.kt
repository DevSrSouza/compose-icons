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

public val MaterialDesignIcons.PlayPause: ImageVector
    get() {
        if (_playPause != null) {
            return _playPause!!
        }
        _playPause = Builder(name = "PlayPause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                verticalLineTo(19.0f)
                lineTo(11.0f, 12.0f)
                moveTo(13.0f, 19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                moveTo(18.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
            }
        }
        .build()
        return _playPause!!
    }

private var _playPause: ImageVector? = null
