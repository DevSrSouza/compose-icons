package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Server16: ImageVector
    get() {
        if (_server16 != null) {
            return _server16!!
        }
        _server16 = Builder(name = "Server16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.75f, 1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 2.75f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.372f, 0.116f, 0.717f, 0.314f, 1.0f)
                arcToRelative(1.742f, 1.742f, 0.0f, false, false, -0.314f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 16.0f, 12.75f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.372f, -0.116f, -0.717f, -0.314f, -1.0f)
                curveToRelative(0.198f, -0.283f, 0.314f, -0.628f, 0.314f, -1.0f)
                verticalLineToRelative(-4.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.25f, 1.0f)
                lineTo(1.75f, 1.0f)
                close()
                moveTo(1.75f, 8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(1.75f, 8.5f)
                close()
                moveTo(1.5f, 2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                lineTo(1.75f, 7.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(7.0f, 4.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.75f, 4.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.0f, 4.75f)
                close()
                moveTo(7.75f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(3.0f, 4.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.75f, 4.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.0f, 4.75f)
                close()
                moveTo(3.75f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _server16!!
    }

private var _server16: ImageVector? = null
