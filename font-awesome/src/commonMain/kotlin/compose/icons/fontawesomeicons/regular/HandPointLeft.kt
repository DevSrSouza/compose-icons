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

public val RegularGroup.HandPointLeft: ImageVector
    get() {
        if (_handPointLeft != null) {
            return _handPointLeft!!
        }
        _handPointLeft = Builder(name = "HandPointLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 220.8f)
                curveTo(0.0f, 266.416f, 37.765f, 304.0f, 83.2f, 304.0f)
                horizontalLineToRelative(35.647f)
                arcToRelative(93.148f, 93.148f, 0.0f, false, false, 7.929f, 22.064f)
                curveToRelative(-2.507f, 22.006f, 3.503f, 44.978f, 15.985f, 62.791f)
                curveTo(143.9f, 441.342f, 180.159f, 480.0f, 242.701f, 480.0f)
                lineTo(264.0f, 480.0f)
                curveToRelative(60.063f, 0.0f, 98.512f, -40.0f, 127.2f, -40.0f)
                horizontalLineToRelative(2.679f)
                curveToRelative(5.747f, 4.952f, 13.536f, 8.0f, 22.12f, 8.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -12.894f, 32.0f, -28.8f)
                lineTo(511.999f, 188.8f)
                curveToRelative(0.0f, -15.906f, -14.327f, -28.8f, -32.0f, -28.8f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-8.584f, 0.0f, -16.373f, 3.048f, -22.12f, 8.0f)
                lineTo(391.2f, 168.0f)
                curveToRelative(-6.964f, 0.0f, -14.862f, -6.193f, -30.183f, -23.668f)
                lineToRelative(-0.129f, -0.148f)
                lineToRelative(-0.131f, -0.146f)
                curveToRelative(-8.856f, -9.937f, -18.116f, -20.841f, -25.851f, -33.253f)
                curveTo(316.202f, 80.537f, 304.514f, 32.0f, 259.2f, 32.0f)
                curveToRelative(-56.928f, 0.0f, -92.0f, 35.286f, -92.0f, 83.2f)
                curveToRelative(0.0f, 8.026f, 0.814f, 15.489f, 2.176f, 22.4f)
                lineTo(83.2f, 137.6f)
                curveTo(38.101f, 137.6f, 0.0f, 175.701f, 0.0f, 220.8f)
                close()
                moveTo(48.0f, 220.8f)
                curveToRelative(0.0f, -18.7f, 16.775f, -35.2f, 35.2f, -35.2f)
                horizontalLineToRelative(158.4f)
                curveToRelative(0.0f, -17.325f, -26.4f, -35.2f, -26.4f, -70.4f)
                curveToRelative(0.0f, -26.4f, 20.625f, -35.2f, 44.0f, -35.2f)
                curveToRelative(8.794f, 0.0f, 20.445f, 32.712f, 34.926f, 56.1f)
                curveToRelative(9.074f, 14.575f, 19.524f, 27.225f, 30.799f, 39.875f)
                curveToRelative(16.109f, 18.374f, 33.836f, 36.633f, 59.075f, 39.596f)
                verticalLineToRelative(176.752f)
                curveTo(341.21f, 396.087f, 309.491f, 432.0f, 264.0f, 432.0f)
                horizontalLineToRelative(-21.299f)
                curveToRelative(-40.524f, 0.0f, -57.124f, -22.197f, -50.601f, -61.325f)
                curveToRelative(-14.612f, -8.001f, -24.151f, -33.979f, -12.925f, -53.625f)
                curveToRelative(-19.365f, -18.225f, -17.787f, -46.381f, -4.95f, -61.05f)
                lineTo(83.2f, 256.0f)
                curveTo(64.225f, 256.0f, 48.0f, 239.775f, 48.0f, 220.8f)
                close()
                moveTo(448.0f, 360.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, 10.745f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.745f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.745f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.745f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _handPointLeft!!
    }

private var _handPointLeft: ImageVector? = null
