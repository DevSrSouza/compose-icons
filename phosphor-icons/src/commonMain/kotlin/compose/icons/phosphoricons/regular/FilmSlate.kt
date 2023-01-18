package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) {
            return _filmSlate!!
        }
        _filmSlate = Builder(name = "FilmSlate", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 104.0f)
                lineTo(100.8f, 104.0f)
                lineTo(212.1f, 74.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.8f, -3.8f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 0.8f, -6.0f)
                lineToRelative(-8.3f, -30.9f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, -19.5f, -11.3f)
                lineTo(35.3f, 63.6f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 24.0f, 83.2f)
                lineToRelative(8.0f, 29.9f)
                lineTo(32.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 104.0f)
                close()
                moveTo(129.0f, 55.0f)
                lineToRelative(29.4f, 17.0f)
                lineTo(110.7f, 84.8f)
                lineToRelative(-29.4f, -17.0f)
                close()
                moveTo(194.0f, 37.6f)
                lineTo(200.2f, 60.8f)
                lineTo(180.2f, 66.1f)
                lineTo(150.8f, 49.2f)
                close()
                moveTo(59.4f, 73.7f)
                lineTo(88.8f, 90.6f)
                lineTo(45.7f, 102.2f)
                lineTo(39.4f, 79.0f)
                close()
                moveTo(208.0f, 200.0f)
                lineTo(48.0f, 200.0f)
                lineTo(48.0f, 120.0f)
                lineTo(208.0f, 120.0f)
                verticalLineToRelative(80.0f)
                close()
            }
        }
        .build()
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
