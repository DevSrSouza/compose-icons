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

public val SimpleIcons.Scrollreveal: ImageVector
    get() {
        if (_scrollreveal != null) {
            return _scrollreveal!!
        }
        _scrollreveal = Builder(name = "Scrollreveal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.714f, 2.857f)
                arcTo(1.71f, 1.71f, 0.0f, false, false, 0.0f, 4.571f)
                verticalLineToRelative(6.858f)
                curveToRelative(0.0f, 0.95f, 0.765f, 1.714f, 1.714f, 1.714f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, 1.715f, -1.714f)
                lineTo(3.429f, 4.57f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.715f, -1.714f)
                close()
                moveTo(8.571f, 2.857f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.714f, 1.714f)
                verticalLineToRelative(1.143f)
                curveToRelative(0.0f, 0.95f, 0.765f, 1.715f, 1.714f, 1.715f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, 1.715f, -1.715f)
                lineTo(10.286f, 4.571f)
                arcTo(1.71f, 1.71f, 0.0f, false, false, 8.57f, 2.857f)
                close()
                moveTo(15.429f, 2.857f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.715f, 1.714f)
                lineTo(13.714f, 19.43f)
                curveToRelative(0.0f, 0.95f, 0.765f, 1.714f, 1.715f, 1.714f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, 1.714f, -1.714f)
                lineTo(17.143f, 4.57f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.714f, -1.714f)
                close()
                moveTo(22.286f, 2.857f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.715f, 1.714f)
                verticalLineToRelative(6.858f)
                curveToRelative(0.0f, 0.95f, 0.765f, 1.714f, 1.715f, 1.714f)
                arcTo(1.71f, 1.71f, 0.0f, false, false, 24.0f, 11.429f)
                lineTo(24.0f, 4.57f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.714f, -1.714f)
                close()
                moveTo(8.571f, 10.857f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.714f, 1.714f)
                verticalLineToRelative(6.858f)
                curveToRelative(0.0f, 0.95f, 0.765f, 1.714f, 1.714f, 1.714f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, 1.715f, -1.714f)
                lineTo(10.286f, 12.57f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.715f, -1.714f)
                close()
                moveTo(1.714f, 16.571f)
                arcTo(1.71f, 1.71f, 0.0f, false, false, 0.0f, 18.286f)
                verticalLineToRelative(1.143f)
                curveToRelative(0.0f, 0.95f, 0.765f, 1.714f, 1.714f, 1.714f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, 1.715f, -1.714f)
                verticalLineToRelative(-1.143f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.715f, -1.715f)
                close()
                moveTo(22.286f, 16.571f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.715f, 1.715f)
                verticalLineToRelative(1.143f)
                curveToRelative(0.0f, 0.95f, 0.765f, 1.714f, 1.715f, 1.714f)
                arcTo(1.71f, 1.71f, 0.0f, false, false, 24.0f, 19.429f)
                verticalLineToRelative(-1.143f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -1.714f, -1.715f)
                close()
            }
        }
        .build()
        return _scrollreveal!!
    }

private var _scrollreveal: ImageVector? = null
