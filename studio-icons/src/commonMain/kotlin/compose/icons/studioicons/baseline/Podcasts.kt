package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Podcasts: ImageVector
    get() {
        if (_podcasts != null) {
            return _podcasts!!
        }
        _podcasts = Builder(name = "Podcasts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, 0.74f, -0.4f, 1.38f, -1.0f, 1.72f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.28f)
                curveToRelative(-0.6f, -0.35f, -1.0f, -0.98f, -1.0f, -1.72f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f)
                curveToRelative(0.0f, 1.74f, 0.75f, 3.31f, 1.94f, 4.4f)
                lineToRelative(1.42f, -1.42f)
                curveTo(8.53f, 14.25f, 8.0f, 13.19f, 8.0f, 12.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.19f, -0.53f, 2.25f, -1.36f, 2.98f)
                lineToRelative(1.42f, 1.42f)
                curveTo(17.25f, 15.31f, 18.0f, 13.74f, 18.0f, 12.0f)
                curveTo(18.0f, 8.69f, 15.31f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 2.85f, 1.2f, 5.41f, 3.11f, 7.24f)
                lineToRelative(1.42f, -1.42f)
                curveTo(4.98f, 16.36f, 4.0f, 14.29f, 4.0f, 12.0f)
                curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f)
                curveToRelative(0.0f, 2.29f, -0.98f, 4.36f, -2.53f, 5.82f)
                lineToRelative(1.42f, 1.42f)
                curveTo(20.8f, 17.41f, 22.0f, 14.85f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _podcasts!!
    }

private var _podcasts: ImageVector? = null
