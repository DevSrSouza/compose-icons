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

public val RoundGroup.NoDrinks: ImageVector
    get() {
        if (_noDrinks != null) {
            return _noDrinks!!
        }
        _noDrinks = Builder(name = "NoDrinks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.49f, 20.49f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(7.54f, 7.54f)
                lineTo(11.0f, 14.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.32f, 0.0f, 0.59f, -0.16f, 0.78f, -0.4f)
                lineToRelative(1.3f, 1.3f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                close()
                moveTo(13.0f, 19.0f)
                verticalLineToRelative(-3.17f)
                lineTo(16.17f, 19.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(7.83f, 5.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(13.72f)
                curveTo(20.35f, 3.0f, 21.0f, 3.65f, 21.0f, 4.45f)
                curveToRelative(0.0f, 0.35f, -0.13f, 0.7f, -0.37f, 0.96f)
                lineToRelative(-5.83f, 6.56f)
                lineTo(9.83f, 7.0f)
                horizontalLineToRelative(6.74f)
                lineToRelative(1.78f, -2.0f)
                horizontalLineTo(7.83f)
                close()
            }
        }
        .build()
        return _noDrinks!!
    }

private var _noDrinks: ImageVector? = null
