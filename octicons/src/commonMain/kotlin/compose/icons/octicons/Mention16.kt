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

public val Octicons.Mention16: ImageVector
    get() {
        if (_mention16 != null) {
            return _mention16!!
        }
        _mention16 = Builder(name = "Mention16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.75f, 2.37f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 6.5f, 11.26f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 1.298f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 3.994f, -7.273f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, 0.006f, 0.095f)
                verticalLineToRelative(1.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.072f, 1.475f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 12.0f, 8.0f)
                verticalLineToRelative(1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                verticalLineTo(7.867f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -9.75f, -5.496f)
                verticalLineTo(2.37f)
                close()
                moveTo(10.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mention16!!
    }

private var _mention16: ImageVector? = null
