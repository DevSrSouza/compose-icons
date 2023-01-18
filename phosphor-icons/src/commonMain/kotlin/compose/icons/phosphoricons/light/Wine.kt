package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Wine: ImageVector
    get() {
        if (_wine != null) {
            return _wine!!
        }
        _wine = Builder(name = "Wine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.8f, 110.6f)
                lineToRelative(-26.0f, -88.3f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 176.0f, 18.0f)
                lineTo(80.0f, 18.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -5.8f, 4.3f)
                lineToRelative(-26.0f, 88.3f)
                arcToRelative(29.8f, 29.8f, 0.0f, false, false, 1.4f, 20.8f)
                arcTo(86.3f, 86.3f, 0.0f, false, false, 122.0f, 181.8f)
                lineTo(122.0f, 226.0f)
                lineTo(88.0f, 226.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 226.0f)
                lineTo(134.0f, 181.8f)
                arcToRelative(86.3f, 86.3f, 0.0f, false, false, 72.4f, -50.4f)
                arcTo(29.8f, 29.8f, 0.0f, false, false, 207.8f, 110.6f)
                close()
                moveTo(84.5f, 30.0f)
                horizontalLineToRelative(87.0f)
                lineToRelative(21.8f, 73.6f)
                curveToRelative(-10.7f, 4.9f, -32.3f, 10.2f, -62.6f, -5.0f)
                curveToRelative(-27.8f, -13.8f, -49.5f, -12.7f, -64.0f, -8.5f)
                close()
                moveTo(195.5f, 126.5f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, true, -135.0f, 0.0f)
                arcToRelative(18.5f, 18.5f, 0.0f, false, true, -0.8f, -12.5f)
                lineToRelative(2.8f, -9.5f)
                curveToRelative(11.2f, -5.3f, 32.6f, -10.2f, 62.8f, 4.9f)
                curveToRelative(16.9f, 8.4f, 31.7f, 11.3f, 43.8f, 11.3f)
                arcToRelative(71.3f, 71.3f, 0.0f, false, false, 27.5f, -5.4f)
                arcTo(18.7f, 18.7f, 0.0f, false, true, 195.5f, 126.5f)
                close()
            }
        }
        .build()
        return _wine!!
    }

private var _wine: ImageVector? = null
