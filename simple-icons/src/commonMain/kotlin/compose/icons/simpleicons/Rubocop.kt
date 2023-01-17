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

public val SimpleIcons.Rubocop: ImageVector
    get() {
        if (_rubocop != null) {
            return _rubocop!!
        }
        _rubocop = Builder(name = "Rubocop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.06f, 0.0f)
                curveTo(7.71f, 0.0f, 4.121f, 3.25f, 3.584f, 7.455f)
                horizontalLineToRelative(16.952f)
                curveTo(19.998f, 3.25f, 16.41f, 0.0f, 12.06f, 0.0f)
                close()
                moveTo(3.93f, 7.95f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, false, -1.537f, 1.537f)
                verticalLineToRelative(0.772f)
                curveToRelative(-0.358f, 0.22f, -0.598f, 0.613f, -0.598f, 1.06f)
                verticalLineToRelative(2.065f)
                curveToRelative(0.0f, 0.448f, 0.24f, 0.842f, 0.598f, 1.061f)
                verticalLineToRelative(0.802f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, false, 1.536f, 1.536f)
                horizontalLineToRelative(16.14f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, false, 1.536f, -1.536f)
                verticalLineToRelative(-0.802f)
                curveToRelative(0.358f, -0.22f, 0.6f, -0.612f, 0.6f, -1.06f)
                lineTo(22.205f, 11.32f)
                curveToRelative(0.0f, -0.448f, -0.242f, -0.842f, -0.6f, -1.061f)
                verticalLineToRelative(-0.772f)
                arcTo(1.54f, 1.54f, 0.0f, false, false, 20.07f, 7.95f)
                close()
                moveTo(5.4f, 11.096f)
                horizontalLineToRelative(13.2f)
                curveToRelative(0.622f, 0.0f, 1.132f, 0.51f, 1.132f, 1.134f)
                reflectiveCurveToRelative(-0.51f, 1.133f, -1.133f, 1.133f)
                lineTo(5.4f, 13.363f)
                curveToRelative(-0.624f, 0.0f, -1.134f, -0.51f, -1.134f, -1.133f)
                reflectiveCurveToRelative(0.51f, -1.134f, 1.134f, -1.134f)
                close()
                moveTo(3.98f, 17.094f)
                verticalLineToRelative(3.276f)
                arcTo(3.64f, 3.64f, 0.0f, false, false, 7.61f, 24.0f)
                horizontalLineToRelative(8.94f)
                arcToRelative(3.64f, 3.64f, 0.0f, false, false, 3.628f, -3.63f)
                verticalLineToRelative(-3.276f)
                horizontalLineToRelative(-1.995f)
                verticalLineToRelative(3.267f)
                curveToRelative(0.0f, 0.898f, -0.735f, 1.633f, -1.633f, 1.633f)
                horizontalLineToRelative(-0.89f)
                verticalLineToRelative(-0.003f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.48f, -0.23f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-1.063f, -1.358f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(0.622f, 0.622f, 0.0f, false, false, -0.488f, -0.245f)
                horizontalLineToRelative(-3.093f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, -0.463f, 0.214f)
                horizontalLineToRelative(-0.002f)
                lineTo(8.98f, 21.758f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.481f, 0.23f)
                verticalLineToRelative(0.004f)
                horizontalLineToRelative(-0.89f)
                arcToRelative(1.638f, 1.638f, 0.0f, false, true, -1.633f, -1.633f)
                verticalLineToRelative(-3.267f)
                close()
                moveTo(8.976f, 17.889f)
                lineTo(8.156f, 18.839f)
                lineTo(8.93f, 19.509f)
                lineTo(9.445f, 18.913f)
                horizontalLineToRelative(5.046f)
                lineToRelative(0.516f, 0.596f)
                lineToRelative(0.774f, -0.67f)
                lineToRelative(-0.82f, -0.95f)
                close()
            }
        }
        .build()
        return _rubocop!!
    }

private var _rubocop: ImageVector? = null
