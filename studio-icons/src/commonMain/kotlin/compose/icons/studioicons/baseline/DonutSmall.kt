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

public val BaselineGroup.DonutSmall: ImageVector
    get() {
        if (_donutSmall != null) {
            return _donutSmall!!
        }
        _donutSmall = Builder(name = "DonutSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.16f)
                verticalLineTo(2.0f)
                curveToRelative(-5.0f, 0.5f, -9.0f, 4.79f, -9.0f, 10.0f)
                reflectiveCurveToRelative(4.0f, 9.5f, 9.0f, 10.0f)
                verticalLineToRelative(-7.16f)
                curveToRelative(-1.0f, -0.41f, -2.0f, -1.52f, -2.0f, -2.84f)
                reflectiveCurveToRelative(1.0f, -2.43f, 2.0f, -2.84f)
                close()
                moveTo(14.86f, 11.0f)
                horizontalLineTo(22.0f)
                curveToRelative(-0.48f, -4.75f, -4.0f, -8.53f, -9.0f, -9.0f)
                verticalLineToRelative(7.16f)
                curveToRelative(1.0f, 0.3f, 1.52f, 0.98f, 1.86f, 1.84f)
                close()
                moveTo(13.0f, 14.84f)
                verticalLineTo(22.0f)
                curveToRelative(5.0f, -0.47f, 8.52f, -4.25f, 9.0f, -9.0f)
                horizontalLineToRelative(-7.14f)
                curveToRelative(-0.34f, 0.86f, -0.86f, 1.54f, -1.86f, 1.84f)
                close()
            }
        }
        .build()
        return _donutSmall!!
    }

private var _donutSmall: ImageVector? = null
