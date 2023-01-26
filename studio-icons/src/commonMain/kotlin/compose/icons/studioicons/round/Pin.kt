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

public val RoundGroup.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                close()
                moveTo(7.64f, 14.47f)
                curveTo(7.64f, 14.76f, 7.4f, 15.0f, 7.11f, 15.0f)
                horizontalLineTo(7.02f)
                curveToRelative(-0.29f, 0.0f, -0.53f, -0.24f, -0.53f, -0.53f)
                verticalLineTo(10.5f)
                lineToRelative(-0.45f, 0.33f)
                curveToRelative(-0.24f, 0.18f, -0.59f, 0.12f, -0.76f, -0.14f)
                curveToRelative(-0.15f, -0.24f, -0.1f, -0.55f, 0.13f, -0.72f)
                lineTo(6.6f, 9.12f)
                curveTo(6.71f, 9.04f, 6.84f, 9.0f, 6.98f, 9.0f)
                curveToRelative(0.36f, 0.0f, 0.66f, 0.29f, 0.66f, 0.66f)
                verticalLineTo(14.47f)
                close()
                moveTo(13.01f, 15.0f)
                horizontalLineToRelative(-2.67f)
                curveToRelative(-0.4f, 0.0f, -0.72f, -0.32f, -0.72f, -0.72f)
                curveToRelative(0.0f, -0.19f, 0.08f, -0.38f, 0.21f, -0.51f)
                curveToRelative(0.95f, -0.95f, 1.58f, -1.58f, 1.92f, -1.94f)
                curveToRelative(0.4f, -0.42f, 0.54f, -0.69f, 0.54f, -1.06f)
                curveToRelative(0.0f, -0.4f, -0.31f, -0.72f, -0.81f, -0.72f)
                curveToRelative(-0.34f, 0.0f, -0.57f, 0.16f, -0.72f, 0.37f)
                curveToRelative(-0.15f, 0.2f, -0.41f, 0.26f, -0.64f, 0.16f)
                curveToRelative(-0.34f, -0.14f, -0.45f, -0.57f, -0.22f, -0.85f)
                curveToRelative(0.15f, -0.19f, 0.37f, -0.38f, 0.67f, -0.53f)
                curveToRelative(0.69f, -0.33f, 1.48f, -0.2f, 1.95f, 0.03f)
                curveToRelative(0.86f, 0.44f, 0.91f, 1.24f, 0.91f, 1.48f)
                curveToRelative(0.0f, 0.64f, -0.31f, 1.26f, -0.92f, 1.86f)
                curveToRelative(-0.25f, 0.25f, -0.72f, 0.71f, -1.4f, 1.39f)
                lineToRelative(0.03f, 0.05f)
                horizontalLineToRelative(1.88f)
                curveToRelative(0.27f, 0.0f, 0.49f, 0.22f, 0.49f, 0.49f)
                reflectiveCurveTo(13.28f, 15.0f, 13.01f, 15.0f)
                close()
                moveTo(18.75f, 14.15f)
                curveTo(18.67f, 14.28f, 18.19f, 15.0f, 16.99f, 15.0f)
                curveToRelative(-0.03f, 0.0f, -1.23f, 0.06f, -1.83f, -0.98f)
                curveToRelative(-0.15f, -0.26f, -0.04f, -0.6f, 0.24f, -0.71f)
                lineToRelative(0.12f, -0.05f)
                curveToRelative(0.22f, -0.09f, 0.47f, -0.01f, 0.59f, 0.19f)
                curveToRelative(0.14f, 0.24f, 0.39f, 0.49f, 0.88f, 0.49f)
                curveToRelative(0.41f, 0.0f, 0.89f, -0.28f, 0.89f, -0.77f)
                curveToRelative(0.0f, -0.55f, -0.48f, -0.79f, -1.04f, -0.79f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.27f, 0.0f, -0.49f, -0.23f, -0.49f, -0.5f)
                curveToRelative(0.0f, -0.26f, 0.2f, -0.47f, 0.45f, -0.49f)
                lineToRelative(0.0f, -0.01f)
                curveToRelative(0.33f, 0.0f, 0.88f, -0.14f, 0.88f, -0.72f)
                curveToRelative(0.0f, -0.39f, -0.31f, -0.65f, -0.75f, -0.65f)
                curveToRelative(-0.32f, 0.0f, -0.53f, 0.13f, -0.67f, 0.3f)
                curveToRelative(-0.14f, 0.18f, -0.37f, 0.26f, -0.58f, 0.17f)
                lineToRelative(-0.08f, -0.03f)
                curveToRelative(-0.3f, -0.12f, -0.4f, -0.5f, -0.2f, -0.75f)
                curveTo(15.67f, 9.35f, 16.16f, 9.0f, 16.94f, 9.0f)
                curveToRelative(1.09f, 0.0f, 1.54f, 0.64f, 1.62f, 0.75f)
                curveToRelative(0.33f, 0.5f, 0.28f, 1.16f, 0.02f, 1.57f)
                curveToRelative(-0.15f, 0.22f, -0.32f, 0.38f, -0.52f, 0.48f)
                verticalLineToRelative(0.07f)
                curveToRelative(0.28f, 0.11f, 0.51f, 0.28f, 0.68f, 0.52f)
                curveTo(19.11f, 12.91f, 19.07f, 13.66f, 18.75f, 14.15f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
