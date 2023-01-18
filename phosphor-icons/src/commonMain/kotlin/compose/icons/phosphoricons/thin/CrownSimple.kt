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

public val ThinGroup.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) {
            return _crownSimple!!
        }
        _crownSimple = Builder(name = "CrownSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.2f, 76.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.6f, -1.7f)
                lineTo(173.1f, 97.4f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -5.2f, -1.7f)
                lineTo(138.5f, 42.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -21.0f, 0.0f)
                lineTo(88.1f, 95.7f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -5.2f, 1.7f)
                lineTo(32.3f, 74.9f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 15.8f, 88.6f)
                lineTo(41.2f, 196.9f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, 5.6f, 7.6f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 6.1f, 1.7f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, false, 3.3f, -0.5f)
                arcToRelative(270.6f, 270.6f, 0.0f, false, true, 143.6f, 0.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 14.9f, -8.8f)
                lineTo(240.2f, 88.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 236.2f, 76.6f)
                close()
                moveTo(232.4f, 86.8f)
                lineTo(206.9f, 195.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -1.8f, 2.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, 0.4f)
                arcTo(278.4f, 278.4f, 0.0f, false, false, 54.0f, 198.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.0f, -2.9f)
                horizontalLineToRelative(0.0f)
                lineTo(23.6f, 86.8f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 1.3f, -4.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.6f, -1.0f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, true, 1.6f, 0.4f)
                lineToRelative(50.6f, 22.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.4f, -5.2f)
                lineToRelative(29.4f, -53.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 7.0f, 0.0f)
                lineToRelative(29.4f, 53.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.4f, 5.2f)
                lineToRelative(50.6f, -22.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.2f, 0.6f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 232.4f, 86.8f)
                close()
            }
        }
        .build()
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
