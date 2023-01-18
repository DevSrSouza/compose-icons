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

public val RemixIcons.Ghost2Fill: ImageVector
    get() {
        if (_ghost2Fill != null) {
            return _ghost2Fill!!
        }
        _ghost2Fill = Builder(name = "Ghost2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(3.5f, 0.0f, 6.0f, 3.0f, 7.0f, 6.0f)
                curveToRelative(3.0f, 1.0f, 4.0f, 3.73f, 4.0f, 6.0f)
                lineToRelative(-2.775f, 0.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.725f, 0.961f)
                verticalLineToRelative(1.496f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 17.75f, 19.0f)
                horizontalLineToRelative(-0.596f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.668f, 0.896f)
                curveTo(14.558f, 21.3f, 13.396f, 22.0f, 12.0f, 22.0f)
                curveToRelative(-1.396f, 0.0f, -2.558f, -0.701f, -3.486f, -2.104f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.846f, 19.0f)
                lineTo(6.25f, 19.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, -1.75f)
                verticalLineToRelative(-1.496f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.725f, -0.961f)
                lineTo(1.0f, 14.0f)
                curveToRelative(0.0f, -2.266f, 1.0f, -5.0f, 4.0f, -6.0f)
                curveToRelative(1.0f, -3.0f, 3.5f, -6.0f, 7.0f, -6.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 1.12f, -1.5f, 2.5f)
                reflectiveCurveTo(11.172f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveToRelative(1.5f, -1.12f, 1.5f, -2.5f)
                reflectiveCurveTo(12.828f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(9.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(14.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _ghost2Fill!!
    }

private var _ghost2Fill: ImageVector? = null
