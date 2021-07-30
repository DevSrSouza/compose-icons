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

public val SolidGroup.Random: ImageVector
    get() {
        if (_random != null) {
            return _random!!
        }
        _random = Builder(name = "Random", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.971f, 359.029f)
                curveToRelative(9.373f, 9.373f, 9.373f, 24.569f, 0.0f, 33.941f)
                lineToRelative(-80.0f, 79.984f)
                curveToRelative(-15.01f, 15.01f, -40.971f, 4.49f, -40.971f, -16.971f)
                lineTo(384.0f, 416.0f)
                horizontalLineToRelative(-58.785f)
                arcToRelative(12.004f, 12.004f, 0.0f, false, true, -8.773f, -3.812f)
                lineToRelative(-70.556f, -75.596f)
                lineToRelative(53.333f, -57.143f)
                lineTo(352.0f, 336.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(-39.981f)
                curveToRelative(0.0f, -21.438f, 25.943f, -31.998f, 40.971f, -16.971f)
                lineToRelative(80.0f, 79.981f)
                close()
                moveTo(12.0f, 176.0f)
                horizontalLineToRelative(84.0f)
                lineToRelative(52.781f, 56.551f)
                lineToRelative(53.333f, -57.143f)
                lineToRelative(-70.556f, -75.596f)
                arcTo(11.999f, 11.999f, 0.0f, false, false, 122.785f, 96.0f)
                lineTo(12.0f, 96.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(384.0f, 176.0f)
                verticalLineToRelative(39.984f)
                curveToRelative(0.0f, 21.46f, 25.961f, 31.98f, 40.971f, 16.971f)
                lineToRelative(80.0f, -79.984f)
                curveToRelative(9.373f, -9.373f, 9.373f, -24.569f, 0.0f, -33.941f)
                lineToRelative(-80.0f, -79.981f)
                curveTo(409.943f, 24.021f, 384.0f, 34.582f, 384.0f, 56.019f)
                lineTo(384.0f, 96.0f)
                horizontalLineToRelative(-58.785f)
                arcToRelative(12.004f, 12.004f, 0.0f, false, false, -8.773f, 3.812f)
                lineTo(96.0f, 336.0f)
                lineTo(12.0f, 336.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(110.785f)
                curveToRelative(3.326f, 0.0f, 6.503f, -1.381f, 8.773f, -3.812f)
                lineTo(352.0f, 176.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _random!!
    }

private var _random: ImageVector? = null
