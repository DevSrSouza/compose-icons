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

public val ThinGroup.Armchair: ImageVector
    get() {
        if (_armchair != null) {
            return _armchair!!
        }
        _armchair = Builder(name = "Armchair", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 92.2f)
                verticalLineTo(72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                horizontalLineTo(80.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 44.0f, 72.0f)
                verticalLineTo(92.2f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 71.6f)
                verticalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(163.8f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -71.6f)
                close()
                moveTo(80.0f, 44.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 28.0f, 28.0f)
                verticalLineTo(92.2f)
                arcTo(36.1f, 36.1f, 0.0f, false, false, 172.0f, 128.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(84.0f)
                verticalLineToRelative(-4.0f)
                arcTo(36.1f, 36.1f, 0.0f, false, false, 52.0f, 92.2f)
                verticalLineTo(72.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 80.0f, 44.0f)
                close()
                moveTo(208.3f, 156.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineToRelative(-0.3f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 76.0f, 128.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(140.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.3f, 28.0f)
                close()
            }
        }
        .build()
        return _armchair!!
    }

private var _armchair: ImageVector? = null
