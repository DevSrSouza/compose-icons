package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandSwift: ImageVector
    get() {
        if (_brandSwift != null) {
            return _brandSwift!!
        }
        _brandSwift = Builder(name = "BrandSwift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.547f, 15.828f)
                curveToRelative(1.33f, -4.126f, -1.384f, -9.521f, -6.047f, -12.828f)
                curveToRelative(-0.135f, -0.096f, 2.39f, 6.704f, 1.308f, 9.124f)
                curveToRelative(-2.153f, -1.454f, -4.756f, -3.494f, -7.808f, -6.124f)
                lineToRelative(-0.5f, 2.0f)
                lineToRelative(-3.5f, -1.0f)
                curveToRelative(4.36f, 4.748f, 7.213f, 7.695f, 8.56f, 8.841f)
                curveToRelative(-4.658f, 2.089f, -10.65f, -0.978f, -10.56f, -0.841f)
                curveToRelative(1.016f, 1.545f, 6.0f, 6.0f, 11.0f, 6.0f)
                curveToRelative(2.0f, 0.0f, 3.788f, -0.502f, 4.742f, -1.389f)
                curveToRelative(0.005f, -0.005f, 0.432f, -0.446f, 1.378f, -0.17f)
                curveToRelative(0.504f, 0.148f, 1.463f, 0.667f, 2.88f, 1.559f)
                verticalLineToRelative(-1.507f)
                curveToRelative(0.0f, -1.377f, -0.515f, -2.67f, -1.453f, -3.665f)
                close()
            }
        }
        .build()
        return _brandSwift!!
    }

private var _brandSwift: ImageVector? = null
