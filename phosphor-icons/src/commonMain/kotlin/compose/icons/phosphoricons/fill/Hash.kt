package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Hash: ImageVector
    get() {
        if (_hash != null) {
            return _hash!!
        }
        _hash = Builder(name = "Hash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 224.0f)
                horizontalLineToRelative(-1.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.5f, -9.3f)
                lineToRelative(8.5f, -46.6f)
                horizontalLineTo(96.9f)
                lineToRelative(-9.0f, 49.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.8f, -2.8f)
                lineTo(80.6f, 168.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(83.5f)
                lineToRelative(8.7f, -48.0f)
                horizontalLineTo(43.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                horizontalLineTo(95.1f)
                lineToRelative(9.0f, -49.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.8f, 2.8f)
                lineTo(111.4f, 88.0f)
                horizontalLineToRelative(47.7f)
                lineToRelative(9.0f, -49.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.8f, 2.8f)
                lineTo(175.4f, 88.0f)
                horizontalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(172.5f)
                lineToRelative(-8.7f, 48.0f)
                horizontalLineToRelative(48.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(160.9f)
                lineToRelative(-9.0f, 49.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 224.0f)
                close()
                moveTo(99.8f, 152.0f)
                horizontalLineToRelative(47.7f)
                lineToRelative(8.7f, -48.0f)
                horizontalLineTo(108.5f)
                close()
            }
        }
        .build()
        return _hash!!
    }

private var _hash: ImageVector? = null
