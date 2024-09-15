package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.InternetExplorer: ImageVector
    get() {
        if (_internetExplorer != null) {
            return _internetExplorer!!
        }
        _internetExplorer = Builder(name = "InternetExplorer", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.699f, 8.813f)
                curveTo(30.145f, 2.57f, 25.398f, 3.008f, 25.398f, 3.008f)
                curveTo(22.352f, 3.008f, 18.543f, 5.738f, 18.543f, 5.738f)
                curveTo(18.543f, 5.738f, 14.0f, 4.531f, 9.457f, 7.234f)
                curveTo(4.508f, 10.34f, 4.672f, 15.855f, 4.672f, 15.855f)
                curveTo(8.695f, 10.184f, 14.301f, 7.879f, 14.301f, 7.879f)
                lineTo(14.301f, 8.254f)
                curveTo(6.027f, 13.816f, 4.07f, 21.957f, 3.582f, 23.617f)
                curveTo(3.09f, 25.277f, 3.418f, 29.0f, 6.898f, 29.0f)
                curveTo(10.383f, 29.0f, 13.918f, 26.238f, 13.918f, 26.238f)
                curveTo(13.918f, 26.238f, 14.68f, 26.402f, 16.746f, 26.402f)
                curveTo(25.453f, 26.402f, 27.52f, 18.852f, 27.52f, 18.852f)
                lineTo(19.793f, 18.852f)
                curveTo(19.793f, 18.852f, 19.25f, 21.316f, 16.477f, 21.316f)
                curveTo(12.664f, 21.316f, 12.883f, 17.406f, 12.883f, 17.406f)
                lineTo(27.629f, 17.406f)
                curveTo(28.336f, 7.344f, 19.414f, 5.898f, 19.414f, 5.898f)
                curveTo(19.414f, 5.898f, 22.566f, 3.703f, 25.289f, 3.703f)
                curveTo(29.602f, 3.703f, 27.563f, 8.676f, 27.563f, 8.676f)
                close()
                moveTo(13.484f, 26.129f)
                curveTo(13.484f, 26.129f, 8.172f, 29.301f, 5.785f, 27.102f)
                curveTo(4.512f, 24.902f, 6.586f, 21.789f, 6.586f, 21.789f)
                curveTo(6.586f, 21.789f, 8.344f, 24.996f, 13.484f, 26.129f)
                close()
                moveTo(19.875f, 13.98f)
                lineTo(12.863f, 13.98f)
                curveTo(12.863f, 13.98f, 12.773f, 10.617f, 16.457f, 10.617f)
                curveTo(20.016f, 10.617f, 19.875f, 13.98f, 19.875f, 13.98f)
                close()
            }
        }
        .build()
        return _internetExplorer!!
    }

private var _internetExplorer: ImageVector? = null
