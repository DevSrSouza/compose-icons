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
                curveToRelative(45.62f, 0.0f, 83.2f, -37.76f, 83.2f, -83.2f)
                verticalLineToRelative(-35.65f)
                arcToRelative(93.15f, 93.15f, 0.0f, false, false, 22.06f, -7.93f)
                curveToRelative(22.01f, 2.51f, 44.98f, -3.5f, 62.79f, -15.98f)
                curveTo(409.34f, 368.1f, 448.0f, 331.84f, 448.0f, 269.3f)
                lineTo(448.0f, 248.0f)
                curveToRelative(0.0f, -60.06f, -40.0f, -98.51f, -40.0f, -127.2f)
                verticalLineToRelative(-2.68f)
                curveToRelative(4.95f, -5.75f, 8.0f, -13.54f, 8.0f, -22.12f)
                lineTo(416.0f, 32.0f)
                curveToRelative(0.0f, -17.67f, -12.89f, -32.0f, -28.8f, -32.0f)
                lineTo(156.8f, 0.0f)
                curveTo(140.89f, 0.0f, 128.0f, 14.33f, 128.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 8.58f, 3.05f, 16.37f, 8.0f, 22.12f)
                verticalLineToRelative(2.68f)
                curveToRelative(0.0f, 6.96f, -6.19f, 14.86f, -23.67f, 30.18f)
                lineToRelative(-0.15f, 0.13f)
                lineToRelative(-0.15f, 0.13f)
                curveToRelative(-9.94f, 8.86f, -20.84f, 18.12f, -33.25f, 25.85f)
                curveTo(48.54f, 195.8f, 0.0f, 207.49f, 0.0f, 252.8f)
                curveToRelative(0.0f, 56.93f, 35.29f, 92.0f, 83.2f, 92.0f)
                curveToRelative(8.03f, 0.0f, 15.49f, -0.81f, 22.4f, -2.18f)
                lineTo(105.6f, 428.8f)
                curveToRelative(0.0f, 45.1f, 38.1f, 83.2f, 83.2f, 83.2f)
                close()
                moveTo(188.8f, 464.0f)
                curveToRelative(-18.7f, 0.0f, -35.2f, -16.77f, -35.2f, -35.2f)
                lineTo(153.6f, 270.4f)
                curveToRelative(-17.33f, 0.0f, -35.2f, 26.4f, -70.4f, 26.4f)
                curveToRelative(-26.4f, 0.0f, -35.2f, -20.63f, -35.2f, -44.0f)
                curveToRelative(0.0f, -8.79f, 32.71f, -20.44f, 56.1f, -34.93f)
                curveToRelative(14.57f, -9.07f, 27.23f, -19.52f, 39.88f, -30.8f)
                curveToRelative(18.37f, -16.11f, 36.63f, -33.84f, 39.6f, -59.08f)
                horizontalLineToRelative(176.75f)
                curveTo(364.09f, 170.79f, 400.0f, 202.51f, 400.0f, 248.0f)
                verticalLineToRelative(21.3f)
                curveToRelative(0.0f, 40.52f, -22.2f, 57.12f, -61.33f, 50.6f)
                curveToRelative(-8.0f, 14.61f, -33.98f, 24.15f, -53.63f, 12.93f)
                curveToRelative(-18.23f, 19.36f, -46.38f, 17.79f, -61.05f, 4.95f)
                lineTo(224.0f, 428.8f)
                curveToRelative(0.0f, 18.98f, -16.23f, 35.2f, -35.2f, 35.2f)
                close()
                moveTo(328.0f, 64.0f)
                curveToRelative(0.0f, -13.26f, 10.74f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.74f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.74f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.74f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _handPointDown!!
    }

private var _handPointDown: ImageVector? = null
