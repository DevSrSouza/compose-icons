package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Armchair: ImageVector
    get() {
        if (_armchair != null) {
            return _armchair!!
        }
        _armchair = Builder(name = "Armchair", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 88.8f)
                verticalLineTo(72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, -40.0f)
                horizontalLineTo(80.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 40.0f, 72.0f)
                verticalLineTo(88.8f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, 78.4f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(167.2f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -78.4f)
                close()
                moveTo(80.0f, 48.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineTo(88.8f)
                arcTo(40.1f, 40.1f, 0.0f, false, false, 168.0f, 128.0f)
                horizontalLineTo(88.0f)
                arcTo(40.1f, 40.1f, 0.0f, false, false, 56.0f, 88.8f)
                verticalLineTo(72.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 80.0f, 48.0f)
                close()
                moveTo(208.4f, 152.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(56.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -8.0f, -7.9f)
                horizontalLineToRelative(-0.4f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 72.0f, 128.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(144.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.4f, 24.0f)
                close()
            }
        }
        .build()
        return _armchair!!
    }

private var _armchair: ImageVector? = null
