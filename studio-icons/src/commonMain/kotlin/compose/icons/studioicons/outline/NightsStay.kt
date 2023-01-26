package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.NightsStay: ImageVector
    get() {
        if (_nightsStay != null) {
            return _nightsStay!!
        }
        _nightsStay = Builder(name = "NightsStay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.78f, 17.51f)
                curveToRelative(-2.47f, 0.0f, -6.57f, -1.33f, -8.68f, -5.43f)
                curveTo(8.77f, 7.57f, 10.6f, 3.6f, 11.63f, 2.01f)
                curveTo(6.27f, 2.2f, 1.98f, 6.59f, 1.98f, 12.0f)
                curveToRelative(0.0f, 0.14f, 0.02f, 0.28f, 0.02f, 0.42f)
                curveTo(2.61f, 12.16f, 3.28f, 12.0f, 3.98f, 12.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.0f, -3.09f, 1.73f, -5.77f, 4.3f, -7.1f)
                curveTo(7.78f, 7.09f, 7.74f, 9.94f, 9.32f, 13.0f)
                curveToRelative(1.57f, 3.04f, 4.18f, 4.95f, 6.8f, 5.86f)
                curveToRelative(-1.23f, 0.74f, -2.65f, 1.15f, -4.13f, 1.15f)
                curveToRelative(-0.5f, 0.0f, -1.0f, -0.05f, -1.48f, -0.14f)
                curveToRelative(-0.37f, 0.7f, -0.94f, 1.27f, -1.64f, 1.64f)
                curveToRelative(0.98f, 0.32f, 2.03f, 0.5f, 3.11f, 0.5f)
                curveToRelative(3.5f, 0.0f, 6.58f, -1.8f, 8.37f, -4.52f)
                curveTo(20.18f, 17.5f, 19.98f, 17.51f, 19.78f, 17.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                lineToRelative(-0.18f, 0.0f)
                curveTo(6.4f, 14.84f, 5.3f, 14.0f, 4.0f, 14.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.62f, 0.0f, 2.49f, 0.0f, 3.0f, 0.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveTo(9.0f, 16.9f, 8.1f, 16.0f, 7.0f, 16.0f)
                close()
            }
        }
        .build()
        return _nightsStay!!
    }

private var _nightsStay: ImageVector? = null
