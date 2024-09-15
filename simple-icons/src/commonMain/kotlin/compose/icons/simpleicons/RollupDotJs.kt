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

public val SimpleIcons.RollupDotJs: ImageVector
    get() {
        if (_rollupDotJs != null) {
            return _rollupDotJs!!
        }
        _rollupDotJs = Builder(name = "RollupDotJs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.42f, 0.0f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, -0.369f, 0.37f)
                verticalLineTo(19.885f)
                curveToRelative(0.577f, -1.488f, 1.557f, -3.617f, 3.138f, -6.53f)
                curveTo(11.889f, 2.876f, 12.635f, 1.819f, 15.604f, 1.819f)
                curveToRelative(1.56f, 0.0f, 3.134f, 0.704f, 4.152f, 1.955f)
                arcTo(7.962f, 7.962f, 0.0f, false, false, 13.101f, 0.0f)
                close()
                moveTo(16.139f, 2.544f)
                curveToRelative(-1.19f, 0.01f, -2.257f, 0.466f, -2.698f, 1.498f)
                curveToRelative(-0.967f, 2.256f, 1.624f, 4.767f, 2.757f, 4.568f)
                curveToRelative(1.442f, -0.255f, -0.255f, -3.563f, -0.255f, -3.563f)
                curveToRelative(2.205f, 4.156f, 1.697f, 2.884f, -2.29f, 6.7f)
                curveTo(9.667f, 15.562f, 5.596f, 23.619f, 5.002f, 23.957f)
                arcToRelative(0.477f, 0.477f, 0.0f, false, true, -0.08f, 0.043f)
                horizontalLineTo(20.558f)
                arcToRelative(0.373f, 0.373f, 0.0f, false, false, 0.33f, -0.538f)
                lineToRelative(-4.088f, -8.092f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.144f, -0.488f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, 4.005f, -6.913f)
                curveToRelative(0.0f, -1.425f, -0.373f, -2.761f, -1.03f, -3.92f)
                curveToRelative(-0.927f, -0.952f, -2.43f, -1.516f, -3.779f, -1.506f)
                close()
            }
        }
        .build()
        return _rollupDotJs!!
    }

private var _rollupDotJs: ImageVector? = null
