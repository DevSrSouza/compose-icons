package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.HandPointRight: ImageVector
    get() {
        if (_handPointRight != null) {
            return _handPointRight!!
        }
        _handPointRight = Builder(name = "HandPointRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(428.8f, 137.6f)
                horizontalLineToRelative(-86.177f)
                arcToRelative(115.52f, 115.52f, 0.0f, false, false, 2.176f, -22.4f)
                curveToRelative(0.0f, -47.914f, -35.072f, -83.2f, -92.0f, -83.2f)
                curveToRelative(-45.314f, 0.0f, -57.002f, 48.537f, -75.707f, 78.784f)
                curveToRelative(-7.735f, 12.413f, -16.994f, 23.317f, -25.851f, 33.253f)
                lineToRelative(-0.131f, 0.146f)
                lineToRelative(-0.129f, 0.148f)
                curveTo(135.662f, 161.807f, 127.764f, 168.0f, 120.8f, 168.0f)
                horizontalLineToRelative(-2.679f)
                curveToRelative(-5.747f, -4.952f, -13.536f, -8.0f, -22.12f, -8.0f)
                lineTo(32.0f, 160.0f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 12.894f, -32.0f, 28.8f)
                verticalLineToRelative(230.4f)
                curveTo(0.0f, 435.106f, 14.327f, 448.0f, 32.0f, 448.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.584f, 0.0f, 16.373f, -3.048f, 22.12f, -8.0f)
                horizontalLineToRelative(2.679f)
                curveToRelative(28.688f, 0.0f, 67.137f, 40.0f, 127.2f, 40.0f)
                horizontalLineToRelative(21.299f)
                curveToRelative(62.542f, 0.0f, 98.8f, -38.658f, 99.94f, -91.145f)
                curveToRelative(12.482f, -17.813f, 18.491f, -40.785f, 15.985f, -62.791f)
                arcTo(93.148f, 93.148f, 0.0f, false, false, 393.152f, 304.0f)
                lineTo(428.8f, 304.0f)
                curveToRelative(45.435f, 0.0f, 83.2f, -37.584f, 83.2f, -83.2f)
                curveToRelative(0.0f, -45.099f, -38.101f, -83.2f, -83.2f, -83.2f)
                close()
                moveTo(428.8f, 256.0f)
                horizontalLineToRelative(-91.026f)
                curveToRelative(12.837f, 14.669f, 14.415f, 42.825f, -4.95f, 61.05f)
                curveToRelative(11.227f, 19.646f, 1.687f, 45.624f, -12.925f, 53.625f)
                curveToRelative(6.524f, 39.128f, -10.076f, 61.325f, -50.6f, 61.325f)
                lineTo(248.0f, 432.0f)
                curveToRelative(-45.491f, 0.0f, -77.21f, -35.913f, -120.0f, -39.676f)
                lineTo(128.0f, 215.571f)
                curveToRelative(25.239f, -2.964f, 42.966f, -21.222f, 59.075f, -39.596f)
                curveToRelative(11.275f, -12.65f, 21.725f, -25.3f, 30.799f, -39.875f)
                curveTo(232.355f, 112.712f, 244.006f, 80.0f, 252.8f, 80.0f)
                curveToRelative(23.375f, 0.0f, 44.0f, 8.8f, 44.0f, 35.2f)
                curveToRelative(0.0f, 35.2f, -26.4f, 53.075f, -26.4f, 70.4f)
                horizontalLineToRelative(158.4f)
                curveToRelative(18.425f, 0.0f, 35.2f, 16.5f, 35.2f, 35.2f)
                curveToRelative(0.0f, 18.975f, -16.225f, 35.2f, -35.2f, 35.2f)
                close()
                moveTo(88.0f, 384.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.745f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.745f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.745f, 24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _handPointRight!!
    }

private var _handPointRight: ImageVector? = null
