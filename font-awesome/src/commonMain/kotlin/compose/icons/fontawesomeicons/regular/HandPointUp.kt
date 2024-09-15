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
                verticalLineToRelative(86.18f)
                arcToRelative(115.52f, 115.52f, 0.0f, false, false, -22.4f, -2.18f)
                curveToRelative(-47.91f, 0.0f, -83.2f, 35.07f, -83.2f, 92.0f)
                curveToRelative(0.0f, 45.31f, 48.54f, 57.0f, 78.78f, 75.71f)
                curveToRelative(12.41f, 7.74f, 23.32f, 16.99f, 33.25f, 25.85f)
                lineToRelative(0.15f, 0.13f)
                lineToRelative(0.15f, 0.13f)
                curveTo(129.81f, 376.34f, 136.0f, 384.24f, 136.0f, 391.2f)
                verticalLineToRelative(2.68f)
                curveToRelative(-4.95f, 5.75f, -8.0f, 13.54f, -8.0f, 22.12f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.67f, 12.89f, 32.0f, 28.8f, 32.0f)
                horizontalLineToRelative(230.4f)
                curveToRelative(15.91f, 0.0f, 28.8f, -14.33f, 28.8f, -32.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(0.0f, -8.58f, -3.05f, -16.37f, -8.0f, -22.12f)
                lineTo(408.0f, 391.2f)
                curveToRelative(0.0f, -28.69f, 40.0f, -67.14f, 40.0f, -127.2f)
                verticalLineToRelative(-21.3f)
                curveToRelative(0.0f, -62.54f, -38.66f, -98.8f, -91.14f, -99.94f)
                curveToRelative(-17.81f, -12.48f, -40.78f, -18.49f, -62.79f, -15.98f)
                arcTo(93.15f, 93.15f, 0.0f, false, false, 272.0f, 118.85f)
                lineTo(272.0f, 83.2f)
                curveTo(272.0f, 37.76f, 234.42f, 0.0f, 188.8f, 0.0f)
                curveToRelative(-45.1f, 0.0f, -83.2f, 38.1f, -83.2f, 83.2f)
                close()
                moveTo(224.0f, 83.2f)
                verticalLineToRelative(91.03f)
                curveToRelative(14.67f, -12.84f, 42.83f, -14.41f, 61.05f, 4.95f)
                curveToRelative(19.65f, -11.23f, 45.62f, -1.69f, 53.63f, 12.93f)
                curveToRelative(39.13f, -6.52f, 61.33f, 10.08f, 61.33f, 50.6f)
                lineTo(400.0f, 264.0f)
                curveToRelative(0.0f, 45.49f, -35.91f, 77.21f, -39.68f, 120.0f)
                lineTo(183.57f, 384.0f)
                curveToRelative(-2.96f, -25.24f, -21.22f, -42.97f, -39.6f, -59.08f)
                curveToRelative(-12.65f, -11.27f, -25.3f, -21.73f, -39.88f, -30.8f)
                curveTo(80.71f, 279.64f, 48.0f, 267.99f, 48.0f, 259.2f)
                curveToRelative(0.0f, -23.38f, 8.8f, -44.0f, 35.2f, -44.0f)
                curveToRelative(35.2f, 0.0f, 53.08f, 26.4f, 70.4f, 26.4f)
                lineTo(153.6f, 83.2f)
                curveToRelative(0.0f, -18.42f, 16.5f, -35.2f, 35.2f, -35.2f)
                curveToRelative(18.98f, 0.0f, 35.2f, 16.23f, 35.2f, 35.2f)
                close()
                moveTo(352.0f, 424.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.74f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.74f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.74f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _handPointUp!!
    }

private var _handPointUp: ImageVector? = null
