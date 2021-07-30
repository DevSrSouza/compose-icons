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

public val SimpleIcons.Hackhands: ImageVector
    get() {
        if (_hackhands != null) {
            return _hackhands!!
        }
        _hackhands = Builder(name = "Hackhands", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3f, 17.63f)
                horizontalLineToRelative(6.35f)
                curveToRelative(0.5f, 0.0f, 0.89f, -0.4f, 0.89f, -0.9f)
                reflectiveCurveToRelative(-0.4f, -0.89f, -0.9f, -0.89f)
                horizontalLineTo(5.3f)
                curveToRelative(-0.5f, 0.0f, -0.89f, 0.4f, -0.89f, 0.89f)
                curveToRelative(0.0f, 0.5f, 0.4f, 0.9f, 0.9f, 0.9f)
                close()
                moveTo(16.58f, 13.77f)
                curveToRelative(0.0f, -0.5f, -0.4f, -0.9f, -0.9f, -0.9f)
                horizontalLineTo(6.54f)
                curveToRelative(-0.5f, 0.0f, -0.89f, 0.4f, -0.89f, 0.9f)
                reflectiveCurveToRelative(0.4f, 0.9f, 0.9f, 0.9f)
                horizontalLineToRelative(9.15f)
                curveToRelative(0.5f, 0.0f, 0.9f, -0.4f, 0.9f, -0.9f)
                close()
                moveTo(18.44f, 10.8f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, -0.89f, -0.88f)
                horizontalLineTo(6.53f)
                curveToRelative(-0.5f, 0.0f, -0.89f, 0.39f, -0.89f, 0.89f)
                reflectiveCurveToRelative(0.4f, 0.89f, 0.9f, 0.89f)
                horizontalLineToRelative(11.01f)
                curveToRelative(0.5f, 0.0f, 0.89f, -0.4f, 0.89f, -0.9f)
                close()
                moveTo(5.64f, 7.82f)
                curveToRelative(0.0f, 0.5f, 0.4f, 0.89f, 0.9f, 0.89f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.49f, 0.0f, 0.88f, -0.4f, 0.88f, -0.9f)
                curveToRelative(0.0f, -0.49f, -0.4f, -0.88f, -0.89f, -0.88f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-0.5f, 0.0f, -0.89f, 0.39f, -0.89f, 0.89f)
                close()
                moveTo(7.92f, 3.96f)
                horizontalLineTo(5.3f)
                curveToRelative(-0.5f, 0.0f, -0.89f, 0.4f, -0.89f, 0.9f)
                reflectiveCurveToRelative(0.4f, 0.89f, 0.9f, 0.89f)
                horizontalLineToRelative(2.64f)
                curveToRelative(0.5f, 0.0f, 0.9f, -0.4f, 0.9f, -0.9f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, -0.93f, -0.89f)
                close()
                moveTo(22.87f, 20.8f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, -0.94f, -0.94f)
                horizontalLineTo(4.7f)
                curveToRelative(-0.95f, 0.0f, -1.73f, -0.8f, -1.73f, -1.74f)
                verticalLineTo(3.57f)
                curveToRelative(0.0f, -0.95f, 0.78f, -1.73f, 1.73f, -1.73f)
                horizontalLineToRelative(14.55f)
                curveToRelative(0.95f, 0.0f, 1.74f, 0.76f, 1.74f, 1.73f)
                verticalLineToRelative(11.8f)
                curveToRelative(0.0f, 0.5f, 0.42f, 0.92f, 0.9f, 0.92f)
                curveToRelative(0.51f, 0.0f, 0.93f, -0.42f, 0.93f, -0.92f)
                verticalLineTo(3.57f)
                curveToRelative(0.0f, -1.97f, -1.6f, -3.57f, -3.57f, -3.57f)
                horizontalLineTo(4.7f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, -3.57f, 3.57f)
                verticalLineToRelative(14.55f)
                curveToRelative(0.0f, 1.97f, 1.6f, 3.57f, 3.57f, 3.57f)
                horizontalLineTo(20.4f)
                lineTo(22.87f, 24.0f)
                verticalLineToRelative(-3.2f)
                close()
            }
        }
        .build()
        return _hackhands!!
    }

private var _hackhands: ImageVector? = null
