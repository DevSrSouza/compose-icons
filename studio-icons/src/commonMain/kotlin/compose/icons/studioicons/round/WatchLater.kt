package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.WatchLater: ImageVector
    get() {
        if (_watchLater != null) {
            return _watchLater!!
        }
        _watchLater = Builder(name = "WatchLater", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.55f, 15.8f)
                lineToRelative(-4.08f, -2.51f)
                curveToRelative(-0.3f, -0.18f, -0.48f, -0.5f, -0.48f, -0.85f)
                verticalLineTo(7.75f)
                curveTo(11.0f, 7.34f, 11.34f, 7.0f, 11.75f, 7.0f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(4.45f)
                lineToRelative(3.84f, 2.31f)
                curveToRelative(0.36f, 0.22f, 0.48f, 0.69f, 0.26f, 1.05f)
                curveTo(16.38f, 15.91f, 15.91f, 16.02f, 15.55f, 15.8f)
                close()
            }
        }
        .build()
        return _watchLater!!
    }

private var _watchLater: ImageVector? = null
