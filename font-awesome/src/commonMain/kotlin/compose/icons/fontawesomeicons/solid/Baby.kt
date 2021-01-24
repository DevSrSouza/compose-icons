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

public val SolidGroup.Baby: ImageVector
    get() {
        if (_baby != null) {
            return _baby!!
        }
        _baby = Builder(name = "Baby", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 160.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                reflectiveCurveTo(236.2f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveToRelative(-80.0f, 35.8f, -80.0f, 80.0f)
                reflectiveCurveToRelative(35.8f, 80.0f, 80.0f, 80.0f)
                close()
                moveTo(138.6f, 408.8f)
                lineToRelative(25.6f, -32.0f)
                lineToRelative(-61.5f, -51.2f)
                lineTo(56.8f, 383.0f)
                curveToRelative(-11.4f, 14.2f, -11.7f, 34.4f, -0.8f, 49.0f)
                lineToRelative(48.0f, 64.0f)
                curveToRelative(7.9f, 10.5f, 19.9f, 16.0f, 32.0f, 16.0f)
                curveToRelative(8.3f, 0.0f, 16.8f, -2.6f, 24.0f, -8.0f)
                curveToRelative(17.7f, -13.2f, 21.2f, -38.3f, 8.0f, -56.0f)
                lineToRelative(-29.4f, -39.2f)
                close()
                moveTo(281.3f, 325.6f)
                lineToRelative(-61.5f, 51.2f)
                lineToRelative(25.6f, 32.0f)
                lineTo(216.0f, 448.0f)
                curveToRelative(-13.2f, 17.7f, -9.7f, 42.8f, 8.0f, 56.0f)
                curveToRelative(7.2f, 5.4f, 15.6f, 8.0f, 24.0f, 8.0f)
                curveToRelative(12.2f, 0.0f, 24.2f, -5.5f, 32.0f, -16.0f)
                lineToRelative(48.0f, -64.0f)
                curveToRelative(10.9f, -14.6f, 10.6f, -34.8f, -0.8f, -49.0f)
                lineToRelative(-45.9f, -57.4f)
                close()
                moveTo(376.7f, 145.0f)
                curveToRelative(-12.7f, -18.1f, -37.6f, -22.4f, -55.7f, -9.8f)
                lineToRelative(-40.6f, 28.5f)
                curveToRelative(-52.7f, 37.0f, -124.2f, 37.0f, -176.8f, 0.0f)
                lineTo(63.0f, 135.3f)
                curveTo(44.9f, 122.6f, 20.0f, 127.0f, 7.3f, 145.0f)
                curveTo(-5.4f, 163.1f, -1.0f, 188.0f, 17.0f, 200.7f)
                lineToRelative(40.6f, 28.5f)
                curveToRelative(17.0f, 11.9f, 35.4f, 20.9f, 54.4f, 27.9f)
                lineTo(112.0f, 288.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(-30.8f)
                curveToRelative(19.0f, -7.0f, 37.4f, -16.0f, 54.4f, -27.9f)
                lineToRelative(40.6f, -28.5f)
                curveToRelative(18.1f, -12.8f, 22.4f, -37.7f, 9.7f, -55.8f)
                close()
            }
        }
        .build()
        return _baby!!
    }

private var _baby: ImageVector? = null
