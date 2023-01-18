package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Parachute: ImageVector
    get() {
        if (_parachute != null) {
            return _parachute!!
        }
        _parachute = Builder(name = "Parachute", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 120.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 12.0f)
                horizontalLineToRelative(0.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 20.0f, 120.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 4.8f, 9.6f)
                horizontalLineToRelative(0.0f)
                lineTo(116.0f, 198.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(140.0f, 198.0f)
                lineToRelative(91.2f, -68.4f)
                horizontalLineToRelative(0.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 236.0f, 120.0f)
                close()
                moveTo(211.1f, 108.0f)
                lineTo(179.6f, 108.0f)
                curveToRelative(-1.8f, -29.3f, -9.9f, -50.5f, -18.9f, -65.4f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 211.1f, 108.0f)
                close()
                moveTo(100.4f, 108.0f)
                curveTo(103.2f, 68.8f, 119.0f, 48.1f, 128.0f, 39.4f)
                curveToRelative(9.0f, 8.7f, 24.8f, 29.4f, 27.6f, 68.6f)
                close()
                moveTo(95.3f, 42.6f)
                curveToRelative(-9.0f, 14.9f, -17.1f, 36.1f, -18.9f, 65.4f)
                lineTo(44.9f, 108.0f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 95.3f, 42.6f)
                close()
                moveTo(68.0f, 132.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(36.0f)
                close()
                moveTo(140.0f, 132.0f)
                horizontalLineToRelative(48.0f)
                lineToRelative(-48.0f, 36.0f)
                close()
            }
        }
        .build()
        return _parachute!!
    }

private var _parachute: ImageVector? = null
