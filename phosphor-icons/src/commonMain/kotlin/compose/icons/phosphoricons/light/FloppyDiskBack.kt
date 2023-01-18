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

public val LightGroup.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) {
            return _floppyDiskBack!!
        }
        _floppyDiskBack = Builder(name = "FloppyDiskBack", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                lineTo(91.3f, 34.0f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -9.9f, 4.1f)
                lineTo(38.1f, 81.4f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 34.0f, 91.3f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 91.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.6f, -1.4f)
                lineTo(89.9f, 46.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.4f, -0.6f)
                lineTo(154.0f, 46.0f)
                lineTo(154.0f, 74.0f)
                lineTo(96.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(166.0f, 46.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(128.0f, 114.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 34.0f, 34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 128.0f, 114.0f)
                close()
                moveTo(128.0f, 170.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 128.0f, 170.0f)
                close()
            }
        }
        .build()
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
