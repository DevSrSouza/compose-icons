package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Otter: ImageVector
    get() {
        if (_otter != null) {
            return _otter!!
        }
        _otter = Builder(name = "Otter", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(608.0f, 32.0f)
                horizontalLineToRelative(-32.0f)
                lineToRelative(-13.25f, -13.25f)
                arcTo(63.97f, 63.97f, 0.0f, false, false, 517.49f, 0.0f)
                lineTo(497.0f, 0.0f)
                curveToRelative(-11.14f, 0.0f, -22.08f, 2.91f, -31.75f, 8.43f)
                lineTo(312.0f, 96.0f)
                horizontalLineToRelative(-56.0f)
                curveTo(149.96f, 96.0f, 64.0f, 181.96f, 64.0f, 288.0f)
                verticalLineToRelative(1.61f)
                curveToRelative(0.0f, 32.75f, -16.0f, 62.14f, -39.56f, 84.89f)
                curveToRelative(-18.19f, 17.58f, -28.1f, 43.68f, -23.19f, 71.8f)
                curveToRelative(6.76f, 38.8f, 42.9f, 65.7f, 82.28f, 65.7f)
                lineTo(192.0f, 512.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.33f, -32.0f, -32.0f, -32.0f)
                lineTo(80.0f, 448.0f)
                curveToRelative(-8.83f, 0.0f, -16.0f, -7.17f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.17f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(224.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-64.0f)
                lineToRelative(149.49f, -80.5f)
                lineTo(448.0f, 416.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-28.22f)
                lineToRelative(-55.11f, -110.21f)
                lineTo(521.14f, 192.0f)
                lineTo(544.0f, 192.0f)
                curveToRelative(53.02f, 0.0f, 96.0f, -42.98f, 96.0f, -96.0f)
                lineTo(640.0f, 64.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(512.0f, 48.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.16f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.16f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.16f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(544.0f, 144.0f)
                horizontalLineToRelative(-34.96f)
                lineTo(407.2f, 198.84f)
                lineToRelative(-13.77f, -27.55f)
                lineTo(512.0f, 112.0f)
                horizontalLineToRelative(77.05f)
                curveToRelative(-6.62f, 18.58f, -24.22f, 32.0f, -45.05f, 32.0f)
                close()
            }
        }
        .build()
        return _otter!!
    }

private var _otter: ImageVector? = null
