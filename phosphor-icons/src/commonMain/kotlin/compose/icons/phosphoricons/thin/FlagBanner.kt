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

public val ThinGroup.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) {
            return _flagBanner!!
        }
        _flagBanner = Builder(name = "FlagBanner", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.1f, 108.0f)
                lineToRelative(46.0f, -57.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.5f, -4.2f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 224.0f, 44.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(172.0f)
                horizontalLineTo(224.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.6f, -2.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.5f, -4.2f)
                close()
                moveTo(44.0f, 164.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(215.7f)
                lineToRelative(-42.8f, 53.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.0f)
                lineTo(215.7f, 164.0f)
                close()
            }
        }
        .build()
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
