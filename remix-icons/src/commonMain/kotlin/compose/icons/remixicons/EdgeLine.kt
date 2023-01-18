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

public val RemixIcons.EdgeLine: ImageVector
    get() {
        if (_edgeLine != null) {
            return _edgeLine!!
        }
        _edgeLine = Builder(name = "EdgeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.007f, 14.001f)
                arcTo(4.559f, 4.559f, 0.0f, false, false, 8.0f, 14.25f)
                curveTo(8.0f, 16.632f, 9.753f, 19.0f, 13.0f, 19.0f)
                curveToRelative(2.373f, 0.0f, 4.528f, -0.655f, 6.0f, -1.553f)
                verticalLineToRelative(3.35f)
                curveTo(17.211f, 21.564f, 15.113f, 22.0f, 13.0f, 22.0f)
                curveToRelative(-5.502f, 0.0f, -8.0f, -3.47f, -8.0f, -7.75f)
                curveToRelative(0.0f, -3.231f, 2.041f, -6.0f, 4.943f, -7.164f)
                curveTo(8.539f, 8.663f, 8.0f, 10.341f, 8.0f, 10.996f)
                lineTo(18.0f, 11.0f)
                curveToRelative(0.0f, -3.406f, -2.548f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-5.0f, 0.0f, -8.001f, 3.988f, -9.0f, 5.999f)
                curveTo(3.29f, 6.237f, 7.01f, 2.0f, 12.0f, 2.0f)
                curveToRelative(5.2f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.0f)
                lineToRelative(0.007f, 0.001f)
                close()
            }
        }
        .build()
        return _edgeLine!!
    }

private var _edgeLine: ImageVector? = null
