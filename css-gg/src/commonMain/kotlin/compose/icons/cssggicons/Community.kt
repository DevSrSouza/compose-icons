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
                curveTo(11.2389f, 17.8053f, 10.3922f, 18.0f, 9.5f, 18.0f)
                curveTo(6.1863f, 18.0f, 3.5f, 15.3137f, 3.5f, 12.0f)
                curveTo(3.5f, 8.6863f, 6.1863f, 6.0f, 9.5f, 6.0f)
                curveTo(10.3922f, 6.0f, 11.2389f, 6.1947f, 12.0f, 6.544f)
                curveTo(12.7611f, 6.1947f, 13.6078f, 6.0f, 14.5f, 6.0f)
                curveTo(17.8137f, 6.0f, 20.5f, 8.6863f, 20.5f, 12.0f)
                curveTo(20.5f, 15.3137f, 17.8137f, 18.0f, 14.5f, 18.0f)
                curveTo(13.6078f, 18.0f, 12.7611f, 17.8053f, 12.0f, 17.456f)
                close()
                moveTo(10.0003f, 15.969f)
                curveTo(9.8364f, 15.9895f, 9.6694f, 16.0f, 9.5f, 16.0f)
                curveTo(7.2909f, 16.0f, 5.5f, 14.2091f, 5.5f, 12.0f)
                curveTo(5.5f, 9.7909f, 7.2909f, 8.0f, 9.5f, 8.0f)
                curveTo(9.6694f, 8.0f, 9.8364f, 8.0105f, 10.0003f, 8.031f)
                curveTo(9.0666f, 9.0887f, 8.5f, 10.4782f, 8.5f, 12.0f)
                curveTo(8.5f, 13.5218f, 9.0666f, 14.9113f, 10.0003f, 15.969f)
                close()
                moveTo(13.9998f, 8.031f)
                curveTo(14.1636f, 8.0105f, 14.3306f, 8.0f, 14.5f, 8.0f)
                curveTo(16.7091f, 8.0f, 18.5f, 9.7909f, 18.5f, 12.0f)
                curveTo(18.5f, 14.2091f, 16.7091f, 16.0f, 14.5f, 16.0f)
                curveTo(14.3306f, 16.0f, 14.1636f, 15.9895f, 13.9998f, 15.969f)
                curveTo(14.9334f, 14.9113f, 15.5f, 13.5218f, 15.5f, 12.0f)
                curveTo(15.5f, 10.4782f, 14.9334f, 9.0887f, 13.9998f, 8.031f)
                close()
                moveTo(12.0f, 8.8773f)
                curveTo(12.9145f, 9.6104f, 13.5f, 10.7368f, 13.5f, 12.0f)
                curveTo(13.5f, 13.2632f, 12.9145f, 14.3896f, 12.0f, 15.1227f)
                curveTo(11.0855f, 14.3896f, 10.5f, 13.2632f, 10.5f, 12.0f)
                curveTo(10.5f, 10.7368f, 11.0855f, 9.6104f, 12.0f, 8.8773f)
                close()
            }
        }
        .build()
        return _community!!
    }

private var _community: ImageVector? = null
