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

public val RemixIcons.LifebuoyFill: ImageVector
    get() {
        if (_lifebuoyFill != null) {
            return _lifebuoyFill!!
        }
        _lifebuoyFill = Builder(name = "LifebuoyFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(7.197f, 14.682f)
                lineToRelative(-2.175f, 2.174f)
                arcToRelative(8.549f, 8.549f, 0.0f, false, false, 1.818f, 1.899f)
                lineToRelative(0.305f, 0.223f)
                lineToRelative(2.173f, -2.175f)
                arcToRelative(5.527f, 5.527f, 0.0f, false, true, -1.98f, -1.883f)
                lineToRelative(-0.14f, -0.238f)
                close()
                moveTo(16.803f, 14.682f)
                arcToRelative(5.527f, 5.527f, 0.0f, false, true, -1.883f, 1.98f)
                lineToRelative(-0.238f, 0.14f)
                lineToRelative(2.174f, 2.176f)
                arcToRelative(8.549f, 8.549f, 0.0f, false, false, 1.899f, -1.818f)
                lineToRelative(0.223f, -0.304f)
                lineToRelative(-2.175f, -2.174f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(7.145f, 5.022f)
                arcToRelative(8.549f, 8.549f, 0.0f, false, false, -1.9f, 1.818f)
                lineToRelative(-0.223f, 0.305f)
                lineToRelative(2.175f, 2.173f)
                arcToRelative(5.527f, 5.527f, 0.0f, false, true, 1.883f, -1.98f)
                lineToRelative(0.238f, -0.14f)
                lineToRelative(-2.173f, -2.176f)
                close()
                moveTo(16.855f, 5.022f)
                lineToRelative(-2.173f, 2.175f)
                arcToRelative(5.527f, 5.527f, 0.0f, false, true, 1.98f, 1.883f)
                lineToRelative(0.14f, 0.238f)
                lineToRelative(2.176f, -2.173f)
                arcToRelative(8.549f, 8.549f, 0.0f, false, false, -1.818f, -1.9f)
                lineToRelative(-0.304f, -0.223f)
                close()
            }
        }
        .build()
        return _lifebuoyFill!!
    }

private var _lifebuoyFill: ImageVector? = null
