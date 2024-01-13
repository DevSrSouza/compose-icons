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

public val SimpleIcons.Abbott: ImageVector
    get() {
        if (_abbott != null) {
            return _abbott!!
        }
        _abbott = Builder(name = "Abbott", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.812f, 2.4f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.197f)
                horizontalLineToRelative(19.773f)
                verticalLineTo(5.6f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, true, 1.032f, 1.031f)
                verticalLineToRelative(10.742f)
                lineToRelative(-0.004f, 0.007f)
                arcToRelative(1.034f, 1.034f, 0.0f, false, true, -1.034f, 1.025f)
                horizontalLineTo(4.23f)
                curveToRelative(-0.569f, 0.0f, -1.033f, -0.46f, -1.033f, -1.033f)
                verticalLineToRelative(-4.34f)
                curveToRelative(0.0f, -0.57f, 0.464f, -1.032f, 1.033f, -1.032f)
                horizontalLineTo(17.6f)
                verticalLineTo(8.803f)
                horizontalLineTo(3.188f)
                arcTo(3.185f, 3.185f, 0.0f, false, false, 0.0f, 11.99f)
                verticalLineToRelative(6.423f)
                arcTo(3.188f, 3.188f, 0.0f, false, false, 3.188f, 21.6f)
                horizontalLineToRelative(17.624f)
                arcTo(3.187f, 3.187f, 0.0f, false, false, 24.0f, 18.412f)
                verticalLineTo(5.587f)
                arcTo(3.186f, 3.186f, 0.0f, false, false, 20.812f, 2.4f)
            }
        }
        .build()
        return _abbott!!
    }

private var _abbott: ImageVector? = null
