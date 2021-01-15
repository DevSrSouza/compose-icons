package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Canonical: ImageVector
    get() {
        if (_canonical != null) {
            return _canonical!!
        }
        _canonical = Builder(name = "Canonical", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-6.628f, 0.0f, -12.0f, -5.373f, -12.0f, -12.0f)
                curveTo(0.0f, 5.372f, 5.372f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, 5.372f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 2.92f)
                arcTo(9.08f, 9.08f, 0.0f, false, false, 2.92f, 12.0f)
                arcTo(9.08f, 9.08f, 0.0f, false, false, 12.0f, 21.08f)
                arcTo(9.08f, 9.08f, 0.0f, false, false, 21.081f, 12.0f)
                arcTo(9.08f, 9.08f, 0.0f, false, false, 12.0f, 2.92f)
                close()
                moveTo(12.0f, 19.642f)
                arcTo(7.64f, 7.64f, 0.0f, false, true, 4.36f, 12.0f)
                arcTo(7.64f, 7.64f, 0.0f, false, true, 12.0f, 4.36f)
                arcTo(7.64f, 7.64f, 0.0f, false, true, 19.641f, 12.0f)
                arcToRelative(7.64f, 7.64f, 0.0f, false, true, -7.64f, 7.641f)
                close()
            }
        }
        .build()
        return _canonical!!
    }

private var _canonical: ImageVector? = null
