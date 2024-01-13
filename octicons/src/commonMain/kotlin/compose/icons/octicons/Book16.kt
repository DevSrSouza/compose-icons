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

public val Octicons.Book16: ImageVector
    get() {
        if (_book16 != null) {
            return _book16!!
        }
        _book16 = Builder(name = "Book16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 0.75f, 1.0f)
                horizontalLineToRelative(4.253f)
                curveToRelative(1.227f, 0.0f, 2.317f, 0.59f, 3.0f, 1.501f)
                arcTo(3.743f, 3.743f, 0.0f, false, true, 11.006f, 1.0f)
                horizontalLineToRelative(4.245f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-4.507f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -1.591f, 0.659f)
                lineToRelative(-0.622f, 0.621f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                lineToRelative(-0.622f, -0.621f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 5.258f, 13.0f)
                lineTo(0.75f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(7.251f, 12.074f)
                lineTo(7.255f, 7.001f)
                lineTo(7.253f, 4.748f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 5.003f, 2.5f)
                lineTo(1.5f, 2.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.757f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, 1.994f, 0.574f)
                close()
                moveTo(8.755f, 4.75f)
                lineToRelative(-0.004f, 7.322f)
                arcToRelative(3.752f, 3.752f, 0.0f, false, true, 1.992f, -0.572f)
                lineTo(14.5f, 11.5f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-3.495f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.25f, 2.25f)
                close()
            }
        }
        .build()
        return _book16!!
    }

private var _book16: ImageVector? = null
