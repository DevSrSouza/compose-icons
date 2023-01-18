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

public val ThinGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.1f, 203.4f)
                lineTo(138.5f, 34.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -21.0f, 0.0f)
                lineTo(22.9f, 203.4f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 24.2f, 217.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 13.2f, 3.6f)
                lineToRelative(89.3f, -31.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.6f, 0.0f)
                lineToRelative(89.3f, 31.9f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, 4.0f, 0.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.5f, -17.9f)
                close()
                moveTo(225.6f, 211.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -4.4f, 1.2f)
                lineTo(132.0f, 181.2f)
                horizontalLineToRelative(0.0f)
                lineTo(132.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(61.2f)
                horizontalLineToRelative(0.0f)
                lineTo(34.8f, 213.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.9f, -5.8f)
                lineTo(124.5f, 38.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 7.0f, 0.0f)
                lineToRelative(94.6f, 168.9f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 225.6f, 211.9f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
