package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Bitbucket: ImageVector
    get() {
        if (_bitbucket != null) {
            return _bitbucket!!
        }
        _bitbucket = Builder(name = "Bitbucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.778f, 1.213f)
                arcToRelative(0.768f, 0.768f, 0.0f, false, false, -0.768f, 0.892f)
                lineToRelative(3.263f, 19.81f)
                curveToRelative(0.084f, 0.5f, 0.515f, 0.868f, 1.022f, 0.873f)
                horizontalLineTo(19.95f)
                arcToRelative(0.772f, 0.772f, 0.0f, false, false, 0.77f, -0.646f)
                lineToRelative(3.27f, -20.03f)
                arcToRelative(0.768f, 0.768f, 0.0f, false, false, -0.768f, -0.891f)
                close()
                moveTo(14.52f, 15.53f)
                horizontalLineTo(9.522f)
                lineTo(8.17f, 8.466f)
                horizontalLineToRelative(7.561f)
                close()
            }
        }
        .build()
        return _bitbucket!!
    }

private var _bitbucket: ImageVector? = null
