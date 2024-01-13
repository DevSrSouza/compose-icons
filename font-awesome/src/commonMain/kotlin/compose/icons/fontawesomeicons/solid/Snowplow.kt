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

public val SolidGroup.Snowplow: ImageVector
    get() {
        if (_snowplow != null) {
            return _snowplow!!
        }
        _snowplow = Builder(name = "Snowplow", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(298.9f, 64.0f)
                lineToRelative(68.6f, 160.0f)
                lineTo(256.0f, 224.0f)
                lineToRelative(-64.0f, -64.0f)
                lineTo(192.0f, 64.0f)
                lineTo(298.9f, 64.0f)
                close()
                moveTo(445.1f, 242.7f)
                lineToRelative(-87.4f, -204.0f)
                curveTo(347.6f, 15.3f, 324.5f, 0.0f, 298.9f, 0.0f)
                lineTo(176.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineTo(128.0f, 160.0f)
                lineTo(96.0f, 160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(64.0f, 298.8f)
                curveTo(26.2f, 316.8f, 0.0f, 355.3f, 0.0f, 400.0f)
                curveToRelative(0.0f, 61.9f, 50.1f, 112.0f, 112.0f, 112.0f)
                lineTo(368.0f, 512.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                curveToRelative(0.0f, -17.2f, -3.9f, -33.5f, -10.8f, -48.0f)
                lineTo(512.0f, 352.0f)
                verticalLineToRelative(50.7f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.3f, 18.7f, 45.3f)
                lineToRelative(54.6f, 54.6f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, -32.8f, 0.0f, -45.3f)
                lineTo(576.0f, 402.7f)
                lineTo(576.0f, 320.0f)
                lineTo(576.0f, 235.2f)
                lineTo(633.0f, 164.0f)
                curveToRelative(11.0f, -13.8f, 8.8f, -33.9f, -5.0f, -45.0f)
                reflectiveCurveToRelative(-33.9f, -8.8f, -45.0f, 5.0f)
                lineToRelative(-57.0f, 71.2f)
                curveToRelative(-9.1f, 11.3f, -14.0f, 25.4f, -14.0f, 40.0f)
                lineTo(512.0f, 288.0f)
                lineTo(448.0f, 288.0f)
                lineTo(448.0f, 256.7f)
                curveToRelative(0.1f, -2.4f, -0.2f, -4.8f, -0.6f, -7.1f)
                reflectiveCurveToRelative(-1.2f, -4.7f, -2.2f, -6.8f)
                close()
                moveTo(368.0f, 352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(112.0f, 448.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.5f, -48.0f, 48.0f, -48.0f)
                lineTo(368.0f, 352.0f)
                close()
                moveTo(144.0f, 400.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
                moveTo(360.0f, 424.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
                moveTo(304.0f, 400.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
                moveTo(200.0f, 424.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _snowplow!!
    }

private var _snowplow: ImageVector? = null
