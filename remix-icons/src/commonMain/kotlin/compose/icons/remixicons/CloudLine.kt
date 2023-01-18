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

public val RemixIcons.CloudLine: ImageVector
    get() {
        if (_cloudLine != null) {
            return _cloudLine!!
        }
        _cloudLine = Builder(name = "CloudLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 5.008f, 9.339f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 13.984f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 17.0f, 21.0f)
                close()
                moveTo(17.0f, 9.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, -9.994f, 0.243f)
                lineToRelative(0.07f, 1.488f)
                lineToRelative(-1.404f, 0.494f)
                arcTo(4.002f, 4.002f, 0.0f, false, false, 7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.796f, -5.265f)
                lineToRelative(-1.898f, -0.633f)
                arcTo(6.003f, 6.003f, 0.0f, false, true, 17.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cloudLine!!
    }

private var _cloudLine: ImageVector? = null
