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

public val ThinGroup.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, true, false, 55.3f, 183.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.1f, -5.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -5.5f, -1.1f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 220.0f, 128.0f)
                curveToRelative(0.0f, 31.3f, -15.0f, 36.0f, -24.0f, 36.0f)
                reflectiveCurveToRelative(-24.0f, -4.7f, -24.0f, -36.0f)
                lineTo(172.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(14.7f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 2.8f, 46.0f)
                curveToRelative(4.7f, 14.9f, 14.9f, 23.3f, 29.2f, 23.3f)
                curveToRelative(20.0f, 0.0f, 32.0f, -16.4f, 32.0f, -44.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
