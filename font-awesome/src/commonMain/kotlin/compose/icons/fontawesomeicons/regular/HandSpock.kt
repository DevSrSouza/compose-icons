package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.HandSpock: ImageVector
    get() {
        if (_handSpock != null) {
            return _handSpock!!
        }
        _handSpock = Builder(name = "HandSpock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(501.031f, 116.176f)
                curveToRelative(-19.391f, -31.508f, -51.244f, -35.728f, -66.31f, -35.018f)
                curveToRelative(-14.113f, -50.811f, -62.004f, -54.08f, -70.738f, -54.08f)
                arcToRelative(74.031f, 74.031f, 0.0f, false, false, -72.238f, 58.916f)
                lineToRelative(-4.646f, 22.66f)
                lineToRelative(-13.684f, -53.207f)
                curveToRelative(-9.096f, -35.371f, -46.412f, -64.051f, -89.66f, -53.072f)
                arcToRelative(73.897f, 73.897f, 0.0f, false, false, -55.121f, 78.947f)
                arcToRelative(73.683f, 73.683f, 0.0f, false, false, -64.85f, 94.422f)
                lineToRelative(24.359f, 82.197f)
                curveToRelative(-38.24f, -7.545f, -62.797f, 16.184f, -68.115f, 21.848f)
                arcToRelative(73.679f, 73.679f, 0.0f, false, false, 3.199f, 104.193f)
                lineToRelative(91.365f, 85.977f)
                arcTo(154.164f, 154.164f, 0.0f, false, false, 220.623f, 512.0f)
                horizontalLineToRelative(107.455f)
                arcTo(127.301f, 127.301f, 0.0f, false, false, 452.339f, 413.861f)
                lineToRelative(57.623f, -241.963f)
                arcTo(73.203f, 73.203f, 0.0f, false, false, 501.031f, 116.176f)
                close()
                moveTo(463.271f, 160.781f)
                lineTo(405.648f, 402.748f)
                arcToRelative(79.466f, 79.466f, 0.0f, false, true, -77.57f, 61.26f)
                lineTo(220.623f, 464.008f)
                arcToRelative(106.341f, 106.341f, 0.0f, false, true, -73.137f, -28.998f)
                lineToRelative(-91.369f, -85.98f)
                curveTo(31.344f, 325.727f, 66.611f, 288.131f, 91.396f, 311.539f)
                lineToRelative(51.123f, 48.107f)
                curveToRelative(5.426f, 5.109f, 13.482f, 0.717f, 13.482f, -5.826f)
                arcToRelative(246.799f, 246.799f, 0.0f, false, false, -10.178f, -70.152f)
                lineToRelative(-36.014f, -121.539f)
                curveToRelative(-9.732f, -32.883f, 39.699f, -47.271f, 49.387f, -14.625f)
                lineToRelative(31.344f, 105.779f)
                curveToRelative(5.594f, 18.904f, 33.781f, 10.713f, 28.965f, -8.008f)
                lineTo(177.064f, 80.237f)
                curveToRelative(-8.504f, -33.104f, 41.432f, -45.646f, 49.865f, -12.836f)
                lineToRelative(47.326f, 184.035f)
                curveToRelative(4.428f, 17.242f, 29.162f, 16.504f, 32.711f, -0.805f)
                lineToRelative(31.791f, -154.971f)
                curveToRelative(6.811f, -33.107f, 57.517f, -24.107f, 50.119f, 11.963f)
                lineTo(360.328f, 246.789f)
                curveToRelative(-3.723f, 18.109f, 23.668f, 24.631f, 28.057f, 6.217f)
                lineTo(413.185f, 148.86f)
                curveTo(421.15f, 115.512f, 471.14f, 127.797f, 463.271f, 160.781f)
                close()
            }
        }
        .build()
        return _handSpock!!
    }

private var _handSpock: ImageVector? = null
