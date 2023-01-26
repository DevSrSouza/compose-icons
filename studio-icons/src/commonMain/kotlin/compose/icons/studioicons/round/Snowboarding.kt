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

public val RoundGroup.Snowboarding: ImageVector
    get() {
        if (_snowboarding != null) {
            return _snowboarding!!
        }
        _snowboarding = Builder(name = "Snowboarding", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(14.0f, 4.1f, 14.0f, 3.0f)
                close()
                moveTo(6.35f, 9.53f)
                curveToRelative(0.47f, 0.29f, 1.09f, 0.15f, 1.38f, -0.32f)
                lineTo(9.1f, 7.0f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-2.51f, 3.99f)
                curveToRelative(-0.28f, 0.45f, -0.37f, 1.0f, -0.25f, 1.52f)
                lineTo(9.5f, 16.0f)
                lineTo(6.0f, 18.35f)
                lineToRelative(-0.47f, -0.1f)
                curveToRelative(-0.96f, -0.2f, -1.71f, -0.85f, -2.1f, -1.67f)
                curveToRelative(-0.1f, -0.21f, -0.28f, -0.37f, -0.51f, -0.42f)
                curveToRelative(-0.43f, -0.09f, -0.82f, 0.2f, -0.9f, 0.58f)
                curveTo(1.98f, 16.88f, 2.0f, 17.05f, 2.07f, 17.2f)
                curveToRelative(0.58f, 1.24f, 1.71f, 2.2f, 3.15f, 2.51f)
                lineToRelative(12.63f, 2.69f)
                curveToRelative(1.44f, 0.31f, 2.86f, -0.11f, 3.9f, -1.01f)
                curveToRelative(0.13f, -0.11f, 0.21f, -0.26f, 0.24f, -0.41f)
                curveToRelative(0.08f, -0.38f, -0.16f, -0.8f, -0.59f, -0.89f)
                curveToRelative(-0.23f, -0.05f, -0.46f, 0.02f, -0.64f, 0.17f)
                curveToRelative(-0.69f, 0.6f, -1.64f, 0.88f, -2.6f, 0.67f)
                lineTo(17.0f, 20.69f)
                lineToRelative(-0.88f, -5.43f)
                curveToRelative(-0.08f, -0.49f, -0.34f, -0.93f, -0.72f, -1.24f)
                lineToRelative(-2.72f, -2.19f)
                lineToRelative(1.8f, -2.89f)
                curveToRelative(0.96f, 1.53f, 2.54f, 2.64f, 4.39f, 2.96f)
                curveToRelative(0.6f, 0.11f, 1.13f, -0.39f, 1.13f, -1.0f)
                curveToRelative(0.0f, -0.48f, -0.35f, -0.89f, -0.83f, -0.98f)
                curveToRelative(-1.49f, -0.28f, -2.72f, -1.29f, -3.3f, -2.64f)
                lineToRelative(-0.52f, -1.21f)
                curveTo(15.16f, 5.64f, 14.61f, 5.0f, 13.7f, 5.0f)
                horizontalLineTo(9.11f)
                curveToRelative(-0.69f, 0.0f, -1.33f, 0.36f, -1.7f, 0.94f)
                lineTo(6.03f, 8.15f)
                curveTo(5.74f, 8.62f, 5.88f, 9.24f, 6.35f, 9.53f)
                close()
                moveTo(8.73f, 18.93f)
                lineToRelative(2.25f, -1.51f)
                curveToRelative(0.47f, -0.32f, 0.73f, -0.88f, 0.65f, -1.44f)
                lineToRelative(-0.32f, -2.4f)
                lineToRelative(2.84f, 2.02f)
                lineToRelative(0.75f, 4.64f)
                lineTo(8.73f, 18.93f)
                close()
            }
        }
        .build()
        return _snowboarding!!
    }

private var _snowboarding: ImageVector? = null
