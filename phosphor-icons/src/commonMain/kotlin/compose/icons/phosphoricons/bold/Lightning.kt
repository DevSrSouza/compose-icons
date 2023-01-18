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

public val BoldGroup.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(name = "Lightning", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 252.0f)
                arcToRelative(13.4f, 13.4f, 0.0f, false, true, -5.5f, -1.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -6.3f, -13.1f)
                lineToRelative(14.0f, -70.0f)
                lineTo(43.8f, 147.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -7.5f, -8.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 2.9f, -10.9f)
                lineToRelative(112.0f, -120.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 14.3f, -2.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 6.3f, 13.0f)
                lineToRelative(-14.0f, 70.0f)
                lineToRelative(54.4f, 20.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 7.5f, 8.5f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -2.9f, 11.0f)
                lineToRelative(-112.0f, 120.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 96.0f, 252.0f)
                close()
                moveTo(69.0f, 131.0f)
                lineToRelative(47.2f, 17.7f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 7.6f, 13.6f)
                lineToRelative(-7.7f, 38.6f)
                lineToRelative(70.9f, -76.0f)
                lineToRelative(-47.2f, -17.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -7.6f, -13.6f)
                lineTo(139.9f, 55.0f)
                close()
            }
        }
        .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
