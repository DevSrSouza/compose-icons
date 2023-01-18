package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(88.0f, 238.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 232.0f)
                close()
                moveTo(214.0f, 104.0f)
                arcToRelative(85.4f, 85.4f, 0.0f, false, true, -32.9f, 67.6f)
                arcTo(18.4f, 18.4f, 0.0f, false, false, 174.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(96.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(17.9f, 17.9f, 0.0f, false, false, -7.0f, -14.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(85.4f, 85.4f, 0.0f, false, true, -33.0f, -67.2f)
                curveTo(41.7f, 57.9f, 79.4f, 19.1f, 125.9f, 18.0f)
                arcTo(86.1f, 86.1f, 0.0f, false, true, 214.0f, 104.0f)
                close()
                moveTo(202.0f, 104.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, false, -75.8f, -74.0f)
                curveToRelative(-40.0f, 1.0f, -72.4f, 34.3f, -72.2f, 74.4f)
                arcToRelative(73.7f, 73.7f, 0.0f, false, false, 28.4f, 57.9f)
                horizontalLineToRelative(0.0f)
                arcTo(29.9f, 29.9f, 0.0f, false, true, 94.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(30.3f, 30.3f, 0.0f, false, true, 11.7f, -23.8f)
                arcTo(73.6f, 73.6f, 0.0f, false, false, 202.0f, 104.0f)
                close()
                moveTo(181.2f, 94.9f)
                arcToRelative(53.8f, 53.8f, 0.0f, false, false, -44.1f, -44.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -6.9f, 4.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.9f, 6.9f)
                arcToRelative(41.9f, 41.9f, 0.0f, false, true, 34.3f, 34.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 5.9f, 5.0f)
                horizontalLineToRelative(1.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 181.2f, 94.9f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
