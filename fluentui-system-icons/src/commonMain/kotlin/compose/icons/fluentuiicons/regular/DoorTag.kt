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

public val RegularGroup.DoorTag: ImageVector
    get() {
        if (_doorTag != null) {
            return _doorTag!!
        }
        _doorTag = Builder(name = "DoorTag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 17.5f)
                curveTo(9.3358f, 17.5f, 9.0f, 17.8358f, 9.0f, 18.25f)
                curveTo(9.0f, 18.6642f, 9.3358f, 19.0f, 9.75f, 19.0f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 19.0f, 15.0f, 18.6642f, 15.0f, 18.25f)
                curveTo(15.0f, 17.8358f, 14.6642f, 17.5f, 14.25f, 17.5f)
                horizontalLineTo(9.75f)
                close()
                moveTo(10.7989f, 7.1012f)
                curveTo(11.0763f, 6.7318f, 11.5108f, 6.5f, 12.0f, 6.5f)
                curveTo(12.8284f, 6.5f, 13.5f, 7.1716f, 13.5f, 8.0f)
                curveTo(13.5f, 8.8284f, 12.8284f, 9.5f, 12.0f, 9.5f)
                horizontalLineTo(8.0f)
                curveTo(6.8954f, 9.5f, 6.0f, 10.3954f, 6.0f, 11.5f)
                verticalLineTo(20.0f)
                curveTo(6.0f, 21.1046f, 6.8954f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1046f, 22.0f, 18.0f, 21.1046f, 18.0f, 20.0f)
                verticalLineTo(8.0f)
                curveTo(18.0f, 4.6863f, 15.3137f, 2.0f, 12.0f, 2.0f)
                curveTo(10.0358f, 2.0f, 8.292f, 2.9462f, 7.2011f, 4.3981f)
                curveTo(6.4547f, 5.3916f, 6.655f, 6.8021f, 7.6485f, 7.5485f)
                curveTo(8.642f, 8.2949f, 10.0524f, 8.0946f, 10.7989f, 7.1012f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(11.0217f, 5.0f, 10.1498f, 5.4678f, 9.5996f, 6.2001f)
                curveTo(9.3508f, 6.5313f, 8.8807f, 6.5981f, 8.5495f, 6.3492f)
                curveTo(8.2183f, 6.1005f, 8.1516f, 5.6303f, 8.4004f, 5.2991f)
                curveTo(9.2205f, 4.2075f, 10.5281f, 3.5f, 12.0f, 3.5f)
                curveTo(14.4853f, 3.5f, 16.5f, 5.5147f, 16.5f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(16.5f, 20.2761f, 16.2761f, 20.5f, 16.0f, 20.5f)
                horizontalLineTo(8.0f)
                curveTo(7.7239f, 20.5f, 7.5f, 20.2761f, 7.5f, 20.0f)
                verticalLineTo(11.5f)
                curveTo(7.5f, 11.2239f, 7.7239f, 11.0f, 8.0f, 11.0f)
                horizontalLineTo(12.0f)
                curveTo(13.6569f, 11.0f, 15.0f, 9.6568f, 15.0f, 8.0f)
                curveTo(15.0f, 6.3432f, 13.6569f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _doorTag!!
    }

private var _doorTag: ImageVector? = null
