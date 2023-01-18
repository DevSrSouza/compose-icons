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

public val RemixIcons.Database2Line: ImageVector
    get() {
        if (_database2Line != null) {
            return _database2Line!!
        }
        _database2Line = Builder(name = "Database2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.5f)
                curveToRelative(0.0f, 0.313f, 0.461f, 0.858f, 1.53f, 1.393f)
                curveTo(7.914f, 14.585f, 9.877f, 15.0f, 12.0f, 15.0f)
                curveToRelative(2.123f, 0.0f, 4.086f, -0.415f, 5.47f, -1.107f)
                curveToRelative(1.069f, -0.535f, 1.53f, -1.08f, 1.53f, -1.393f)
                verticalLineToRelative(-2.171f)
                curveTo(17.35f, 11.349f, 14.827f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.35f, -0.652f, -7.0f, -1.671f)
                lineTo(5.0f, 12.5f)
                close()
                moveTo(19.0f, 15.329f)
                curveTo(17.35f, 16.349f, 14.827f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveToRelative(-5.35f, -0.652f, -7.0f, -1.671f)
                lineTo(5.0f, 17.5f)
                curveToRelative(0.0f, 0.313f, 0.461f, 0.858f, 1.53f, 1.393f)
                curveTo(7.914f, 19.585f, 9.877f, 20.0f, 12.0f, 20.0f)
                curveToRelative(2.123f, 0.0f, 4.086f, -0.415f, 5.47f, -1.107f)
                curveToRelative(1.069f, -0.535f, 1.53f, -1.08f, 1.53f, -1.393f)
                verticalLineToRelative(-2.171f)
                close()
                moveTo(3.0f, 17.5f)
                verticalLineToRelative(-10.0f)
                curveTo(3.0f, 5.015f, 7.03f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 2.015f, 9.0f, 4.5f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.485f, -4.03f, 4.5f, -9.0f, 4.5f)
                reflectiveCurveToRelative(-9.0f, -2.015f, -9.0f, -4.5f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(2.123f, 0.0f, 4.086f, -0.415f, 5.47f, -1.107f)
                curveTo(18.539f, 8.358f, 19.0f, 7.813f, 19.0f, 7.5f)
                curveToRelative(0.0f, -0.313f, -0.461f, -0.858f, -1.53f, -1.393f)
                curveTo(16.086f, 5.415f, 14.123f, 5.0f, 12.0f, 5.0f)
                curveToRelative(-2.123f, 0.0f, -4.086f, 0.415f, -5.47f, 1.107f)
                curveTo(5.461f, 6.642f, 5.0f, 7.187f, 5.0f, 7.5f)
                curveToRelative(0.0f, 0.313f, 0.461f, 0.858f, 1.53f, 1.393f)
                curveTo(7.914f, 9.585f, 9.877f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _database2Line!!
    }

private var _database2Line: ImageVector? = null
