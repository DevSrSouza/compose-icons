package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Umbraco: ImageVector
    get() {
        if (_umbraco != null) {
            return _umbraco!!
        }
        _umbraco = Builder(name = "Umbraco", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                curveTo(0.0f, 5.522f, 5.363f, 0.319f, 12.0f, 0.319f)
                reflectiveCurveTo(24.0f, 5.522f, 24.0f, 12.0f)
                curveToRelative(0.0f, 6.476f, -5.363f, 11.681f, -12.0f, 11.681f)
                reflectiveCurveTo(0.0f, 18.477f, 0.0f, 12.0f)
                close()
                moveTo(11.734f, 15.98f)
                curveToRelative(-1.168f, 0.0f, -2.123f, -0.104f, -2.76f, -0.211f)
                curveToRelative(-0.744f, -0.158f, -1.223f, -0.584f, -1.541f, -1.168f)
                curveToRelative(-0.266f, -0.586f, -0.424f, -1.539f, -0.371f, -2.814f)
                curveToRelative(0.0f, -0.689f, 0.053f, -1.327f, 0.104f, -1.965f)
                curveToRelative(0.108f, -0.636f, 0.16f, -1.167f, 0.267f, -1.594f)
                lineToRelative(0.105f, -0.424f)
                verticalLineToRelative(-0.052f)
                curveToRelative(0.0f, -0.105f, -0.105f, -0.213f, -0.212f, -0.213f)
                lineToRelative(-1.54f, -0.212f)
                horizontalLineToRelative(-0.052f)
                curveToRelative(-0.105f, 0.0f, -0.213f, 0.105f, -0.266f, 0.16f)
                curveToRelative(0.0f, 0.104f, -0.053f, 0.159f, -0.104f, 0.371f)
                curveToRelative(-0.108f, 0.478f, -0.161f, 0.902f, -0.267f, 1.486f)
                curveToRelative(-0.109f, 0.685f, -0.163f, 1.378f, -0.159f, 2.071f)
                curveToRelative(0.0f, 0.0f, -0.053f, 0.159f, 0.0f, 1.434f)
                reflectiveCurveToRelative(0.266f, 2.283f, 0.69f, 3.08f)
                curveToRelative(0.425f, 0.742f, 1.116f, 1.326f, 2.124f, 1.645f)
                curveToRelative(1.01f, 0.32f, 2.389f, 0.479f, 4.142f, 0.479f)
                horizontalLineToRelative(0.213f)
                curveToRelative(1.753f, 0.0f, 3.132f, -0.158f, 4.14f, -0.479f)
                curveToRelative(1.01f, -0.318f, 1.701f, -0.902f, 2.126f, -1.645f)
                curveToRelative(0.425f, -0.795f, 0.638f, -1.805f, 0.69f, -3.08f)
                curveToRelative(0.053f, -1.275f, 0.0f, -1.434f, 0.0f, -1.434f)
                curveToRelative(0.0f, -0.743f, -0.104f, -1.435f, -0.16f, -2.069f)
                curveToRelative(-0.105f, -0.638f, -0.158f, -1.063f, -0.266f, -1.487f)
                curveToRelative(-0.053f, -0.212f, -0.053f, -0.319f, -0.105f, -0.371f)
                curveToRelative(0.0f, -0.107f, -0.105f, -0.16f, -0.266f, -0.16f)
                horizontalLineToRelative(-0.053f)
                lineToRelative(-1.54f, 0.212f)
                curveToRelative(-0.105f, 0.0f, -0.213f, 0.107f, -0.213f, 0.213f)
                verticalLineToRelative(0.052f)
                lineToRelative(0.106f, 0.424f)
                curveToRelative(0.106f, 0.427f, 0.158f, 0.957f, 0.266f, 1.593f)
                curveToRelative(0.105f, 0.639f, 0.105f, 1.275f, 0.105f, 1.965f)
                curveToRelative(0.0f, 1.275f, -0.104f, 2.177f, -0.371f, 2.814f)
                curveToRelative(-0.266f, 0.586f, -0.795f, 1.01f, -1.539f, 1.168f)
                curveToRelative(-0.639f, 0.16f, -1.594f, 0.213f, -2.762f, 0.213f)
                horizontalLineToRelative(-0.531f)
                verticalLineToRelative(-0.002f)
                close()
            }
        }
        .build()
        return _umbraco!!
    }

private var _umbraco: ImageVector? = null
