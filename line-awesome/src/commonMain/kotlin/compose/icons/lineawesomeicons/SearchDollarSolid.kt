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

public val LineAwesomeIcons.SearchDollarSolid: ImageVector
    get() {
        if (_searchDollarSolid != null) {
            return _searchDollarSolid!!
        }
        _searchDollarSolid = Builder(name = "SearchDollarSolid", defaultWidth = 32.0.dp,
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
                moveTo(18.0f, 8.0f)
                lineTo(18.0f, 9.0625f)
                curveTo(16.875f, 9.2505f, 16.0f, 10.205f, 16.0f, 11.377f)
                curveTo(16.0f, 12.131f, 16.4177f, 12.8202f, 17.0938f, 13.1563f)
                lineTo(20.0f, 14.625f)
                curveTo(20.0f, 14.848f, 19.848f, 15.0f, 19.625f, 15.0f)
                lineTo(18.375f, 15.0f)
                curveTo(18.152f, 15.0f, 18.0f, 14.848f, 18.0f, 14.625f)
                lineTo(18.0f, 14.0f)
                lineTo(16.0f, 14.0f)
                lineTo(16.0f, 14.625f)
                curveTo(16.0f, 15.797f, 16.875f, 16.7495f, 18.0f, 16.9375f)
                lineTo(18.0f, 18.0f)
                lineTo(20.0f, 18.0f)
                lineTo(20.0f, 16.9375f)
                curveTo(21.125f, 16.7495f, 22.0f, 15.795f, 22.0f, 14.623f)
                curveTo(22.0f, 13.869f, 21.5823f, 13.1838f, 20.9063f, 12.8438f)
                lineTo(18.0f, 11.375f)
                curveTo(18.0f, 11.152f, 18.152f, 11.0f, 18.375f, 11.0f)
                lineTo(19.625f, 11.0f)
                curveTo(19.848f, 11.0f, 20.0f, 11.152f, 20.0f, 11.375f)
                lineTo(20.0f, 12.0f)
                lineTo(22.0f, 12.0f)
                lineTo(22.0f, 11.375f)
                curveTo(22.0f, 10.203f, 21.125f, 9.2505f, 20.0f, 9.0625f)
                lineTo(20.0f, 8.0f)
                lineTo(18.0f, 8.0f)
                close()
            }
        }
        .build()
        return _searchDollarSolid!!
    }

private var _searchDollarSolid: ImageVector? = null
