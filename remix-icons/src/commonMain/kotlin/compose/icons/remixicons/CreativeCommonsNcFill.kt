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

public val RemixIcons.CreativeCommonsNcFill: ImageVector
    get() {
        if (_creativeCommonsNcFill != null) {
            return _creativeCommonsNcFill!!
        }
        _creativeCommonsNcFill = Builder(name = "CreativeCommonsNcFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.256f, 5.672f)
                lineToRelative(3.58f, 3.577f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.0f, 3.746f)
                lineTo(10.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.09f, 0.008f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.984f)
                lineTo(14.0f, 14.0f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.121f, 0.0f, 0.24f, -0.009f, 0.357f, -0.025f)
                lineToRelative(0.173f, -0.031f)
                lineToRelative(3.798f, 3.8f)
                arcTo(9.959f, 9.959f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveToRelative(0.0f, -2.4f, 0.846f, -4.604f, 2.256f, -6.328f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                curveToRelative(0.0f, 2.4f, -0.846f, 4.604f, -2.256f, 6.328f)
                lineToRelative(-3.579f, -3.577f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.0f, -3.745f)
                lineTo(14.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-0.09f, -0.008f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.984f)
                lineTo(10.0f, 10.0f)
                horizontalLineToRelative(5.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.121f, 0.0f, -0.24f, 0.009f, -0.356f, 0.025f)
                lineToRelative(-0.173f, 0.031f)
                lineToRelative(-3.799f, -3.8f)
                arcTo(9.959f, 9.959f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsNcFill!!
    }

private var _creativeCommonsNcFill: ImageVector? = null
