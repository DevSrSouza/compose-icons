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

public val OutlineGroup.Icecream: ImageVector
    get() {
        if (_icecream != null) {
            return _icecream!!
        }
        _icecream = Builder(name = "Icecream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.38f, 6.24f)
                curveTo(17.79f, 3.24f, 15.14f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(6.21f, 3.24f, 5.62f, 6.24f)
                curveTo(4.08f, 6.81f, 3.0f, 8.29f, 3.0f, 10.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.12f, 0.0f, 0.23f, -0.02f, 0.34f, -0.02f)
                lineTo(12.07f, 23.0f)
                lineToRelative(4.61f, -9.03f)
                curveTo(16.79f, 13.98f, 16.89f, 14.0f, 17.0f, 14.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                curveTo(21.0f, 8.29f, 19.92f, 6.81f, 18.38f, 6.24f)
                close()
                moveTo(12.05f, 18.63f)
                lineToRelative(-2.73f, -5.21f)
                curveTo(10.15f, 13.79f, 11.06f, 14.0f, 12.0f, 14.0f)
                curveToRelative(0.95f, 0.0f, 1.88f, -0.21f, 2.72f, -0.6f)
                lineTo(12.05f, 18.63f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(-0.52f, 0.0f, -1.01f, -0.2f, -1.39f, -0.56f)
                lineToRelative(-0.56f, -0.54f)
                lineToRelative(-0.66f, 0.42f)
                curveTo(13.68f, 11.76f, 12.86f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-1.68f, -0.24f, -2.39f, -0.69f)
                lineTo(8.95f, 10.9f)
                lineToRelative(-0.56f, 0.54f)
                curveTo(8.01f, 11.79f, 7.52f, 12.0f, 7.0f, 12.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.98f, 0.72f, -1.82f, 1.68f, -1.97f)
                lineTo(7.45f, 7.9f)
                lineToRelative(0.06f, -0.78f)
                curveTo(7.71f, 4.8f, 9.66f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(4.29f, 1.8f, 4.48f, 4.12f)
                lineToRelative(0.06f, 0.78f)
                lineToRelative(0.77f, 0.12f)
                curveTo(18.28f, 8.18f, 19.0f, 9.01f, 19.0f, 10.0f)
                curveTo(19.0f, 11.1f, 18.1f, 12.0f, 17.0f, 12.0f)
                close()
            }
        }
        .build()
        return _icecream!!
    }

private var _icecream: ImageVector? = null
