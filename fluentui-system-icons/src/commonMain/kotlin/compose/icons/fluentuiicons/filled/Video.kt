package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(name = "Video", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.25f)
                curveTo(16.0f, 18.0449f, 14.5449f, 19.5f, 12.75f, 19.5f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 19.5f, 2.0f, 18.0449f, 2.0f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(2.0f, 5.9551f, 3.4551f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(12.75f)
                curveTo(14.5449f, 4.5f, 16.0f, 5.9551f, 16.0f, 7.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(21.762f, 5.8933f)
                curveTo(21.9156f, 6.0741f, 22.0f, 6.3037f, 22.0f, 6.541f)
                verticalLineTo(17.4588f)
                curveTo(22.0f, 18.0111f, 21.5523f, 18.4588f, 21.0f, 18.4588f)
                curveTo(20.7627f, 18.4588f, 20.5332f, 18.3744f, 20.3524f, 18.2208f)
                lineTo(17.0f, 15.3709f)
                verticalLineTo(8.6279f)
                lineTo(20.3524f, 5.779f)
                curveTo(20.7732f, 5.4213f, 21.4043f, 5.4725f, 21.762f, 5.8933f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null
