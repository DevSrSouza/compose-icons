package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.SearchSolid: ImageVector
    get() {
        if (_searchSolid != null) {
            return _searchSolid!!
        }
        _searchSolid = Builder(name = "SearchSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                curveTo(13.488f, 3.0f, 9.0f, 7.488f, 9.0f, 13.0f)
                curveTo(9.0f, 15.395f, 9.84f, 17.59f, 11.25f, 19.313f)
                lineTo(3.281f, 27.281f)
                lineTo(4.719f, 28.719f)
                lineTo(12.688f, 20.75f)
                curveTo(14.41f, 22.16f, 16.605f, 23.0f, 19.0f, 23.0f)
                curveTo(24.512f, 23.0f, 29.0f, 18.512f, 29.0f, 13.0f)
                curveTo(29.0f, 7.488f, 24.512f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(19.0f, 5.0f)
                curveTo(23.43f, 5.0f, 27.0f, 8.57f, 27.0f, 13.0f)
                curveTo(27.0f, 17.43f, 23.43f, 21.0f, 19.0f, 21.0f)
                curveTo(14.57f, 21.0f, 11.0f, 17.43f, 11.0f, 13.0f)
                curveTo(11.0f, 8.57f, 14.57f, 5.0f, 19.0f, 5.0f)
                close()
            }
        }
        .build()
        return _searchSolid!!
    }

private var _searchSolid: ImageVector? = null
