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

public val OutlineGroup.DoNotStep: ImageVector
    get() {
        if (_doNotStep != null) {
            return _doNotStep!!
        }
        _doNotStep = Builder(name = "DoNotStep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.51f, 15.68f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.48f, -4.48f)
                lineTo(23.0f, 11.2f)
                lineTo(18.51f, 15.68f)
                close()
                moveTo(14.98f, 12.15f)
                moveTo(14.98f, 12.15f)
                lineToRelative(3.07f, -3.07f)
                lineTo(13.8f, 4.82f)
                lineToRelative(-3.08f, 3.07f)
                lineTo(9.3f, 6.47f)
                lineTo(13.8f, 2.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(7.08f, 7.08f)
                lineToRelative(-4.48f, 4.48f)
                lineTo(14.98f, 12.15f)
                close()
                moveTo(21.18f, 21.2f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-5.94f, -5.94f)
                lineTo(10.5f, 20.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-2.63f)
                curveToRelative(0.0f, -0.84f, 0.52f, -1.57f, 1.3f, -1.88f)
                curveToRelative(0.58f, -0.23f, 1.28f, -0.56f, 1.97f, -1.02f)
                lineToRelative(1.38f, 1.38f)
                curveTo(5.74f, 15.95f, 5.87f, 16.0f, 6.0f, 16.0f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.36f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(-1.28f, -1.28f)
                curveToRelative(0.27f, -0.24f, 0.53f, -0.51f, 0.77f, -0.8f)
                lineToRelative(1.27f, 1.27f)
                curveToRelative(0.09f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.25f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(-1.4f, -1.4f)
                curveToRelative(0.19f, -0.34f, 0.34f, -0.72f, 0.45f, -1.12f)
                lineToRelative(1.71f, 1.72f)
                curveToRelative(0.09f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.25f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.5f, 0.01f, -0.7f)
                lineToRelative(-7.9f, -7.9f)
                lineToRelative(1.42f, -1.41f)
                lineTo(21.18f, 21.2f)
                close()
                moveTo(12.42f, 15.26f)
                lineToRelative(-1.67f, -1.68f)
                lineTo(7.42f, 16.9f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, -0.01f)
                lineTo(4.4f, 16.72f)
                lineToRelative(-0.47f, 0.24f)
                curveToRelative(-0.29f, 0.14f, -0.59f, 0.27f, -0.89f, 0.39f)
                lineTo(3.03f, 18.0f)
                horizontalLineToRelative(6.64f)
                lineTo(12.42f, 15.26f)
                close()
            }
        }
        .build()
        return _doNotStep!!
    }

private var _doNotStep: ImageVector? = null
