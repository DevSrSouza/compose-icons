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

public val FilledGroup.Braces: ImageVector
    get() {
        if (_braces != null) {
            return _braces!!
        }
        _braces = Builder(name = "Braces", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(4.0f, 4.3432f, 5.3432f, 3.0f, 7.0f, 3.0f)
                curveTo(7.5523f, 3.0f, 8.0f, 3.4477f, 8.0f, 4.0f)
                curveTo(8.0f, 4.5523f, 7.5523f, 5.0f, 7.0f, 5.0f)
                curveTo(6.4477f, 5.0f, 6.0f, 5.4477f, 6.0f, 6.0f)
                verticalLineTo(9.9384f)
                curveTo(6.0f, 10.7267f, 5.6928f, 11.457f, 5.1795f, 12.0f)
                curveTo(5.6928f, 12.543f, 6.0f, 13.2733f, 6.0f, 14.0616f)
                verticalLineTo(18.0f)
                curveTo(6.0f, 18.5523f, 6.4477f, 19.0f, 7.0f, 19.0f)
                curveTo(7.5523f, 19.0f, 8.0f, 19.4477f, 8.0f, 20.0f)
                curveTo(8.0f, 20.5523f, 7.5523f, 21.0f, 7.0f, 21.0f)
                curveTo(5.3432f, 21.0f, 4.0f, 19.6569f, 4.0f, 18.0f)
                verticalLineTo(14.0616f)
                curveTo(4.0f, 13.6027f, 3.6877f, 13.2027f, 3.2425f, 13.0914f)
                lineTo(2.7575f, 12.9701f)
                curveTo(2.3123f, 12.8589f, 2.0f, 12.4589f, 2.0f, 12.0f)
                curveTo(2.0f, 11.5411f, 2.3123f, 11.1411f, 2.7575f, 11.0299f)
                lineTo(3.2425f, 10.9086f)
                curveTo(3.6877f, 10.7973f, 4.0f, 10.3973f, 4.0f, 9.9384f)
                verticalLineTo(6.0f)
                close()
                moveTo(20.0f, 6.0f)
                curveTo(20.0f, 4.3432f, 18.6569f, 3.0f, 17.0f, 3.0f)
                curveTo(16.4477f, 3.0f, 16.0f, 3.4477f, 16.0f, 4.0f)
                curveTo(16.0f, 4.5523f, 16.4477f, 5.0f, 17.0f, 5.0f)
                curveTo(17.5523f, 5.0f, 18.0f, 5.4477f, 18.0f, 6.0f)
                verticalLineTo(9.9384f)
                curveTo(18.0f, 10.7267f, 18.3072f, 11.457f, 18.8205f, 12.0f)
                curveTo(18.3072f, 12.543f, 18.0f, 13.2733f, 18.0f, 14.0616f)
                verticalLineTo(18.0f)
                curveTo(18.0f, 18.5523f, 17.5523f, 19.0f, 17.0f, 19.0f)
                curveTo(16.4477f, 19.0f, 16.0f, 19.4477f, 16.0f, 20.0f)
                curveTo(16.0f, 20.5523f, 16.4477f, 21.0f, 17.0f, 21.0f)
                curveTo(18.6569f, 21.0f, 20.0f, 19.6569f, 20.0f, 18.0f)
                verticalLineTo(14.0616f)
                curveTo(20.0f, 13.6027f, 20.3123f, 13.2027f, 20.7575f, 13.0914f)
                lineTo(21.2425f, 12.9701f)
                curveTo(21.6877f, 12.8589f, 22.0f, 12.4589f, 22.0f, 12.0f)
                curveTo(22.0f, 11.5411f, 21.6877f, 11.1411f, 21.2425f, 11.0299f)
                lineTo(20.7575f, 10.9086f)
                curveTo(20.3123f, 10.7973f, 20.0f, 10.3973f, 20.0f, 9.9384f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _braces!!
    }

private var _braces: ImageVector? = null
