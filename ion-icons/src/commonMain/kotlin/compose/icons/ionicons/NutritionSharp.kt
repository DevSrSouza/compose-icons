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

public val IonIcons.NutritionSharp: ImageVector
    get() {
        if (_nutritionSharp != null) {
            return _nutritionSharp!!
        }
        _nutritionSharp = Builder(name = "NutritionSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(438.71f, 159.43f)
                curveToRelative(-17.6f, -28.31f, -45.5f, -43.8f, -85.28f, -47.37f)
                curveToRelative(-22.82f, -2.0f, -50.23f, 4.94f, -72.25f, 10.55f)
                curveTo(271.26f, 125.14f, 260.0f, 128.0f, 256.0f, 128.0f)
                reflectiveCurveToRelative(-15.18f, -2.86f, -25.0f, -5.39f)
                curveToRelative(-22.08f, -5.65f, -49.56f, -12.69f, -72.45f, -10.54f)
                curveToRelative(-38.53f, 3.61f, -66.0f, 19.19f, -84.0f, 47.62f)
                reflectiveCurveTo(48.0f, 229.0f, 48.0f, 288.0f)
                curveToRelative(0.0f, 61.28f, 29.53f, 114.58f, 47.13f, 140.89f)
                curveTo(116.82f, 461.34f, 149.25f, 496.0f, 175.2f, 496.0f)
                curveToRelative(18.57f, 0.0f, 34.12f, -7.23f, 47.82f, -13.64f)
                curveTo(243.0f, 473.0f, 256.0f, 472.0f, 256.0f, 472.0f)
                reflectiveCurveToRelative(11.0f, 0.0f, 31.94f, 10.11f)
                curveTo(301.65f, 488.73f, 317.3f, 496.0f, 336.8f, 496.0f)
                curveToRelative(26.58f, 0.0f, 59.08f, -34.69f, 80.63f, -67.15f)
                curveTo(434.82f, 402.65f, 464.0f, 349.52f, 464.0f, 288.0f)
                curveTo(464.0f, 228.0f, 456.0f, 187.17f, 438.71f, 159.43f)
                close()
                moveTo(216.0f, 352.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, -21.49f, -24.0f, -48.0f)
                reflectiveCurveToRelative(10.75f, -48.0f, 24.0f, -48.0f)
                reflectiveCurveToRelative(24.0f, 21.49f, 24.0f, 48.0f)
                reflectiveCurveTo(229.25f, 352.0f, 216.0f, 352.0f)
                close()
                moveTo(296.0f, 352.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, -21.49f, -24.0f, -48.0f)
                reflectiveCurveToRelative(10.75f, -48.0f, 24.0f, -48.0f)
                reflectiveCurveToRelative(24.0f, 21.49f, 24.0f, 48.0f)
                reflectiveCurveTo(309.25f, 352.0f, 296.0f, 352.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(323.72f, 82.76f)
                curveTo(353.68f, 52.82f, 352.0f, 16.18f, 352.0f, 16.14f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-35.77f, -3.76f, -67.23f, 27.67f)
                reflectiveCurveTo(256.06f, 112.0f, 256.06f, 112.0f)
                reflectiveCurveTo(293.74f, 112.71f, 323.72f, 82.76f)
                close()
            }
        }
        .build()
        return _nutritionSharp!!
    }

private var _nutritionSharp: ImageVector? = null
