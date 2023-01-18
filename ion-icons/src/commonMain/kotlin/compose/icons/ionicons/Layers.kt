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

public val IonIcons.Layers: ImageVector
    get() {
        if (_layers != null) {
            return _layers!!
        }
        _layers = Builder(name = "Layers", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                curveToRelative(-13.47f, 0.0f, -26.94f, -2.39f, -37.44f, -7.17f)
                lineToRelative(-148.0f, -67.49f)
                curveTo(63.79f, 178.26f, 48.0f, 169.25f, 48.0f, 152.24f)
                reflectiveCurveToRelative(15.79f, -26.0f, 22.58f, -29.12f)
                lineTo(219.86f, 55.05f)
                curveToRelative(20.57f, -9.4f, 51.61f, -9.4f, 72.19f, 0.0f)
                lineToRelative(149.37f, 68.07f)
                curveToRelative(6.79f, 3.09f, 22.58f, 12.1f, 22.58f, 29.12f)
                reflectiveCurveToRelative(-15.79f, 26.0f, -22.58f, 29.11f)
                lineToRelative(-148.0f, 67.48f)
                curveTo(282.94f, 253.61f, 269.47f, 256.0f, 256.0f, 256.0f)
                close()
                moveTo(432.76f, 155.14f)
                horizontalLineToRelative(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(441.36f, 226.81f)
                lineTo(426.27f, 220.0f)
                lineTo(387.5f, 237.74f)
                lineToRelative(-94.0f, 43.0f)
                curveToRelative(-10.5f, 4.8f, -24.0f, 7.19f, -37.44f, 7.19f)
                reflectiveCurveToRelative(-26.93f, -2.39f, -37.42f, -7.19f)
                lineToRelative(-94.07f, -43.0f)
                lineTo(85.79f, 220.0f)
                lineToRelative(-15.22f, 6.84f)
                curveTo(63.79f, 229.93f, 48.0f, 239.0f, 48.0f, 256.0f)
                reflectiveCurveToRelative(15.79f, 26.08f, 22.56f, 29.17f)
                lineToRelative(148.0f, 67.63f)
                curveTo(229.0f, 357.6f, 242.49f, 360.0f, 256.0f, 360.0f)
                reflectiveCurveToRelative(26.94f, -2.4f, 37.44f, -7.19f)
                lineTo(441.31f, 285.2f)
                curveTo(448.12f, 282.11f, 464.0f, 273.09f, 464.0f, 256.0f)
                reflectiveCurveTo(448.23f, 229.93f, 441.36f, 226.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(441.36f, 330.8f)
                lineTo(426.27f, 324.0f)
                lineTo(387.5f, 341.73f)
                lineToRelative(-94.0f, 42.95f)
                curveToRelative(-10.5f, 4.78f, -24.0f, 7.18f, -37.44f, 7.18f)
                reflectiveCurveToRelative(-26.93f, -2.39f, -37.42f, -7.18f)
                lineToRelative(-94.07f, -43.0f)
                lineTo(85.79f, 324.0f)
                lineToRelative(-15.22f, 6.84f)
                curveTo(63.79f, 333.93f, 48.0f, 343.0f, 48.0f, 360.0f)
                reflectiveCurveToRelative(15.79f, 26.07f, 22.56f, 29.15f)
                lineToRelative(148.0f, 67.59f)
                curveTo(229.0f, 461.52f, 242.54f, 464.0f, 256.0f, 464.0f)
                reflectiveCurveToRelative(26.88f, -2.48f, 37.38f, -7.27f)
                lineToRelative(147.92f, -67.57f)
                curveTo(448.12f, 386.08f, 464.0f, 377.06f, 464.0f, 360.0f)
                reflectiveCurveTo(448.23f, 333.93f, 441.36f, 330.8f)
                close()
            }
        }
        .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
