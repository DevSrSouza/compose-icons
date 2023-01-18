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

public val RemixIcons.GitRepositoryLine: ImageVector
    get() {
        if (_gitRepositoryLine != null) {
            return _gitRepositoryLine!!
        }
        _gitRepositoryLine = Builder(name = "GitRepositoryLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                verticalLineToRelative(2.5f)
                lineToRelative(-3.0f, -2.0f)
                lineToRelative(-3.0f, 2.0f)
                lineTo(7.0f, 21.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.0f, 17.5f)
                lineTo(3.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                lineTo(6.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 14.0f)
                lineTo(19.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(10.035f)
                arcTo(3.53f, 3.53f, 0.0f, false, true, 6.5f, 14.0f)
                lineTo(19.0f, 14.0f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 7.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(7.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 10.0f)
                lineTo(7.0f, 8.0f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _gitRepositoryLine!!
    }

private var _gitRepositoryLine: ImageVector? = null
