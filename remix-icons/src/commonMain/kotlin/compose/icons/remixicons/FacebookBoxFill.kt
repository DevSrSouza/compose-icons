package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FacebookBoxFill: ImageVector
    get() {
        if (_facebookBoxFill != null) {
            return _facebookBoxFill!!
        }
        _facebookBoxFill = Builder(name = "FacebookBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.402f, 21.0f)
                verticalLineToRelative(-6.966f)
                horizontalLineToRelative(2.333f)
                lineToRelative(0.349f, -2.708f)
                horizontalLineToRelative(-2.682f)
                verticalLineTo(9.598f)
                curveToRelative(0.0f, -0.784f, 0.218f, -1.319f, 1.342f, -1.319f)
                horizontalLineToRelative(1.434f)
                verticalLineTo(5.857f)
                arcToRelative(19.19f, 19.19f, 0.0f, false, false, -2.09f, -0.107f)
                curveToRelative(-2.067f, 0.0f, -3.482f, 1.262f, -3.482f, 3.58f)
                verticalLineToRelative(1.996f)
                horizontalLineToRelative(-2.338f)
                verticalLineToRelative(2.708f)
                horizontalLineToRelative(2.338f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-4.598f)
                close()
            }
        }
        .build()
        return _facebookBoxFill!!
    }

private var _facebookBoxFill: ImageVector? = null
