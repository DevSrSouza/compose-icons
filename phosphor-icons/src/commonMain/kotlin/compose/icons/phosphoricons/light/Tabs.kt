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

public val LightGroup.Tabs: ImageVector
    get() {
        if (_tabs != null) {
            return _tabs!!
        }
        _tabs = Builder(name = "Tabs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.7f, 166.3f)
                horizontalLineToRelative(0.0f)
                lineTo(231.5f, 92.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 218.0f, 82.0f)
                horizontalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 2.0f, 1.4f)
                lineTo(239.9f, 162.0f)
                horizontalLineTo(204.5f)
                lineToRelative(-21.0f, -70.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 170.0f, 82.0f)
                horizontalLineTo(160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 2.0f, 1.4f)
                lineTo(191.9f, 162.0f)
                horizontalLineTo(156.5f)
                lineToRelative(-21.0f, -70.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 122.0f, 82.0f)
                horizontalLineTo(38.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 24.5f, 92.0f)
                lineTo(2.3f, 166.2f)
                horizontalLineToRelative(0.0f)
                arcTo(4.7f, 4.7f, 0.0f, false, false, 2.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineTo(248.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                arcTo(4.7f, 4.7f, 0.0f, false, false, 253.7f, 166.3f)
                close()
                moveTo(36.0f, 95.4f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 38.0f, 94.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 2.0f, 1.4f)
                lineTo(143.9f, 162.0f)
                horizontalLineTo(16.1f)
                close()
            }
        }
        .build()
        return _tabs!!
    }

private var _tabs: ImageVector? = null
