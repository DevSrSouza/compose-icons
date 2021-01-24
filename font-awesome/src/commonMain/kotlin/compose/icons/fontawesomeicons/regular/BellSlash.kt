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

public val RegularGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(633.99f, 471.02f)
                lineTo(36.0f, 3.51f)
                curveTo(29.1f, -2.01f, 19.03f, -0.9f, 13.51f, 6.0f)
                lineToRelative(-10.0f, 12.49f)
                curveTo(-2.02f, 25.39f, -0.9f, 35.46f, 6.0f, 40.98f)
                lineToRelative(598.0f, 467.51f)
                curveToRelative(6.9f, 5.52f, 16.96f, 4.4f, 22.49f, -2.49f)
                lineToRelative(10.0f, -12.49f)
                curveToRelative(5.52f, -6.9f, 4.41f, -16.97f, -2.5f, -22.49f)
                close()
                moveTo(163.53f, 368.0f)
                curveToRelative(16.71f, -22.03f, 34.48f, -55.8f, 41.4f, -110.58f)
                lineToRelative(-45.47f, -35.55f)
                curveToRelative(-3.27f, 90.73f, -36.47f, 120.68f, -54.84f, 140.42f)
                curveToRelative(-6.0f, 6.45f, -8.66f, 14.16f, -8.61f, 21.71f)
                curveToRelative(0.11f, 16.4f, 12.98f, 32.0f, 32.1f, 32.0f)
                horizontalLineToRelative(279.66f)
                lineToRelative(-61.4f, -48.0f)
                lineTo(163.53f, 368.0f)
                close()
                moveTo(320.0f, 96.0f)
                curveToRelative(61.86f, 0.0f, 112.0f, 50.14f, 112.0f, 112.0f)
                curveToRelative(0.0f, 0.2f, -0.06f, 0.38f, -0.06f, 0.58f)
                curveToRelative(0.02f, 16.84f, 1.16f, 31.77f, 2.79f, 45.73f)
                lineToRelative(59.53f, 46.54f)
                curveToRelative(-8.31f, -22.13f, -14.34f, -51.49f, -14.34f, -92.85f)
                curveToRelative(0.0f, -77.7f, -54.48f, -139.9f, -127.94f, -155.16f)
                lineTo(351.98f, 32.0f)
                curveToRelative(0.0f, -17.67f, -14.32f, -32.0f, -31.98f, -32.0f)
                reflectiveCurveToRelative(-31.98f, 14.33f, -31.98f, 32.0f)
                verticalLineToRelative(20.84f)
                curveToRelative(-26.02f, 5.41f, -49.45f, 16.94f, -69.13f, 32.72f)
                lineToRelative(38.17f, 29.84f)
                curveTo(275.0f, 103.18f, 296.65f, 96.0f, 320.0f, 96.0f)
                close()
                moveTo(320.0f, 512.0f)
                curveToRelative(35.32f, 0.0f, 63.97f, -28.65f, 63.97f, -64.0f)
                lineTo(256.03f, 448.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 63.97f, 64.0f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
