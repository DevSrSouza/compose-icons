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

public val SimpleIcons.Audioboom: ImageVector
    get() {
        if (_audioboom != null) {
            return _audioboom!!
        }
        _audioboom = Builder(name = "Audioboom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.373f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(7.425f, 3.214f)
                curveToRelative(-0.621f, 0.0f, -1.125f, 0.503f, -1.125f, 1.124f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.124f, 1.124f, 0.0f, false, false, 2.25f, 0.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.62f, -0.504f, -1.124f, -1.125f, -1.124f)
                close()
                moveTo(7.425f, 12.528f)
                curveToRelative(-0.621f, 0.0f, -1.125f, 0.503f, -1.125f, 1.125f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.124f, 1.124f, 0.0f, false, false, 2.25f, 0.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.622f, -0.504f, -1.125f, -1.125f, -1.125f)
                close()
                moveTo(11.577f, 5.672f)
                curveToRelative(-0.621f, 0.0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(10.388f)
                arcToRelative(1.124f, 1.124f, 0.0f, false, false, 2.25f, 0.0f)
                lineTo(12.702f, 6.797f)
                curveToRelative(0.0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                close()
                moveTo(15.728f, 12.528f)
                curveToRelative(-0.62f, 0.0f, -1.124f, 0.503f, -1.124f, 1.125f)
                verticalLineToRelative(1.056f)
                arcToRelative(1.124f, 1.124f, 0.0f, true, false, 2.249f, 0.0f)
                verticalLineToRelative(-1.056f)
                curveToRelative(0.0f, -0.622f, -0.504f, -1.125f, -1.125f, -1.125f)
                close()
                moveTo(15.728f, 8.158f)
                curveToRelative(-0.62f, 0.0f, -1.124f, 0.503f, -1.124f, 1.124f)
                verticalLineToRelative(1.056f)
                arcToRelative(1.124f, 1.124f, 0.0f, false, false, 2.249f, 0.0f)
                lineTo(16.853f, 9.282f)
                curveToRelative(0.0f, -0.62f, -0.504f, -1.124f, -1.125f, -1.124f)
                close()
                moveTo(19.88f, 10.58f)
                curveToRelative(-0.62f, 0.0f, -1.124f, 0.503f, -1.124f, 1.124f)
                verticalLineToRelative(0.574f)
                arcToRelative(1.124f, 1.124f, 0.0f, true, false, 2.249f, 0.0f)
                verticalLineToRelative(-0.574f)
                curveToRelative(0.0f, -0.62f, -0.504f, -1.124f, -1.125f, -1.124f)
                close()
            }
        }
        .build()
        return _audioboom!!
    }

private var _audioboom: ImageVector? = null
