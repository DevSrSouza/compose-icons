package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ExtensionOff: ImageVector
    get() {
        if (_extensionOff != null) {
            return _extensionOff!!
        }
        _extensionOff = Builder(name = "ExtensionOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.49f, 21.9f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-0.92f, -0.92f)
                curveTo(18.1f, 20.98f, 18.05f, 21.0f, 18.0f, 21.0f)
                horizontalLineToRelative(-3.8f)
                curveToRelative(0.0f, -2.71f, -2.16f, -3.0f, -2.7f, -3.0f)
                reflectiveCurveToRelative(-2.7f, 0.29f, -2.7f, 3.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-3.8f)
                curveToRelative(2.71f, 0.0f, 3.0f, -2.16f, 3.0f, -2.7f)
                curveToRelative(0.0f, -0.54f, -0.3f, -2.7f, -2.99f, -2.7f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.05f, 0.02f, -0.09f, 0.02f, -0.14f)
                lineTo(2.1f, 4.93f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(16.97f, 16.97f)
                curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f)
                lineTo(20.49f, 21.9f)
                close()
                moveTo(20.0f, 17.17f)
                verticalLineTo(15.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(21.38f, 10.0f, 20.0f, 10.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(9.0f, 2.62f, 9.0f, 4.0f)
                horizontalLineTo(6.83f)
                lineTo(20.0f, 17.17f)
                close()
            }
        }
        .build()
        return _extensionOff!!
    }

private var _extensionOff: ImageVector? = null
