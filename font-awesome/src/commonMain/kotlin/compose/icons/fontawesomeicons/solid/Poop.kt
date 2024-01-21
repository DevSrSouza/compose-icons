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

public val SolidGroup.Poop: ImageVector
    get() {
        if (_poop != null) {
            return _poop!!
        }
        _poop = Builder(name = "Poop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.4f, 6.6f)
                curveToRelative(3.5f, -4.3f, 9.0f, -6.5f, 14.5f, -5.7f)
                curveTo(315.8f, 7.2f, 352.0f, 47.4f, 352.0f, 96.0f)
                curveToRelative(0.0f, 11.2f, -1.9f, 22.0f, -5.5f, 32.0f)
                horizontalLineTo(352.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                curveToRelative(0.0f, 19.1f, -8.4f, 36.3f, -21.7f, 48.0f)
                horizontalLineTo(408.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, 32.2f, 72.0f, 72.0f)
                curveToRelative(0.0f, 23.2f, -11.0f, 43.8f, -28.0f, 57.0f)
                curveToRelative(34.1f, 5.7f, 60.0f, 35.3f, 60.0f, 71.0f)
                curveToRelative(0.0f, 39.8f, -32.2f, 72.0f, -72.0f, 72.0f)
                horizontalLineTo(72.0f)
                curveToRelative(-39.8f, 0.0f, -72.0f, -32.2f, -72.0f, -72.0f)
                curveToRelative(0.0f, -35.7f, 25.9f, -65.3f, 60.0f, -71.0f)
                curveToRelative(-17.0f, -13.2f, -28.0f, -33.8f, -28.0f, -57.0f)
                curveToRelative(0.0f, -39.8f, 32.2f, -72.0f, 72.0f, -72.0f)
                horizontalLineToRelative(13.7f)
                curveTo(104.4f, 228.3f, 96.0f, 211.1f, 96.0f, 192.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(16.2f)
                curveToRelative(44.1f, -0.1f, 79.8f, -35.9f, 79.8f, -80.0f)
                curveToRelative(0.0f, -9.2f, -1.5f, -17.9f, -4.3f, -26.1f)
                curveToRelative(-1.8f, -5.2f, -0.8f, -11.1f, 2.8f, -15.4f)
                close()
            }
        }
        .build()
        return _poop!!
    }

private var _poop: ImageVector? = null
