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

public val BoldGroup.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) {
            return _filmSlate!!
        }
        _filmSlate = Builder(name = "FilmSlate", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 100.0f)
                lineTo(131.1f, 100.0f)
                lineToRelative(51.0f, -13.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(31.0f, -8.3f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 7.3f, -5.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.2f, -9.1f)
                lineToRelative(-8.3f, -30.9f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -24.5f, -14.1f)
                lineTo(34.3f, 59.7f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.1f, 84.2f)
                lineTo(28.0f, 113.6f)
                lineTo(28.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 100.0f)
                close()
                moveTo(128.4f, 59.3f)
                lineTo(148.0f, 70.6f)
                lineToRelative(-36.8f, 9.9f)
                lineTo(91.6f, 69.2f)
                close()
                moveTo(191.2f, 42.5f)
                lineTo(195.3f, 58.0f)
                lineToRelative(-14.5f, 3.9f)
                lineTo(161.2f, 50.5f)
                close()
                moveTo(58.9f, 78.0f)
                lineTo(78.5f, 89.3f)
                lineToRelative(-30.0f, 8.0f)
                lineTo(44.3f, 81.8f)
                close()
                moveTo(204.0f, 196.0f)
                lineTo(52.0f, 196.0f)
                lineTo(52.0f, 124.0f)
                lineTo(204.0f, 124.0f)
                close()
            }
        }
        .build()
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
