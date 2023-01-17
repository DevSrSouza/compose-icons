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

public val RegularGroup.HandLizard: ImageVector
    get() {
        if (_handLizard != null) {
            return _handLizard!!
        }
        _handLizard = Builder(name = "HandLizard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 331.8f)
                verticalLineTo(424.0f)
                curveToRelative(0.0f, 13.25f, -10.75f, 24.0f, -24.0f, 24.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, -10.75f, -24.0f, -24.0f)
                verticalLineToRelative(-92.17f)
                curveToRelative(0.0f, -10.09f, -3.031f, -19.8f, -8.766f, -28.08f)
                lineToRelative(-118.6f, -170.5f)
                curveTo(327.4f, 119.1f, 312.2f, 112.0f, 295.1f, 112.0f)
                horizontalLineTo(53.32f)
                curveToRelative(-2.5f, 0.0f, -5.25f, 2.453f, -5.313f, 4.172f)
                curveToRelative(-0.297f, 9.5f, 3.156f, 18.47f, 9.75f, 25.28f)
                curveTo(64.36f, 148.3f, 73.2f, 152.0f, 82.67f, 152.0f)
                horizontalLineToRelative(161.8f)
                curveToRelative(17.09f, 0.0f, 33.4f, 8.281f, 43.4f, 22.14f)
                curveToRelative(9.984f, 13.88f, 12.73f, 31.83f, 7.328f, 48.05f)
                lineToRelative(-9.781f, 29.34f)
                curveTo(278.2f, 273.3f, 257.8f, 288.0f, 234.9f, 288.0f)
                horizontalLineTo(138.7f)
                curveTo(129.2f, 288.0f, 120.4f, 291.8f, 113.8f, 298.5f)
                curveToRelative(-6.594f, 6.812f, -10.05f, 15.78f, -9.75f, 25.28f)
                curveTo(104.1f, 325.5f, 106.8f, 328.0f, 109.3f, 328.0f)
                horizontalLineToRelative(156.6f)
                curveToRelative(5.188f, 0.0f, 10.14f, 1.688f, 14.3f, 4.797f)
                lineToRelative(78.22f, 58.67f)
                curveToRelative(6.031f, 4.531f, 9.594f, 11.66f, 9.594f, 19.2f)
                lineTo(367.1f, 424.0f)
                curveToRelative(0.0f, 13.25f, -10.75f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.75f, -24.0f, -24.0f)
                verticalLineToRelative(-1.328f)
                lineTo(257.8f, 376.0f)
                horizontalLineTo(109.3f)
                curveToRelative(-28.48f, 0.0f, -52.39f, -22.72f, -53.28f, -50.64f)
                curveToRelative(-0.719f, -22.61f, 7.531f, -43.98f, 23.23f, -60.2f)
                curveTo(94.1f, 248.9f, 116.1f, 240.0f, 138.7f, 240.0f)
                horizontalLineToRelative(96.19f)
                curveToRelative(2.297f, 0.0f, 4.328f, -1.469f, 5.063f, -3.656f)
                lineToRelative(9.781f, -29.33f)
                curveToRelative(0.703f, -2.141f, -0.016f, -3.797f, -0.734f, -4.797f)
                curveTo(248.2f, 201.2f, 246.9f, 200.0f, 244.6f, 200.0f)
                horizontalLineTo(82.67f)
                curveToRelative(-22.58f, 0.0f, -43.67f, -8.938f, -59.39f, -25.16f)
                curveTo(7.575f, 158.6f, -0.675f, 137.3f, 0.043f, 114.6f)
                curveTo(0.934f, 86.72f, 24.84f, 64.0f, 53.32f, 64.0f)
                horizontalLineToRelative(242.7f)
                curveToRelative(31.94f, 0.0f, 61.86f, 15.67f, 80.05f, 41.92f)
                lineToRelative(118.6f, 170.5f)
                curveTo(506.0f, 292.8f, 512.0f, 311.9f, 512.0f, 331.8f)
                close()
            }
        }
        .build()
        return _handLizard!!
    }

private var _handLizard: ImageVector? = null
