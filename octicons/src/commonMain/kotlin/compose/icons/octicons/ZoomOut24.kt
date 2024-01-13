package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ZoomOut24: ImageVector
    get() {
        if (_zoomOut24 != null) {
            return _zoomOut24!!
        }
        _zoomOut24 = Builder(name = "ZoomOut24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 10.5f)
                curveTo(0.0f, 4.701f, 4.701f, 0.0f, 10.5f, 0.0f)
                reflectiveCurveTo(21.0f, 4.701f, 21.0f, 10.5f)
                curveToRelative(0.0f, 2.63f, -0.967f, 5.033f, -2.564f, 6.875f)
                lineToRelative(4.344f, 4.345f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-4.345f, -4.344f)
                arcTo(10.459f, 10.459f, 0.0f, false, true, 10.5f, 21.0f)
                curveTo(4.701f, 21.0f, 0.0f, 16.299f, 0.0f, 10.5f)
                close()
                moveTo(10.5f, 1.5f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 9.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 9.0f, -9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _zoomOut24!!
    }

private var _zoomOut24: ImageVector? = null
