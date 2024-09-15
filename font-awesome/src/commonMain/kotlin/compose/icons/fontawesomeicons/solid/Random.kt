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
                moveTo(504.97f, 359.03f)
                curveToRelative(9.37f, 9.37f, 9.37f, 24.57f, 0.0f, 33.94f)
                lineToRelative(-80.0f, 79.98f)
                curveToRelative(-15.01f, 15.01f, -40.97f, 4.49f, -40.97f, -16.97f)
                lineTo(384.0f, 416.0f)
                horizontalLineToRelative(-58.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.77f, -3.81f)
                lineToRelative(-70.56f, -75.6f)
                lineToRelative(53.33f, -57.14f)
                lineTo(352.0f, 336.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(-39.98f)
                curveToRelative(0.0f, -21.44f, 25.94f, -32.0f, 40.97f, -16.97f)
                lineToRelative(80.0f, 79.98f)
                close()
                moveTo(12.0f, 176.0f)
                horizontalLineToRelative(84.0f)
                lineToRelative(52.78f, 56.55f)
                lineToRelative(53.33f, -57.14f)
                lineToRelative(-70.56f, -75.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 122.79f, 96.0f)
                lineTo(12.0f, 96.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(384.0f, 176.0f)
                verticalLineToRelative(39.98f)
                curveToRelative(0.0f, 21.46f, 25.96f, 31.98f, 40.97f, 16.97f)
                lineToRelative(80.0f, -79.98f)
                curveToRelative(9.37f, -9.37f, 9.37f, -24.57f, 0.0f, -33.94f)
                lineToRelative(-80.0f, -79.98f)
                curveTo(409.94f, 24.02f, 384.0f, 34.58f, 384.0f, 56.02f)
                lineTo(384.0f, 96.0f)
                horizontalLineToRelative(-58.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.77f, 3.81f)
                lineTo(96.0f, 336.0f)
                lineTo(12.0f, 336.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(110.79f)
                curveToRelative(3.33f, 0.0f, 6.5f, -1.38f, 8.77f, -3.81f)
                lineTo(352.0f, 176.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _random!!
    }

private var _random: ImageVector? = null
