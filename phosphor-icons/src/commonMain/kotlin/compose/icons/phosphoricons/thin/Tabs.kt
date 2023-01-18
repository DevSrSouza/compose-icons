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

public val ThinGroup.Tabs: ImageVector
    get() {
        if (_tabs != null) {
            return _tabs!!
        }
        _tabs = Builder(name = "Tabs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.8f, 166.9f)
                horizontalLineToRelative(0.0f)
                lineTo(229.5f, 92.6f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 218.0f, 84.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.9f, 2.9f)
                lineTo(242.6f, 164.0f)
                horizontalLineTo(203.0f)
                lineTo(181.5f, 92.6f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 170.0f, 84.0f)
                horizontalLineTo(160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.9f, 2.9f)
                lineTo(194.6f, 164.0f)
                horizontalLineTo(155.0f)
                lineTo(133.5f, 92.6f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 122.0f, 84.0f)
                horizontalLineTo(38.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -11.5f, 8.6f)
                lineTo(4.2f, 166.9f)
                horizontalLineToRelative(0.0f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 4.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(248.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 251.8f, 166.9f)
                close()
                moveTo(34.1f, 94.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 38.0f, 92.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.9f, 2.9f)
                lineTo(146.6f, 164.0f)
                horizontalLineTo(13.4f)
                close()
            }
        }
        .build()
        return _tabs!!
    }

private var _tabs: ImageVector? = null
