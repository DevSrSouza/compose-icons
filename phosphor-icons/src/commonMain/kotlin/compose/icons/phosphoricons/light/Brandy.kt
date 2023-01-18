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

public val LightGroup.Brandy: ImageVector
    get() {
        if (_brandy != null) {
            return _brandy!!
        }
        _brandy = Builder(name = "Brandy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 88.0f)
                arcToRelative(94.2f, 94.2f, 0.0f, false, false, -15.2f, -51.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, -2.7f)
                horizontalLineTo(54.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 2.7f)
                arcTo(94.0f, 94.0f, 0.0f, false, false, 122.0f, 181.8f)
                verticalLineTo(218.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(134.0f)
                verticalLineTo(181.8f)
                arcTo(94.2f, 94.2f, 0.0f, false, false, 222.0f, 88.0f)
                close()
                moveTo(57.6f, 46.0f)
                horizontalLineTo(198.4f)
                arcToRelative(81.0f, 81.0f, 0.0f, false, true, 11.4f, 36.0f)
                horizontalLineTo(46.2f)
                arcTo(81.0f, 81.0f, 0.0f, false, true, 57.6f, 46.0f)
                close()
                moveTo(46.2f, 94.0f)
                horizontalLineTo(209.8f)
                arcTo(82.0f, 82.0f, 0.0f, false, true, 46.2f, 94.0f)
                close()
            }
        }
        .build()
        return _brandy!!
    }

private var _brandy: ImageVector? = null
