package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MovieFill: ImageVector
    get() {
        if (_movieFill != null) {
            return _movieFill!!
        }
        _movieFill = Builder(name = "MovieFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.992f, 3.0f)
                horizontalLineToRelative(18.016f)
                curveToRelative(0.548f, 0.0f, 0.992f, 0.445f, 0.992f, 0.993f)
                verticalLineToRelative(16.014f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.992f, 0.993f)
                lineTo(2.992f, 21.0f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 2.0f, 20.007f)
                lineTo(2.0f, 3.993f)
                close()
                moveTo(10.622f, 8.415f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.622f, 0.332f)
                verticalLineToRelative(6.506f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.622f, 0.332f)
                lineToRelative(4.879f, -3.252f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.0f, -0.666f)
                lineToRelative(-4.88f, -3.252f)
                close()
            }
        }
        .build()
        return _movieFill!!
    }

private var _movieFill: ImageVector? = null
