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

public val ThinGroup.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) {
            return _arrowsCounterClockwise!!
        }
        _arrowsCounterClockwise = Builder(name = "ArrowsCounterClockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.8f, 103.7f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineToRelative(-48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                lineTo(35.8f, 90.1f)
                lineTo(62.9f, 62.9f)
                arcToRelative(92.3f, 92.3f, 0.0f, false, true, 130.2f, 0.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.0f, 5.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.7f, 0.0f)
                arcToRelative(84.2f, 84.2f, 0.0f, false, false, -118.8f, 0.0f)
                lineTo(41.5f, 95.7f)
                lineTo(79.8f, 95.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(224.2f, 152.3f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(38.3f)
                lineToRelative(-27.1f, 27.1f)
                arcToRelative(84.2f, 84.2f, 0.0f, false, true, -118.8f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.7f, 0.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.0f, 5.7f)
                arcToRelative(92.2f, 92.2f, 0.0f, false, false, 130.2f, 0.0f)
                lineToRelative(27.1f, -27.2f)
                verticalLineToRelative(38.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineToRelative(-48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.2f, 152.3f)
                close()
            }
        }
        .build()
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
