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

public val RemixIcons.Database2Fill: ImageVector
    get() {
        if (_database2Fill != null) {
            return _database2Fill!!
        }
        _database2Fill = Builder(name = "Database2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.485f, -4.03f, 4.5f, -9.0f, 4.5f)
                reflectiveCurveToRelative(-9.0f, -2.015f, -9.0f, -4.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, 2.485f, 4.03f, 4.5f, 9.0f, 4.5f)
                reflectiveCurveToRelative(9.0f, -2.015f, 9.0f, -4.5f)
                close()
                moveTo(3.0f, 14.5f)
                curveToRelative(0.0f, 2.485f, 4.03f, 4.5f, 9.0f, 4.5f)
                reflectiveCurveToRelative(9.0f, -2.015f, 9.0f, -4.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.485f, -4.03f, 4.5f, -9.0f, 4.5f)
                reflectiveCurveToRelative(-9.0f, -2.015f, -9.0f, -4.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, -2.015f, -9.0f, -4.5f)
                reflectiveCurveTo(7.03f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 2.015f, 9.0f, 4.5f)
                reflectiveCurveToRelative(-4.03f, 4.5f, -9.0f, 4.5f)
                close()
            }
        }
        .build()
        return _database2Fill!!
    }

private var _database2Fill: ImageVector? = null
