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

public val RemixIcons.MiniProgramLine: ImageVector
    get() {
        if (_miniProgramLine != null) {
            return _miniProgramLine!!
        }
        _miniProgramLine = Builder(name = "MiniProgramLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(13.0f, 14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -4.977f, -3.174f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.845f, 1.813f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 11.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 4.977f, 3.174f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.845f, -1.813f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 13.0f, 10.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _miniProgramLine!!
    }

private var _miniProgramLine: ImageVector? = null
