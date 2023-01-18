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

public val LightGroup.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) {
            return _paperclipHorizontal!!
        }
        _paperclipHorizontal = Builder(name = "PaperclipHorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 182.0f)
                horizontalLineTo(46.0f)
                curveToRelative(-20.5f, 0.0f, -37.2f, -17.0f, -37.2f, -38.0f)
                reflectiveCurveTo(25.5f, 106.0f, 46.0f, 106.0f)
                horizontalLineTo(190.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 0.0f, 44.0f)
                horizontalLineTo(78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(190.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                horizontalLineTo(46.0f)
                curveToRelative(-13.9f, 0.0f, -25.2f, 11.7f, -25.2f, 26.0f)
                reflectiveCurveTo(32.1f, 170.0f, 46.0f, 170.0f)
                horizontalLineTo(192.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 0.0f, -84.0f)
                horizontalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(192.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, 0.0f, 108.0f)
                close()
            }
        }
        .build()
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
