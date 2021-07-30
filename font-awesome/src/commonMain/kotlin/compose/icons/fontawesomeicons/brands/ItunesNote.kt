package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.ItunesNote: ImageVector
    get() {
        if (_itunesNote != null) {
            return _itunesNote!!
        }
        _itunesNote = Builder(name = "ItunesNote", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(381.9f, 388.2f)
                curveToRelative(-6.4f, 27.4f, -27.2f, 42.8f, -55.1f, 48.0f)
                curveToRelative(-24.5f, 4.5f, -44.9f, 5.6f, -64.5f, -10.2f)
                curveToRelative(-23.9f, -20.1f, -24.2f, -53.4f, -2.7f, -74.4f)
                curveToRelative(17.0f, -16.2f, 40.9f, -19.5f, 76.8f, -25.8f)
                curveToRelative(6.0f, -1.1f, 11.2f, -2.5f, 15.6f, -7.4f)
                curveToRelative(6.4f, -7.2f, 4.4f, -4.1f, 4.4f, -163.2f)
                curveToRelative(0.0f, -11.2f, -5.5f, -14.3f, -17.0f, -12.3f)
                curveToRelative(-8.2f, 1.4f, -185.7f, 34.6f, -185.7f, 34.6f)
                curveToRelative(-10.2f, 2.2f, -13.4f, 5.2f, -13.4f, 16.7f)
                curveToRelative(0.0f, 234.7f, 1.1f, 223.9f, -2.5f, 239.5f)
                curveToRelative(-4.2f, 18.2f, -15.4f, 31.9f, -30.2f, 39.5f)
                curveToRelative(-16.8f, 9.3f, -47.2f, 13.4f, -63.4f, 10.4f)
                curveToRelative(-43.2f, -8.1f, -58.4f, -58.0f, -29.1f, -86.6f)
                curveToRelative(17.0f, -16.2f, 40.9f, -19.5f, 76.8f, -25.8f)
                curveToRelative(6.0f, -1.1f, 11.2f, -2.5f, 15.6f, -7.4f)
                curveToRelative(10.1f, -11.5f, 1.8f, -256.6f, 5.2f, -270.2f)
                curveToRelative(0.8f, -5.2f, 3.0f, -9.6f, 7.1f, -12.9f)
                curveToRelative(4.2f, -3.5f, 11.8f, -5.5f, 13.4f, -5.5f)
                curveToRelative(204.0f, -38.2f, 228.9f, -43.1f, 232.4f, -43.1f)
                curveToRelative(11.5f, -0.8f, 18.1f, 6.0f, 18.1f, 17.6f)
                curveToRelative(0.2f, 344.5f, 1.1f, 326.0f, -1.8f, 338.5f)
                close()
            }
        }
        .build()
        return _itunesNote!!
    }

private var _itunesNote: ImageVector? = null
