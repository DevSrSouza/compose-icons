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

public val SimpleIcons.G2a: ImageVector
    get() {
        if (_g2a != null) {
            return _g2a!!
        }
        _g2a = Builder(name = "G2a", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.419f)
                reflectiveCurveToRelative(-1.8844f, -3.5895f, -3.1571f, -6.0153f)
                arcToRelative(1.6802f, 1.6802f, 0.0f, false, false, -0.4674f, -0.5659f)
                arcToRelative(1.3021f, 1.3021f, 0.0f, false, false, -0.7927f, -0.2572f)
                arcToRelative(1.239f, 1.239f, 0.0f, false, false, -0.7715f, 0.2572f)
                arcToRelative(1.6802f, 1.6802f, 0.0f, false, false, -0.4674f, 0.5659f)
                curveToRelative(-1.2726f, 2.4258f, -3.1783f, 6.0153f, -3.1783f, 6.0153f)
                lineToRelative(1.7391f, 4.0E-4f)
                lineToRelative(2.6781f, -5.1339f)
                lineToRelative(1.2586f, 2.4128f)
                horizontalLineToRelative(-1.9378f)
                lineToRelative(0.6832f, 1.3053f)
                horizontalLineToRelative(1.9356f)
                lineToRelative(0.7386f, 1.4154f)
                lineTo(24.0f, 15.419f)
                close()
                moveTo(3.4872f, 13.9588f)
                curveToRelative(-1.071f, 0.0f, -1.9392f, -0.8682f, -1.9392f, -1.9392f)
                reflectiveCurveToRelative(0.8682f, -1.9392f, 1.9392f, -1.9392f)
                lineToRelative(3.9342f, -0.0031f)
                lineTo(7.4214f, 8.6212f)
                lineTo(3.3946f, 8.6212f)
                curveTo(1.5174f, 8.6236f, -0.0024f, 10.1473f, 0.0f, 12.0244f)
                curveToRelative(0.0024f, 1.8738f, 1.5208f, 3.3922f, 3.3946f, 3.3946f)
                horizontalLineToRelative(4.0268f)
                verticalLineToRelative(-4.1277f)
                lineTo(3.053f, 11.2913f)
                verticalLineToRelative(1.4571f)
                lineToRelative(2.8447f, -1.0E-4f)
                verticalLineToRelative(1.2141f)
                lineToRelative(-2.4105f, -0.0036f)
                close()
                moveTo(10.7177f, 12.7479f)
                lineTo(13.7818f, 12.7477f)
                curveToRelative(1.1395f, 0.0f, 2.0633f, -0.9238f, 2.0633f, -2.0633f)
                reflectiveCurveToRelative(-0.9238f, -2.0633f, -2.0633f, -2.0633f)
                horizontalLineToRelative(-3.6463f)
                curveToRelative(-0.804f, -2.0E-4f, -1.4559f, 0.6515f, -1.4561f, 1.4555f)
                verticalLineToRelative(6.0E-4f)
                lineToRelative(4.9963f, -1.0E-4f)
                arcToRelative(0.6157f, 0.6157f, 0.0f, false, true, 0.6201f, 0.591f)
                arcToRelative(0.6064f, 0.6064f, 0.0f, false, true, -0.5894f, 0.6229f)
                lineToRelative(-0.0159f, 2.0E-4f)
                horizontalLineToRelative(-3.185f)
                curveToRelative(-1.0725f, 4.0E-4f, -1.9417f, 0.8701f, -1.9413f, 1.9426f)
                verticalLineToRelative(2.185f)
                horizontalLineToRelative(5.4523f)
                lineToRelative(0.7727f, -1.4566f)
                horizontalLineToRelative(-4.7014f)
                verticalLineToRelative(-0.5841f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, true, 0.6299f, -0.6302f)
                close()
            }
        }
        .build()
        return _g2a!!
    }

private var _g2a: ImageVector? = null
