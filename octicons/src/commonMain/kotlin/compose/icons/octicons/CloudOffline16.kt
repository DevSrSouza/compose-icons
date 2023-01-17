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

public val Octicons.CloudOffline16: ImageVector
    get() {
        if (_cloudOffline16 != null) {
            return _cloudOffline16!!
        }
        _cloudOffline16 = Builder(name = "CloudOffline16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 2.0f)
                curveToRelative(-0.69f, 0.0f, -1.351f, 0.13f, -1.957f, 0.371f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.554f, 1.394f)
                curveToRelative(0.43f, -0.17f, 0.903f, -0.265f, 1.403f, -0.265f)
                arcToRelative(3.72f, 3.72f, 0.0f, false, true, 3.541f, 2.496f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.709f, 0.504f)
                curveToRelative(1.676f, 0.0f, 3.0f, 1.324f, 3.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.681f, 1.92f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.156f, 0.955f)
                arcTo(4.496f, 4.496f, 0.0f, false, false, 16.0f, 9.5f)
                arcToRelative(4.472f, 4.472f, 0.0f, false, false, -3.983f, -4.471f)
                arcTo(5.222f, 5.222f, 0.0f, false, false, 7.25f, 2.0f)
                close()
                moveTo(0.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(2.311f, 2.31f)
                curveToRelative(0.03f, 0.025f, 0.056f, 0.052f, 0.08f, 0.08f)
                lineToRelative(8.531f, 8.532f)
                lineToRelative(0.035f, 0.034f)
                lineToRelative(2.043f, 2.044f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                lineToRelative(-1.8f, -1.799f)
                arcToRelative(4.54f, 4.54f, 0.0f, false, true, -0.42f, 0.019f)
                horizontalLineToRelative(-8.0f)
                arcTo(3.474f, 3.474f, 0.0f, false, true, 0.0f, 10.5f)
                curveToRelative(0.0f, -1.41f, 0.809f, -2.614f, 2.001f, -3.17f)
                arcToRelative(5.218f, 5.218f, 0.0f, false, true, 0.646f, -2.622f)
                lineTo(0.72f, 2.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(3.5f, 7.25f)
                curveToRelative(0.004f, 0.161f, 0.018f, 0.322f, 0.041f, 0.481f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.557f, 0.833f)
                curveToRelative(-0.86f, 0.22f, -1.484f, 0.986f, -1.484f, 1.936f)
                curveToRelative(0.0f, 1.124f, 0.876f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.94f)
                lineTo(3.771f, 5.832f)
                arcTo(3.788f, 3.788f, 0.0f, false, false, 3.5f, 7.25f)
                close()
            }
        }
        .build()
        return _cloudOffline16!!
    }

private var _cloudOffline16: ImageVector? = null
