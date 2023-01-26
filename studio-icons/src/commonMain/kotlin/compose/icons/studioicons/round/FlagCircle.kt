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

public val RoundGroup.FlagCircle: ImageVector
    get() {
        if (_flagCircle != null) {
            return _flagCircle!!
        }
        _flagCircle = Builder(name = "FlagCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.0f, 15.0f)
                horizontalLineToRelative(-3.38f)
                curveToRelative(-0.38f, 0.0f, -0.73f, -0.21f, -0.89f, -0.55f)
                lineTo(12.0f, 13.0f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(4.25f)
                curveTo(9.5f, 17.66f, 9.16f, 18.0f, 8.75f, 18.0f)
                horizontalLineToRelative(0.0f)
                curveTo(8.34f, 18.0f, 8.0f, 17.66f, 8.0f, 17.25f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.38f)
                curveToRelative(0.38f, 0.0f, 0.73f, 0.21f, 0.89f, 0.55f)
                lineTo(15.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveTo(18.0f, 14.55f, 17.55f, 15.0f, 17.0f, 15.0f)
                close()
            }
        }
        .build()
        return _flagCircle!!
    }

private var _flagCircle: ImageVector? = null
