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

public val IonIcons.Nutrition: ImageVector
    get() {
        if (_nutrition != null) {
            return _nutrition!!
        }
        _nutrition = Builder(name = "Nutrition", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.0f, 166.29f)
                curveToRelative(-18.67f, -32.57f, -47.46f, -50.81f, -85.57f, -54.23f)
                curveToRelative(-20.18f, -1.8f, -39.0f, 3.37f, -57.23f, 8.38f)
                curveTo(282.05f, 124.33f, 268.68f, 128.0f, 256.0f, 128.0f)
                reflectiveCurveToRelative(-26.0f, -3.68f, -40.06f, -7.57f)
                curveToRelative(-18.28f, -5.0f, -37.18f, -10.26f, -57.43f, -8.36f)
                curveTo(122.12f, 115.48f, 93.0f, 134.18f, 74.2f, 166.15f)
                curveTo(56.82f, 195.76f, 48.0f, 236.76f, 48.0f, 288.0f)
                curveToRelative(0.0f, 40.4f, 15.0f, 90.49f, 40.0f, 134.0f)
                curveToRelative(12.82f, 22.25f, 47.0f, 74.0f, 87.16f, 74.0f)
                curveToRelative(30.77f, 0.0f, 47.15f, -9.44f, 59.11f, -16.33f)
                curveToRelative(8.3f, -4.78f, 13.31f, -7.67f, 21.69f, -7.67f)
                reflectiveCurveToRelative(13.39f, 2.89f, 21.69f, 7.67f)
                curveTo(289.65f, 486.56f, 306.0f, 496.0f, 336.8f, 496.0f)
                curveToRelative(40.17f, 0.0f, 74.34f, -51.76f, 87.16f, -74.0f)
                curveToRelative(25.07f, -43.5f, 40.0f, -93.59f, 40.0f, -134.0f)
                curveTo(464.0f, 235.43f, 455.82f, 195.62f, 439.0f, 166.29f)
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
                moveTo(265.1f, 111.93f)
                curveToRelative(13.16f, -1.75f, 37.86f, -7.83f, 58.83f, -28.79f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, false, 28.0f, -58.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 343.38f, 16.0f)
                curveToRelative(-12.71f, 0.95f, -36.76f, 5.87f, -58.73f, 27.85f)
                arcTo(97.6f, 97.6f, 0.0f, false, false, 256.0f, 103.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 265.1f, 111.93f)
                close()
            }
        }
        .build()
        return _nutrition!!
    }

private var _nutrition: ImageVector? = null
