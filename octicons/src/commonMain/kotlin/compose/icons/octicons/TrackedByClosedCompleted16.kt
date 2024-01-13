package compose.icons.octicons

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
import compose.icons.Octicons

public val Octicons.TrackedByClosedCompleted16: ImageVector
    get() {
        if (_trackedByClosedCompleted16 != null) {
            return _trackedByClosedCompleted16!!
        }
        _trackedByClosedCompleted16 = Builder(name = "TrackedByClosedCompleted16", defaultWidth =
                16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
                16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 8.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 1.5f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.677f, 12.427f)
                lineToRelative(2.896f, 2.896f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.427f, -0.177f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.354f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.427f, -0.177f)
                lineToRelative(-2.896f, 2.896f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, 0.354f)
                close()
                moveTo(11.28f, 6.78f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(7.25f, 8.689f)
                lineTo(5.78f, 7.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _trackedByClosedCompleted16!!
    }

private var _trackedByClosedCompleted16: ImageVector? = null
