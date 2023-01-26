package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FeaturedPlayList: ImageVector
    get() {
        if (_featuredPlayList != null) {
            return _featuredPlayList!!
        }
        _featuredPlayList = Builder(name = "FeaturedPlayList", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 3.0f)
                lineTo(1.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(22.0f)
                lineTo(23.0f, 3.0f)
                close()
                moveTo(12.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                lineTo(3.0f, 9.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 5.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _featuredPlayList!!
    }

private var _featuredPlayList: ImageVector? = null
