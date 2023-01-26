package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ZoomOutMap: ImageVector
    get() {
        if (_zoomOutMap != null) {
            return _zoomOutMap!!
        }
        _zoomOutMap = Builder(name = "ZoomOutMap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.3f, 5.3f)
                lineToRelative(-2.89f, 2.87f)
                lineToRelative(1.42f, 1.42f)
                lineTo(18.7f, 6.7f)
                lineTo(21.0f, 9.0f)
                lineTo(21.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(9.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(2.3f, -2.3f)
                lineToRelative(2.87f, 2.89f)
                lineToRelative(1.42f, -1.42f)
                lineTo(6.7f, 5.3f)
                close()
                moveTo(8.17f, 14.41f)
                lineTo(5.3f, 17.3f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-2.3f, -2.3f)
                lineToRelative(2.89f, -2.87f)
                close()
                moveTo(15.83f, 14.41f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(2.89f, 2.87f)
                lineTo(15.0f, 21.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-2.3f, 2.3f)
                close()
            }
        }
        .build()
        return _zoomOutMap!!
    }

private var _zoomOutMap: ImageVector? = null
