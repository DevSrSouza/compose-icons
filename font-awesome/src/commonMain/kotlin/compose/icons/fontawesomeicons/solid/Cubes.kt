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

public val SolidGroup.Cubes: ImageVector
    get() {
        if (_cubes != null) {
            return _cubes!!
        }
        _cubes = Builder(name = "Cubes", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.6f, 250.2f)
                lineTo(392.0f, 214.0f)
                lineTo(392.0f, 105.5f)
                curveToRelative(0.0f, -15.0f, -9.3f, -28.4f, -23.4f, -33.7f)
                lineToRelative(-100.0f, -37.5f)
                curveToRelative(-8.1f, -3.1f, -17.1f, -3.1f, -25.3f, 0.0f)
                lineToRelative(-100.0f, 37.5f)
                curveToRelative(-14.1f, 5.3f, -23.4f, 18.7f, -23.4f, 33.7f)
                lineTo(119.9f, 214.0f)
                lineToRelative(-96.6f, 36.2f)
                curveTo(9.3f, 255.5f, 0.0f, 268.9f, 0.0f, 283.9f)
                lineTo(0.0f, 394.0f)
                curveToRelative(0.0f, 13.6f, 7.7f, 26.1f, 19.9f, 32.2f)
                lineToRelative(100.0f, 50.0f)
                curveToRelative(10.1f, 5.1f, 22.1f, 5.1f, 32.2f, 0.0f)
                lineToRelative(103.9f, -52.0f)
                lineToRelative(103.9f, 52.0f)
                curveToRelative(10.1f, 5.1f, 22.1f, 5.1f, 32.2f, 0.0f)
                lineToRelative(100.0f, -50.0f)
                curveToRelative(12.2f, -6.1f, 19.9f, -18.6f, 19.9f, -32.2f)
                lineTo(512.0f, 283.9f)
                curveToRelative(0.0f, -15.0f, -9.3f, -28.4f, -23.4f, -33.7f)
                close()
                moveTo(358.0f, 214.8f)
                lineToRelative(-85.0f, 31.9f)
                verticalLineToRelative(-68.2f)
                lineToRelative(85.0f, -37.0f)
                verticalLineToRelative(73.3f)
                close()
                moveTo(154.0f, 104.1f)
                lineToRelative(102.0f, -38.2f)
                lineToRelative(102.0f, 38.2f)
                verticalLineToRelative(0.6f)
                lineToRelative(-102.0f, 41.4f)
                lineToRelative(-102.0f, -41.4f)
                verticalLineToRelative(-0.6f)
                close()
                moveTo(238.0f, 395.2f)
                lineToRelative(-85.0f, 42.5f)
                verticalLineToRelative(-79.1f)
                lineToRelative(85.0f, -38.8f)
                verticalLineToRelative(75.4f)
                close()
                moveTo(238.0f, 283.2f)
                lineToRelative(-102.0f, 41.4f)
                lineToRelative(-102.0f, -41.4f)
                verticalLineToRelative(-0.6f)
                lineToRelative(102.0f, -38.2f)
                lineToRelative(102.0f, 38.2f)
                verticalLineToRelative(0.6f)
                close()
                moveTo(478.0f, 395.2f)
                lineToRelative(-85.0f, 42.5f)
                verticalLineToRelative(-79.1f)
                lineToRelative(85.0f, -38.8f)
                verticalLineToRelative(75.4f)
                close()
                moveTo(478.0f, 283.2f)
                lineToRelative(-102.0f, 41.4f)
                lineToRelative(-102.0f, -41.4f)
                verticalLineToRelative(-0.6f)
                lineToRelative(102.0f, -38.2f)
                lineToRelative(102.0f, 38.2f)
                verticalLineToRelative(0.6f)
                close()
            }
        }
        .build()
        return _cubes!!
    }

private var _cubes: ImageVector? = null
