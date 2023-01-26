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

public val RoundGroup.Usb: ImageVector
    get() {
        if (_usb != null) {
            return _usb!!
        }
        _usb = Builder(name = "Usb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.41f, 0.0f, 0.65f, -0.47f, 0.4f, -0.8f)
                lineToRelative(-2.0f, -2.67f)
                curveToRelative(-0.2f, -0.27f, -0.6f, -0.27f, -0.8f, 0.0f)
                lineToRelative(-2.0f, 2.67f)
                curveToRelative(-0.25f, 0.33f, -0.01f, 0.8f, 0.4f, 0.8f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.07f)
                curveToRelative(0.83f, -0.44f, 1.38f, -1.36f, 1.14f, -2.43f)
                curveToRelative(-0.17f, -0.77f, -0.77f, -1.4f, -1.52f, -1.61f)
                curveTo(6.15f, 6.48f, 4.8f, 7.59f, 4.8f, 9.0f)
                curveToRelative(0.0f, 0.85f, 0.5f, 1.56f, 1.2f, 1.93f)
                verticalLineTo(13.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.05f)
                curveToRelative(-0.86f, 0.45f, -1.39f, 1.42f, -1.13f, 2.49f)
                curveToRelative(0.18f, 0.75f, 0.79f, 1.38f, 1.54f, 1.58f)
                curveToRelative(1.46f, 0.39f, 2.8f, -0.7f, 2.8f, -2.12f)
                curveToRelative(0.0f, -0.85f, -0.49f, -1.58f, -1.2f, -1.95f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 7.45f, 18.55f, 7.0f, 18.0f, 7.0f)
                close()
            }
        }
        .build()
        return _usb!!
    }

private var _usb: ImageVector? = null
