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

public val SolidGroup.ExclamationCircle: ImageVector
    get() {
        if (_exclamationCircle != null) {
            return _exclamationCircle!!
        }
        _exclamationCircle = Builder(name = "ExclamationCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, -111.04f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 393.0f, 8.0f, 256.0f)
                curveTo(8.0f, 119.08f, 119.04f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.08f, 248.0f, 248.0f)
                close()
                moveTo(256.0f, 306.0f)
                curveToRelative(-25.41f, 0.0f, -46.0f, 20.59f, -46.0f, 46.0f)
                reflectiveCurveToRelative(20.59f, 46.0f, 46.0f, 46.0f)
                reflectiveCurveToRelative(46.0f, -20.59f, 46.0f, -46.0f)
                reflectiveCurveToRelative(-20.59f, -46.0f, -46.0f, -46.0f)
                close()
                moveTo(212.33f, 140.65f)
                lineToRelative(7.42f, 136.0f)
                curveToRelative(0.35f, 6.36f, 5.61f, 11.35f, 11.98f, 11.35f)
                horizontalLineToRelative(48.55f)
                curveToRelative(6.37f, 0.0f, 11.64f, -4.98f, 11.98f, -11.35f)
                lineToRelative(7.42f, -136.0f)
                curveToRelative(0.38f, -6.87f, -5.1f, -12.65f, -11.98f, -12.65f)
                horizontalLineToRelative(-63.38f)
                curveToRelative(-6.88f, 0.0f, -12.36f, 5.78f, -11.98f, 12.65f)
                close()
            }
        }
        .build()
        return _exclamationCircle!!
    }

private var _exclamationCircle: ImageVector? = null
