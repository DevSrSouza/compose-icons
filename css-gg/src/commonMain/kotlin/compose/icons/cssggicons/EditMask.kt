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
                curveTo(13.1046f, 14.0f, 14.0f, 13.1046f, 14.0f, 12.0f)
                curveTo(14.0f, 10.8954f, 13.1046f, 10.0f, 12.0f, 10.0f)
                curveTo(10.8954f, 10.0f, 10.0f, 10.8954f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1046f, 10.8954f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4772f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4772f, 6.4772f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4772f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(9.0307f, 19.4308f)
                curveTo(9.0105f, 19.29f, 9.0f, 19.1462f, 9.0f, 19.0f)
                curveTo(9.0f, 17.3431f, 10.3431f, 16.0f, 12.0f, 16.0f)
                curveTo(13.6569f, 16.0f, 15.0f, 17.3431f, 15.0f, 19.0f)
                curveTo(15.0f, 19.1462f, 14.9895f, 19.29f, 14.9693f, 19.4308f)
                curveTo(16.9993f, 18.6189f, 18.619f, 16.9993f, 19.4308f, 14.9692f)
                curveTo(19.2901f, 14.9895f, 19.1463f, 15.0f, 19.0f, 15.0f)
                curveTo(17.3431f, 15.0f, 16.0f, 13.6569f, 16.0f, 12.0f)
                curveTo(16.0f, 10.3431f, 17.3431f, 9.0f, 19.0f, 9.0f)
                curveTo(19.0637f, 9.0f, 19.127f, 9.002f, 19.1897f, 9.0059f)
                curveTo(19.271f, 9.011f, 19.3514f, 9.0193f, 19.4308f, 9.0308f)
                curveTo(18.6189f, 7.0007f, 16.9993f, 5.3811f, 14.9693f, 4.5692f)
                curveTo(14.9895f, 4.71f, 15.0f, 4.8538f, 15.0f, 5.0f)
                curveTo(15.0f, 6.6569f, 13.6569f, 8.0f, 12.0f, 8.0f)
                curveTo(10.3431f, 8.0f, 9.0f, 6.6569f, 9.0f, 5.0f)
                curveTo(9.0f, 4.8538f, 9.0105f, 4.71f, 9.0307f, 4.5692f)
                curveTo(7.0007f, 5.3811f, 5.3811f, 7.0007f, 4.5691f, 9.0308f)
                curveTo(4.6486f, 9.0193f, 4.729f, 9.011f, 4.8103f, 9.0059f)
                curveTo(4.873f, 9.002f, 4.9363f, 9.0f, 5.0f, 9.0f)
                curveTo(6.6569f, 9.0f, 8.0f, 10.3431f, 8.0f, 12.0f)
                curveTo(8.0f, 13.6569f, 6.6569f, 15.0f, 5.0f, 15.0f)
                curveTo(4.8537f, 15.0f, 4.7098f, 14.9895f, 4.5691f, 14.9692f)
                curveTo(5.381f, 16.9993f, 7.0007f, 18.6189f, 9.0307f, 19.4308f)
                close()
            }
        }
        .build()
        return _editMask!!
    }

private var _editMask: ImageVector? = null
