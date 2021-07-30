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

public val BrandsGroup.Rocketchat: ImageVector
    get() {
        if (_rocketchat != null) {
            return _rocketchat!!
        }
        _rocketchat = Builder(name = "Rocketchat", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(284.046f, 224.8f)
                arcToRelative(34.114f, 34.114f, 0.0f, true, false, 34.317f, 34.113f)
                arcTo(34.217f, 34.217f, 0.0f, false, false, 284.046f, 224.8f)
                close()
                moveTo(173.596f, 224.8f)
                arcToRelative(34.114f, 34.114f, 0.0f, true, false, 34.317f, 34.113f)
                arcTo(34.217f, 34.217f, 0.0f, false, false, 173.6f, 224.8f)
                close()
                moveTo(394.519f, 224.8f)
                arcToRelative(34.114f, 34.114f, 0.0f, true, false, 34.317f, 34.113f)
                arcTo(34.215f, 34.215f, 0.0f, false, false, 394.519f, 224.8f)
                close()
                moveTo(548.326f, 169.481f)
                curveToRelative(-15.535f, -24.172f, -37.31f, -45.57f, -64.681f, -63.618f)
                curveToRelative(-52.886f, -34.817f, -122.374f, -54.0f, -195.666f, -54.0f)
                arcToRelative(405.975f, 405.975f, 0.0f, false, false, -72.032f, 6.357f)
                arcToRelative(238.524f, 238.524f, 0.0f, false, false, -49.51f, -36.588f)
                curveTo(99.684f, -11.7f, 40.859f, 0.711f, 11.135f, 11.421f)
                arcTo(14.291f, 14.291f, 0.0f, false, false, 5.58f, 34.782f)
                curveTo(26.542f, 56.458f, 61.222f, 99.3f, 52.7f, 138.252f)
                curveToRelative(-33.142f, 33.9f, -51.112f, 74.776f, -51.112f, 117.337f)
                curveToRelative(0.0f, 43.372f, 17.97f, 84.248f, 51.112f, 118.148f)
                curveToRelative(8.526f, 38.956f, -26.154f, 81.816f, -47.116f, 103.491f)
                arcToRelative(14.284f, 14.284f, 0.0f, false, false, 5.555f, 23.34f)
                curveToRelative(29.724f, 10.709f, 88.549f, 23.147f, 155.324f, -10.2f)
                arcToRelative(238.679f, 238.679f, 0.0f, false, false, 49.51f, -36.589f)
                arcTo(405.972f, 405.972f, 0.0f, false, false, 288.0f, 460.14f)
                curveToRelative(73.313f, 0.0f, 142.8f, -19.159f, 195.667f, -53.975f)
                curveToRelative(27.371f, -18.049f, 49.145f, -39.426f, 64.679f, -63.619f)
                curveToRelative(17.309f, -26.923f, 26.07f, -55.916f, 26.07f, -86.125f)
                curveTo(574.394f, 225.4f, 565.634f, 196.43f, 548.326f, 169.485f)
                close()
                moveTo(284.987f, 409.9f)
                arcToRelative(345.65f, 345.65f, 0.0f, false, true, -89.446f, -11.5f)
                lineToRelative(-20.129f, 19.393f)
                arcToRelative(184.366f, 184.366f, 0.0f, false, true, -37.138f, 27.585f)
                arcToRelative(145.767f, 145.767f, 0.0f, false, true, -52.522f, 14.87f)
                curveToRelative(0.983f, -1.771f, 1.881f, -3.563f, 2.842f, -5.356f)
                quadToRelative(30.258f, -55.68f, 16.325f, -100.078f)
                curveToRelative(-32.992f, -25.962f, -52.778f, -59.2f, -52.778f, -95.4f)
                curveToRelative(0.0f, -83.1f, 104.254f, -150.469f, 232.846f, -150.469f)
                reflectiveCurveToRelative(232.867f, 67.373f, 232.867f, 150.469f)
                curveTo(517.854f, 342.525f, 413.6f, 409.9f, 284.987f, 409.9f)
                close()
            }
        }
        .build()
        return _rocketchat!!
    }

private var _rocketchat: ImageVector? = null
