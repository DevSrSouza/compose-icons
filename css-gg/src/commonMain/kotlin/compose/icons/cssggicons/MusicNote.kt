package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.MusicNote: ImageVector
    get() {
        if (_musicNote != null) {
            return _musicNote!!
        }
        _musicNote = Builder(name = "MusicNote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 8.954f)
                lineTo(17.635f, 7.827f)
                curveTo(19.01f, 7.552f, 20.0f, 6.345f, 20.0f, 4.943f)
                curveTo(20.0f, 3.086f, 18.302f, 1.694f, 16.481f, 2.058f)
                lineTo(12.412f, 2.872f)
                curveTo(11.009f, 3.153f, 10.0f, 4.384f, 10.0f, 5.814f)
                verticalLineTo(13.889f)
                curveTo(9.412f, 13.549f, 8.729f, 13.354f, 8.0f, 13.354f)
                curveTo(5.791f, 13.354f, 4.0f, 15.145f, 4.0f, 17.354f)
                curveTo(4.0f, 19.563f, 5.791f, 21.354f, 8.0f, 21.354f)
                curveTo(10.209f, 21.354f, 12.0f, 19.563f, 12.0f, 17.354f)
                verticalLineTo(8.954f)
                close()
                moveTo(16.874f, 4.019f)
                lineTo(12.804f, 4.833f)
                curveTo(12.337f, 4.927f, 12.0f, 5.337f, 12.0f, 5.814f)
                verticalLineTo(6.915f)
                lineTo(17.243f, 5.866f)
                curveTo(17.683f, 5.778f, 18.0f, 5.392f, 18.0f, 4.943f)
                curveTo(18.0f, 4.348f, 17.456f, 3.903f, 16.874f, 4.019f)
                close()
                moveTo(10.0f, 17.354f)
                curveTo(10.0f, 16.25f, 9.105f, 15.354f, 8.0f, 15.354f)
                curveTo(6.895f, 15.354f, 6.0f, 16.25f, 6.0f, 17.354f)
                curveTo(6.0f, 18.459f, 6.895f, 19.354f, 8.0f, 19.354f)
                curveTo(9.105f, 19.354f, 10.0f, 18.459f, 10.0f, 17.354f)
                close()
            }
        }
        .build()
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
