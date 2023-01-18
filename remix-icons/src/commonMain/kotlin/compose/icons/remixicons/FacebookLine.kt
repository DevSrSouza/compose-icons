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

public val RemixIcons.FacebookLine: ImageVector
    get() {
        if (_facebookLine != null) {
            return _facebookLine!!
        }
        _facebookLine = Builder(name = "FacebookLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(4.5f)
                lineToRelative(-0.5f, 2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(7.128f)
                curveToRelative(0.0f, -1.783f, 0.186f, -2.43f, 0.534f, -3.082f)
                arcToRelative(3.635f, 3.635f, 0.0f, false, true, 1.512f, -1.512f)
                curveTo(13.698f, 2.186f, 14.345f, 2.0f, 16.128f, 2.0f)
                curveToRelative(0.522f, 0.0f, 0.98f, 0.05f, 1.372f, 0.15f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-1.372f)
                curveToRelative(-1.324f, 0.0f, -1.727f, 0.078f, -2.138f, 0.298f)
                curveToRelative(-0.304f, 0.162f, -0.53f, 0.388f, -0.692f, 0.692f)
                curveToRelative(-0.22f, 0.411f, -0.298f, 0.814f, -0.298f, 2.138f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _facebookLine!!
    }

private var _facebookLine: ImageVector? = null
