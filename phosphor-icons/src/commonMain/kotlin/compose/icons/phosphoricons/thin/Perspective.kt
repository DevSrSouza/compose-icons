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

public val ThinGroup.Perspective: ImageVector
    get() {
        if (_perspective != null) {
            return _perspective!!
        }
        _perspective = Builder(name = "Perspective", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 124.0f)
                horizontalLineTo(220.0f)
                verticalLineTo(49.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.3f, -9.2f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -9.8f, -2.6f)
                lineTo(45.9f, 66.9f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 36.0f, 78.7f)
                verticalLineTo(124.0f)
                horizontalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(36.0f)
                verticalLineToRelative(45.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 9.9f, 11.8f)
                lineToRelative(160.0f, 29.1f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 2.1f, 0.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(132.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(44.0f, 78.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.3f, -4.0f)
                lineToRelative(160.0f, -29.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 3.3f, 0.8f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 1.4f, 3.1f)
                verticalLineTo(124.0f)
                horizontalLineTo(44.0f)
                close()
                moveTo(212.0f, 206.4f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -1.4f, 3.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -3.3f, 0.8f)
                lineToRelative(-160.0f, -29.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.3f, -4.0f)
                verticalLineTo(132.0f)
                horizontalLineTo(212.0f)
                close()
            }
        }
        .build()
        return _perspective!!
    }

private var _perspective: ImageVector? = null
