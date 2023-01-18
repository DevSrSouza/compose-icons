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

public val RemixIcons.CloudyLine: ImageVector
    get() {
        if (_cloudyLine != null) {
            return _cloudyLine!!
        }
        _cloudyLine = Builder(name = "CloudyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 6.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, 13.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -0.957f, -8.898f)
                arcTo(6.502f, 6.502f, 0.0f, false, false, 9.5f, 6.0f)
                close()
                moveTo(16.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 7.215f, -12.997f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 16.5f, 21.0f)
                close()
            }
        }
        .build()
        return _cloudyLine!!
    }

private var _cloudyLine: ImageVector? = null
