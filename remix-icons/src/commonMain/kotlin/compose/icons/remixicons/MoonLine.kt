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

public val RemixIcons.MoonLine: ImageVector
    get() {
        if (_moonLine != null) {
            return _moonLine!!
        }
        _moonLine = Builder(name = "MoonLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 12.0f, 4.9f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.0f, 5.523f, -4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                horizontalLineToRelative(0.1f)
                arcTo(6.979f, 6.979f, 0.0f, false, false, 10.0f, 7.0f)
                close()
                moveTo(4.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.062f, 3.762f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 8.238f, 4.938f)
                arcTo(7.999f, 7.999f, 0.0f, false, false, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _moonLine!!
    }

private var _moonLine: ImageVector? = null
