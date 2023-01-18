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

public val LightGroup.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) {
            return _filmSlate!!
        }
        _filmSlate = Builder(name = "FilmSlate", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 106.0f)
                lineTo(85.6f, 106.0f)
                lineToRelative(25.5f, -6.8f)
                horizontalLineToRelative(0.0f)
                lineToRelative(69.5f, -18.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(31.0f, -8.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.2f, -7.3f)
                lineTo(207.5f, 34.0f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, false, -6.5f, -8.5f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, false, -10.6f, -1.4f)
                lineTo(35.8f, 65.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.9f, 17.1f)
                lineTo(34.0f, 112.8f)
                lineTo(34.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 112.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 106.0f)
                close()
                moveTo(129.3f, 52.9f)
                lineToRelative(34.2f, 19.8f)
                lineTo(110.4f, 86.9f)
                lineTo(76.1f, 67.1f)
                close()
                moveTo(193.5f, 35.7f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.9f, 1.5f)
                lineToRelative(6.8f, 25.1f)
                lineToRelative(-22.8f, 6.1f)
                lineTo(145.6f, 48.5f)
                close()
                moveTo(38.9f, 77.1f)
                lineToRelative(20.8f, -5.6f)
                lineTo(94.0f, 91.3f)
                lineTo(44.2f, 104.7f)
                lineTo(37.5f, 79.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.9f, 77.1f)
                close()
                moveTo(210.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 118.0f)
                lineTo(210.0f, 118.0f)
                close()
            }
        }
        .build()
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
