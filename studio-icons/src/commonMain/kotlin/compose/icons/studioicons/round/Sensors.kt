package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Sensors: ImageVector
    get() {
        if (_sensors != null) {
            return _sensors!!
        }
        _sensors = Builder(name = "Sensors", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.54f, 8.54f)
                curveToRelative(0.35f, 0.35f, 0.37f, 0.88f, 0.1f, 1.29f)
                curveTo(8.24f, 10.45f, 8.0f, 11.2f, 8.0f, 12.0f)
                curveToRelative(0.0f, 0.8f, 0.24f, 1.55f, 0.64f, 2.17f)
                curveToRelative(0.27f, 0.41f, 0.24f, 0.95f, -0.11f, 1.29f)
                curveToRelative(-0.43f, 0.43f, -1.17f, 0.4f, -1.51f, -0.11f)
                curveTo(6.38f, 14.4f, 6.0f, 13.24f, 6.0f, 12.0f)
                curveToRelative(0.0f, -1.21f, 0.36f, -2.33f, 0.97f, -3.28f)
                curveTo(7.33f, 8.18f, 8.08f, 8.08f, 8.54f, 8.54f)
                close()
                moveTo(15.46f, 15.46f)
                curveToRelative(0.43f, 0.43f, 1.17f, 0.4f, 1.51f, -0.11f)
                curveTo(17.62f, 14.4f, 18.0f, 13.24f, 18.0f, 12.0f)
                curveToRelative(0.0f, -1.24f, -0.38f, -2.4f, -1.03f, -3.36f)
                curveToRelative(-0.34f, -0.5f, -1.08f, -0.54f, -1.51f, -0.11f)
                curveToRelative(-0.35f, 0.35f, -0.37f, 0.88f, -0.11f, 1.29f)
                curveTo(15.76f, 10.45f, 16.0f, 11.2f, 16.0f, 12.0f)
                curveToRelative(0.0f, 0.8f, -0.24f, 1.55f, -0.64f, 2.17f)
                curveTo(15.09f, 14.58f, 15.12f, 15.12f, 15.46f, 15.46f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(18.32f, 18.32f)
                curveToRelative(0.42f, 0.42f, 1.12f, 0.39f, 1.5f, -0.08f)
                curveTo(21.18f, 16.53f, 22.0f, 14.36f, 22.0f, 12.0f)
                reflectiveCurveToRelative(-0.82f, -4.53f, -2.18f, -6.24f)
                curveToRelative(-0.37f, -0.47f, -1.07f, -0.5f, -1.5f, -0.08f)
                curveToRelative(-0.36f, 0.36f, -0.4f, 0.92f, -0.08f, 1.32f)
                curveToRelative(1.1f, 1.37f, 1.76f, 3.11f, 1.76f, 5.0f)
                reflectiveCurveToRelative(-0.66f, 3.63f, -1.76f, 5.0f)
                curveTo(17.92f, 17.39f, 17.96f, 17.96f, 18.32f, 18.32f)
                close()
                moveTo(5.68f, 5.68f)
                curveToRelative(-0.42f, -0.42f, -1.12f, -0.39f, -1.5f, 0.08f)
                curveTo(2.82f, 7.47f, 2.0f, 9.64f, 2.0f, 12.0f)
                reflectiveCurveToRelative(0.82f, 4.53f, 2.18f, 6.24f)
                curveToRelative(0.37f, 0.47f, 1.07f, 0.5f, 1.5f, 0.08f)
                curveToRelative(0.36f, -0.36f, 0.4f, -0.92f, 0.08f, -1.32f)
                curveTo(4.66f, 15.63f, 4.0f, 13.89f, 4.0f, 12.0f)
                reflectiveCurveToRelative(0.66f, -3.63f, 1.76f, -5.0f)
                curveTo(6.08f, 6.61f, 6.04f, 6.04f, 5.68f, 5.68f)
                close()
            }
        }
        .build()
        return _sensors!!
    }

private var _sensors: ImageVector? = null
