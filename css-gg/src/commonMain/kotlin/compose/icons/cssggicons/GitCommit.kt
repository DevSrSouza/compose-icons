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
                curveTo(11.0f, 3.448f, 11.448f, 3.0f, 12.0f, 3.0f)
                curveTo(12.552f, 3.0f, 13.0f, 3.448f, 13.0f, 4.0f)
                verticalLineTo(9.171f)
                curveTo(14.165f, 9.583f, 15.0f, 10.694f, 15.0f, 12.0f)
                curveTo(15.0f, 13.306f, 14.165f, 14.417f, 13.0f, 14.829f)
                verticalLineTo(20.0f)
                curveTo(13.0f, 20.552f, 12.552f, 21.0f, 12.0f, 21.0f)
                curveTo(11.448f, 21.0f, 11.0f, 20.552f, 11.0f, 20.0f)
                verticalLineTo(14.829f)
                curveTo(9.835f, 14.417f, 9.0f, 13.306f, 9.0f, 12.0f)
                curveTo(9.0f, 10.694f, 9.835f, 9.583f, 11.0f, 9.171f)
                verticalLineTo(4.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(12.552f, 13.0f, 13.0f, 12.552f, 13.0f, 12.0f)
                curveTo(13.0f, 11.448f, 12.552f, 11.0f, 12.0f, 11.0f)
                curveTo(11.448f, 11.0f, 11.0f, 11.448f, 11.0f, 12.0f)
                curveTo(11.0f, 12.552f, 11.448f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _gitCommit!!
    }

private var _gitCommit: ImageVector? = null
