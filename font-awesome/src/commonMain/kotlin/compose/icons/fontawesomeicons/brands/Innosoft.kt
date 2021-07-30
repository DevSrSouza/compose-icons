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

public val BrandsGroup.Innosoft: ImageVector
    get() {
        if (_innosoft != null) {
            return _innosoft!!
        }
        _innosoft = Builder(name = "Innosoft", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(422.559f, 159.71f)
                arcToRelative(27.379f, 27.379f, 0.0f, false, false, -13.866f, -23.337f)
                arcToRelative(26.42f, 26.42f, 0.0f, false, false, -26.211f, 0.133f)
                lineTo(73.943f, 314.647f)
                verticalLineTo(176.261f)
                arcToRelative(11.955f, 11.955f, 0.0f, false, true, 6.047f, -10.34f)
                lineTo(218.066f, 86.208f)
                arcToRelative(12.153f, 12.153f, 0.0f, false, true, 11.922f, 0.025f)
                lineToRelative(32.656f, 18.853f)
                lineTo(112.581f, 191.723f)
                verticalLineToRelative(56.0f)
                lineTo(359.642f, 105.086f)
                lineTo(241.129f, 36.679f)
                curveToRelative(-10.992f, -6.129f, -22.3f, -6.255f, -33.8f, -0.27f)
                lineToRelative(-164.6f, 95.026f)
                curveToRelative(-10.634f, 6.12f, -16.771f, 16.39f, -17.29f, 29.124f)
                lineToRelative(0.0f, 191.5f)
                curveToRelative(0.17f, 10.135f, 5.08f, 18.672f, 13.474f, 23.428f)
                arcToRelative(27.037f, 27.037f, 0.0f, false, false, 26.736f, -0.045f)
                lineTo(374.057f, 197.376f)
                verticalLineTo(335.657f)
                arcToRelative(11.976f, 11.976f, 0.0f, false, true, -5.92f, 10.368f)
                lineTo(230.025f, 425.77f)
                arcToRelative(12.175f, 12.175f, 0.0f, false, true, -11.937f, 0.062f)
                lineToRelative(-32.723f, -18.9f)
                lineToRelative(150.051f, -86.627f)
                verticalLineToRelative(-56.0f)
                lineTo(88.367f, 406.932f)
                lineToRelative(118.794f, 68.583f)
                arcToRelative(33.88f, 33.88f, 0.0f, false, false, 34.25f, -0.327f)
                lineToRelative(164.527f, -94.995f)
                curveToRelative(10.746f, -6.631f, 16.649f, -17.118f, 16.624f, -29.528f)
                close()
            }
        }
        .build()
        return _innosoft!!
    }

private var _innosoft: ImageVector? = null
