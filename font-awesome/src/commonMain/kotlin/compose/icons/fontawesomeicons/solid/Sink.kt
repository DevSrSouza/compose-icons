package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Sink: ImageVector
    get() {
        if (_sink != null) {
            return _sink!!
        }
        _sink = Builder(name = "Sink", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 416.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 96.0f, 96.0f)
                horizontalLineTo(384.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 96.0f, -96.0f)
                verticalLineTo(384.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(496.0f, 288.0f)
                horizontalLineTo(400.0f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(288.0f)
                verticalLineTo(96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(96.0f)
                arcTo(96.16f, 96.16f, 0.0f, false, false, 300.87f, 1.86f)
                curveTo(255.29f, 10.71f, 224.0f, 53.36f, 224.0f, 99.79f)
                verticalLineTo(288.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(240.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 304.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(496.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(304.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 496.0f, 288.0f)
                close()
            }
        }
        .build()
        return _sink!!
    }

private var _sink: ImageVector? = null
