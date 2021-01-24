package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(326.612f, 185.391f)
                curveToRelative(59.747f, 59.809f, 58.927f, 155.698f, 0.36f, 214.59f)
                curveToRelative(-0.11f, 0.12f, -0.24f, 0.25f, -0.36f, 0.37f)
                lineToRelative(-67.2f, 67.2f)
                curveToRelative(-59.27f, 59.27f, -155.699f, 59.262f, -214.96f, 0.0f)
                curveToRelative(-59.27f, -59.26f, -59.27f, -155.7f, 0.0f, -214.96f)
                lineToRelative(37.106f, -37.106f)
                curveToRelative(9.84f, -9.84f, 26.786f, -3.3f, 27.294f, 10.606f)
                curveToRelative(0.648f, 17.722f, 3.826f, 35.527f, 9.69f, 52.721f)
                curveToRelative(1.986f, 5.822f, 0.567f, 12.262f, -3.783f, 16.612f)
                lineToRelative(-13.087f, 13.087f)
                curveToRelative(-28.026f, 28.026f, -28.905f, 73.66f, -1.155f, 101.96f)
                curveToRelative(28.024f, 28.579f, 74.086f, 28.749f, 102.325f, 0.51f)
                lineToRelative(67.2f, -67.19f)
                curveToRelative(28.191f, -28.191f, 28.073f, -73.757f, 0.0f, -101.83f)
                curveToRelative(-3.701f, -3.694f, -7.429f, -6.564f, -10.341f, -8.569f)
                arcToRelative(16.037f, 16.037f, 0.0f, false, true, -6.947f, -12.606f)
                curveToRelative(-0.396f, -10.567f, 3.348f, -21.456f, 11.698f, -29.806f)
                lineToRelative(21.054f, -21.055f)
                curveToRelative(5.521f, -5.521f, 14.182f, -6.199f, 20.584f, -1.731f)
                arcToRelative(152.482f, 152.482f, 0.0f, false, true, 20.522f, 17.197f)
                close()
                moveTo(467.547f, 44.449f)
                curveToRelative(-59.261f, -59.262f, -155.69f, -59.27f, -214.96f, 0.0f)
                lineToRelative(-67.2f, 67.2f)
                curveToRelative(-0.12f, 0.12f, -0.25f, 0.25f, -0.36f, 0.37f)
                curveToRelative(-58.566f, 58.892f, -59.387f, 154.781f, 0.36f, 214.59f)
                arcToRelative(152.454f, 152.454f, 0.0f, false, false, 20.521f, 17.196f)
                curveToRelative(6.402f, 4.468f, 15.064f, 3.789f, 20.584f, -1.731f)
                lineToRelative(21.054f, -21.055f)
                curveToRelative(8.35f, -8.35f, 12.094f, -19.239f, 11.698f, -29.806f)
                arcToRelative(16.037f, 16.037f, 0.0f, false, false, -6.947f, -12.606f)
                curveToRelative(-2.912f, -2.005f, -6.64f, -4.875f, -10.341f, -8.569f)
                curveToRelative(-28.073f, -28.073f, -28.191f, -73.639f, 0.0f, -101.83f)
                lineToRelative(67.2f, -67.19f)
                curveToRelative(28.239f, -28.239f, 74.3f, -28.069f, 102.325f, 0.51f)
                curveToRelative(27.75f, 28.3f, 26.872f, 73.934f, -1.155f, 101.96f)
                lineToRelative(-13.087f, 13.087f)
                curveToRelative(-4.35f, 4.35f, -5.769f, 10.79f, -3.783f, 16.612f)
                curveToRelative(5.864f, 17.194f, 9.042f, 34.999f, 9.69f, 52.721f)
                curveToRelative(0.509f, 13.906f, 17.454f, 20.446f, 27.294f, 10.606f)
                lineToRelative(37.106f, -37.106f)
                curveToRelative(59.271f, -59.259f, 59.271f, -155.699f, 0.001f, -214.959f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
