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

public val Octicons.Book24: ImageVector
    get() {
        if (_book24 != null) {
            return _book24!!
        }
        _book24 = Builder(name = "Book24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 0.75f, 3.0f)
                horizontalLineToRelative(7.497f)
                curveToRelative(1.566f, 0.0f, 2.945f, 0.8f, 3.751f, 2.014f)
                arcTo(4.495f, 4.495f, 0.0f, false, true, 15.75f, 3.0f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(15.063f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, -0.755f, 0.75f)
                lineToRelative(-7.682f, -0.052f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.142f, 0.878f)
                lineToRelative(-0.89f, 0.891f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.061f, 0.0f)
                lineToRelative(-0.902f, -0.901f)
                arcToRelative(2.996f, 2.996f, 0.0f, false, false, -2.121f, -0.879f)
                lineTo(0.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(12.75f, 18.982f)
                arcToRelative(4.503f, 4.503f, 0.0f, false, true, 2.823f, -0.971f)
                lineToRelative(6.927f, 0.047f)
                lineTo(22.5f, 4.5f)
                horizontalLineToRelative(-6.75f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                close()
                moveTo(11.247f, 7.497f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -2.997f)
                lineTo(1.5f, 4.5f)
                lineTo(1.5f, 18.0f)
                horizontalLineToRelative(6.947f)
                curveToRelative(1.018f, 0.0f, 2.006f, 0.346f, 2.803f, 0.98f)
                close()
            }
        }
        .build()
        return _book24!!
    }

private var _book24: ImageVector? = null
