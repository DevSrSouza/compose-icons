package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) {
            return _gitCommit!!
        }
        _gitCommit = Builder(name = "GitCommit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 4.0f)
                curveTo(11.0f, 3.4477f, 11.4477f, 3.0f, 12.0f, 3.0f)
                curveTo(12.5523f, 3.0f, 13.0f, 3.4477f, 13.0f, 4.0f)
                verticalLineTo(9.1707f)
                curveTo(14.1652f, 9.5825f, 15.0f, 10.6938f, 15.0f, 12.0f)
                curveTo(15.0f, 13.3062f, 14.1652f, 14.4175f, 13.0f, 14.8293f)
                verticalLineTo(20.0f)
                curveTo(13.0f, 20.5523f, 12.5523f, 21.0f, 12.0f, 21.0f)
                curveTo(11.4477f, 21.0f, 11.0f, 20.5523f, 11.0f, 20.0f)
                verticalLineTo(14.8293f)
                curveTo(9.8348f, 14.4175f, 9.0f, 13.3062f, 9.0f, 12.0f)
                curveTo(9.0f, 10.6938f, 9.8348f, 9.5825f, 11.0f, 9.1707f)
                verticalLineTo(4.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(12.5523f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
                curveTo(13.0f, 11.4477f, 12.5523f, 11.0f, 12.0f, 11.0f)
                curveTo(11.4477f, 11.0f, 11.0f, 11.4477f, 11.0f, 12.0f)
                curveTo(11.0f, 12.5523f, 11.4477f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _gitCommit!!
    }

private var _gitCommit: ImageVector? = null
