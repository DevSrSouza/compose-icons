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

public val SimpleIcons.Toml: ImageVector
    get() {
        if (_toml != null) {
            return _toml!!
        }
        _toml = Builder(name = "Toml", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.014f, 0.0f)
                horizontalLineToRelative(5.34f)
                verticalLineToRelative(2.652f)
                lineTo(2.888f, 2.652f)
                verticalLineToRelative(18.681f)
                horizontalLineToRelative(2.468f)
                lineTo(5.356f, 24.0f)
                lineTo(0.015f, 24.0f)
                lineTo(0.015f, 0.0f)
                close()
                moveTo(17.636f, 5.049f)
                verticalLineToRelative(2.78f)
                horizontalLineToRelative(-4.274f)
                verticalLineToRelative(12.935f)
                horizontalLineToRelative(-3.008f)
                lineTo(10.354f, 7.83f)
                lineTo(6.059f, 7.83f)
                lineTo(6.059f, 5.05f)
                horizontalLineToRelative(11.577f)
                close()
                moveTo(23.986f, 24.0f)
                horizontalLineToRelative(-5.34f)
                verticalLineToRelative(-2.652f)
                horizontalLineToRelative(2.467f)
                lineTo(21.113f, 2.667f)
                horizontalLineToRelative(-2.468f)
                lineTo(18.645f, 0.0f)
                horizontalLineToRelative(5.34f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _toml!!
    }

private var _toml: ImageVector? = null
