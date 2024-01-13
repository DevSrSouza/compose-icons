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

public val Octicons.TrackedByClosedNotPlanned24: ImageVector
    get() {
        if (_trackedByClosedNotPlanned24 != null) {
            return _trackedByClosedNotPlanned24!!
        }
        _trackedByClosedNotPlanned24 = Builder(name = "TrackedByClosedNotPlanned24", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 2.5f, 12.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                curveTo(5.925f, 23.0f, 1.0f, 18.075f, 1.0f, 12.0f)
                reflectiveCurveTo(5.925f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveToRelative(11.0f, 4.925f, 11.0f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 12.0f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.759f, 17.48f)
                lineToRelative(3.728f, 3.314f)
                arcToRelative(0.308f, 0.308f, 0.0f, false, false, 0.513f, -0.23f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(18.0f, 16.5f)
                verticalLineToRelative(-2.564f)
                arcToRelative(0.308f, 0.308f, 0.0f, false, false, -0.513f, -0.23f)
                lineToRelative(-3.728f, 3.314f)
                arcToRelative(0.307f, 0.307f, 0.0f, false, false, 0.0f, 0.46f)
                close()
                moveTo(17.28f, 7.78f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-9.5f, 9.5f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(9.5f, -9.5f)
                close()
            }
        }
        .build()
        return _trackedByClosedNotPlanned24!!
    }

private var _trackedByClosedNotPlanned24: ImageVector? = null
