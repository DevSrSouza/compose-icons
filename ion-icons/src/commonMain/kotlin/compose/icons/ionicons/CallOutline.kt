package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CallOutline: ImageVector
    get() {
        if (_callOutline != null) {
            return _callOutline!!
        }
        _callOutline = Builder(name = "CallOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(451.0f, 374.0f)
                curveToRelative(-15.88f, -16.0f, -54.34f, -39.35f, -73.0f, -48.76f)
                curveTo(353.7f, 313.0f, 351.7f, 312.0f, 332.6f, 326.19f)
                curveToRelative(-12.74f, 9.47f, -21.21f, 17.93f, -36.12f, 14.75f)
                reflectiveCurveToRelative(-47.31f, -21.11f, -75.68f, -49.39f)
                reflectiveCurveToRelative(-47.34f, -61.62f, -50.53f, -76.48f)
                reflectiveCurveToRelative(5.41f, -23.23f, 14.79f, -36.0f)
                curveToRelative(13.22f, -18.0f, 12.22f, -21.0f, 0.92f, -45.3f)
                curveToRelative(-8.81f, -18.9f, -32.84f, -57.0f, -48.9f, -72.8f)
                curveTo(119.9f, 44.0f, 119.9f, 47.0f, 108.83f, 51.6f)
                arcTo(160.15f, 160.15f, 0.0f, false, false, 83.0f, 65.37f)
                curveTo(67.0f, 76.0f, 58.12f, 84.83f, 51.91f, 98.1f)
                reflectiveCurveToRelative(-9.0f, 44.38f, 23.07f, 102.64f)
                reflectiveCurveToRelative(54.57f, 88.05f, 101.14f, 134.49f)
                reflectiveCurveTo(258.5f, 406.64f, 310.85f, 436.0f)
                curveToRelative(64.76f, 36.27f, 89.6f, 29.2f, 102.91f, 23.0f)
                reflectiveCurveToRelative(22.18f, -15.0f, 32.83f, -31.0f)
                arcToRelative(159.09f, 159.09f, 0.0f, false, false, 13.8f, -25.8f)
                curveTo(465.0f, 391.17f, 468.0f, 391.17f, 451.0f, 374.0f)
                close()
            }
        }
        .build()
        return _callOutline!!
    }

private var _callOutline: ImageVector? = null
