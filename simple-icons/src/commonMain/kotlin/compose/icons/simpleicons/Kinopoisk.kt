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

public val SimpleIcons.Kinopoisk: ImageVector
    get() {
        if (_kinopoisk != null) {
            return _kinopoisk!!
        }
        _kinopoisk = Builder(name = "Kinopoisk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.049f, 0.0f)
                curveTo(5.45f, 0.0f, 0.104f, 5.373f, 0.104f, 12.0f)
                reflectiveCurveTo(5.45f, 24.0f, 12.049f, 24.0f)
                curveToRelative(3.928f, 0.0f, 7.414f, -1.904f, 9.592f, -4.844f)
                lineToRelative(-9.803f, -5.174f)
                lineToRelative(6.256f, 6.418f)
                horizontalLineToRelative(-3.559f)
                lineToRelative(-4.373f, -6.086f)
                lineTo(10.162f, 20.4f)
                horizontalLineToRelative(-2.89f)
                lineTo(7.272f, 3.6f)
                horizontalLineToRelative(2.89f)
                verticalLineToRelative(6.095f)
                lineTo(14.535f, 3.6f)
                horizontalLineToRelative(3.559f)
                lineToRelative(-6.422f, 6.627f)
                lineToRelative(9.98f, -5.368f)
                curveTo(19.476f, 1.911f, 15.984f, 0.0f, 12.05f, 0.0f)
                close()
                moveTo(22.973f, 7.133f)
                lineTo(12.979f, 11.16f)
                lineTo(23.896f, 10.447f)
                arcToRelative(11.963f, 11.963f, 0.0f, false, false, -0.923f, -3.314f)
                close()
                moveTo(12.908f, 12.813f)
                lineTo(22.973f, 16.867f)
                curveToRelative(0.458f, -1.036f, 0.774f, -2.149f, 0.923f, -3.314f)
                lineToRelative(-10.988f, -0.74f)
                close()
            }
        }
        .build()
        return _kinopoisk!!
    }

private var _kinopoisk: ImageVector? = null
