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

public val BoldGroup.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) {
            return _arrowsCounterClockwise!!
        }
        _arrowsCounterClockwise = Builder(name = "ArrowsCounterClockwise", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.8f, 111.7f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineToRelative(-48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                verticalLineToRelative(19.0f)
                lineTo(57.3f, 57.3f)
                arcToRelative(100.1f, 100.1f, 0.0f, false, true, 141.4f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, false, -107.4f, 0.0f)
                lineTo(60.8f, 87.7f)
                horizontalLineToRelative(19.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(224.2f, 144.3f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(19.0f)
                lineToRelative(-13.5f, 13.4f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, true, -107.4f, 0.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(99.9f, 99.9f, 0.0f, false, false, 141.4f, 0.0f)
                lineToRelative(13.5f, -13.4f)
                verticalLineToRelative(19.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.2f, 144.3f)
                close()
            }
        }
        .build()
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
