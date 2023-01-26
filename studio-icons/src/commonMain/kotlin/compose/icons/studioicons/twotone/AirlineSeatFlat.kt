package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.AirlineSeatFlat: ImageVector
    get() {
        if (_airlineSeatFlat != null) {
            return _airlineSeatFlat!!
        }
        _airlineSeatFlat = Builder(name = "AirlineSeatFlat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.71f, -0.3f)
                curveToRelative(0.39f, -0.4f, 0.39f, -1.02f, -0.01f, -1.41f)
                curveTo(5.51f, 9.11f, 5.26f, 9.0f, 5.0f, 9.0f)
                curveToRelative(-0.27f, 0.0f, -0.52f, 0.11f, -0.71f, 0.3f)
                curveToRelative(-0.39f, 0.4f, -0.39f, 1.02f, 0.01f, 1.41f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.29f, 0.7f, 0.29f)
                close()
                moveTo(18.0f, 9.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                curveToRelative(0.78f, 0.0f, 1.55f, -0.3f, 2.14f, -0.9f)
                curveToRelative(1.16f, -1.19f, 1.14f, -3.08f, -0.04f, -4.24f)
                curveTo(6.51f, 7.29f, 5.75f, 7.0f, 5.0f, 7.0f)
                curveToRelative(-0.78f, 0.0f, -1.55f, 0.3f, -2.14f, 0.9f)
                curveToRelative(-1.16f, 1.19f, -1.14f, 3.08f, 0.04f, 4.24f)
                curveToRelative(0.59f, 0.57f, 1.35f, 0.86f, 2.1f, 0.86f)
                close()
                moveTo(4.29f, 9.3f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.3f, 0.71f, -0.3f)
                curveToRelative(0.26f, 0.0f, 0.51f, 0.1f, 0.7f, 0.28f)
                curveToRelative(0.4f, 0.39f, 0.4f, 1.01f, 0.02f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.31f, -0.72f, 0.31f)
                curveToRelative(-0.26f, 0.0f, -0.51f, -0.1f, -0.7f, -0.28f)
                curveToRelative(-0.4f, -0.4f, -0.4f, -1.02f, -0.01f, -1.42f)
                close()
                moveTo(18.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 14.0f)
                close()
            }
        }
        .build()
        return _airlineSeatFlat!!
    }

private var _airlineSeatFlat: ImageVector? = null
