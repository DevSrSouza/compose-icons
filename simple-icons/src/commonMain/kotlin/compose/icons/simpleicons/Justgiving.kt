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

public val SimpleIcons.Justgiving: ImageVector
    get() {
        if (_justgiving != null) {
            return _justgiving!!
        }
        _justgiving = Builder(name = "Justgiving", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.716f, 9.925f)
                horizontalLineTo(15.33f)
                lineToRelative(-4.898f, 4.919f)
                horizontalLineToRelative(6.727f)
                curveToRelative(-0.885f, 1.975f, -2.865f, 3.061f, -5.16f, 3.061f)
                curveToRelative(-3.104f, 0.0f, -5.639f, -2.67f, -5.639f, -5.771f)
                curveTo(6.36f, 9.02f, 8.896f, 6.42f, 12.0f, 6.42f)
                curveToRelative(1.134f, 0.0f, 2.189f, 0.295f, 3.061f, 0.871f)
                lineToRelative(4.542f, -4.561f)
                curveTo(17.541f, 1.031f, 14.893f, 0.0f, 12.0f, 0.0f)
                curveTo(5.37f, 0.0f, 0.0f, 5.367f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.623f, 5.37f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.115f, 12.0f, -11.738f)
                curveToRelative(0.0f, -0.896f, -0.103f, -1.35f, -0.284f, -2.337f)
                close()
            }
        }
        .build()
        return _justgiving!!
    }

private var _justgiving: ImageVector? = null
