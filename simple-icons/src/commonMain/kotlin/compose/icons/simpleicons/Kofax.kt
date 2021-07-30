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

public val SimpleIcons.Kofax: ImageVector
    get() {
        if (_kofax != null) {
            return _kofax!!
        }
        _kofax = Builder(name = "Kofax", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.38f, 12.94f)
                lineToRelative(0.576f, -0.5f)
                lineToRelative(1.273f, 1.698f)
                horizontalLineToRelative(1.835f)
                lineToRelative(-2.001f, -2.593f)
                lineToRelative(1.85f, -1.683f)
                horizontalLineToRelative(-1.82f)
                lineTo(1.38f, 11.545f)
                lineTo(1.38f, 9.862f)
                lineTo(0.0f, 9.862f)
                verticalLineToRelative(4.276f)
                horizontalLineToRelative(1.38f)
                close()
                moveTo(7.353f, 9.726f)
                curveToRelative(-1.455f, 0.0f, -2.683f, 0.5f, -2.683f, 2.274f)
                reflectiveCurveToRelative(1.228f, 2.274f, 2.683f, 2.274f)
                reflectiveCurveToRelative(2.684f, -0.5f, 2.684f, -2.274f)
                reflectiveCurveToRelative(-1.228f, -2.274f, -2.684f, -2.274f)
                close()
                moveTo(7.353f, 13.319f)
                curveToRelative(-0.728f, 0.0f, -1.228f, -0.41f, -1.228f, -1.319f)
                curveToRelative(0.0f, -0.894f, 0.5f, -1.319f, 1.228f, -1.319f)
                curveToRelative(0.743f, 0.0f, 1.228f, 0.425f, 1.228f, 1.32f)
                curveToRelative(0.0f, 0.894f, -0.5f, 1.318f, -1.228f, 1.318f)
                close()
                moveTo(11.795f, 14.138f)
                verticalLineToRelative(-1.653f)
                horizontalLineToRelative(2.365f)
                verticalLineToRelative(-0.925f)
                horizontalLineToRelative(-2.365f)
                verticalLineToRelative(-0.742f)
                horizontalLineToRelative(2.547f)
                verticalLineToRelative(-0.956f)
                horizontalLineToRelative(-3.926f)
                verticalLineToRelative(4.276f)
                close()
                moveTo(22.21f, 11.91f)
                lineToRelative(1.593f, -2.063f)
                horizontalLineToRelative(-1.638f)
                lineTo(21.407f, 11.0f)
                lineToRelative(-0.758f, -1.153f)
                horizontalLineToRelative(-1.637f)
                lineToRelative(1.592f, 2.062f)
                lineToRelative(-1.607f, 2.001f)
                lineToRelative(-1.668f, -4.048f)
                horizontalLineToRelative(-1.683f)
                lineToRelative(-1.759f, 4.276f)
                horizontalLineToRelative(1.471f)
                lineToRelative(0.243f, -0.698f)
                horizontalLineToRelative(1.804f)
                lineToRelative(0.242f, 0.698f)
                horizontalLineToRelative(2.896f)
                lineToRelative(0.88f, -1.289f)
                lineToRelative(0.879f, 1.289f)
                lineTo(24.0f, 14.138f)
                close()
                moveTo(15.934f, 12.561f)
                lineToRelative(0.576f, -1.622f)
                horizontalLineToRelative(0.015f)
                lineToRelative(0.577f, 1.622f)
                close()
            }
        }
        .build()
        return _kofax!!
    }

private var _kofax: ImageVector? = null
