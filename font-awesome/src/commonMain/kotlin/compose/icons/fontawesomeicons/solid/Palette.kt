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

public val SolidGroup.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 256.0f)
                curveToRelative(0.0f, 0.9f, 0.0f, 1.8f, 0.0f, 2.7f)
                curveToRelative(-0.4f, 36.5f, -33.6f, 61.3f, -70.1f, 61.3f)
                lineTo(344.0f, 320.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                curveToRelative(0.0f, 3.4f, 0.4f, 6.7f, 1.0f, 9.9f)
                curveToRelative(2.1f, 10.2f, 6.5f, 20.0f, 10.8f, 29.9f)
                curveToRelative(6.1f, 13.8f, 12.1f, 27.5f, 12.1f, 42.0f)
                curveToRelative(0.0f, 31.8f, -21.6f, 60.7f, -53.4f, 62.0f)
                curveToRelative(-3.5f, 0.1f, -7.0f, 0.2f, -10.6f, 0.2f)
                curveTo(114.6f, 512.0f, 0.0f, 397.4f, 0.0f, 256.0f)
                reflectiveCurveTo(114.6f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(512.0f, 114.6f, 512.0f, 256.0f)
                close()
                moveTo(128.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(128.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(288.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(384.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
