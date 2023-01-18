package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) {
            return _paperclipHorizontal!!
        }
        _paperclipHorizontal = Builder(name = "PaperclipHorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 180.0f)
                horizontalLineTo(46.0f)
                curveToRelative(-19.4f, 0.0f, -35.2f, -16.1f, -35.2f, -36.0f)
                reflectiveCurveTo(26.6f, 108.0f, 46.0f, 108.0f)
                horizontalLineTo(190.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                horizontalLineTo(78.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(190.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(46.0f)
                curveToRelative(-15.0f, 0.0f, -27.2f, 12.6f, -27.2f, 28.0f)
                reflectiveCurveTo(31.0f, 172.0f, 46.0f, 172.0f)
                horizontalLineTo(192.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -88.0f)
                horizontalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(192.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, 104.0f)
                close()
            }
        }
        .build()
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
