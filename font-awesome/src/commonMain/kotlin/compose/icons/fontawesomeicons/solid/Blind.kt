package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Blind: ImageVector
    get() {
        if (_blind != null) {
            return _blind!!
        }
        _blind = Builder(name = "Blind", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(380.15f, 510.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.99f, -2.69f)
                lineToRelative(-125.33f, -206.43f)
                arcToRelative(31.92f, 31.92f, 0.0f, false, false, 12.96f, -9.48f)
                lineToRelative(126.05f, 207.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.69f, 10.99f)
                close()
                moveTo(142.8f, 314.34f)
                lineToRelative(-32.54f, 89.49f)
                lineToRelative(36.12f, 88.29f)
                curveToRelative(6.69f, 16.36f, 25.38f, 24.19f, 41.73f, 17.5f)
                curveToRelative(16.36f, -6.69f, 24.19f, -25.38f, 17.5f, -41.73f)
                lineToRelative(-62.81f, -153.54f)
                close()
                moveTo(96.0f, 88.0f)
                curveToRelative(24.3f, 0.0f, 44.0f, -19.7f, 44.0f, -44.0f)
                reflectiveCurveTo(120.3f, 0.0f, 96.0f, 0.0f)
                reflectiveCurveTo(52.0f, 19.7f, 52.0f, 44.0f)
                reflectiveCurveToRelative(19.7f, 44.0f, 44.0f, 44.0f)
                close()
                moveTo(250.84f, 257.13f)
                lineToRelative(-120.0f, -152.0f)
                curveToRelative(-4.73f, -5.99f, -11.75f, -9.11f, -18.84f, -9.11f)
                lineTo(112.0f, 96.0f)
                lineTo(80.0f, 96.0f)
                verticalLineToRelative(0.03f)
                curveToRelative(-7.15f, 0.0f, -14.22f, 3.16f, -18.94f, 9.24f)
                lineTo(0.0f, 183.77f)
                verticalLineToRelative(95.69f)
                curveToRelative(0.0f, 13.45f, 11.01f, 24.79f, 24.46f, 24.54f)
                curveTo(37.51f, 303.75f, 48.0f, 293.1f, 48.0f, 280.0f)
                verticalLineToRelative(-79.77f)
                lineToRelative(16.0f, -20.57f)
                verticalLineToRelative(140.7f)
                lineTo(9.93f, 469.05f)
                curveToRelative(-6.04f, 16.61f, 2.53f, 34.97f, 19.14f, 41.01f)
                curveToRelative(16.6f, 6.04f, 34.97f, -2.52f, 41.01f, -19.14f)
                lineTo(136.0f, 309.64f)
                lineTo(136.0f, 202.44f)
                lineToRelative(-31.41f, -39.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.27f, -4.97f)
                lineToRelative(102.3f, 129.22f)
                curveToRelative(9.15f, 11.58f, 24.37f, 11.34f, 33.71f, 3.96f)
                curveToRelative(10.41f, -8.22f, 12.16f, -23.33f, 3.97f, -33.71f)
                close()
            }
        }
        .build()
        return _blind!!
    }

private var _blind: ImageVector? = null
