package compose.icons.lineaicons.basic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.Spades: ImageVector
    get() {
        if (_spades != null) {
            return _spades!!
        }
        _spades = Builder(name = "Spades", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 63.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(-7.0f, 0.0f, -7.0f, -19.0f, -7.0f, -19.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, 7.671f, 6.0f, 13.0f, 13.0f, 13.0f)
                curveToRelative(8.334f, 0.0f, 14.0f, -7.329f, 14.0f, -15.0f)
                curveTo(61.0f, 17.48f, 32.0f, 1.0f, 32.0f, 1.0f)
                reflectiveCurveTo(3.0f, 17.48f, 3.0f, 36.0f)
                curveToRelative(0.0f, 7.671f, 6.667f, 15.0f, 15.0f, 15.0f)
                curveToRelative(7.0f, 0.0f, 11.395f, -5.87f, 12.0f, -13.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 19.0f, -7.0f, 19.0f)
                horizontalLineTo(32.0f)
            }
        }
        .build()
        return _spades!!
    }

private var _spades: ImageVector? = null
