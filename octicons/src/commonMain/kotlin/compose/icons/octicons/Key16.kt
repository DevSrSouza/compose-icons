package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Key16: ImageVector
    get() {
        if (_key16 != null) {
            return _key16!!
        }
        _key16 = Builder(name = "Key16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.5f, 5.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.731f, 3.795f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.768f, 0.18f)
                lineTo(7.44f, 10.5f)
                lineTo(6.25f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(1.19f)
                lineToRelative(-0.06f, 0.06f)
                lineTo(4.25f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(1.19f)
                lineToRelative(-0.06f, 0.06f)
                lineTo(1.75f, 14.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-1.69f)
                lineToRelative(5.024f, -5.023f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.181f, -0.768f)
                arcTo(3.995f, 3.995f, 0.0f, false, true, 6.5f, 5.5f)
                close()
                moveTo(10.5f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.348f, 6.788f)
                lineTo(0.22f, 11.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.22f, 0.53f)
                verticalLineToRelative(2.0f)
                curveTo(0.0f, 15.216f, 0.784f, 16.0f, 1.75f, 16.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.53f, -0.22f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.22f, -0.53f)
                lineTo(5.0f, 14.0f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.53f, -0.22f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.22f, -0.53f)
                lineTo(7.0f, 12.0f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.53f, -0.22f)
                lineToRelative(0.932f, -0.932f)
                arcTo(5.5f, 5.5f, 0.0f, true, false, 10.5f, 0.0f)
                close()
                moveTo(11.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _key16!!
    }

private var _key16: ImageVector? = null
