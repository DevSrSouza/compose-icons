package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.7f, 174.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.5f, 2.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -2.0f, -0.5f)
                lineTo(132.0f, 134.9f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(134.9f)
                lineTo(53.8f, 175.5f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -2.0f, 0.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -7.5f)
                lineTo(120.0f, 128.0f)
                lineTo(49.8f, 87.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -7.0f)
                lineTo(124.0f, 121.1f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(81.1f)
                lineToRelative(70.2f, -40.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, 7.0f)
                lineTo(136.0f, 128.0f)
                lineToRelative(70.2f, 40.5f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 207.7f, 174.0f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
