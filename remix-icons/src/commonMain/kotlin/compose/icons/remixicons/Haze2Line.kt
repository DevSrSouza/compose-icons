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

public val RemixIcons.Haze2Line: ImageVector
    get() {
        if (_haze2Line != null) {
            return _haze2Line!!
        }
        _haze2Line = Builder(name = "Haze2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(19.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(4.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(17.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                curveToRelative(-1.844f, 0.0f, -3.51f, -1.04f, -5.0f, -3.122f)
                curveTo(10.51f, 15.96f, 8.844f, 17.0f, 7.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 7.0f)
                curveToRelative(1.844f, 0.0f, 3.51f, 1.04f, 5.0f, 3.122f)
                curveTo(13.49f, 8.04f, 15.156f, 7.0f, 17.0f, 7.0f)
                close()
                moveTo(7.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                curveToRelative(1.254f, 0.0f, 2.51f, -0.875f, 3.759f, -2.854f)
                lineToRelative(0.089f, -0.147f)
                lineToRelative(-0.09f, -0.145f)
                curveToRelative(-1.197f, -1.896f, -2.4f, -2.78f, -3.601f, -2.85f)
                lineTo(7.0f, 9.0f)
                close()
                moveTo(17.0f, 9.0f)
                curveToRelative(-1.254f, 0.0f, -2.51f, 0.875f, -3.759f, 2.854f)
                lineToRelative(-0.09f, 0.146f)
                lineToRelative(0.09f, 0.146f)
                curveToRelative(1.198f, 1.896f, 2.4f, 2.78f, 3.602f, 2.85f)
                lineTo(17.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(4.5f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(19.5f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _haze2Line!!
    }

private var _haze2Line: ImageVector? = null
