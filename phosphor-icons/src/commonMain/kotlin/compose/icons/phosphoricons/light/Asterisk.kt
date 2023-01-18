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

public val LightGroup.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.4f, 175.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.2f, 3.0f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -3.0f, -0.8f)
                lineTo(134.0f, 138.4f)
                verticalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(138.4f)
                lineTo(54.8f, 177.2f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -3.0f, 0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.0f, -11.2f)
                lineTo(116.0f, 128.0f)
                lineTo(48.8f, 89.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -10.4f)
                lineTo(122.0f, 117.6f)
                verticalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(77.6f)
                lineToRelative(67.2f, -38.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 10.4f)
                lineTo(140.0f, 128.0f)
                lineToRelative(67.2f, 38.8f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 209.4f, 175.0f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
