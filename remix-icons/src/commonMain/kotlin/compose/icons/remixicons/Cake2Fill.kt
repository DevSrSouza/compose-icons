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

public val RemixIcons.Cake2Fill: ImageVector
    get() {
        if (_cake2Fill != null) {
            return _cake2Fill!!
        }
        _cake2Fill = Builder(name = "Cake2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 6.0f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.999f)
                lineTo(19.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, 2.824f)
                lineTo(22.0f, 13.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.014f, -0.377f, 1.94f, -0.999f, 2.645f)
                lineTo(21.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-4.36f)
                arcToRelative(4.025f, 4.025f, 0.0f, false, true, -0.972f, -2.182f)
                lineToRelative(-0.022f, -0.253f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.824f, -2.995f)
                lineTo(5.0f, 10.0f)
                lineToRelative(1.0f, -0.001f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(0.971f)
                lineToRelative(0.003f, 0.147f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 16.0f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, false, 1.98f, -1.7f)
                lineToRelative(0.015f, -0.153f)
                lineToRelative(0.005f, -0.176f)
                curveToRelative(0.036f, -1.248f, 1.827f, -1.293f, 1.989f, -0.134f)
                lineToRelative(0.01f, 0.134f)
                lineToRelative(0.004f, 0.147f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.992f, 0.031f)
                lineToRelative(0.012f, -0.282f)
                curveToRelative(0.124f, -1.156f, 1.862f, -1.156f, 1.986f, 0.0f)
                lineToRelative(0.012f, 0.282f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.99f, 0.0f)
                lineTo(20.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, -0.993f)
                lineTo(19.0f, 12.0f)
                close()
                moveTo(7.0f, 1.0f)
                curveToRelative(1.32f, 0.871f, 1.663f, 2.088f, 1.449f, 2.888f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.898f, -0.776f)
                curveTo(5.85f, 2.002f, 7.0f, 2.5f, 7.0f, 1.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveToRelative(1.32f, 0.871f, 1.663f, 2.088f, 1.449f, 2.888f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.898f, -0.776f)
                curveTo(10.85f, 2.002f, 12.0f, 2.5f, 12.0f, 1.0f)
                close()
                moveTo(17.0f, 1.0f)
                curveToRelative(1.32f, 0.871f, 1.663f, 2.088f, 1.449f, 2.888f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.898f, -0.776f)
                curveTo(15.85f, 2.002f, 17.0f, 2.5f, 17.0f, 1.0f)
                close()
            }
        }
        .build()
        return _cake2Fill!!
    }

private var _cake2Fill: ImageVector? = null
