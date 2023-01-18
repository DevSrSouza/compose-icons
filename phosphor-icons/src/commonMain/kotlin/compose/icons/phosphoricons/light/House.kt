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

public val LightGroup.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 222.0f)
                lineTo(160.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(146.0f, 160.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(112.0f, 158.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(48.0f, 222.0f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, -9.9f, -4.1f)
                arcTo(14.1f, 14.1f, 0.0f, false, true, 34.0f, 208.0f)
                lineTo(34.0f, 115.5f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, 4.6f, -10.3f)
                lineToRelative(80.0f, -72.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 18.8f, 0.0f)
                lineToRelative(80.0f, 72.8f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, 4.6f, 10.3f)
                lineTo(222.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                close()
                moveTo(112.0f, 146.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(210.0f, 115.5f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.6f, -1.4f)
                lineTo(129.3f, 41.3f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -2.6f, 0.0f)
                lineToRelative(-80.0f, 72.8f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.7f, 1.4f)
                lineTo(46.0f, 208.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(96.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(98.0f, 160.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 112.0f, 146.0f)
                close()
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null
