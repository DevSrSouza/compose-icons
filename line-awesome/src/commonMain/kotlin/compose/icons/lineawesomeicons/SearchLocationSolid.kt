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

public val LineAwesomeIcons.SearchLocationSolid: ImageVector
    get() {
        if (_searchLocationSolid != null) {
            return _searchLocationSolid!!
        }
        _searchLocationSolid = Builder(name = "SearchLocationSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                curveTo(13.489f, 3.0f, 9.0f, 7.489f, 9.0f, 13.0f)
                curveTo(9.0f, 15.395f, 9.839f, 17.5875f, 11.25f, 19.3125f)
                lineTo(3.2813f, 27.2813f)
                lineTo(4.7188f, 28.7207f)
                lineTo(12.6875f, 20.752f)
                curveTo(14.4115f, 22.162f, 16.605f, 23.0f, 19.0f, 23.0f)
                curveTo(24.511f, 23.0f, 29.0f, 18.511f, 29.0f, 13.0f)
                curveTo(29.0f, 7.489f, 24.511f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(19.0f, 5.0f)
                curveTo(23.43f, 5.0f, 27.0f, 8.57f, 27.0f, 13.0f)
                curveTo(27.0f, 17.43f, 23.43f, 21.0f, 19.0f, 21.0f)
                curveTo(14.57f, 21.0f, 11.0f, 17.43f, 11.0f, 13.0f)
                curveTo(11.0f, 8.57f, 14.57f, 5.0f, 19.0f, 5.0f)
                close()
                moveTo(19.0f, 8.0f)
                curveTo(16.791f, 8.0f, 15.0f, 9.791f, 15.0f, 12.0f)
                curveTo(15.0f, 15.0f, 19.0f, 19.0f, 19.0f, 19.0f)
                curveTo(19.0f, 19.0f, 23.0f, 15.0f, 23.0f, 12.0f)
                curveTo(23.0f, 9.791f, 21.209f, 8.0f, 19.0f, 8.0f)
                close()
                moveTo(19.0f, 10.0f)
                curveTo(20.105f, 10.0f, 21.0f, 10.895f, 21.0f, 12.0f)
                curveTo(21.0f, 13.104f, 20.105f, 14.0f, 19.0f, 14.0f)
                curveTo(17.895f, 14.0f, 17.0f, 13.104f, 17.0f, 12.0f)
                curveTo(17.0f, 10.895f, 17.895f, 10.0f, 19.0f, 10.0f)
                close()
            }
        }
        .build()
        return _searchLocationSolid!!
    }

private var _searchLocationSolid: ImageVector? = null
