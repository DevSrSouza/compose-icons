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

public val LightGroup.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) {
            return _asteriskSimple!!
        }
        _asteriskSimple = Builder(name = "AsteriskSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.5f, 106.5f)
                lineToRelative(-75.8f, 24.7f)
                lineToRelative(46.9f, 64.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.9f, 9.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.8f, -2.5f)
                lineTo(128.0f, 138.2f)
                lineTo(81.1f, 202.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.8f, 2.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.9f, -9.5f)
                lineToRelative(46.9f, -64.5f)
                lineTo(42.5f, 106.5f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 38.6f, 99.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.6f, -3.9f)
                lineTo(122.0f, 119.7f)
                verticalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(79.7f)
                lineToRelative(75.8f, -24.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.6f, 3.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 213.5f, 106.5f)
                close()
            }
        }
        .build()
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
