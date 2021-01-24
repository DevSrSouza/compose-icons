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

public val RegularGroup.HandPointUp: ImageVector
    get() {
        if (_handPointUp != null) {
            return _handPointUp!!
        }
        _handPointUp = Builder(name = "HandPointUp", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.6f, 83.2f)
                verticalLineToRelative(86.177f)
                arcToRelative(115.52f, 115.52f, 0.0f, false, false, -22.4f, -2.176f)
                curveToRelative(-47.914f, 0.0f, -83.2f, 35.072f, -83.2f, 92.0f)
                curveToRelative(0.0f, 45.314f, 48.537f, 57.002f, 78.784f, 75.707f)
                curveToRelative(12.413f, 7.735f, 23.317f, 16.994f, 33.253f, 25.851f)
                lineToRelative(0.146f, 0.131f)
                lineToRelative(0.148f, 0.129f)
                curveTo(129.807f, 376.338f, 136.0f, 384.236f, 136.0f, 391.2f)
                verticalLineToRelative(2.679f)
                curveToRelative(-4.952f, 5.747f, -8.0f, 13.536f, -8.0f, 22.12f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.673f, 12.894f, 32.0f, 28.8f, 32.0f)
                horizontalLineToRelative(230.4f)
                curveToRelative(15.906f, 0.0f, 28.8f, -14.327f, 28.8f, -32.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(0.0f, -8.584f, -3.048f, -16.373f, -8.0f, -22.12f)
                lineTo(408.0f, 391.2f)
                curveToRelative(0.0f, -28.688f, 40.0f, -67.137f, 40.0f, -127.2f)
                verticalLineToRelative(-21.299f)
                curveToRelative(0.0f, -62.542f, -38.658f, -98.8f, -91.145f, -99.94f)
                curveToRelative(-17.813f, -12.482f, -40.785f, -18.491f, -62.791f, -15.985f)
                arcTo(93.148f, 93.148f, 0.0f, false, false, 272.0f, 118.847f)
                lineTo(272.0f, 83.2f)
                curveTo(272.0f, 37.765f, 234.416f, 0.0f, 188.8f, 0.0f)
                curveToRelative(-45.099f, 0.0f, -83.2f, 38.101f, -83.2f, 83.2f)
                close()
                moveTo(224.0f, 83.2f)
                verticalLineToRelative(91.026f)
                curveToRelative(14.669f, -12.837f, 42.825f, -14.415f, 61.05f, 4.95f)
                curveToRelative(19.646f, -11.227f, 45.624f, -1.687f, 53.625f, 12.925f)
                curveToRelative(39.128f, -6.524f, 61.325f, 10.076f, 61.325f, 50.6f)
                lineTo(400.0f, 264.0f)
                curveToRelative(0.0f, 45.491f, -35.913f, 77.21f, -39.676f, 120.0f)
                lineTo(183.571f, 384.0f)
                curveToRelative(-2.964f, -25.239f, -21.222f, -42.966f, -39.596f, -59.075f)
                curveToRelative(-12.65f, -11.275f, -25.3f, -21.725f, -39.875f, -30.799f)
                curveTo(80.712f, 279.645f, 48.0f, 267.994f, 48.0f, 259.2f)
                curveToRelative(0.0f, -23.375f, 8.8f, -44.0f, 35.2f, -44.0f)
                curveToRelative(35.2f, 0.0f, 53.075f, 26.4f, 70.4f, 26.4f)
                lineTo(153.6f, 83.2f)
                curveToRelative(0.0f, -18.425f, 16.5f, -35.2f, 35.2f, -35.2f)
                curveToRelative(18.975f, 0.0f, 35.2f, 16.225f, 35.2f, 35.2f)
                close()
                moveTo(352.0f, 424.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, 10.745f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.745f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.745f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.745f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _handPointUp!!
    }

private var _handPointUp: ImageVector? = null
