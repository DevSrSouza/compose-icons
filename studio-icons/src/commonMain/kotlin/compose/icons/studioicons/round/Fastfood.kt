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

public val RoundGroup.Fastfood: ImageVector
    get() {
        if (_fastfood != null) {
            return _fastfood!!
        }
        _fastfood = Builder(name = "Fastfood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(-0.59f, 0.0f, -1.05f, 0.51f, -1.0f, 1.1f)
                lineToRelative(0.12f, 1.21f)
                curveTo(14.9f, 8.16f, 18.0f, 10.77f, 18.0f, 15.0f)
                lineToRelative(0.02f, 8.0f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.84f, 0.0f, 1.53f, -0.65f, 1.63f, -1.47f)
                lineTo(22.89f, 6.1f)
                curveToRelative(0.06f, -0.59f, -0.4f, -1.1f, -0.99f, -1.1f)
                close()
                moveTo(15.0f, 21.0f)
                horizontalLineTo(2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(2.1f, 15.0f)
                horizontalLineToRelative(12.8f)
                curveToRelative(0.62f, 0.0f, 1.11f, -0.56f, 0.99f, -1.16f)
                curveToRelative(-0.65f, -3.23f, -4.02f, -4.85f, -7.39f, -4.85f)
                reflectiveCurveToRelative(-6.73f, 1.62f, -7.39f, 4.85f)
                curveToRelative(-0.12f, 0.6f, 0.38f, 1.16f, 0.99f, 1.16f)
                close()
                moveTo(15.0f, 17.0f)
                horizontalLineTo(2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _fastfood!!
    }

private var _fastfood: ImageVector? = null
