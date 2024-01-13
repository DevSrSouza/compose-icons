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

public val SimpleIcons.Webflow: ImageVector
    get() {
        if (_webflow != null) {
            return _webflow!!
        }
        _webflow = Builder(name = "Webflow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.515f)
                lineToRelative(-7.658f, 14.97f)
                horizontalLineTo(9.149f)
                lineToRelative(3.205f, -6.204f)
                horizontalLineToRelative(-0.144f)
                curveTo(9.566f, 16.713f, 5.621f, 18.973f, 0.0f, 19.485f)
                verticalLineToRelative(-6.118f)
                reflectiveCurveToRelative(3.596f, -0.213f, 5.71f, -2.435f)
                horizontalLineTo(0.0f)
                verticalLineTo(4.515f)
                horizontalLineToRelative(6.417f)
                verticalLineToRelative(5.278f)
                lineToRelative(0.144f, -0.001f)
                lineToRelative(2.622f, -5.277f)
                horizontalLineToRelative(4.854f)
                verticalLineToRelative(5.244f)
                horizontalLineToRelative(0.144f)
                lineToRelative(2.72f, -5.244f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _webflow!!
    }

private var _webflow: ImageVector? = null
