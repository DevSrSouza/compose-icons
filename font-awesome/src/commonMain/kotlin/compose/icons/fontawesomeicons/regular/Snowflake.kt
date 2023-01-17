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

public val RegularGroup.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(484.4f, 294.4f)
                curveToRelative(1.715f, 6.402f, 0.676f, 12.89f, -2.395f, 18.21f)
                reflectiveCurveToRelative(-8.172f, 9.463f, -14.57f, 11.18f)
                lineToRelative(-31.46f, 8.43f)
                lineToRelative(32.96f, 19.03f)
                curveTo(480.4f, 357.8f, 484.4f, 372.5f, 477.8f, 384.0f)
                reflectiveCurveToRelative(-21.38f, 15.41f, -32.86f, 8.783f)
                lineToRelative(-32.96f, -19.03f)
                lineToRelative(8.43f, 31.46f)
                curveToRelative(3.432f, 12.81f, -4.162f, 25.96f, -16.97f, 29.39f)
                reflectiveCurveToRelative(-25.96f, -4.162f, -29.39f, -16.97f)
                lineToRelative(-20.85f, -77.82f)
                lineTo(280.0f, 297.6f)
                verticalLineToRelative(84.49f)
                lineToRelative(56.97f, 56.97f)
                curveToRelative(9.375f, 9.375f, 9.375f, 24.56f, 0.0f, 33.94f)
                curveTo(332.3f, 477.7f, 326.1f, 480.0f, 320.0f, 480.0f)
                reflectiveCurveToRelative(-12.28f, -2.344f, -16.97f, -7.031f)
                lineTo(280.0f, 449.9f)
                verticalLineTo(488.0f)
                curveToRelative(0.0f, 13.25f, -10.75f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.75f, -24.0f, -24.0f)
                verticalLineToRelative(-38.06f)
                lineToRelative(-23.03f, 23.03f)
                curveToRelative(-9.375f, 9.375f, -24.56f, 9.375f, -33.94f, 0.0f)
                reflectiveCurveToRelative(-9.375f, -24.56f, 0.0f, -33.94f)
                lineTo(232.0f, 382.1f)
                verticalLineTo(297.6f)
                lineToRelative(-73.17f, 42.25f)
                lineToRelative(-20.85f, 77.82f)
                curveToRelative(-3.432f, 12.81f, -16.58f, 20.4f, -29.39f, 16.97f)
                reflectiveCurveToRelative(-20.4f, -16.58f, -16.97f, -29.39f)
                lineToRelative(8.43f, -31.46f)
                lineToRelative(-32.96f, 19.03f)
                curveTo(55.61f, 399.4f, 40.85f, 395.5f, 34.22f, 384.0f)
                reflectiveCurveToRelative(-2.615f, -26.16f, 8.859f, -32.79f)
                lineToRelative(32.96f, -19.03f)
                lineToRelative(-31.46f, -8.43f)
                curveToRelative(-12.81f, -3.432f, -20.4f, -16.58f, -16.97f, -29.39f)
                reflectiveCurveToRelative(16.58f, -20.4f, 29.39f, -16.97f)
                lineToRelative(77.82f, 20.85f)
                lineTo(208.0f, 255.1f)
                lineTo(134.8f, 213.8f)
                lineTo(57.01f, 234.6f)
                curveTo(44.2f, 238.0f, 31.05f, 230.4f, 27.62f, 217.6f)
                reflectiveCurveToRelative(4.162f, -25.96f, 16.97f, -29.39f)
                lineToRelative(31.46f, -8.432f)
                lineTo(43.08f, 160.8f)
                curveTo(31.61f, 154.2f, 27.6f, 139.5f, 34.22f, 128.0f)
                reflectiveCurveToRelative(21.38f, -15.41f, 32.86f, -8.785f)
                lineToRelative(32.96f, 19.03f)
                lineTo(91.62f, 106.8f)
                curveTo(88.18f, 93.98f, 95.78f, 80.83f, 108.6f, 77.39f)
                reflectiveCurveToRelative(25.96f, 4.162f, 29.39f, 16.97f)
                lineToRelative(20.85f, 77.82f)
                lineTo(232.0f, 214.4f)
                verticalLineTo(129.9f)
                lineTo(175.0f, 72.97f)
                curveToRelative(-9.375f, -9.375f, -9.375f, -24.56f, 0.0f, -33.94f)
                reflectiveCurveToRelative(24.56f, -9.375f, 33.94f, 0.0f)
                lineTo(232.0f, 62.06f)
                verticalLineTo(24.0f)
                curveTo(232.0f, 10.75f, 242.8f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(24.0f, 10.75f, 24.0f, 24.0f)
                verticalLineToRelative(38.06f)
                lineToRelative(23.03f, -23.03f)
                curveToRelative(9.375f, -9.375f, 24.56f, -9.375f, 33.94f, 0.0f)
                reflectiveCurveToRelative(9.375f, 24.56f, 0.0f, 33.94f)
                lineTo(280.0f, 129.9f)
                verticalLineToRelative(84.49f)
                lineToRelative(73.17f, -42.25f)
                lineToRelative(20.85f, -77.82f)
                curveToRelative(3.432f, -12.81f, 16.58f, -20.4f, 29.39f, -16.97f)
                curveToRelative(6.402f, 1.715f, 11.5f, 5.861f, 14.57f, 11.18f)
                reflectiveCurveToRelative(4.109f, 11.81f, 2.395f, 18.21f)
                lineToRelative(-8.43f, 31.46f)
                lineToRelative(32.96f, -19.03f)
                curveTo(456.4f, 112.6f, 471.2f, 116.5f, 477.8f, 128.0f)
                reflectiveCurveToRelative(2.615f, 26.16f, -8.859f, 32.78f)
                lineToRelative(-32.96f, 19.03f)
                lineToRelative(31.46f, 8.432f)
                curveToRelative(12.81f, 3.432f, 20.4f, 16.58f, 16.97f, 29.39f)
                reflectiveCurveToRelative(-16.58f, 20.4f, -29.39f, 16.97f)
                lineToRelative(-77.82f, -20.85f)
                lineTo(304.0f, 255.1f)
                lineToRelative(73.17f, 42.25f)
                lineToRelative(77.82f, -20.85f)
                curveTo(467.8f, 273.1f, 480.1f, 281.6f, 484.4f, 294.4f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
