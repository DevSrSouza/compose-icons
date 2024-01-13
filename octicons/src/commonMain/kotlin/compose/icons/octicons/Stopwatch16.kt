package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Stopwatch16: ImageVector
    get() {
        if (_stopwatch16 != null) {
            return _stopwatch16!!
        }
        _stopwatch16 = Builder(name = "Stopwatch16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 0.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(1.0f)
                lineToRelative(-0.001f, 0.041f)
                arcToRelative(6.724f, 6.724f, 0.0f, false, true, 3.464f, 1.435f)
                lineToRelative(0.007f, -0.006f)
                lineToRelative(0.75f, -0.75f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 1.275f, 0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.215f, 0.734f)
                lineToRelative(-0.75f, 0.75f)
                lineToRelative(-0.006f, 0.007f)
                arcToRelative(6.75f, 6.75f, 0.0f, true, true, -10.548f, 0.0f)
                lineTo(2.72f, 5.03f)
                lineToRelative(-0.75f, -0.75f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, -1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, -0.018f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(0.007f, 0.006f)
                arcTo(6.72f, 6.72f, 0.0f, false, true, 7.25f, 2.541f)
                lineTo(7.25f, 1.5f)
                lineTo(6.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(8.0f, 14.5f)
                arcToRelative(5.25f, 5.25f, 0.0f, true, false, -0.001f, -10.501f)
                arcTo(5.25f, 5.25f, 0.0f, false, false, 8.0f, 14.5f)
                close()
                moveTo(8.389f, 7.8f)
                lineTo(9.719f, 6.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.061f, 1.06f)
                lineTo(9.45f, 8.861f)
                arcTo(1.503f, 1.503f, 0.0f, false, true, 8.0f, 10.75f)
                arcToRelative(1.499f, 1.499f, 0.0f, true, true, 0.389f, -2.95f)
                close()
            }
        }
        .build()
        return _stopwatch16!!
    }

private var _stopwatch16: ImageVector? = null
