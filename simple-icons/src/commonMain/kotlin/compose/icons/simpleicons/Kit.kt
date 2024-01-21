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

public val SimpleIcons.Kit: ImageVector
    get() {
        if (_kit != null) {
            return _kit!!
        }
        _kit = Builder(name = "Kit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.5f, 11.633f)
                lineToRelative(-2.434f, 2.408f)
                lineTo(1.066f, 8.687f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, -0.533f, -0.527f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, -0.533f, 0.527f)
                verticalLineToRelative(6.624f)
                arcToRelative(0.528f, 0.528f, 0.0f, false, false, 0.532f, 0.526f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, false, 0.377f, -0.153f)
                lineToRelative(2.974f, -2.939f)
                lineToRelative(2.974f, 2.94f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, false, 0.754f, 0.0f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, false, 0.0f, -0.746f)
                lineToRelative(-2.974f, -2.938f)
                lineTo(7.61f, 9.06f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, false, 0.0f, -0.745f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, false, -0.753f, 0.0f)
                lineToRelative(-3.344f, 3.307f)
                curveToRelative(-0.003f, 0.0f, -0.005f, 0.003f, -0.007f, 0.005f)
                lineToRelative(-0.007f, 0.006f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(12.326f, 15.839f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, -0.533f, -0.526f)
                lineTo(11.793f, 8.688f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.533f, -0.528f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.533f, 0.528f)
                verticalLineToRelative(6.624f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, -0.533f, 0.526f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(19.583f, 9.215f)
                verticalLineToRelative(6.098f)
                curveToRelative(0.0f, 0.29f, 0.238f, 0.526f, 0.532f, 0.526f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, 0.533f, -0.526f)
                lineTo(20.648f, 9.215f)
                horizontalLineToRelative(2.818f)
                arcTo(0.53f, 0.53f, 0.0f, false, false, 24.0f, 8.688f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, -0.533f, -0.527f)
                horizontalLineToRelative(-6.702f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, -0.533f, 0.527f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, 0.533f, 0.527f)
                horizontalLineToRelative(2.819f)
                horizontalLineToRelative(-0.001f)
                close()
            }
        }
        .build()
        return _kit!!
    }

private var _kit: ImageVector? = null
