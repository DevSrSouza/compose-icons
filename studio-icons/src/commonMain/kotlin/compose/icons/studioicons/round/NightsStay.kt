package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.NightsStay: ImageVector
    get() {
        if (_nightsStay != null) {
            return _nightsStay!!
        }
        _nightsStay = Builder(name = "NightsStay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1f, 12.08f)
                curveToRelative(-2.0f, -3.88f, -0.92f, -7.36f, 0.07f, -9.27f)
                curveToRelative(0.19f, -0.36f, -0.12f, -0.77f, -0.53f, -0.72f)
                curveTo(5.62f, 2.77f, 1.78f, 7.16f, 1.99f, 12.41f)
                curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, 0.01f)
                curveTo(2.62f, 12.15f, 3.29f, 12.0f, 4.0f, 12.0f)
                curveToRelative(1.66f, 0.0f, 3.18f, 0.83f, 4.1f, 2.15f)
                curveTo(9.77f, 14.63f, 11.0f, 16.17f, 11.0f, 18.0f)
                curveToRelative(0.0f, 1.52f, -0.87f, 2.83f, -2.12f, 3.51f)
                curveToRelative(0.98f, 0.32f, 2.03f, 0.5f, 3.11f, 0.5f)
                curveToRelative(3.13f, 0.0f, 5.92f, -1.44f, 7.76f, -3.69f)
                curveToRelative(0.26f, -0.32f, 0.04f, -0.79f, -0.37f, -0.82f)
                curveTo(16.89f, 17.37f, 13.1f, 15.97f, 11.1f, 12.08f)
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
