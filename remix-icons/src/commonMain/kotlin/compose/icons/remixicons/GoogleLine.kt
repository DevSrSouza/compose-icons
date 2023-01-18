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

public val RemixIcons.GoogleLine: ImageVector
    get() {
        if (_googleLine != null) {
            return _googleLine!!
        }
        _googleLine = Builder(name = "GoogleLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                horizontalLineToRelative(8.533f)
                curveToRelative(0.044f, 0.385f, 0.067f, 0.78f, 0.067f, 1.184f)
                curveToRelative(0.0f, 2.734f, -0.98f, 5.036f, -2.678f, 6.6f)
                curveToRelative(-1.485f, 1.371f, -3.518f, 2.175f, -5.942f, 2.175f)
                arcTo(8.976f, 8.976f, 0.0f, false, true, 3.0f, 11.98f)
                arcTo(8.976f, 8.976f, 0.0f, false, true, 11.98f, 3.0f)
                curveToRelative(2.42f, 0.0f, 4.453f, 0.89f, 6.008f, 2.339f)
                lineTo(16.526f, 6.8f)
                curveTo(15.368f, 5.681f, 13.803f, 5.0f, 12.0f, 5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 0.0f, 14.0f)
                curveToRelative(3.526f, 0.0f, 6.144f, -2.608f, 6.577f, -6.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _googleLine!!
    }

private var _googleLine: ImageVector? = null
