package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Profile: ImageVector
    get() {
        if (_profile != null) {
            return _profile!!
        }
        _profile = Builder(name = "Profile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 9.0f)
                curveTo(16.0f, 11.209f, 14.209f, 13.0f, 12.0f, 13.0f)
                curveTo(9.791f, 13.0f, 8.0f, 11.209f, 8.0f, 9.0f)
                curveTo(8.0f, 6.791f, 9.791f, 5.0f, 12.0f, 5.0f)
                curveTo(14.209f, 5.0f, 16.0f, 6.791f, 16.0f, 9.0f)
                close()
                moveTo(14.0f, 9.0f)
                curveTo(14.0f, 10.105f, 13.105f, 11.0f, 12.0f, 11.0f)
                curveTo(10.895f, 11.0f, 10.0f, 10.105f, 10.0f, 9.0f)
                curveTo(10.0f, 7.895f, 10.895f, 7.0f, 12.0f, 7.0f)
                curveTo(13.105f, 7.0f, 14.0f, 7.895f, 14.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.0f)
                curveTo(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                curveTo(1.0f, 18.075f, 5.925f, 23.0f, 12.0f, 23.0f)
                curveTo(18.075f, 23.0f, 23.0f, 18.075f, 23.0f, 12.0f)
                curveTo(23.0f, 5.925f, 18.075f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 14.09f, 3.713f, 16.014f, 4.908f, 17.542f)
                curveTo(6.552f, 15.389f, 9.146f, 14.0f, 12.064f, 14.0f)
                curveTo(14.945f, 14.0f, 17.509f, 15.353f, 19.156f, 17.458f)
                curveTo(20.313f, 15.944f, 21.0f, 14.052f, 21.0f, 12.0f)
                curveTo(21.0f, 7.029f, 16.971f, 3.0f, 12.0f, 3.0f)
                curveTo(7.029f, 3.0f, 3.0f, 7.029f, 3.0f, 12.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveTo(9.85f, 21.0f, 7.876f, 20.246f, 6.328f, 18.988f)
                curveTo(7.594f, 17.181f, 9.691f, 16.0f, 12.064f, 16.0f)
                curveTo(14.408f, 16.0f, 16.483f, 17.152f, 17.754f, 18.921f)
                curveTo(16.194f, 20.219f, 14.188f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _profile!!
    }

private var _profile: ImageVector? = null
