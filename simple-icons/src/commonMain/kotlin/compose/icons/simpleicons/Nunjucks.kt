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

public val SimpleIcons.Nunjucks: ImageVector
    get() {
        if (_nunjucks != null) {
            return _nunjucks!!
        }
        _nunjucks = Builder(name = "Nunjucks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(8.2f, 10.1f)
                lineTo(8.2f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(17.3f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.7f, -2.5f, -1.4f, -5.0f, -2.2f, -7.5f)
                verticalLineToRelative(7.5f)
                lineTo(3.0f, 20.3f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.8f, 2.3f, 1.5f, 4.7f, 2.2f, 7.1f)
                close()
                moveTo(20.9f, 7.0f)
                verticalLineToRelative(11.6f)
                curveToRelative(0.0f, 0.2f, -0.1f, 0.7f, -0.5f, 1.1f)
                curveToRelative(-0.4f, 0.4f, -0.8f, 0.5f, -0.9f, 0.6f)
                horizontalLineToRelative(-5.1f)
                curveToRelative(-0.2f, 0.0f, -0.7f, -0.1f, -1.0f, -0.5f)
                curveToRelative(-0.4f, -0.4f, -0.5f, -0.9f, -0.6f, -1.2f)
                verticalLineToRelative(-3.8f)
                curveToRelative(1.0f, -0.2f, 2.0f, -0.5f, 3.0f, -0.7f)
                verticalLineToRelative(3.1f)
                horizontalLineToRelative(2.1f)
                lineTo(17.9f, 7.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(0.0f, 24.0f)
            }
        }
        .build()
        return _nunjucks!!
    }

private var _nunjucks: ImageVector? = null
