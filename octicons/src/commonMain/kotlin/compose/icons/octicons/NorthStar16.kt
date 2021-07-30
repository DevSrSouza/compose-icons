package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.NorthStar16: ImageVector
    get() {
        if (_northStar16 != null) {
            return _northStar16!!
        }
        _northStar16 = Builder(name = "NorthStar16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(5.19f)
                lineTo(4.391f, 3.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.061f)
                lineTo(5.939f, 7.0f)
                horizontalLineTo(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(5.19f)
                lineToRelative(-2.61f, 2.609f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.061f, 1.06f)
                lineTo(7.0f, 9.561f)
                verticalLineToRelative(5.189f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(9.56f)
                lineToRelative(2.609f, 2.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.061f)
                lineTo(9.561f, 8.5f)
                horizontalLineToRelative(5.189f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(9.56f)
                lineToRelative(2.61f, -2.609f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.061f, -1.06f)
                lineTo(8.5f, 5.939f)
                verticalLineTo(0.75f)
                close()
            }
        }
        .build()
        return _northStar16!!
    }

private var _northStar16: ImageVector? = null
