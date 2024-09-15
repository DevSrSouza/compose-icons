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
                curveTo(0.0f, 266.42f, 37.76f, 304.0f, 83.2f, 304.0f)
                horizontalLineToRelative(35.65f)
                arcToRelative(93.15f, 93.15f, 0.0f, false, false, 7.93f, 22.06f)
                curveToRelative(-2.51f, 22.01f, 3.5f, 44.98f, 15.98f, 62.79f)
                curveTo(143.9f, 441.34f, 180.16f, 480.0f, 242.7f, 480.0f)
                lineTo(264.0f, 480.0f)
                curveToRelative(60.06f, 0.0f, 98.51f, -40.0f, 127.2f, -40.0f)
                horizontalLineToRelative(2.68f)
                curveToRelative(5.75f, 4.95f, 13.54f, 8.0f, 22.12f, 8.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -12.89f, 32.0f, -28.8f)
                lineTo(512.0f, 188.8f)
                curveToRelative(0.0f, -15.91f, -14.33f, -28.8f, -32.0f, -28.8f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-8.58f, 0.0f, -16.37f, 3.05f, -22.12f, 8.0f)
                lineTo(391.2f, 168.0f)
                curveToRelative(-6.96f, 0.0f, -14.86f, -6.19f, -30.18f, -23.67f)
                lineToRelative(-0.13f, -0.15f)
                lineToRelative(-0.13f, -0.15f)
                curveToRelative(-8.86f, -9.94f, -18.12f, -20.84f, -25.85f, -33.25f)
                curveTo(316.2f, 80.54f, 304.51f, 32.0f, 259.2f, 32.0f)
                curveToRelative(-56.93f, 0.0f, -92.0f, 35.29f, -92.0f, 83.2f)
                curveToRelative(0.0f, 8.03f, 0.81f, 15.49f, 2.18f, 22.4f)
                lineTo(83.2f, 137.6f)
                curveTo(38.1f, 137.6f, 0.0f, 175.7f, 0.0f, 220.8f)
                close()
                moveTo(48.0f, 220.8f)
                curveToRelative(0.0f, -18.7f, 16.77f, -35.2f, 35.2f, -35.2f)
                horizontalLineToRelative(158.4f)
                curveToRelative(0.0f, -17.33f, -26.4f, -35.2f, -26.4f, -70.4f)
                curveToRelative(0.0f, -26.4f, 20.63f, -35.2f, 44.0f, -35.2f)
                curveToRelative(8.79f, 0.0f, 20.44f, 32.71f, 34.93f, 56.1f)
                curveToRelative(9.07f, 14.57f, 19.52f, 27.23f, 30.8f, 39.88f)
                curveToRelative(16.11f, 18.37f, 33.84f, 36.63f, 59.08f, 39.6f)
                verticalLineToRelative(176.75f)
                curveTo(341.21f, 396.09f, 309.49f, 432.0f, 264.0f, 432.0f)
                horizontalLineToRelative(-21.3f)
                curveToRelative(-40.52f, 0.0f, -57.12f, -22.2f, -50.6f, -61.33f)
                curveToRelative(-14.61f, -8.0f, -24.15f, -33.98f, -12.93f, -53.63f)
                curveToRelative(-19.36f, -18.23f, -17.79f, -46.38f, -4.95f, -61.05f)
                lineTo(83.2f, 256.0f)
                curveTo(64.22f, 256.0f, 48.0f, 239.77f, 48.0f, 220.8f)
                close()
                moveTo(448.0f, 360.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.74f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.74f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.74f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _handPointLeft!!
    }

private var _handPointLeft: ImageVector? = null
