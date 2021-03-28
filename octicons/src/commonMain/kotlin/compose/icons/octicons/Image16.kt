package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Image16: ImageVector
    get() {
        if (_image16 != null) {
            return _image16!!
        }
        _image16 = Builder(name = "Image16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.75f, 2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(0.94f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, 0.03f, -0.03f)
                lineToRelative(6.077f, -6.078f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.412f, -0.06f)
                lineTo(14.5f, 10.31f)
                lineTo(14.5f, 2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(1.75f, 2.5f)
                close()
                moveTo(14.25f, 13.5f)
                lineTo(4.81f, 13.5f)
                lineToRelative(5.048f, -5.047f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.344f, -0.009f)
                lineToRelative(4.298f, 3.889f)
                verticalLineToRelative(0.917f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                close()
                moveTo(16.0f, 13.25f)
                lineTo(16.0f, 2.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.25f, 1.0f)
                lineTo(1.75f, 1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 2.75f)
                verticalLineToRelative(10.5f)
                curveTo(0.0f, 14.216f, 0.784f, 15.0f, 1.75f, 15.0f)
                horizontalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 16.0f, 13.25f)
                close()
                moveTo(5.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
                moveTo(7.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _image16!!
    }

private var _image16: ImageVector? = null
