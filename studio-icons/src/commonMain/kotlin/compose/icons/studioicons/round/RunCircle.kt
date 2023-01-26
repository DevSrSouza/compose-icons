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

public val RoundGroup.RunCircle: ImageVector
    get() {
        if (_runCircle != null) {
            return _runCircle!!
        }
        _runCircle = Builder(name = "RunCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.5f, 6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                curveTo(12.5f, 6.45f, 12.95f, 6.0f, 13.5f, 6.0f)
                close()
                moveTo(15.41f, 11.91f)
                curveToRelative(-0.71f, -0.2f, -1.63f, -0.74f, -2.32f, -1.66f)
                lineToRelative(-0.41f, 2.35f)
                lineToRelative(1.19f, 1.3f)
                curveTo(13.95f, 13.98f, 14.0f, 14.1f, 14.0f, 14.22f)
                verticalLineToRelative(3.28f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.08f)
                lineToRelative(-1.11f, -1.21f)
                lineToRelative(-0.43f, 2.15f)
                curveToRelative(-0.05f, 0.27f, -0.32f, 0.45f, -0.59f, 0.39f)
                lineToRelative(-2.78f, -0.57f)
                curveToRelative(-0.27f, -0.06f, -0.45f, -0.32f, -0.39f, -0.59f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.06f, -0.27f, 0.32f, -0.44f, 0.59f, -0.39f)
                lineToRelative(2.29f, 0.47f)
                lineToRelative(0.96f, -4.89f)
                lineTo(10.0f, 10.35f)
                verticalLineToRelative(1.15f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(0.0f)
                curveTo(9.22f, 12.0f, 9.0f, 11.78f, 9.0f, 11.5f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -0.21f, 0.13f, -0.4f, 0.33f, -0.47f)
                lineToRelative(2.95f, -1.09f)
                curveToRelative(0.49f, -0.18f, 1.02f, 0.04f, 1.25f, 0.51f)
                curveToRelative(0.65f, 1.35f, 1.55f, 1.85f, 2.1f, 2.0f)
                curveTo(15.85f, 11.0f, 16.0f, 11.18f, 16.0f, 11.4f)
                verticalLineToRelative(0.04f)
                curveTo(16.0f, 11.75f, 15.71f, 11.99f, 15.41f, 11.91f)
                close()
            }
        }
        .build()
        return _runCircle!!
    }

private var _runCircle: ImageVector? = null
