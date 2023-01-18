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

public val RemixIcons.AnchorLine: ImageVector
    get() {
        if (_anchorLine != null) {
            return _anchorLine!!
        }
        _anchorLine = Builder(name = "AnchorLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.05f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.062f)
                arcTo(8.004f, 8.004f, 0.0f, false, false, 11.0f, 19.938f)
                verticalLineTo(9.874f)
                arcTo(4.002f, 4.002f, 0.0f, false, true, 12.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.0f, 7.874f)
                verticalLineToRelative(10.064f)
                arcTo(8.004f, 8.004f, 0.0f, false, false, 19.938f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.95f)
                curveToRelative(0.033f, 0.329f, 0.05f, 0.663f, 0.05f, 1.0f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                curveToRelative(0.0f, -0.337f, 0.017f, -0.671f, 0.05f, -1.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _anchorLine!!
    }

private var _anchorLine: ImageVector? = null
