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

public val Octicons.Bold16: ImageVector
    get() {
        if (_bold16 != null) {
            return _bold16!!
        }
        _bold16 = Builder(name = "Bold16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.852f, -6.47f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.5f, 2.0f)
                lineTo(4.0f, 2.0f)
                close()
                moveTo(8.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(5.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(5.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bold16!!
    }

private var _bold16: ImageVector? = null
