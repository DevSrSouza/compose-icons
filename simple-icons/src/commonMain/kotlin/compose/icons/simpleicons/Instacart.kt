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

public val SimpleIcons.Instacart: ImageVector
    get() {
        if (_instacart != null) {
            return _instacart!!
        }
        _instacart = Builder(name = "Instacart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.629f, 9.619f)
                curveToRelative(1.421f, 1.429f, 2.58f, 3.766f, 1.917f, 5.152f)
                curveToRelative(-1.778f, 3.715f, -15.04f, 10.226f, -16.169f, 9.1f)
                curveTo(0.252f, 22.746f, 6.768f, 9.476f, 10.481f, 7.697f)
                curveToRelative(1.388f, -0.66f, 3.724f, 0.51f, 5.152f, 1.92f)
                lineToRelative(-0.005f, 0.014f)
                verticalLineToRelative(-0.012f)
                close()
                moveTo(22.657f, 8.053f)
                curveToRelative(-0.231f, -0.855f, -0.821f, -1.717f, -1.7f, -1.82f)
                curveToRelative(-1.61f, -0.186f, -4.151f, 2.663f, -3.971f, 3.339f)
                curveToRelative(0.181f, 0.69f, 3.766f, 1.875f, 5.1f, 0.915f)
                curveToRelative(0.691f, -0.494f, 0.781f, -1.56f, 0.556f, -2.414f)
                lineToRelative(0.015f, -0.02f)
                close()
                moveTo(17.666f, 0.158f)
                curveToRelative(1.198f, 0.324f, 2.407f, 1.148f, 2.551f, 2.382f)
                curveToRelative(0.261f, 2.259f, -3.732f, 5.819f, -4.68f, 5.564f)
                curveToRelative(-0.948f, -0.251f, -2.618f, -5.284f, -1.269f, -7.162f)
                curveToRelative(0.695f, -0.972f, 2.201f, -1.106f, 3.399f, -0.788f)
                verticalLineToRelative(0.004f)
                horizontalLineToRelative(-0.001f)
                close()
            }
        }
        .build()
        return _instacart!!
    }

private var _instacart: ImageVector? = null
