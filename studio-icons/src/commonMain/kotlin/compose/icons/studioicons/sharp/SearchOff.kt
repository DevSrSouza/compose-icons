package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SearchOff: ImageVector
    get() {
        if (_searchOff != null) {
            return _searchOff!!
        }
        _searchOff = Builder(name = "SearchOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 14.0f)
                horizontalLineToRelative(-0.79f)
                lineToRelative(-0.28f, -0.27f)
                curveTo(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f)
                curveTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f)
                curveTo(6.08f, 3.0f, 3.28f, 5.64f, 3.03f, 9.0f)
                horizontalLineToRelative(2.02f)
                curveTo(5.3f, 6.75f, 7.18f, 5.0f, 9.5f, 5.0f)
                curveTo(11.99f, 5.0f, 14.0f, 7.01f, 14.0f, 9.5f)
                reflectiveCurveTo(11.99f, 14.0f, 9.5f, 14.0f)
                curveToRelative(-0.17f, 0.0f, -0.33f, -0.03f, -0.5f, -0.05f)
                verticalLineToRelative(2.02f)
                curveTo(9.17f, 15.99f, 9.33f, 16.0f, 9.5f, 16.0f)
                curveToRelative(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f)
                lineTo(14.0f, 14.71f)
                verticalLineToRelative(0.79f)
                lineToRelative(5.0f, 4.99f)
                lineTo(20.49f, 19.0f)
                lineTo(15.5f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.47f, 10.82f)
                lineToRelative(-2.47f, 2.47f)
                lineToRelative(-2.47f, -2.47f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(-2.47f, 2.47f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.47f, -2.47f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-2.47f, -2.47f)
                lineToRelative(2.47f, -2.47f)
                close()
            }
        }
        .build()
        return _searchOff!!
    }

private var _searchOff: ImageVector? = null
