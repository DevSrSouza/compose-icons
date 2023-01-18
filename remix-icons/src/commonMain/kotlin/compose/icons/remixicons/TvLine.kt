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

public val RemixIcons.TvLine: ImageVector
    get() {
        if (_tvLine != null) {
            return _tvLine!!
        }
        _tvLine = Builder(name = "TvLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.414f, 5.0f)
                horizontalLineToRelative(5.594f)
                curveToRelative(0.548f, 0.0f, 0.992f, 0.445f, 0.992f, 1.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.552f, -0.455f, 1.0f, -0.992f, 1.0f)
                horizontalLineTo(2.992f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.552f, 0.455f, -1.0f, 0.992f, -1.0f)
                horizontalLineToRelative(5.594f)
                lineTo(6.05f, 2.464f)
                lineTo(7.464f, 1.05f)
                lineTo(11.414f, 5.0f)
                horizontalLineToRelative(1.172f)
                lineToRelative(3.95f, -3.95f)
                lineToRelative(1.414f, 1.414f)
                lineTo(15.414f, 5.0f)
                close()
                moveTo(4.0f, 7.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _tvLine!!
    }

private var _tvLine: ImageVector? = null
