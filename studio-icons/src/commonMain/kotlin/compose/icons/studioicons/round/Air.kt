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

public val RoundGroup.Air: ImageVector
    get() {
        if (_air != null) {
            return _air!!
        }
        _air = Builder(name = "Air", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.35f, 17.95f)
                curveToRelative(-0.28f, 0.89f, -1.01f, 1.62f, -1.9f, 1.9f)
                curveToRelative(-1.51f, 0.48f, -2.94f, -0.23f, -3.59f, -1.42f)
                curveTo(8.51f, 17.78f, 9.03f, 17.0f, 9.77f, 17.0f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.34f, 0.0f, 0.68f, 0.16f, 0.84f, 0.46f)
                curveToRelative(0.17f, 0.32f, 0.5f, 0.54f, 0.89f, 0.54f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.5f)
                curveTo(13.46f, 14.0f, 15.0f, 15.9f, 14.35f, 17.95f)
                close()
                moveTo(18.91f, 5.67f)
                curveToRelative(-0.29f, -1.26f, -1.32f, -2.29f, -2.58f, -2.58f)
                curveToRelative(-1.76f, -0.4f, -3.37f, 0.53f, -4.02f, 1.98f)
                curveTo(12.0f, 5.74f, 12.48f, 6.5f, 13.21f, 6.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.39f, 0.0f, 0.75f, -0.22f, 0.9f, -0.57f)
                curveTo(14.34f, 5.38f, 14.87f, 5.0f, 15.5f, 5.0f)
                curveTo(16.33f, 5.0f, 17.0f, 5.67f, 17.0f, 6.5f)
                reflectiveCurveTo(16.33f, 8.0f, 15.5f, 8.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 8.0f, 2.0f, 8.45f, 2.0f, 9.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.5f)
                curveTo(17.7f, 10.0f, 19.43f, 7.96f, 18.91f, 5.67f)
                close()
                moveTo(18.4f, 11.0f)
                lineTo(3.0f, 11.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.63f, -0.38f, 1.16f, -0.93f, 1.39f)
                curveToRelative(-0.36f, 0.15f, -0.57f, 0.51f, -0.57f, 0.9f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.73f, 0.76f, 1.21f, 1.43f, 0.91f)
                curveToRelative(1.43f, -0.64f, 2.35f, -2.21f, 2.0f, -3.93f)
                curveTo(21.59f, 12.13f, 20.07f, 11.0f, 18.4f, 11.0f)
                close()
            }
        }
        .build()
        return _air!!
    }

private var _air: ImageVector? = null
