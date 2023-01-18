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

public val LightGroup.Perspective: ImageVector
    get() {
        if (_perspective != null) {
            return _perspective!!
        }
        _perspective = Builder(name = "Perspective", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 122.0f)
                horizontalLineTo(222.0f)
                verticalLineTo(49.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -5.0f, -10.8f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, -11.5f, -3.0f)
                lineTo(45.5f, 64.9f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 78.7f)
                verticalLineTo(122.0f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(34.0f)
                verticalLineToRelative(43.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 11.5f, 13.8f)
                lineToRelative(160.0f, 29.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(2.5f, 0.2f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(134.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(46.0f, 78.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.6f, -2.0f)
                lineToRelative(160.0f, -29.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.7f, 0.5f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 0.7f, 1.5f)
                verticalLineTo(122.0f)
                horizontalLineTo(46.0f)
                close()
                moveTo(210.0f, 206.4f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -0.7f, 1.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.7f, 0.5f)
                lineToRelative(-160.0f, -29.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.6f, -2.0f)
                verticalLineTo(134.0f)
                horizontalLineTo(210.0f)
                close()
            }
        }
        .build()
        return _perspective!!
    }

private var _perspective: ImageVector? = null
