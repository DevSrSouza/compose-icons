package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SunCloudyFill: ImageVector
    get() {
        if (_sunCloudyFill != null) {
            return _sunCloudyFill!!
        }
        _sunCloudyFill = Builder(name = "SunCloudyFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.984f, 5.06f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 11.286f, 6.436f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 17.5f, 21.0f)
                lineTo(9.0f, 20.999f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.984f, -15.94f)
                close()
                moveTo(12.055f, 5.604f)
                arcToRelative(8.026f, 8.026f, 0.0f, false, true, 4.403f, 4.495f)
                arcToRelative(5.529f, 5.529f, 0.0f, false, true, 3.12f, 0.307f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -7.522f, -4.802f)
                close()
            }
        }
        .build()
        return _sunCloudyFill!!
    }

private var _sunCloudyFill: ImageVector? = null
