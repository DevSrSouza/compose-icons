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

public val RegularGroup.HandPointDown: ImageVector
    get() {
        if (_handPointDown != null) {
            return _handPointDown!!
        }
        _handPointDown = Builder(name = "HandPointDown", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.8f, 512.0f)
                curveToRelative(45.616f, 0.0f, 83.2f, -37.765f, 83.2f, -83.2f)
                verticalLineToRelative(-35.647f)
                arcToRelative(93.148f, 93.148f, 0.0f, false, false, 22.064f, -7.929f)
                curveToRelative(22.006f, 2.507f, 44.978f, -3.503f, 62.791f, -15.985f)
                curveTo(409.342f, 368.1f, 448.0f, 331.841f, 448.0f, 269.299f)
                lineTo(448.0f, 248.0f)
                curveToRelative(0.0f, -60.063f, -40.0f, -98.512f, -40.0f, -127.2f)
                verticalLineToRelative(-2.679f)
                curveToRelative(4.952f, -5.747f, 8.0f, -13.536f, 8.0f, -22.12f)
                lineTo(416.0f, 32.0f)
                curveToRelative(0.0f, -17.673f, -12.894f, -32.0f, -28.8f, -32.0f)
                lineTo(156.8f, 0.0f)
                curveTo(140.894f, 0.0f, 128.0f, 14.327f, 128.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 8.584f, 3.048f, 16.373f, 8.0f, 22.12f)
                verticalLineToRelative(2.679f)
                curveToRelative(0.0f, 6.964f, -6.193f, 14.862f, -23.668f, 30.183f)
                lineToRelative(-0.148f, 0.129f)
                lineToRelative(-0.146f, 0.131f)
                curveToRelative(-9.937f, 8.856f, -20.841f, 18.116f, -33.253f, 25.851f)
                curveTo(48.537f, 195.798f, 0.0f, 207.486f, 0.0f, 252.8f)
                curveToRelative(0.0f, 56.928f, 35.286f, 92.0f, 83.2f, 92.0f)
                curveToRelative(8.026f, 0.0f, 15.489f, -0.814f, 22.4f, -2.176f)
                lineTo(105.6f, 428.8f)
                curveToRelative(0.0f, 45.099f, 38.101f, 83.2f, 83.2f, 83.2f)
                close()
                moveTo(188.8f, 464.0f)
                curveToRelative(-18.7f, 0.0f, -35.2f, -16.775f, -35.2f, -35.2f)
                lineTo(153.6f, 270.4f)
                curveToRelative(-17.325f, 0.0f, -35.2f, 26.4f, -70.4f, 26.4f)
                curveToRelative(-26.4f, 0.0f, -35.2f, -20.625f, -35.2f, -44.0f)
                curveToRelative(0.0f, -8.794f, 32.712f, -20.445f, 56.1f, -34.926f)
                curveToRelative(14.575f, -9.074f, 27.225f, -19.524f, 39.875f, -30.799f)
                curveToRelative(18.374f, -16.109f, 36.633f, -33.836f, 39.596f, -59.075f)
                horizontalLineToRelative(176.752f)
                curveTo(364.087f, 170.79f, 400.0f, 202.509f, 400.0f, 248.0f)
                verticalLineToRelative(21.299f)
                curveToRelative(0.0f, 40.524f, -22.197f, 57.124f, -61.325f, 50.601f)
                curveToRelative(-8.001f, 14.612f, -33.979f, 24.151f, -53.625f, 12.925f)
                curveToRelative(-18.225f, 19.365f, -46.381f, 17.787f, -61.05f, 4.95f)
                lineTo(224.0f, 428.8f)
                curveToRelative(0.0f, 18.975f, -16.225f, 35.2f, -35.2f, 35.2f)
                close()
                moveTo(328.0f, 64.0f)
                curveToRelative(0.0f, -13.255f, 10.745f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.745f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.745f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.745f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _handPointDown!!
    }

private var _handPointDown: ImageVector? = null
