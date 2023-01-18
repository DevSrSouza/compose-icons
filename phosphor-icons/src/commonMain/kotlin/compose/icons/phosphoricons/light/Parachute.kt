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

public val LightGroup.Parachute: ImageVector
    get() {
        if (_parachute != null) {
            return _parachute!!
        }
        _parachute = Builder(name = "Parachute", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 120.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, -204.0f, 0.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 2.4f, 4.8f)
                horizontalLineToRelative(0.0f)
                lineTo(122.0f, 195.0f)
                verticalLineToRelative(23.0f)
                lineTo(112.0f, 218.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 218.0f)
                lineTo(134.0f, 195.0f)
                lineToRelative(93.6f, -70.2f)
                horizontalLineToRelative(0.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 230.0f, 120.0f)
                close()
                moveTo(217.8f, 114.0f)
                lineTo(173.9f, 114.0f)
                curveToRelative(-1.3f, -42.9f, -16.5f, -68.6f, -28.4f, -82.3f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 217.8f, 114.0f)
                close()
                moveTo(128.0f, 31.4f)
                arcToRelative(78.5f, 78.5f, 0.0f, false, true, 15.4f, 17.5f)
                curveTo(157.3f, 70.1f, 161.2f, 95.0f, 161.9f, 114.0f)
                lineTo(94.1f, 114.0f)
                curveToRelative(1.1f, -31.9f, 10.5f, -52.9f, 18.5f, -65.1f)
                arcTo(78.5f, 78.5f, 0.0f, false, true, 128.0f, 31.4f)
                close()
                moveTo(157.8f, 126.0f)
                lineTo(128.0f, 179.6f)
                lineTo(98.2f, 126.0f)
                close()
                moveTo(84.5f, 126.0f)
                lineTo(109.1f, 170.3f)
                lineTo(50.0f, 126.0f)
                close()
                moveTo(171.5f, 126.0f)
                lineTo(206.0f, 126.0f)
                lineToRelative(-59.1f, 44.3f)
                close()
                moveTo(110.5f, 31.7f)
                curveTo(98.6f, 45.4f, 83.4f, 71.1f, 82.1f, 114.0f)
                lineTo(38.2f, 114.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 110.5f, 31.7f)
                close()
            }
        }
        .build()
        return _parachute!!
    }

private var _parachute: ImageVector? = null
