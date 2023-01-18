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

public val ThinGroup.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) {
            return _filmSlate!!
        }
        _filmSlate = Builder(name = "FilmSlate", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 108.0f)
                lineTo(70.4f, 108.0f)
                lineToRelative(40.2f, -10.8f)
                horizontalLineToRelative(0.0f)
                lineToRelative(69.5f, -18.6f)
                horizontalLineToRelative(0.0f)
                lineTo(211.0f, 70.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.5f, -1.9f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.4f, -3.0f)
                lineToRelative(-8.3f, -30.9f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -5.6f, -7.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -9.1f, -1.2f)
                lineTo(59.5f, 61.2f)
                horizontalLineToRelative(0.0f)
                lineTo(36.3f, 67.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -8.4f, 14.7f)
                lineTo(36.0f, 112.5f)
                lineTo(36.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 112.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 108.0f)
                close()
                moveTo(129.5f, 50.7f)
                lineToRelative(39.2f, 22.7f)
                lineTo(110.1f, 89.1f)
                lineTo(70.9f, 66.4f)
                close()
                moveTo(193.0f, 33.7f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.9f, 3.0f)
                lineToRelative(7.2f, 27.0f)
                lineToRelative(-25.4f, 6.8f)
                lineTo(140.5f, 47.8f)
                close()
                moveTo(38.4f, 75.2f)
                lineTo(60.0f, 69.4f)
                lineTo(99.2f, 92.0f)
                lineTo(42.8f, 107.1f)
                lineToRelative(-7.2f, -27.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 38.4f, 75.2f)
                close()
                moveTo(212.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 116.0f)
                lineTo(212.0f, 116.0f)
                close()
            }
        }
        .build()
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
