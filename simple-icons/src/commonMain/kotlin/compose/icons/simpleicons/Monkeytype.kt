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

public val SimpleIcons.Monkeytype: ImageVector
    get() {
        if (_monkeytype != null) {
            return _monkeytype!!
        }
        _monkeytype = Builder(name = "Monkeytype", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, 0.0f, 1.6f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.0f, -1.6f)
                close()
                moveTo(8.8f, 14.4f)
                horizontalLineToRelative(4.8f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, 0.0f, 1.6f)
                horizontalLineTo(8.8f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, 0.0f, -1.6f)
                close()
                moveTo(7.2f, 9.6f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.8f, 0.8f)
                verticalLineTo(12.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, -1.6f, 0.0f)
                verticalLineToRelative(-1.6f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.8f, -0.8f)
                close()
                moveTo(3.201f, 10.359f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 7.2f, 8.612f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 4.0f, 1.788f)
                verticalLineTo(12.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, -1.6f, 0.0f)
                verticalLineToRelative(-1.6f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, false, -1.6f, 0.0f)
                verticalLineTo(12.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, -1.6f, 0.0f)
                verticalLineToRelative(-1.6f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, false, -1.6f, 0.0f)
                verticalLineTo(12.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, -1.6f, 0.0f)
                verticalLineToRelative(-1.6f)
                lineToRelative(0.001f, -0.041f)
                close()
                moveTo(17.6f, 12.8f)
                verticalLineToRelative(2.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, -1.6f, 0.0f)
                verticalLineToRelative(-2.4f)
                horizontalLineToRelative(-2.306f)
                curveToRelative(-0.493f, 0.0f, -0.894f, -0.358f, -0.894f, -0.8f)
                curveToRelative(0.0f, -0.442f, 0.401f, -0.8f, 0.894f, -0.8f)
                horizontalLineToRelative(6.212f)
                curveToRelative(0.493f, 0.0f, 0.894f, 0.358f, 0.894f, 0.8f)
                curveToRelative(0.0f, 0.442f, -0.401f, 0.8f, -0.894f, 0.8f)
                horizontalLineTo(17.6f)
                close()
                moveTo(16.8f, 8.0f)
                horizontalLineTo(20.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, 0.0f, 1.6f)
                horizontalLineToRelative(-3.2f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, 0.0f, -1.6f)
                close()
                moveTo(4.0f, 14.4f)
                horizontalLineToRelative(1.6f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, 0.0f, 1.6f)
                horizontalLineTo(4.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, 0.0f, -1.6f)
                close()
                moveTo(13.2f, 8.0f)
                horizontalLineToRelative(0.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, 0.0f, 1.6f)
                horizontalLineToRelative(-0.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, true, true, 0.0f, -1.6f)
                close()
                moveTo(1.6f, 14.4f)
                horizontalLineTo(0.0f)
                verticalLineTo(8.8f)
                curveToRelative(0.0f, -2.208f, 1.792f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.208f, 0.0f, 4.0f, 1.792f, 4.0f, 4.0f)
                verticalLineToRelative(6.4f)
                curveToRelative(0.0f, 2.208f, -1.792f, 4.0f, -4.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-2.208f, 0.0f, -4.0f, -1.792f, -4.0f, -4.0f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(1.6f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 4.0f, 17.6f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.4f, -2.4f)
                verticalLineTo(8.8f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 20.0f, 6.4f)
                horizontalLineTo(4.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -2.4f, 2.4f)
                verticalLineToRelative(5.6f)
                close()
            }
        }
        .build()
        return _monkeytype!!
    }

private var _monkeytype: ImageVector? = null
