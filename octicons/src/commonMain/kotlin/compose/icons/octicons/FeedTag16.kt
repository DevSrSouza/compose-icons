package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import compose.icons.Octicons

public val Octicons.FeedTag16: ImageVector
    get() {
        if (_feedTag16 != null) {
            return _feedTag16!!
        }
        _feedTag16 = Builder(name = "FeedTag16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.22f, 6.5f)
                arcToRelative(0.72f, 0.72f, 0.0f, true, true, -1.44f, 0.0f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 1.44f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineToRelative(3.38f)
                curveToRelative(0.001f, 0.397f, 0.159f, 0.778f, 0.44f, 1.059f)
                lineToRelative(3.211f, 3.213f)
                arcToRelative(1.202f, 1.202f, 0.0f, false, false, 1.698f, 0.0f)
                lineToRelative(3.303f, -3.303f)
                arcToRelative(1.202f, 1.202f, 0.0f, false, false, 0.0f, -1.698f)
                lineTo(9.439f, 4.44f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.379f, 4.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _feedTag16!!
    }

private var _feedTag16: ImageVector? = null
