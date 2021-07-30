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

public val SimpleIcons.Oyo: ImageVector
    get() {
        if (_oyo != null) {
            return _oyo!!
        }
        _oyo = Builder(name = "Oyo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.843f, 16.185f)
                curveTo(22.135f, 16.185f, 24.0f, 14.307f, 24.0f, 12.0f)
                curveToRelative(0.0f, -2.309f, -1.865f, -4.185f, -4.157f, -4.185f)
                curveToRelative(-2.293f, 0.0f, -4.158f, 1.876f, -4.158f, 4.185f)
                curveToRelative(0.0f, 2.307f, 1.865f, 4.185f, 4.158f, 4.185f)
                close()
                moveTo(19.843f, 10.508f)
                curveToRelative(0.817f, 0.0f, 1.482f, 0.67f, 1.482f, 1.492f)
                reflectiveCurveToRelative(-0.666f, 1.49f, -1.483f, 1.49f)
                arcTo(1.488f, 1.488f, 0.0f, false, true, 18.36f, 12.0f)
                curveToRelative(0.0f, -0.824f, 0.665f, -1.493f, 1.482f, -1.493f)
                close()
                moveTo(4.157f, 16.185f)
                curveToRelative(2.293f, 0.0f, 4.158f, -1.878f, 4.158f, -4.185f)
                curveToRelative(0.0f, -2.309f, -1.865f, -4.185f, -4.158f, -4.185f)
                curveTo(1.866f, 7.815f, 0.0f, 9.691f, 0.0f, 12.0f)
                curveToRelative(0.0f, 2.307f, 1.866f, 4.185f, 4.157f, 4.185f)
                close()
                moveTo(4.157f, 10.508f)
                curveToRelative(0.818f, 0.0f, 1.483f, 0.67f, 1.483f, 1.492f)
                reflectiveCurveToRelative(-0.665f, 1.49f, -1.483f, 1.49f)
                arcTo(1.488f, 1.488f, 0.0f, false, true, 2.677f, 12.0f)
                curveToRelative(0.0f, -0.824f, 0.664f, -1.493f, 1.48f, -1.493f)
                close()
                moveTo(11.997f, 10.414f)
                lineTo(10.722f, 7.87f)
                lineTo(7.733f, 7.87f)
                lineToRelative(2.791f, 5.564f)
                verticalLineToRelative(2.62f)
                horizontalLineToRelative(2.948f)
                verticalLineToRelative(-2.62f)
                lineToRelative(2.791f, -5.564f)
                horizontalLineToRelative(-2.99f)
                lineToRelative(-1.275f, 2.544f)
                close()
            }
        }
        .build()
        return _oyo!!
    }

private var _oyo: ImageVector? = null
