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

public val SimpleIcons.Rome: ImageVector
    get() {
        if (_rome != null) {
            return _rome!!
        }
        _rome = Builder(name = "Rome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(16.941f, 16.941f, 0.0f, false, false, -2.283f, 0.154f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, false, -0.485f, 0.895f)
                lineToRelative(0.172f, 0.361f)
                lineToRelative(1.338f, 2.8f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, false, 0.608f, 0.356f)
                arcToRelative(11.695f, 11.695f, 0.0f, false, true, 1.3f, 0.0f)
                arcToRelative(0.632f, 0.632f, 0.0f, false, false, 0.608f, -0.355f)
                lineToRelative(1.338f, -2.8f)
                lineToRelative(0.172f, -0.362f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, false, -0.485f, -0.895f)
                arcTo(16.941f, 16.941f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(16.309f, 1.902f)
                arcToRelative(0.629f, 0.629f, 0.0f, false, false, -0.786f, 0.32f)
                lineToRelative(-0.949f, 1.989f)
                arcToRelative(0.629f, 0.629f, 0.0f, false, false, 0.36f, 0.863f)
                curveToRelative(3.193f, 1.134f, 5.466f, 4.063f, 5.466f, 7.498f)
                verticalLineToRelative(0.627f)
                lineTo(24.0f, 13.199f)
                verticalLineToRelative(-0.627f)
                curveToRelative(0.0f, -4.864f, -3.191f, -9.021f, -7.691f, -10.67f)
                close()
                moveTo(7.689f, 1.904f)
                curveTo(3.191f, 3.551f, 0.0f, 7.706f, 0.0f, 12.572f)
                verticalLineToRelative(0.627f)
                horizontalLineToRelative(3.6f)
                verticalLineToRelative(-0.627f)
                curveToRelative(0.0f, -3.435f, 2.275f, -6.364f, 5.466f, -7.498f)
                arcToRelative(0.629f, 0.629f, 0.0f, false, false, 0.358f, -0.863f)
                lineToRelative(-0.95f, -1.986f)
                arcToRelative(0.629f, 0.629f, 0.0f, false, false, -0.785f, -0.32f)
                close()
                moveTo(12.0f, 5.714f)
                curveToRelative(-3.976f, 0.0f, -7.2f, 3.07f, -7.2f, 6.858f)
                lineTo(4.8f, 24.0f)
                horizontalLineToRelative(3.6f)
                lineTo(8.4f, 12.572f)
                curveToRelative(0.0f, -1.895f, 1.612f, -3.43f, 3.6f, -3.43f)
                reflectiveCurveToRelative(3.6f, 1.536f, 3.6f, 3.43f)
                lineTo(15.6f, 24.0f)
                horizontalLineToRelative(3.6f)
                lineTo(19.2f, 12.572f)
                curveToRelative(0.0f, -3.787f, -3.224f, -6.857f, -7.2f, -6.857f)
                close()
                moveTo(0.0f, 14.4f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(3.6f)
                verticalLineToRelative(-9.6f)
                close()
                moveTo(20.4f, 14.4f)
                lineTo(20.4f, 24.0f)
                lineTo(24.0f, 24.0f)
                verticalLineToRelative(-9.6f)
                close()
            }
        }
        .build()
        return _rome!!
    }

private var _rome: ImageVector? = null
