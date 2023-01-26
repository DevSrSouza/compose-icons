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

public val RoundGroup.HelpOutline: ImageVector
    get() {
        if (_helpOutline != null) {
            return _helpOutline!!
        }
        _helpOutline = Builder(name = "HelpOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.61f, 6.04f)
                curveToRelative(-2.06f, -0.3f, -3.88f, 0.97f, -4.43f, 2.79f)
                curveToRelative(-0.18f, 0.58f, 0.26f, 1.17f, 0.87f, 1.17f)
                horizontalLineToRelative(0.2f)
                curveToRelative(0.41f, 0.0f, 0.74f, -0.29f, 0.88f, -0.67f)
                curveToRelative(0.32f, -0.89f, 1.27f, -1.5f, 2.3f, -1.28f)
                curveToRelative(0.95f, 0.2f, 1.65f, 1.13f, 1.57f, 2.1f)
                curveToRelative(-0.1f, 1.34f, -1.62f, 1.63f, -2.45f, 2.88f)
                curveToRelative(0.0f, 0.01f, -0.01f, 0.01f, -0.01f, 0.02f)
                curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.03f, 0.05f)
                curveToRelative(-0.09f, 0.15f, -0.18f, 0.32f, -0.25f, 0.5f)
                curveToRelative(-0.01f, 0.03f, -0.03f, 0.05f, -0.04f, 0.08f)
                curveToRelative(-0.01f, 0.02f, -0.01f, 0.04f, -0.02f, 0.07f)
                curveToRelative(-0.12f, 0.34f, -0.2f, 0.75f, -0.2f, 1.25f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.42f, 0.11f, -0.77f, 0.28f, -1.07f)
                curveToRelative(0.02f, -0.03f, 0.03f, -0.06f, 0.05f, -0.09f)
                curveToRelative(0.08f, -0.14f, 0.18f, -0.27f, 0.28f, -0.39f)
                curveToRelative(0.01f, -0.01f, 0.02f, -0.03f, 0.03f, -0.04f)
                curveToRelative(0.1f, -0.12f, 0.21f, -0.23f, 0.33f, -0.34f)
                curveToRelative(0.96f, -0.91f, 2.26f, -1.65f, 1.99f, -3.56f)
                curveToRelative(-0.24f, -1.74f, -1.61f, -3.21f, -3.35f, -3.47f)
                close()
            }
        }
        .build()
        return _helpOutline!!
    }

private var _helpOutline: ImageVector? = null
