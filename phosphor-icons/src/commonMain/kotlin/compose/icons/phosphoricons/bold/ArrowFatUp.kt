package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ArrowFatUp: ImageVector
    get() {
        if (_arrowFatUp != null) {
            return _arrowFatUp!!
        }
        _arrowFatUp = Builder(name = "ArrowFatUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.5f, 111.5f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -2.6f, 13.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 132.0f)
                horizontalLineTo(68.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(132.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.1f, -7.4f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 232.5f, 111.5f)
                close()
                moveTo(176.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(84.0f)
                horizontalLineTo(92.0f)
                verticalLineTo(120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(61.0f)
                lineToRelative(67.0f, -67.0f)
                lineToRelative(67.0f, 67.0f)
                close()
            }
        }
        .build()
        return _arrowFatUp!!
    }

private var _arrowFatUp: ImageVector? = null
