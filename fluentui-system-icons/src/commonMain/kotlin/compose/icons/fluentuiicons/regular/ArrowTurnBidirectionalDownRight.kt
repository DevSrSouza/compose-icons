package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowTurnBidirectionalDownRight: ImageVector
    get() {
        if (_arrowTurnBidirectionalDownRight != null) {
            return _arrowTurnBidirectionalDownRight!!
        }
        _arrowTurnBidirectionalDownRight = Builder(name = "ArrowTurnBidirectionalDownRight",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2803f, 3.2196f)
                curveTo(16.9874f, 2.9268f, 16.5125f, 2.9268f, 16.2196f, 3.2197f)
                curveTo(15.9268f, 3.5126f, 15.9268f, 3.9875f, 16.2197f, 4.2804f)
                lineTo(19.4397f, 7.5f)
                horizontalLineTo(11.75f)
                curveTo(9.4028f, 7.5f, 7.5f, 9.4028f, 7.5f, 11.75f)
                verticalLineTo(19.439f)
                lineTo(4.2803f, 16.2196f)
                curveTo(3.9874f, 15.9268f, 3.5125f, 15.9268f, 3.2196f, 16.2197f)
                curveTo(2.9268f, 16.5126f, 2.9268f, 16.9875f, 3.2197f, 17.2804f)
                lineTo(7.7201f, 21.7804f)
                curveTo(8.0131f, 22.0732f, 8.4879f, 22.0732f, 8.7808f, 21.7803f)
                lineTo(13.2803f, 17.2806f)
                curveTo(13.5732f, 16.9877f, 13.5732f, 16.5128f, 13.2803f, 16.22f)
                curveTo(12.9874f, 15.9271f, 12.5125f, 15.9271f, 12.2197f, 16.22f)
                lineTo(9.0f, 19.4398f)
                verticalLineTo(11.75f)
                curveTo(9.0f, 10.2312f, 10.2312f, 9.0f, 11.75f, 9.0f)
                horizontalLineTo(19.439f)
                lineTo(16.2196f, 12.2197f)
                curveTo(15.9268f, 12.5126f, 15.9268f, 12.9875f, 16.2197f, 13.2804f)
                curveTo(16.5126f, 13.5732f, 16.9875f, 13.5732f, 17.2804f, 13.2803f)
                lineTo(21.7804f, 8.7799f)
                curveTo(21.921f, 8.6392f, 22.0f, 8.4484f, 22.0f, 8.2495f)
                curveTo(22.0f, 8.0506f, 21.921f, 7.8598f, 21.7803f, 7.7192f)
                lineTo(17.2803f, 3.2196f)
                close()
            }
        }
        .build()
        return _arrowTurnBidirectionalDownRight!!
    }

private var _arrowTurnBidirectionalDownRight: ImageVector? = null
