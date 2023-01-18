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

public val LightGroup.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) {
            return _arrowsCounterClockwise!!
        }
        _arrowsCounterClockwise = Builder(name = "ArrowsCounterClockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.8f, 105.7f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                verticalLineToRelative(-48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f)
                lineTo(37.8f, 85.2f)
                lineTo(61.5f, 61.5f)
                arcToRelative(94.3f, 94.3f, 0.0f, false, true, 133.0f, 0.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.5f, 0.0f)
                arcTo(82.1f, 82.1f, 0.0f, false, false, 70.0f, 70.0f)
                lineTo(46.3f, 93.7f)
                lineTo(79.8f, 93.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(224.2f, 150.3f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(33.5f)
                lineTo(186.0f, 186.0f)
                arcToRelative(82.1f, 82.1f, 0.0f, false, true, -116.0f, 0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.5f, 0.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.0f, 8.5f)
                arcToRelative(94.2f, 94.2f, 0.0f, false, false, 133.0f, 0.0f)
                lineToRelative(23.7f, -23.7f)
                verticalLineToRelative(33.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineToRelative(-48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.2f, 150.3f)
                close()
            }
        }
        .build()
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
