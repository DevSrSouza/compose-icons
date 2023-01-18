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

public val RemixIcons.FireLine: ImageVector
    get() {
        if (_fireLine != null) {
            return _fireLine!!
        }
        _fireLine = Builder(name = "FireLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 7.5f, -7.5f)
                curveToRelative(0.0f, -0.866f, -0.23f, -1.697f, -0.5f, -2.47f)
                curveToRelative(-1.667f, 1.647f, -2.933f, 2.47f, -3.8f, 2.47f)
                curveToRelative(3.995f, -7.0f, 1.8f, -10.0f, -4.2f, -14.0f)
                curveToRelative(0.5f, 5.0f, -2.796f, 7.274f, -4.138f, 8.537f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 12.0f, 23.0f)
                close()
                moveTo(12.71f, 5.235f)
                curveToRelative(3.241f, 2.75f, 3.257f, 4.887f, 0.753f, 9.274f)
                curveToRelative(-0.761f, 1.333f, 0.202f, 2.991f, 1.737f, 2.991f)
                curveToRelative(0.688f, 0.0f, 1.384f, -0.2f, 2.119f, -0.595f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -9.087f, -5.412f)
                curveToRelative(0.126f, -0.118f, 0.765f, -0.685f, 0.793f, -0.71f)
                curveToRelative(0.424f, -0.38f, 0.773f, -0.717f, 1.118f, -1.086f)
                curveToRelative(1.23f, -1.318f, 2.114f, -2.78f, 2.566f, -4.462f)
                close()
            }
        }
        .build()
        return _fireLine!!
    }

private var _fireLine: ImageVector? = null
