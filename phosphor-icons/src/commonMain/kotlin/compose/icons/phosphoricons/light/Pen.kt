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

public val LightGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.7f, 88.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -4.1f, -9.9f)
                lineTo(177.9f, 33.4f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -19.8f, 0.0f)
                lineToRelative(-120.0f, 120.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -3.1f, 4.8f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, -0.9f, 5.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(92.7f, 222.0f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 5.0f, -0.9f)
                horizontalLineToRelative(0.1f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 4.8f, -3.1f)
                lineToRelative(86.1f, -86.2f)
                lineToRelative(4.7f, 18.5f)
                lineToRelative(-37.6f, 37.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 1.6f, -5.7f)
                lineToRelative(-7.2f, -28.7f)
                lineToRelative(24.0f, -23.9f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 226.7f, 88.0f)
                close()
                moveTo(46.0f, 208.0f)
                lineTo(46.0f, 174.5f)
                lineTo(81.5f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f)
                close()
                moveTo(96.0f, 207.5f)
                lineTo(48.5f, 160.0f)
                lineTo(136.0f, 72.5f)
                lineTo(183.5f, 120.0f)
                close()
                moveTo(214.1f, 89.4f)
                lineTo(192.0f, 111.5f)
                lineTo(144.5f, 64.0f)
                lineToRelative(22.1f, -22.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.8f, 0.0f)
                lineToRelative(44.7f, 44.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, 2.8f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
