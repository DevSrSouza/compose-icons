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

public val LightGroup.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.3f, 142.0f)
                lineTo(205.7f, 142.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 118.5f)
                lineTo(138.3f, 34.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -20.6f, 0.0f)
                lineTo(40.0f, 118.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.3f, 142.0f)
                close()
                moveTo(48.8f, 126.6f)
                lineTo(126.5f, 42.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 3.0f, 0.0f)
                lineToRelative(77.7f, 84.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.4f, 2.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.9f, 1.2f)
                lineTo(50.3f, 130.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.9f, -1.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 48.8f, 126.6f)
                close()
                moveTo(208.0f, 162.0f)
                lineTo(48.0f, 162.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 176.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 162.0f)
                close()
                moveTo(210.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 174.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
