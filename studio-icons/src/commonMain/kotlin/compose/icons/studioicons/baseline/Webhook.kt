package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Webhook: ImageVector
    get() {
        if (_webhook != null) {
            return _webhook!!
        }
        _webhook = Builder(name = "Webhook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 15.0f)
                lineToRelative(5.88f, 0.0f)
                curveToRelative(0.27f, -0.31f, 0.67f, -0.5f, 1.12f, -0.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.44f, 0.0f, -0.84f, -0.19f, -1.12f, -0.5f)
                lineToRelative(-3.98f, 0.0f)
                curveToRelative(-0.46f, 2.28f, -2.48f, 4.0f, -4.9f, 4.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -2.42f, 1.72f, -4.44f, 4.0f, -4.9f)
                lineToRelative(0.0f, 2.07f)
                curveTo(4.84f, 13.58f, 4.0f, 14.7f, 4.0f, 16.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(12.5f, 4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                curveToRelative(0.0f, 1.43f, 0.6f, 2.71f, 1.55f, 3.62f)
                lineToRelative(-2.35f, 3.9f)
                curveTo(6.02f, 14.66f, 5.5f, 15.27f, 5.5f, 16.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.16f, -0.02f, -0.31f, -0.07f, -0.45f)
                lineToRelative(3.38f, -5.63f)
                curveTo(10.49f, 9.61f, 9.5f, 8.42f, 9.5f, 7.0f)
                curveTo(9.5f, 5.35f, 10.85f, 4.0f, 12.5f, 4.0f)
                close()
                moveTo(17.0f, 13.0f)
                curveToRelative(-0.64f, 0.0f, -1.23f, 0.2f, -1.72f, 0.54f)
                lineToRelative(-3.05f, -5.07f)
                curveTo(11.53f, 8.35f, 11.0f, 7.74f, 11.0f, 7.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveTo(14.0f, 6.17f, 14.0f, 7.0f)
                curveToRelative(0.0f, 0.15f, -0.02f, 0.29f, -0.06f, 0.43f)
                lineToRelative(2.19f, 3.65f)
                curveTo(16.41f, 11.03f, 16.7f, 11.0f, 17.0f, 11.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                curveToRelative(-1.85f, 0.0f, -3.47f, -1.01f, -4.33f, -2.5f)
                lineToRelative(2.67f, 0.0f)
                curveTo(15.82f, 18.82f, 16.39f, 19.0f, 17.0f, 19.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                reflectiveCurveTo(18.65f, 13.0f, 17.0f, 13.0f)
                close()
            }
        }
        .build()
        return _webhook!!
    }

private var _webhook: ImageVector? = null
