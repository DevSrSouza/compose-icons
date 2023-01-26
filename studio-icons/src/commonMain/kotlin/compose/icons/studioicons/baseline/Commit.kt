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

public val BaselineGroup.Commit: ImageVector
    get() {
        if (_commit != null) {
            return _commit!!
        }
        _commit = Builder(name = "Commit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9f, 11.0f)
                lineTo(16.9f, 11.0f)
                curveToRelative(-0.46f, -2.28f, -2.48f, -4.0f, -4.9f, -4.0f)
                reflectiveCurveToRelative(-4.44f, 1.72f, -4.9f, 4.0f)
                horizontalLineToRelative(0.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.1f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.46f, 2.28f, 2.48f, 4.0f, 4.9f, 4.0f)
                reflectiveCurveToRelative(4.44f, -1.72f, 4.9f, -4.0f)
                horizontalLineToRelative(0.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(16.9f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveTo(13.66f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _commit!!
    }

private var _commit: ImageVector? = null
