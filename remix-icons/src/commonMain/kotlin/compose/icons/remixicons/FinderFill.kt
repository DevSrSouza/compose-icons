package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FinderFill: ImageVector
    get() {
        if (_finderFill != null) {
            return _finderFill!!
        }
        _finderFill = Builder(name = "FinderFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-8.465f)
                curveToRelative(-0.69f, 1.977f, -1.035f, 4.644f, -1.035f, 8.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(-0.115f, 0.92f, -0.15f, 1.878f, -0.107f, 2.877f)
                curveToRelative(1.226f, -0.211f, 2.704f, -0.777f, 4.027f, -1.71f)
                lineToRelative(1.135f, 1.665f)
                curveToRelative(-1.642f, 1.095f, -3.303f, 1.779f, -4.976f, 2.043f)
                curveToRelative(0.052f, 0.37f, 0.113f, 0.745f, 0.184f, 1.125f)
                lineTo(20.0f, 19.0f)
                lineTo(20.0f, 5.0f)
                close()
                moveTo(6.555f, 14.168f)
                lineToRelative(-1.11f, 1.664f)
                curveTo(7.602f, 17.27f, 9.792f, 18.0f, 12.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.792f, 0.0f, -3.602f, -0.603f, -5.445f, -1.832f)
                close()
                moveTo(17.0f, 7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(16.0f, 8.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(7.0f, 7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.452f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(8.0f, 8.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _finderFill!!
    }

private var _finderFill: ImageVector? = null
