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

public val RemixIcons.ThumbUpLine: ImageVector
    get() {
        if (_thumbUpLine != null) {
            return _thumbUpLine!!
        }
        _thumbUpLine = Builder(name = "ThumbUpLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6f, 8.0f)
                horizontalLineTo(21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(2.104f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.15f, 0.762f)
                lineToRelative(-3.095f, 7.515f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.925f, 0.619f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.482f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.817f, -0.423f)
                lineTo(11.752f, 0.85f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.632f, -0.159f)
                lineToRelative(1.814f, 0.907f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.305f, 2.853f)
                lineTo(14.6f, 8.0f)
                close()
                moveTo(7.0f, 10.588f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(11.16f)
                lineTo(21.0f, 12.104f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(-6.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.938f, -2.493f)
                lineToRelative(0.903f, -3.548f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.261f, -0.571f)
                lineToRelative(-0.661f, -0.33f)
                lineToRelative(-4.71f, 6.672f)
                curveToRelative(-0.25f, 0.354f, -0.57f, 0.644f, -0.933f, 0.858f)
                close()
                moveTo(5.0f, 11.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _thumbUpLine!!
    }

private var _thumbUpLine: ImageVector? = null
