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

public val SolidGroup.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(62.1f)
                lineToRelative(15.0f, -15.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-49.0f, 49.0f)
                verticalLineToRelative(70.3f)
                lineToRelative(61.4f, -35.8f)
                lineToRelative(17.7f, -66.1f)
                curveToRelative(3.4f, -12.8f, 16.6f, -20.4f, 29.4f, -17.0f)
                reflectiveCurveToRelative(20.4f, 16.6f, 17.0f, 29.4f)
                lineToRelative(-5.2f, 19.3f)
                lineToRelative(23.6f, -13.8f)
                curveToRelative(15.3f, -8.9f, 34.9f, -3.7f, 43.8f, 11.5f)
                reflectiveCurveToRelative(3.8f, 34.9f, -11.5f, 43.8f)
                lineToRelative(-25.3f, 14.8f)
                lineToRelative(21.7f, 5.8f)
                curveToRelative(12.8f, 3.4f, 20.4f, 16.6f, 17.0f, 29.4f)
                reflectiveCurveToRelative(-16.6f, 20.4f, -29.4f, 17.0f)
                lineToRelative(-67.7f, -18.1f)
                lineTo(287.5f, 256.0f)
                lineToRelative(60.9f, 35.5f)
                lineToRelative(67.7f, -18.1f)
                curveToRelative(12.8f, -3.4f, 26.0f, 4.2f, 29.4f, 17.0f)
                reflectiveCurveToRelative(-4.2f, 26.0f, -17.0f, 29.4f)
                lineToRelative(-21.7f, 5.8f)
                lineToRelative(25.3f, 14.8f)
                curveToRelative(15.3f, 8.9f, 20.4f, 28.5f, 11.5f, 43.8f)
                reflectiveCurveToRelative(-28.5f, 20.4f, -43.8f, 11.5f)
                lineToRelative(-23.6f, -13.8f)
                lineToRelative(5.2f, 19.3f)
                curveToRelative(3.4f, 12.8f, -4.2f, 26.0f, -17.0f, 29.4f)
                reflectiveCurveToRelative(-26.0f, -4.2f, -29.4f, -17.0f)
                lineToRelative(-17.7f, -66.1f)
                lineTo(256.0f, 311.7f)
                verticalLineToRelative(70.3f)
                lineToRelative(49.0f, 49.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-15.0f, -15.0f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(449.9f)
                lineToRelative(-15.0f, 15.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(49.0f, -49.0f)
                verticalLineTo(311.7f)
                lineToRelative(-61.4f, 35.8f)
                lineToRelative(-17.7f, 66.1f)
                curveToRelative(-3.4f, 12.8f, -16.6f, 20.4f, -29.4f, 17.0f)
                reflectiveCurveToRelative(-20.4f, -16.6f, -17.0f, -29.4f)
                lineToRelative(5.2f, -19.3f)
                lineTo(48.1f, 395.6f)
                curveToRelative(-15.3f, 8.9f, -34.9f, 3.7f, -43.8f, -11.5f)
                reflectiveCurveToRelative(-3.7f, -34.9f, 11.5f, -43.8f)
                lineToRelative(25.3f, -14.8f)
                lineToRelative(-21.7f, -5.8f)
                curveToRelative(-12.8f, -3.4f, -20.4f, -16.6f, -17.0f, -29.4f)
                reflectiveCurveToRelative(16.6f, -20.4f, 29.4f, -17.0f)
                lineToRelative(67.7f, 18.1f)
                lineTo(160.5f, 256.0f)
                lineTo(99.6f, 220.5f)
                lineTo(31.9f, 238.6f)
                curveToRelative(-12.8f, 3.4f, -26.0f, -4.2f, -29.4f, -17.0f)
                reflectiveCurveToRelative(4.2f, -26.0f, 17.0f, -29.4f)
                lineToRelative(21.7f, -5.8f)
                lineTo(15.9f, 171.6f)
                curveTo(0.6f, 162.7f, -4.5f, 143.1f, 4.4f, 127.9f)
                reflectiveCurveToRelative(28.5f, -20.4f, 43.8f, -11.5f)
                lineToRelative(23.6f, 13.8f)
                lineToRelative(-5.2f, -19.3f)
                curveToRelative(-3.4f, -12.8f, 4.2f, -26.0f, 17.0f, -29.4f)
                reflectiveCurveToRelative(26.0f, 4.2f, 29.4f, 17.0f)
                lineToRelative(17.7f, 66.1f)
                lineTo(192.0f, 200.3f)
                verticalLineTo(129.9f)
                lineTo(143.0f, 81.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(15.0f, 15.0f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
