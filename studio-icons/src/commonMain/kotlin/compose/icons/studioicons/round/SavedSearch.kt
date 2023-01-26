package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SavedSearch: ImageVector
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
                curveToRelative(1.13f, -1.55f, 1.63f, -3.58f, 0.98f, -5.74f)
                curveToRelative(-0.68f, -2.23f, -2.57f, -3.98f, -4.85f, -4.44f)
                curveTo(6.21f, 2.2f, 2.2f, 6.22f, 3.14f, 10.86f)
                curveToRelative(0.46f, 2.29f, 2.21f, 4.18f, 4.44f, 4.85f)
                curveToRelative(2.16f, 0.65f, 4.19f, 0.15f, 5.74f, -0.98f)
                lineToRelative(5.56f, 5.56f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
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
                moveTo(10.29f, 8.44f)
                lineToRelative(-0.79f, -2.44f)
                lineToRelative(-0.79f, 2.44f)
                lineToRelative(-2.46f, 0.0f)
                lineToRelative(2.01f, 1.59f)
                lineToRelative(-0.77f, 2.47f)
                lineToRelative(2.01f, -1.53f)
                lineToRelative(2.01f, 1.53f)
                lineToRelative(-0.77f, -2.47f)
                lineToRelative(2.01f, -1.59f)
                close()
            }
        }
        .build()
        return _savedSearch!!
    }

private var _savedSearch: ImageVector? = null
