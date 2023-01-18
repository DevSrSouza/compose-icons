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

public val ThinGroup.Martini: ImageVector
    get() {
        if (_martini != null) {
            return _martini!!
        }
        _martini = Builder(name = "Martini", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.7f, 38.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 36.0f)
                horizontalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.7f, 2.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.9f, 4.3f)
                lineToRelative(32.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                lineTo(124.0f, 145.7f)
                verticalLineTo(212.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(145.7f)
                lineToRelative(70.8f, -70.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 235.7f, 38.5f)
                close()
                moveTo(128.0f, 138.3f)
                lineTo(65.7f, 76.0f)
                horizontalLineTo(190.3f)
                close()
                moveTo(198.3f, 68.0f)
                horizontalLineTo(57.7f)
                lineToRelative(-24.0f, -24.0f)
                horizontalLineTo(222.3f)
                close()
            }
        }
        .build()
        return _martini!!
    }

private var _martini: ImageVector? = null
