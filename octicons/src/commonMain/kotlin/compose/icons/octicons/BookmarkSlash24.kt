package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.BookmarkSlash24: ImageVector
    get() {
        if (_bookmarkSlash24 != null) {
            return _bookmarkSlash24!!
        }
        _bookmarkSlash24 = Builder(name = "BookmarkSlash24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.565f, 2.018f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.88f, 1.214f)
                lineTo(5.0f, 6.357f)
                verticalLineToRelative(14.902f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.219f, 0.585f)
                lineTo(12.0f, 17.21f)
                lineToRelative(5.781f, 4.633f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 19.0f, 21.259f)
                verticalLineToRelative(-4.764f)
                lineToRelative(3.435f, 2.487f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.88f, -1.215f)
                lineTo(1.565f, 2.017f)
                close()
                moveTo(17.5f, 15.408f)
                lineToRelative(-11.0f, -7.965f)
                verticalLineToRelative(12.254f)
                lineToRelative(5.031f, -4.032f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.938f, 0.0f)
                lineToRelative(5.031f, 4.032f)
                verticalLineToRelative(-4.288f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-6.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 17.25f, 2.0f)
                horizontalLineToRelative(-10.0f)
                close()
            }
        }
        .build()
        return _bookmarkSlash24!!
    }

private var _bookmarkSlash24: ImageVector? = null
