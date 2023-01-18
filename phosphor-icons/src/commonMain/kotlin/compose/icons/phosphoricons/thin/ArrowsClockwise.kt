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

public val ThinGroup.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) {
            return _arrowsClockwise!!
        }
        _arrowsClockwise = Builder(name = "ArrowsClockwise", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.2f, 51.7f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(38.3f)
                lineTo(187.4f, 68.6f)
                arcToRelative(84.2f, 84.2f, 0.0f, false, false, -118.8f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.7f, 0.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.0f, -5.7f)
                arcToRelative(92.2f, 92.2f, 0.0f, false, true, 130.2f, 0.0f)
                lineToRelative(27.1f, 27.2f)
                verticalLineTo(51.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                close()
                moveTo(187.4f, 187.4f)
                arcToRelative(84.2f, 84.2f, 0.0f, false, true, -118.8f, 0.0f)
                lineTo(41.5f, 160.3f)
                horizontalLineTo(79.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 8.0f, 0.0f)
                verticalLineTo(165.9f)
                lineToRelative(27.1f, 27.2f)
                arcToRelative(92.2f, 92.2f, 0.0f, false, false, 130.2f, 0.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.0f, -5.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 187.4f, 187.4f)
                close()
            }
        }
        .build()
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
