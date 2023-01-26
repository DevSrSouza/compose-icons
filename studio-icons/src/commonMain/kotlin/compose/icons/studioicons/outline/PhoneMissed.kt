package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.PhoneMissed: ImageVector
    get() {
        if (_phoneMissed != null) {
            return _phoneMissed!!
        }
        _phoneMissed = Builder(name = "PhoneMissed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.71f, 16.67f)
                curveTo(20.66f, 13.78f, 16.54f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveTo(3.34f, 13.78f, 0.29f, 16.67f)
                curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f)
                curveToRelative(0.0f, 0.28f, 0.11f, 0.53f, 0.29f, 0.71f)
                lineToRelative(2.48f, 2.48f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.7f, -0.28f)
                curveToRelative(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f)
                curveToRelative(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f)
                verticalLineToRelative(-3.1f)
                curveToRelative(1.45f, -0.48f, 3.0f, -0.73f, 4.6f, -0.73f)
                reflectiveCurveToRelative(3.15f, 0.25f, 4.6f, 0.72f)
                verticalLineToRelative(3.1f)
                curveToRelative(0.0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f)
                curveToRelative(0.98f, 0.49f, 1.87f, 1.12f, 2.67f, 1.85f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f)
                curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f)
                lineToRelative(2.48f, -2.48f)
                curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f)
                curveToRelative(0.0f, -0.28f, -0.12f, -0.52f, -0.3f, -0.7f)
                close()
                moveTo(5.4f, 17.23f)
                curveToRelative(-0.66f, 0.37f, -1.29f, 0.8f, -1.87f, 1.27f)
                lineToRelative(-1.07f, -1.07f)
                curveToRelative(0.91f, -0.75f, 1.9f, -1.39f, 2.95f, -1.9f)
                verticalLineToRelative(1.7f)
                close()
                moveTo(20.48f, 18.49f)
                curveToRelative(-0.6f, -0.48f, -1.22f, -0.9f, -1.88f, -1.27f)
                verticalLineToRelative(-1.7f)
                curveToRelative(1.05f, 0.51f, 2.03f, 1.15f, 2.95f, 1.9f)
                lineToRelative(-1.07f, 1.07f)
                close()
                moveTo(7.0f, 6.43f)
                lineToRelative(4.94f, 4.94f)
                lineToRelative(7.07f, -7.07f)
                lineToRelative(-1.41f, -1.42f)
                lineToRelative(-5.66f, 5.66f)
                lineTo(8.4f, 5.0f)
                lineTo(11.0f, 5.0f)
                lineTo(11.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _phoneMissed!!
    }

private var _phoneMissed: ImageVector? = null
