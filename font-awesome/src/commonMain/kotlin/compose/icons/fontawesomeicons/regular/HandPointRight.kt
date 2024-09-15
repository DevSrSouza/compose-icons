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
                horizontalLineToRelative(-86.18f)
                arcToRelative(115.52f, 115.52f, 0.0f, false, false, 2.18f, -22.4f)
                curveToRelative(0.0f, -47.91f, -35.07f, -83.2f, -92.0f, -83.2f)
                curveToRelative(-45.31f, 0.0f, -57.0f, 48.54f, -75.71f, 78.78f)
                curveToRelative(-7.74f, 12.41f, -16.99f, 23.32f, -25.85f, 33.25f)
                lineToRelative(-0.13f, 0.15f)
                lineToRelative(-0.13f, 0.15f)
                curveTo(135.66f, 161.81f, 127.76f, 168.0f, 120.8f, 168.0f)
                horizontalLineToRelative(-2.68f)
                curveToRelative(-5.75f, -4.95f, -13.54f, -8.0f, -22.12f, -8.0f)
                lineTo(32.0f, 160.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 12.89f, -32.0f, 28.8f)
                verticalLineToRelative(230.4f)
                curveTo(0.0f, 435.11f, 14.33f, 448.0f, 32.0f, 448.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.58f, 0.0f, 16.37f, -3.05f, 22.12f, -8.0f)
                horizontalLineToRelative(2.68f)
                curveToRelative(28.69f, 0.0f, 67.14f, 40.0f, 127.2f, 40.0f)
                horizontalLineToRelative(21.3f)
                curveToRelative(62.54f, 0.0f, 98.8f, -38.66f, 99.94f, -91.14f)
                curveToRelative(12.48f, -17.81f, 18.49f, -40.78f, 15.98f, -62.79f)
                arcTo(93.15f, 93.15f, 0.0f, false, false, 393.15f, 304.0f)
                lineTo(428.8f, 304.0f)
                curveToRelative(45.44f, 0.0f, 83.2f, -37.58f, 83.2f, -83.2f)
                curveToRelative(0.0f, -45.1f, -38.1f, -83.2f, -83.2f, -83.2f)
                close()
                moveTo(428.8f, 256.0f)
                horizontalLineToRelative(-91.03f)
                curveToRelative(12.84f, 14.67f, 14.41f, 42.83f, -4.95f, 61.05f)
                curveToRelative(11.23f, 19.65f, 1.69f, 45.62f, -12.93f, 53.63f)
                curveToRelative(6.52f, 39.13f, -10.08f, 61.33f, -50.6f, 61.33f)
                lineTo(248.0f, 432.0f)
                curveToRelative(-45.49f, 0.0f, -77.21f, -35.91f, -120.0f, -39.68f)
                lineTo(128.0f, 215.57f)
                curveToRelative(25.24f, -2.96f, 42.97f, -21.22f, 59.08f, -39.6f)
                curveToRelative(11.27f, -12.65f, 21.73f, -25.3f, 30.8f, -39.88f)
                curveTo(232.35f, 112.71f, 244.01f, 80.0f, 252.8f, 80.0f)
                curveToRelative(23.38f, 0.0f, 44.0f, 8.8f, 44.0f, 35.2f)
                curveToRelative(0.0f, 35.2f, -26.4f, 53.08f, -26.4f, 70.4f)
                horizontalLineToRelative(158.4f)
                curveToRelative(18.42f, 0.0f, 35.2f, 16.5f, 35.2f, 35.2f)
                curveToRelative(0.0f, 18.98f, -16.23f, 35.2f, -35.2f, 35.2f)
                close()
                moveTo(88.0f, 384.0f)
                curveToRelative(0.0f, 13.26f, -10.74f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.74f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.74f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.74f, 24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _handPointRight!!
    }

private var _handPointRight: ImageVector? = null
