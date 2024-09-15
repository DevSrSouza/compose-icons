package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import compose.icons.CssGgIcons

public val CssGgIcons.EditMask: ImageVector
    get() {
        if (_editMask != null) {
            return _editMask!!
        }
        _editMask = Builder(name = "EditMask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                curveTo(13.105f, 14.0f, 14.0f, 13.105f, 14.0f, 12.0f)
                curveTo(14.0f, 10.895f, 13.105f, 10.0f, 12.0f, 10.0f)
                curveTo(10.895f, 10.0f, 10.0f, 10.895f, 10.0f, 12.0f)
                curveTo(10.0f, 13.105f, 10.895f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(9.031f, 19.431f)
                curveTo(9.01f, 19.29f, 9.0f, 19.146f, 9.0f, 19.0f)
                curveTo(9.0f, 17.343f, 10.343f, 16.0f, 12.0f, 16.0f)
                curveTo(13.657f, 16.0f, 15.0f, 17.343f, 15.0f, 19.0f)
                curveTo(15.0f, 19.146f, 14.99f, 19.29f, 14.969f, 19.431f)
                curveTo(16.999f, 18.619f, 18.619f, 16.999f, 19.431f, 14.969f)
                curveTo(19.29f, 14.99f, 19.146f, 15.0f, 19.0f, 15.0f)
                curveTo(17.343f, 15.0f, 16.0f, 13.657f, 16.0f, 12.0f)
                curveTo(16.0f, 10.343f, 17.343f, 9.0f, 19.0f, 9.0f)
                curveTo(19.064f, 9.0f, 19.127f, 9.002f, 19.19f, 9.006f)
                curveTo(19.271f, 9.011f, 19.351f, 9.019f, 19.431f, 9.031f)
                curveTo(18.619f, 7.001f, 16.999f, 5.381f, 14.969f, 4.569f)
                curveTo(14.99f, 4.71f, 15.0f, 4.854f, 15.0f, 5.0f)
                curveTo(15.0f, 6.657f, 13.657f, 8.0f, 12.0f, 8.0f)
                curveTo(10.343f, 8.0f, 9.0f, 6.657f, 9.0f, 5.0f)
                curveTo(9.0f, 4.854f, 9.01f, 4.71f, 9.031f, 4.569f)
                curveTo(7.001f, 5.381f, 5.381f, 7.001f, 4.569f, 9.031f)
                curveTo(4.649f, 9.019f, 4.729f, 9.011f, 4.81f, 9.006f)
                curveTo(4.873f, 9.002f, 4.936f, 9.0f, 5.0f, 9.0f)
                curveTo(6.657f, 9.0f, 8.0f, 10.343f, 8.0f, 12.0f)
                curveTo(8.0f, 13.657f, 6.657f, 15.0f, 5.0f, 15.0f)
                curveTo(4.854f, 15.0f, 4.71f, 14.99f, 4.569f, 14.969f)
                curveTo(5.381f, 16.999f, 7.001f, 18.619f, 9.031f, 19.431f)
                close()
            }
        }
        .build()
        return _editMask!!
    }

private var _editMask: ImageVector? = null
