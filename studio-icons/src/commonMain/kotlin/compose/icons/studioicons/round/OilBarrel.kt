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

public val RoundGroup.OilBarrel: ImageVector
    get() {
        if (_oilBarrel != null) {
            return _oilBarrel!!
        }
        _oilBarrel = Builder(name = "OilBarrel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 3.0f, 3.0f, 3.45f, 3.0f, 4.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.32f, -3.0f, -2.95f)
                curveToRelative(0.0f, -1.16f, 0.41f, -1.58f, 2.24f, -3.68f)
                curveToRelative(0.4f, -0.46f, 1.12f, -0.46f, 1.51f, 0.0f)
                curveToRelative(1.82f, 2.09f, 2.24f, 2.52f, 2.24f, 3.68f)
                curveTo(15.0f, 14.68f, 13.66f, 16.0f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _oilBarrel!!
    }

private var _oilBarrel: ImageVector? = null