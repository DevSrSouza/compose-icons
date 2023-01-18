package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) {
            return _arrowsCounterClockwise!!
        }
        _arrowsCounterClockwise = Builder(name = "ArrowsCounterClockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.8f, 107.7f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-48.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 5.0f, -7.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.7f, 1.8f)
                lineTo(55.8f, 64.4f)
                lineToRelative(4.3f, -4.3f)
                arcToRelative(96.2f, 96.2f, 0.0f, false, true, 135.8f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -11.3f, 0.0f)
                arcToRelative(80.2f, 80.2f, 0.0f, false, false, -113.2f, 0.0f)
                lineToRelative(-4.3f, 4.3f)
                lineTo(85.5f, 94.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.7f, 13.6f)
                close()
                moveTo(224.2f, 148.3f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.7f, 13.6f)
                lineToRelative(18.4f, 18.4f)
                lineToRelative(-4.3f, 4.3f)
                arcToRelative(80.2f, 80.2f, 0.0f, false, true, -113.2f, 0.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -11.3f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.3f)
                arcToRelative(96.1f, 96.1f, 0.0f, false, false, 135.8f, 0.0f)
                lineToRelative(4.3f, -4.3f)
                lineToRelative(18.3f, 18.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.7f, 2.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, -0.6f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.0f, -7.4f)
                verticalLineToRelative(-48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.2f, 148.3f)
                close()
            }
        }
        .build()
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
