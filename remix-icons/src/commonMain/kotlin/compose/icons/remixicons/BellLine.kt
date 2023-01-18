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

public val RemixIcons.BellLine: ImageVector
    get() {
        if (_bellLine != null) {
            return _bellLine!!
        }
        _bellLine = Builder(name = "BellLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.121f, 9.879f)
                curveToRelative(4.296f, 4.295f, 6.829f, 8.728f, 5.657f, 9.9f)
                curveToRelative(-0.475f, 0.474f, -1.486f, 0.34f, -2.807f, -0.273f)
                arcToRelative(9.008f, 9.008f, 0.0f, false, true, -10.59f, -0.474f)
                lineToRelative(-0.038f, 0.04f)
                lineToRelative(-1.414f, -1.415f)
                lineToRelative(0.038f, -0.04f)
                arcTo(9.006f, 9.006f, 0.0f, false, true, 4.495f, 7.03f)
                curveToRelative(-0.614f, -1.322f, -0.748f, -2.333f, -0.273f, -2.808f)
                curveToRelative(1.128f, -1.128f, 5.277f, 1.177f, 9.417f, 5.182f)
                lineToRelative(0.482f, 0.475f)
                close()
                moveTo(12.707f, 11.293f)
                curveTo(10.823f, 9.409f, 8.87f, 7.842f, 7.236f, 6.87f)
                lineToRelative(-0.186f, 0.18f)
                arcToRelative(7.002f, 7.002f, 0.0f, false, false, -0.657f, 9.142f)
                lineToRelative(1.846f, -1.846f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 1.416f, 1.415f)
                lineToRelative(-1.848f, 1.846f)
                arcToRelative(7.002f, 7.002f, 0.0f, false, false, 9.143f, -0.657f)
                lineToRelative(0.179f, -0.188f)
                lineToRelative(-0.053f, -0.089f)
                curveToRelative(-0.976f, -1.615f, -2.52f, -3.53f, -4.369f, -5.38f)
                close()
                moveTo(19.778f, 4.222f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.164f, 2.976f)
                arcToRelative(9.015f, 9.015f, 0.0f, false, true, 0.662f, 8.345f)
                arcToRelative(21.168f, 21.168f, 0.0f, false, false, -1.386f, -2.306f)
                arcToRelative(6.99f, 6.99f, 0.0f, false, false, -1.94f, -6.187f)
                arcToRelative(6.992f, 6.992f, 0.0f, false, false, -6.187f, -1.94f)
                arcToRelative(21.092f, 21.092f, 0.0f, false, false, -2.306f, -1.386f)
                arcToRelative(9.016f, 9.016f, 0.0f, false, true, 8.347f, 0.663f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.974f, -0.165f)
                close()
            }
        }
        .build()
        return _bellLine!!
    }

private var _bellLine: ImageVector? = null
