package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.MinusCircle: ImageVector
    get() {
        if (_minusCircle != null) {
            return _minusCircle!!
        }
        _minusCircle = Builder(name = "MinusCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.0f, 8.0f, 8.0f, 119.0f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(393.0f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(124.0f, 296.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(264.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineTo(124.0f)
                close()
            }
        }
        .build()
        return _minusCircle!!
    }

private var _minusCircle: ImageVector? = null
