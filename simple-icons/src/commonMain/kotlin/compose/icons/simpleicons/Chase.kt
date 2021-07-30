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

public val SimpleIcons.Chase: ImageVector
    get() {
        if (_chase != null) {
            return _chase!!
        }
        _chase = Builder(name = "Chase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 15.415f)
                curveToRelative(0.0f, 0.468f, 0.38f, 0.85f, 0.848f, 0.85f)
                horizontalLineToRelative(5.937f)
                verticalLineTo(0.575f)
                lineTo(0.0f, 7.72f)
                verticalLineToRelative(7.695f)
                moveToRelative(15.416f, 8.582f)
                curveToRelative(0.467f, 0.0f, 0.846f, -0.38f, 0.846f, -0.849f)
                verticalLineToRelative(-5.937f)
                horizontalLineTo(0.573f)
                lineToRelative(7.146f, 6.785f)
                horizontalLineToRelative(7.697f)
                moveTo(24.0f, 8.587f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, false, -0.847f, -0.846f)
                horizontalLineToRelative(-5.938f)
                verticalLineTo(23.43f)
                lineToRelative(6.782f, -7.148f)
                lineTo(24.0f, 8.586f)
                moveTo(8.585f, 0.003f)
                arcToRelative(0.847f, 0.847f, 0.0f, false, false, -0.847f, 0.847f)
                verticalLineToRelative(5.94f)
                horizontalLineToRelative(15.688f)
                lineTo(16.282f, 0.003f)
                horizontalLineTo(8.585f)
                close()
            }
        }
        .build()
        return _chase!!
    }

private var _chase: ImageVector? = null
