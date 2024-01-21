package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Polkadot: ImageVector
    get() {
        if (_polkadot != null) {
            return _polkadot!!
        }
        _polkadot = Builder(name = "Polkadot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(2.39f, 0.0f, 4.328f, 1.127f, 4.328f, 2.517f)
                reflectiveCurveTo(14.39f, 5.034f, 12.0f, 5.034f)
                reflectiveCurveTo(7.672f, 3.907f, 7.672f, 2.517f)
                reflectiveCurveTo(9.61f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 18.966f)
                curveToRelative(2.39f, 0.0f, 4.328f, 1.127f, 4.328f, 2.517f)
                reflectiveCurveTo(14.39f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(-4.328f, -1.127f, -4.328f, -2.517f)
                reflectiveCurveTo(9.61f, 18.966f, 12.0f, 18.966f)
                close()
                moveTo(1.606f, 6.0f)
                curveTo(2.8f, 3.93f, 4.747f, 2.816f, 5.952f, 3.511f)
                reflectiveCurveToRelative(1.212f, 2.937f, 0.017f, 5.007f)
                reflectiveCurveTo(2.828f, 11.7f, 1.624f, 11.007f)
                reflectiveCurveTo(0.411f, 8.07f, 1.606f, 6.0f)
                close()
                moveTo(18.033f, 15.483f)
                curveToRelative(1.2f, -2.07f, 3.139f, -3.184f, 4.343f, -2.489f)
                reflectiveCurveToRelative(1.211f, 2.936f, 0.016f, 5.006f)
                reflectiveCurveToRelative(-3.14f, 3.185f, -4.344f, 2.49f)
                reflectiveCurveTo(16.837f, 17.553f, 18.033f, 15.483f)
                close()
                moveTo(1.624f, 12.993f)
                curveToRelative(1.205f, -0.7f, 3.15f, 0.419f, 4.346f, 2.489f)
                reflectiveCurveToRelative(1.187f, 4.311f, -0.018f, 5.007f)
                reflectiveCurveTo(2.8f, 20.07f, 1.607f, 18.0f)
                reflectiveCurveTo(0.42f, 13.689f, 1.624f, 12.993f)
                close()
                moveTo(18.049f, 3.512f)
                curveToRelative(1.2f, -0.695f, 3.149f, 0.419f, 4.344f, 2.489f)
                reflectiveCurveToRelative(1.188f, 4.311f, -0.016f, 5.007f)
                reflectiveCurveToRelative(-3.148f, -0.42f, -4.343f, -2.49f)
                reflectiveCurveTo(16.846f, 4.207f, 18.049f, 3.512f)
                close()
            }
        }
        .build()
        return _polkadot!!
    }

private var _polkadot: ImageVector? = null
