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

public val Octicons.Paste16: ImageVector
    get() {
        if (_paste16 != null) {
            return _paste16!!
        }
        _paste16 = Builder(name = "Paste16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.626f, 3.533f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, false, -0.126f, 0.217f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-9.5f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, false, -0.126f, -0.217f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.752f, -1.298f)
                curveToRelative(0.541f, 0.313f, 0.874f, 0.89f, 0.874f, 1.515f)
                verticalLineToRelative(9.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 12.25f, 15.0f)
                horizontalLineToRelative(-8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 13.25f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.625f, 0.333f, -1.202f, 0.874f, -1.515f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.752f, 1.298f)
                close()
                moveTo(5.75f, 1.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-4.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.0f, 4.75f)
                verticalLineToRelative(-3.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.75f, 1.0f)
                close()
                moveTo(6.5f, 4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(9.5f, 2.5f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _paste16!!
    }

private var _paste16: ImageVector? = null
