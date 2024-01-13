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

public val SolidGroup.Burger: ImageVector
    get() {
        if (_burger != null) {
            return _burger!!
        }
        _burger = Builder(name = "Burger", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(61.1f, 224.0f)
                curveTo(45.0f, 224.0f, 32.0f, 211.0f, 32.0f, 194.9f)
                curveToRelative(0.0f, -1.9f, 0.2f, -3.7f, 0.6f, -5.6f)
                curveTo(37.9f, 168.3f, 78.8f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveToRelative(218.1f, 136.3f, 223.4f, 157.3f)
                curveToRelative(0.5f, 1.9f, 0.6f, 3.7f, 0.6f, 5.6f)
                curveToRelative(0.0f, 16.1f, -13.0f, 29.1f, -29.1f, 29.1f)
                lineTo(61.1f, 224.0f)
                close()
                moveTo(144.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
                moveTo(384.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 32.0f)
                close()
                moveTo(272.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
                moveTo(16.0f, 304.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineTo(448.0f, 256.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(64.0f, 352.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                close()
                moveTo(32.0f, 400.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineTo(464.0f, 384.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(96.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(32.0f, 400.0f)
                close()
            }
        }
        .build()
        return _burger!!
    }

private var _burger: ImageVector? = null
