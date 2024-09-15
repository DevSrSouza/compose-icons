package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Community: ImageVector
    get() {
        if (_community != null) {
            return _community!!
        }
        _community = Builder(name = "Community", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 17.456f)
                curveTo(11.239f, 17.805f, 10.392f, 18.0f, 9.5f, 18.0f)
                curveTo(6.186f, 18.0f, 3.5f, 15.314f, 3.5f, 12.0f)
                curveTo(3.5f, 8.686f, 6.186f, 6.0f, 9.5f, 6.0f)
                curveTo(10.392f, 6.0f, 11.239f, 6.195f, 12.0f, 6.544f)
                curveTo(12.761f, 6.195f, 13.608f, 6.0f, 14.5f, 6.0f)
                curveTo(17.814f, 6.0f, 20.5f, 8.686f, 20.5f, 12.0f)
                curveTo(20.5f, 15.314f, 17.814f, 18.0f, 14.5f, 18.0f)
                curveTo(13.608f, 18.0f, 12.761f, 17.805f, 12.0f, 17.456f)
                close()
                moveTo(10.0f, 15.969f)
                curveTo(9.836f, 15.99f, 9.669f, 16.0f, 9.5f, 16.0f)
                curveTo(7.291f, 16.0f, 5.5f, 14.209f, 5.5f, 12.0f)
                curveTo(5.5f, 9.791f, 7.291f, 8.0f, 9.5f, 8.0f)
                curveTo(9.669f, 8.0f, 9.836f, 8.011f, 10.0f, 8.031f)
                curveTo(9.067f, 9.089f, 8.5f, 10.478f, 8.5f, 12.0f)
                curveTo(8.5f, 13.522f, 9.067f, 14.911f, 10.0f, 15.969f)
                close()
                moveTo(14.0f, 8.031f)
                curveTo(14.164f, 8.011f, 14.331f, 8.0f, 14.5f, 8.0f)
                curveTo(16.709f, 8.0f, 18.5f, 9.791f, 18.5f, 12.0f)
                curveTo(18.5f, 14.209f, 16.709f, 16.0f, 14.5f, 16.0f)
                curveTo(14.331f, 16.0f, 14.164f, 15.99f, 14.0f, 15.969f)
                curveTo(14.933f, 14.911f, 15.5f, 13.522f, 15.5f, 12.0f)
                curveTo(15.5f, 10.478f, 14.933f, 9.089f, 14.0f, 8.031f)
                close()
                moveTo(12.0f, 8.877f)
                curveTo(12.915f, 9.61f, 13.5f, 10.737f, 13.5f, 12.0f)
                curveTo(13.5f, 13.263f, 12.915f, 14.39f, 12.0f, 15.123f)
                curveTo(11.085f, 14.39f, 10.5f, 13.263f, 10.5f, 12.0f)
                curveTo(10.5f, 10.737f, 11.085f, 9.61f, 12.0f, 8.877f)
                close()
            }
        }
        .build()
        return _community!!
    }

private var _community: ImageVector? = null
