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

public val Octicons.Lock16: ImageVector
    get() {
        if (_lock16 != null) {
            return _lock16!!
        }
        _lock16 = Builder(name = "Lock16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 2.0f, 7.75f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.0f, 13.25f)
                verticalLineToRelative(-5.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 12.25f, 6.0f)
                lineTo(12.0f, 6.0f)
                lineTo(12.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -8.0f, 0.0f)
                close()
                moveTo(10.5f, 6.0f)
                lineTo(10.5f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(12.0f, 7.5f)
                horizontalLineToRelative(0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                lineTo(12.0f, 7.5f)
                close()
            }
        }
        .build()
        return _lock16!!
    }

private var _lock16: ImageVector? = null
