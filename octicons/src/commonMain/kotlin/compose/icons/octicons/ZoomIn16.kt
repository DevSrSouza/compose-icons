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

public val Octicons.ZoomIn16: ImageVector
    get() {
        if (_zoomIn16 != null) {
            return _zoomIn16!!
        }
        _zoomIn16 = Builder(name = "ZoomIn16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.25f)
                verticalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(2.25f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(8.25f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(8.25f)
                horizontalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 0.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 5.807f, 12.247f)
                lineToRelative(2.473f, 2.473f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-2.473f, -2.473f)
                arcTo(7.5f, 7.5f, 0.0f, true, true, 7.5f, 0.0f)
                close()
                moveTo(1.5f, 7.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _zoomIn16!!
    }

private var _zoomIn16: ImageVector? = null
