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

public val TwotoneGroup.CatchingPokemon: ImageVector
    get() {
        if (_catchingPokemon != null) {
            return _catchingPokemon!!
        }
        _catchingPokemon = Builder(name = "CatchingPokemon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(4.08f, 0.0f, 7.45f, 3.05f, 7.94f, 7.0f)
                horizontalLineToRelative(-4.06f)
                curveTo(15.43f, 9.27f, 13.86f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveToRelative(-3.43f, 1.27f, -3.87f, 3.0f)
                horizontalLineTo(4.06f)
                curveTo(4.55f, 7.05f, 7.92f, 4.0f, 12.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(4.08f, 0.0f, 7.45f, 3.05f, 7.94f, 7.0f)
                horizontalLineToRelative(-4.06f)
                curveTo(15.43f, 9.27f, 13.86f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveToRelative(-3.43f, 1.27f, -3.87f, 3.0f)
                horizontalLineTo(4.06f)
                curveTo(4.55f, 7.05f, 7.92f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.08f, 0.0f, -7.45f, -3.05f, -7.94f, -7.0f)
                horizontalLineToRelative(4.06f)
                curveToRelative(0.44f, 1.73f, 2.01f, 3.0f, 3.87f, 3.0f)
                reflectiveCurveToRelative(3.43f, -1.27f, 3.87f, -3.0f)
                horizontalLineToRelative(4.06f)
                curveTo(19.45f, 16.95f, 16.08f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _catchingPokemon!!
    }

private var _catchingPokemon: ImageVector? = null
