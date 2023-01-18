package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.GolfSharp: ImageVector
    get() {
        if (_golfSharp != null) {
            return _golfSharp!!
        }
        _golfSharp = Builder(name = "GolfSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 16.0f)
                verticalLineTo(191.66f)
                curveToRelative(0.0f, 0.23f, 0.0f, 0.47f, 0.0f, 0.7f)
                verticalLineTo(320.47f)
                quadToRelative(8.0f, -0.47f, 16.0f, -0.47f)
                reflectiveQuadToRelative(16.0f, 0.47f)
                verticalLineTo(202.3f)
                lineTo(448.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(462.91f, 457.5f)
                curveToRelative(-8.54f, -42.85f, -35.0f, -78.74f, -76.62f, -103.8f)
                curveTo(353.86f, 334.15f, 313.76f, 322.4f, 272.0f, 320.0f)
                verticalLineToRelative(95.79f)
                horizontalLineTo(240.0f)
                verticalLineTo(320.0f)
                curveToRelative(-41.79f, 2.4f, -81.89f, 14.15f, -114.32f, 33.7f)
                curveToRelative(-41.59f, 25.06f, -68.08f, 60.95f, -76.62f, 103.8f)
                curveToRelative(-2.0f, 9.81f, -0.68f, 38.5f, -0.68f, 38.5f)
                horizontalLineTo(463.59f)
                reflectiveCurveTo(464.87f, 467.31f, 462.91f, 457.5f)
                close()
            }
        }
        .build()
        return _golfSharp!!
    }

private var _golfSharp: ImageVector? = null
