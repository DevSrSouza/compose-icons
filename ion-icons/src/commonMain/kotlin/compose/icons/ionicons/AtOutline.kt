package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.AtOutline: ImageVector
    get() {
        if (_atOutline != null) {
            return _atOutline!!
        }
        _atOutline = Builder(name = "AtOutline", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 254.27f)
                curveToRelative(-4.5f, 51.0f, -40.12f, 80.0f, -80.55f, 80.0f)
                reflectiveCurveToRelative(-67.34f, -35.82f, -63.45f, -80.0f)
                reflectiveCurveToRelative(37.12f, -80.0f, 77.55f, -80.0f)
                reflectiveCurveTo(323.88f, 210.27f, 320.0f, 254.27f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(319.77f, 415.77f)
                curveToRelative(-28.56f, 12.0f, -47.28f, 14.5f, -79.28f, 14.5f)
                curveToRelative(-97.2f, 0.0f, -169.0f, -78.8f, -160.49f, -176.0f)
                reflectiveCurveToRelative(94.31f, -176.0f, 191.51f, -176.0f)
                curveTo(381.0f, 78.27f, 441.19f, 150.0f, 432.73f, 246.0f)
                curveToRelative(-6.31f, 71.67f, -52.11f, 92.32f, -76.09f, 88.07f)
                curveToRelative(-22.56f, -4.0f, -41.18f, -24.42f, -37.74f, -63.5f)
                lineToRelative(8.48f, -96.25f)
            }
        }
        .build()
        return _atOutline!!
    }

private var _atOutline: ImageVector? = null
