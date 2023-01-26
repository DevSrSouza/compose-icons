package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.SavedSearch: ImageVector
    get() {
        if (_savedSearch != null) {
            return _savedSearch!!
        }
        _savedSearch = Builder(name = "SavedSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.73f, 13.31f)
                curveTo(15.52f, 12.24f, 16.0f, 10.93f, 16.0f, 9.5f)
                curveTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f)
                reflectiveCurveTo(3.0f, 5.91f, 3.0f, 9.5f)
                curveTo(3.0f, 13.09f, 5.91f, 16.0f, 9.5f, 16.0f)
                curveToRelative(1.43f, 0.0f, 2.74f, -0.48f, 3.81f, -1.27f)
                lineTo(19.59f, 21.0f)
                lineTo(21.0f, 19.59f)
                lineTo(14.73f, 13.31f)
                close()
                moveTo(9.5f, 14.0f)
                curveTo(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f)
                reflectiveCurveTo(7.01f, 5.0f, 9.5f, 5.0f)
                reflectiveCurveTo(14.0f, 7.01f, 14.0f, 9.5f)
                reflectiveCurveTo(11.99f, 14.0f, 9.5f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 6.0f)
                lineToRelative(-0.79f, 2.44f)
                lineToRelative(-2.46f, 0.0f)
                lineToRelative(2.01f, 1.59f)
                lineToRelative(-0.77f, 2.47f)
                lineToRelative(2.01f, -1.53f)
                lineToRelative(2.01f, 1.53f)
                lineToRelative(-0.77f, -2.47f)
                lineToRelative(2.01f, -1.59f)
                lineToRelative(-2.46f, 0.0f)
                close()
            }
        }
        .build()
        return _savedSearch!!
    }

private var _savedSearch: ImageVector? = null
