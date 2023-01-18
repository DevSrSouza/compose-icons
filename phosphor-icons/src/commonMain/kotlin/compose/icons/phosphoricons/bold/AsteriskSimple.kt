package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) {
            return _asteriskSimple!!
        }
        _asteriskSimple = Builder(name = "AsteriskSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.4f, 112.2f)
                lineToRelative(-68.0f, 22.1f)
                lineToRelative(42.0f, 57.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -2.6f, 16.8f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -7.1f, 2.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -9.7f, -5.0f)
                lineToRelative(-42.0f, -57.8f)
                lineTo(86.0f, 206.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -9.7f, 5.0f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -7.1f, -2.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -2.6f, -16.8f)
                lineToRelative(42.0f, -57.8f)
                lineToRelative(-68.0f, -22.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 89.4f)
                lineToRelative(68.0f, 22.1f)
                verticalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(71.5f)
                lineToRelative(68.0f, -22.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.4f, 22.8f)
                close()
            }
        }
        .build()
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
