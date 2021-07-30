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

public val SimpleIcons.Fite: ImageVector
    get() {
        if (_fite != null) {
            return _fite!!
        }
        _fite = Builder(name = "Fite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.52f, 8.254f)
                curveToRelative(-0.347f, 0.0f, -0.667f, 0.08f, -1.014f, 0.213f)
                curveToRelative(-0.427f, 0.186f, -0.666f, 0.454f, -0.746f, 0.8f)
                lineTo(0.0f, 15.748f)
                horizontalLineToRelative(2.533f)
                lineToRelative(0.801f, -3.015f)
                horizontalLineToRelative(3.28f)
                lineToRelative(0.4f, -1.464f)
                lineTo(3.732f, 11.269f)
                lineToRelative(0.375f, -1.362f)
                curveToRelative(0.027f, -0.133f, 0.133f, -0.185f, 0.346f, -0.185f)
                horizontalLineToRelative(3.014f)
                lineToRelative(0.346f, -1.467f)
                lineTo(3.52f, 8.255f)
                close()
                moveTo(8.346f, 8.254f)
                lineToRelative(-2.0f, 7.492f)
                lineTo(8.88f, 15.746f)
                lineToRelative(2.0f, -7.492f)
                lineTo(8.346f, 8.254f)
                close()
                moveTo(11.146f, 8.254f)
                lineToRelative(-0.373f, 1.467f)
                horizontalLineToRelative(1.84f)
                curveToRelative(0.16f, 0.0f, 0.24f, 0.053f, 0.24f, 0.16f)
                verticalLineToRelative(0.025f)
                lineToRelative(-1.574f, 5.84f)
                horizontalLineToRelative(2.534f)
                lineToRelative(1.574f, -5.84f)
                curveToRelative(0.026f, -0.133f, 0.132f, -0.185f, 0.345f, -0.185f)
                horizontalLineToRelative(1.842f)
                lineToRelative(0.319f, -1.467f)
                horizontalLineToRelative(-6.747f)
                close()
                moveTo(19.68f, 8.254f)
                curveToRelative(-0.347f, 0.0f, -0.667f, 0.08f, -1.014f, 0.213f)
                curveToRelative(-0.427f, 0.186f, -0.666f, 0.453f, -0.746f, 0.773f)
                lineToRelative(-1.467f, 5.492f)
                curveToRelative(0.0f, 0.027f, -0.027f, 0.081f, -0.027f, 0.108f)
                verticalLineToRelative(0.107f)
                curveToRelative(0.0f, 0.267f, 0.162f, 0.48f, 0.455f, 0.614f)
                curveToRelative(0.24f, 0.106f, 0.505f, 0.185f, 0.799f, 0.185f)
                lineTo(22.0f, 15.746f)
                lineToRelative(0.4f, -1.467f)
                horizontalLineToRelative(-3.013f)
                curveToRelative(-0.16f, 0.0f, -0.24f, -0.053f, -0.24f, -0.16f)
                verticalLineToRelative(-0.025f)
                lineToRelative(0.373f, -1.387f)
                horizontalLineToRelative(3.28f)
                lineToRelative(0.4f, -1.467f)
                horizontalLineToRelative(-3.28f)
                lineToRelative(0.348f, -1.334f)
                curveToRelative(0.053f, -0.133f, 0.159f, -0.185f, 0.345f, -0.185f)
                horizontalLineToRelative(3.014f)
                lineTo(24.0f, 8.254f)
                horizontalLineToRelative(-4.32f)
                close()
            }
        }
        .build()
        return _fite!!
    }

private var _fite: ImageVector? = null
