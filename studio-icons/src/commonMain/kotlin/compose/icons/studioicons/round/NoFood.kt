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

public val RoundGroup.NoFood: ImageVector
    get() {
        if (_noFood != null) {
            return _noFood!!
        }
        _noFood = Builder(name = "NoFood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 22.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(13.0f)
                curveTo(15.55f, 21.0f, 16.0f, 21.45f, 16.0f, 22.0f)
                close()
                moveTo(22.89f, 6.1f)
                curveTo(22.95f, 5.51f, 22.49f, 5.0f, 21.9f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(-0.59f, 0.0f, -1.05f, 0.51f, -1.0f, 1.1f)
                lineToRelative(0.24f, 2.41f)
                lineTo(18.0f, 15.17f)
                lineToRelative(3.62f, 3.62f)
                lineTo(22.89f, 6.1f)
                close()
                moveTo(21.19f, 22.61f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(12.0f, 12.0f)
                lineTo(9.01f, 9.01f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-6.2f, -6.2f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(1.0f, 3.2f, 1.0f, 3.83f, 1.39f, 4.22f)
                lineToRelative(4.99f, 4.99f)
                curveToRelative(-2.56f, 0.54f, -4.76f, 2.08f, -5.28f, 4.63f)
                curveTo(0.99f, 14.45f, 1.49f, 15.0f, 2.1f, 15.0f)
                lineToRelative(10.07f, 0.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.32f, 0.0f, 0.59f, -0.16f, 0.78f, -0.4f)
                lineToRelative(4.0f, 4.0f)
                curveTo(20.17f, 23.0f, 20.8f, 23.0f, 21.19f, 22.61f)
                lineTo(21.19f, 22.61f)
                close()
            }
        }
        .build()
        return _noFood!!
    }

private var _noFood: ImageVector? = null
