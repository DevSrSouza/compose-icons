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

public val SimpleIcons.Tmobile: ImageVector
    get() {
        if (_tmobile != null) {
            return _tmobile!!
        }
        _tmobile = Builder(name = "Tmobile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.722f, 15.84f)
                horizontalLineToRelative(-4.8f)
                verticalLineToRelative(-4.8f)
                horizontalLineToRelative(4.791f)
                verticalLineToRelative(4.8f)
                close()
                moveTo(1.922f, 0.0f)
                verticalLineToRelative(8.16f)
                lineTo(3.36f, 8.16f)
                verticalLineToRelative(-0.236f)
                curveToRelative(0.0f, -3.844f, 2.159f, -6.24f, 6.239f, -6.24f)
                horizontalLineToRelative(0.237f)
                verticalLineToRelative(17.279f)
                curveToRelative(0.0f, 2.396f, -0.957f, 3.36f, -3.36f, 3.36f)
                horizontalLineToRelative(-0.72f)
                lineTo(5.756f, 24.0f)
                horizontalLineToRelative(12.478f)
                verticalLineToRelative(-1.676f)
                horizontalLineToRelative(-0.72f)
                curveToRelative(-2.395f, 0.0f, -3.36f, -0.957f, -3.36f, -3.361f)
                lineTo(14.154f, 1.676f)
                horizontalLineToRelative(0.237f)
                curveToRelative(4.08f, 0.0f, 6.239f, 2.396f, 6.239f, 6.24f)
                verticalLineToRelative(0.236f)
                horizontalLineToRelative(1.439f)
                lineTo(22.069f, 0.0f)
                close()
                moveTo(17.278f, 15.84f)
                horizontalLineToRelative(4.8f)
                verticalLineToRelative(-4.8f)
                horizontalLineToRelative(-4.791f)
                verticalLineToRelative(4.8f)
                close()
            }
        }
        .build()
        return _tmobile!!
    }

private var _tmobile: ImageVector? = null
