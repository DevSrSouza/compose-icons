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

public val LightGroup.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 170.0f)
                horizontalLineTo(222.0f)
                verticalLineTo(72.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, -22.0f, -22.0f)
                horizontalLineTo(56.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 34.0f, 72.0f)
                verticalLineToRelative(98.0f)
                horizontalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineTo(216.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, -22.0f)
                verticalLineTo(176.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 170.0f)
                close()
                moveTo(46.0f, 72.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 56.0f, 62.0f)
                horizontalLineTo(200.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineToRelative(98.0f)
                horizontalLineTo(46.0f)
                close()
                moveTo(226.0f, 192.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                horizontalLineTo(40.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                verticalLineTo(182.0f)
                horizontalLineTo(226.0f)
                close()
                moveTo(150.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 150.0f, 88.0f)
                close()
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
