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

public val SimpleIcons.Diagramsdotnet: ImageVector
    get() {
        if (_diagramsdotnet != null) {
            return _diagramsdotnet!!
        }
        _diagramsdotnet = Builder(name = "Diagramsdotnet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.69f, 13.419f)
                horizontalLineToRelative(-2.527f)
                lineToRelative(-2.667f, -4.555f)
                arcToRelative(1.292f, 1.292f, 0.0f, false, false, 1.035f, -1.28f)
                verticalLineTo(4.16f)
                curveToRelative(0.0f, -0.725f, -0.576f, -1.312f, -1.302f, -1.312f)
                horizontalLineTo(9.771f)
                curveToRelative(-0.726f, 0.0f, -1.312f, 0.576f, -1.312f, 1.301f)
                verticalLineToRelative(3.435f)
                curveToRelative(0.0f, 0.619f, 0.426f, 1.152f, 1.034f, 1.28f)
                lineToRelative(-2.666f, 4.555f)
                horizontalLineTo(4.309f)
                curveToRelative(-0.725f, 0.0f, -1.312f, 0.576f, -1.312f, 1.301f)
                verticalLineToRelative(3.435f)
                curveToRelative(0.0f, 0.725f, 0.576f, 1.312f, 1.302f, 1.312f)
                horizontalLineToRelative(4.458f)
                curveToRelative(0.726f, 0.0f, 1.312f, -0.576f, 1.312f, -1.302f)
                verticalLineToRelative(-3.434f)
                curveToRelative(0.0f, -0.726f, -0.576f, -1.312f, -1.301f, -1.312f)
                horizontalLineToRelative(-0.437f)
                lineToRelative(2.645f, -4.523f)
                horizontalLineToRelative(2.059f)
                lineToRelative(2.656f, 4.523f)
                horizontalLineToRelative(-0.438f)
                curveToRelative(-0.725f, 0.0f, -1.312f, 0.576f, -1.312f, 1.301f)
                verticalLineToRelative(3.435f)
                curveToRelative(0.0f, 0.725f, 0.576f, 1.312f, 1.302f, 1.312f)
                horizontalLineTo(19.7f)
                curveToRelative(0.726f, 0.0f, 1.312f, -0.576f, 1.312f, -1.302f)
                verticalLineToRelative(-3.434f)
                curveToRelative(0.0f, -0.726f, -0.576f, -1.312f, -1.301f, -1.312f)
                close()
                moveTo(24.0f, 22.976f)
                curveToRelative(0.0f, 0.565f, -0.459f, 1.024f, -1.013f, 1.024f)
                horizontalLineTo(1.024f)
                arcTo(1.022f, 1.022f, 0.0f, false, true, 0.0f, 22.987f)
                verticalLineTo(1.024f)
                curveTo(0.0f, 0.459f, 0.459f, 0.0f, 1.013f, 0.0f)
                horizontalLineToRelative(21.963f)
                curveTo(23.541f, 0.0f, 24.0f, 0.459f, 24.0f, 1.013f)
                close()
            }
        }
        .build()
        return _diagramsdotnet!!
    }

private var _diagramsdotnet: ImageVector? = null
