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

public val Octicons.TelescopeFill16: ImageVector
    get() {
        if (_telescopeFill16 != null) {
            return _telescopeFill16!!
        }
        _telescopeFill16 = Builder(name = "TelescopeFill16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.905f, 0.42f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.144f, 0.49f)
                lineToRelative(1.692f, 2.93f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.649f, 2.102f)
                lineTo(2.895f, 11.815f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.95f, -0.602f)
                lineToRelative(-0.68f, -1.176f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.455f, -1.99f)
                lineTo(11.905f, 0.422f)
                close()
                moveTo(8.531f, 10.21f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.944f, 0.253f)
                lineToRelative(2.644f, 3.864f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.238f, 0.847f)
                lineTo(9.0f, 12.424f)
                verticalLineToRelative(2.826f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.826f)
                lineToRelative(-1.881f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.238f, -0.848f)
                lineToRelative(2.048f, -2.992f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, 0.293f, -0.252f)
                lineToRelative(1.81f, -0.871f)
                close()
                moveTo(11.007f, 6.245f)
                verticalLineToRelative(-0.001f)
                lineToRelative(1.356f, -0.653f)
                lineToRelative(-1.52f, -2.631f)
                lineToRelative(-1.243f, 0.848f)
                close()
                moveTo(3.279f, 8.119f)
                lineToRelative(0.835f, 1.445f)
                lineToRelative(1.355f, -0.653f)
                lineToRelative(-0.947f, -1.64f)
                close()
            }
        }
        .build()
        return _telescopeFill16!!
    }

private var _telescopeFill16: ImageVector? = null
