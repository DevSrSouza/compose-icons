package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DoorTag: ImageVector
    get() {
        if (_doorTag != null) {
            return _doorTag!!
        }
        _doorTag = Builder(name = "DoorTag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.5f)
                curveTo(11.5108f, 6.5f, 11.0763f, 6.7318f, 10.7989f, 7.1012f)
                curveTo(10.0524f, 8.0946f, 8.642f, 8.2949f, 7.6485f, 7.5485f)
                curveTo(6.655f, 6.8021f, 6.4547f, 5.3916f, 7.2011f, 4.3981f)
                curveTo(8.292f, 2.9462f, 10.0358f, 2.0f, 12.0f, 2.0f)
                curveTo(15.3137f, 2.0f, 18.0f, 4.6863f, 18.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 21.1046f, 17.1046f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(6.8954f, 22.0f, 6.0f, 21.1046f, 6.0f, 20.0f)
                verticalLineTo(11.5f)
                curveTo(6.0f, 10.3954f, 6.8954f, 9.5f, 8.0f, 9.5f)
                horizontalLineTo(12.0f)
                curveTo(12.8284f, 9.5f, 13.5f, 8.8284f, 13.5f, 8.0f)
                curveTo(13.5f, 7.1716f, 12.8284f, 6.5f, 12.0f, 6.5f)
                close()
                moveTo(9.75f, 17.5f)
                curveTo(9.3358f, 17.5f, 9.0f, 17.8358f, 9.0f, 18.25f)
                curveTo(9.0f, 18.6642f, 9.3358f, 19.0f, 9.75f, 19.0f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 19.0f, 15.0f, 18.6642f, 15.0f, 18.25f)
                curveTo(15.0f, 17.8358f, 14.6642f, 17.5f, 14.25f, 17.5f)
                horizontalLineTo(9.75f)
                close()
            }
        }
        .build()
        return _doorTag!!
    }

private var _doorTag: ImageVector? = null
