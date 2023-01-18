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

public val ThinGroup.Brandy: ImageVector
    get() {
        if (_brandy != null) {
            return _brandy!!
        }
        _brandy = Builder(name = "Brandy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 88.0f)
                arcToRelative(91.1f, 91.1f, 0.0f, false, false, -14.9f, -50.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.3f, -1.8f)
                horizontalLineTo(54.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.3f, 1.8f)
                arcTo(91.1f, 91.1f, 0.0f, false, false, 36.0f, 88.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 88.0f, 91.9f)
                verticalLineTo(220.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(179.9f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 220.0f, 88.0f)
                close()
                moveTo(56.4f, 44.0f)
                horizontalLineTo(199.6f)
                arcToRelative(84.5f, 84.5f, 0.0f, false, true, 12.3f, 40.0f)
                horizontalLineTo(44.1f)
                arcTo(84.5f, 84.5f, 0.0f, false, true, 56.4f, 44.0f)
                close()
                moveTo(44.1f, 92.0f)
                horizontalLineTo(211.9f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 44.1f, 92.0f)
                close()
            }
        }
        .build()
        return _brandy!!
    }

private var _brandy: ImageVector? = null
