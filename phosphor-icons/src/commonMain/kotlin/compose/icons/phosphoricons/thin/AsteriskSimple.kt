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

public val ThinGroup.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) {
            return _asteriskSimple!!
        }
        _asteriskSimple = Builder(name = "AsteriskSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.9f, 104.6f)
                lineToRelative(-78.4f, 25.5f)
                lineTo(183.0f, 196.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.9f, 5.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -2.4f, 0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -1.7f)
                lineTo(128.0f, 134.8f)
                lineTo(79.5f, 201.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, 1.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -2.4f, -0.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.9f, -5.6f)
                lineToRelative(48.5f, -66.7f)
                lineTo(43.1f, 104.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 45.5f, 97.0f)
                lineTo(124.0f, 122.5f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(82.5f)
                lineTo(210.5f, 97.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.4f, 7.6f)
                close()
            }
        }
        .build()
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
