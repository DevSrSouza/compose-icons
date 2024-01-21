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

public val SimpleIcons.Zyte: ImageVector
    get() {
        if (_zyte != null) {
            return _zyte!!
        }
        _zyte = Builder(name = "Zyte", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.135f, 6.818f)
                verticalLineToRelative(1.715f)
                horizontalLineToRelative(-1.217f)
                lineTo(12.918f, 9.92f)
                horizontalLineToRelative(1.217f)
                verticalLineToRelative(2.601f)
                curveToRelative(0.0f, 1.624f, 0.943f, 2.487f, 2.355f, 2.487f)
                curveToRelative(0.236f, 0.0f, 0.562f, -0.025f, 0.785f, -0.076f)
                verticalLineToRelative(-1.348f)
                curveToRelative(-0.146f, 0.039f, -0.312f, 0.05f, -0.47f, 0.05f)
                curveToRelative(-0.708f, 0.0f, -1.205f, -0.328f, -1.205f, -1.138f)
                lineTo(15.6f, 9.92f)
                horizontalLineToRelative(1.675f)
                lineTo(17.275f, 8.533f)
                horizontalLineToRelative(-1.671f)
                lineTo(15.604f, 6.818f)
                close()
                moveTo(20.873f, 8.4f)
                curveToRelative(-1.846f, 0.0f, -3.299f, 1.441f, -3.299f, 3.3f)
                curveToRelative(0.0f, 1.909f, 1.454f, 3.36f, 3.324f, 3.36f)
                curveToRelative(1.572f, 0.0f, 2.788f, -0.89f, 3.024f, -2.238f)
                horizontalLineToRelative(-1.467f)
                curveToRelative(-0.132f, 0.553f, -0.746f, 0.918f, -1.531f, 0.918f)
                curveToRelative(-1.034f, 0.0f, -1.688f, -0.589f, -1.871f, -1.531f)
                horizontalLineToRelative(4.908f)
                curveToRelative(0.026f, -0.12f, 0.039f, -0.445f, 0.039f, -0.617f)
                curveToRelative(0.0f, -1.87f, -1.399f, -3.192f, -3.127f, -3.192f)
                close()
                moveTo(0.0f, 8.533f)
                verticalLineToRelative(1.399f)
                horizontalLineToRelative(3.928f)
                lineTo(0.0f, 13.532f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(5.719f)
                verticalLineToRelative(-1.4f)
                horizontalLineToRelative(-3.94f)
                lineToRelative(3.94f, -3.6f)
                lineTo(5.719f, 8.533f)
                close()
                moveTo(6.037f, 8.533f)
                lineTo(8.577f, 14.592f)
                lineTo(7.426f, 17.182f)
                horizontalLineToRelative(1.57f)
                lineToRelative(3.611f, -8.649f)
                horizontalLineToRelative(-1.57f)
                lineToRelative(-1.715f, 4.358f)
                lineToRelative(-1.717f, -4.358f)
                close()
                moveTo(20.795f, 9.723f)
                curveToRelative(0.875f, 0.0f, 1.49f, 0.511f, 1.623f, 1.244f)
                horizontalLineToRelative(-3.324f)
                curveToRelative(0.21f, -0.786f, 0.838f, -1.244f, 1.7f, -1.244f)
                close()
            }
        }
        .build()
        return _zyte!!
    }

private var _zyte: ImageVector? = null
