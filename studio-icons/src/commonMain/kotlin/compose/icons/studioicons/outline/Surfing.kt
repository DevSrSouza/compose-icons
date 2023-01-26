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

public val OutlineGroup.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 23.0f)
                curveToRelative(-1.03f, 0.0f, -2.06f, -0.25f, -3.0f, -0.75f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.89f, 1.0f, -4.11f, 1.0f, -6.0f, 0.0f)
                curveToRelative(-1.89f, 1.0f, -4.11f, 1.0f, -6.0f, 0.0f)
                curveTo(5.05f, 22.75f, 4.03f, 23.0f, 3.0f, 23.0f)
                horizontalLineTo(2.0f)
                lineToRelative(0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.04f, 0.0f, 2.08f, -0.35f, 3.0f, -1.0f)
                curveToRelative(1.83f, 1.3f, 4.17f, 1.3f, 6.0f, 0.0f)
                curveToRelative(1.83f, 1.3f, 4.17f, 1.3f, 6.0f, 0.0f)
                curveToRelative(0.91f, 0.65f, 1.96f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(17.0f, 1.5f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(18.1f, 1.5f, 17.0f, 1.5f)
                close()
                moveTo(14.43f, 8.48f)
                lineTo(12.18f, 10.0f)
                lineTo(16.0f, 13.0f)
                verticalLineToRelative(3.84f)
                curveToRelative(0.53f, 0.38f, 1.03f, 0.78f, 1.49f, 1.17f)
                curveTo(16.81f, 18.59f, 15.94f, 19.0f, 15.0f, 19.0f)
                curveToRelative(-1.2f, 0.0f, -2.27f, -0.66f, -3.0f, -1.5f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3.0f, 1.5f)
                curveToRelative(-0.33f, 0.0f, -0.65f, -0.05f, -0.96f, -0.14f)
                curveTo(5.19f, 16.9f, 3.0f, 14.72f, 3.0f, 13.28f)
                curveTo(3.0f, 12.25f, 4.01f, 12.0f, 4.85f, 12.0f)
                curveToRelative(0.98f, 0.0f, 2.28f, 0.31f, 3.7f, 0.83f)
                lineToRelative(-0.53f, -3.1f)
                curveTo(7.91f, 9.06f, 8.2f, 8.35f, 8.8f, 7.94f)
                lineToRelative(2.15f, -1.45f)
                lineToRelative(-2.0f, -0.37f)
                lineTo(6.13f, 8.05f)
                lineTo(5.0f, 6.4f)
                lineTo(8.5f, 4.0f)
                lineToRelative(5.55f, 1.03f)
                curveToRelative(0.45f, 0.09f, 0.93f, 0.37f, 1.22f, 0.89f)
                lineToRelative(0.88f, 1.55f)
                curveTo(17.01f, 8.98f, 18.64f, 10.0f, 20.5f, 10.0f)
                verticalLineToRelative(2.0f)
                curveTo(17.91f, 12.0f, 15.64f, 10.58f, 14.43f, 8.48f)
                close()
                moveTo(10.3f, 11.1f)
                lineToRelative(0.44f, 2.65f)
                curveToRelative(0.92f, 0.42f, 2.48f, 1.27f, 3.26f, 1.75f)
                verticalLineTo(14.0f)
                lineTo(10.3f, 11.1f)
                close()
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
