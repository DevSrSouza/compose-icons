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

public val RoundGroup.Girl: ImageVector
    get() {
        if (_girl != null) {
            return _girl!!
        }
        _girl = Builder(name = "Girl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                reflectiveCurveTo(12.97f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(-1.75f, 0.78f, -1.75f, 1.75f)
                reflectiveCurveTo(11.03f, 7.5f, 12.0f, 7.5f)
                close()
                moveTo(14.0f, 16.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(9.44f)
                curveToRelative(-0.7f, 0.0f, -1.18f, -0.7f, -0.94f, -1.35f)
                lineToRelative(1.88f, -5.03f)
                curveTo(10.63f, 8.95f, 11.28f, 8.5f, 12.0f, 8.5f)
                reflectiveCurveToRelative(1.37f, 0.45f, 1.62f, 1.12f)
                lineToRelative(1.88f, 5.03f)
                curveTo(15.74f, 15.3f, 15.26f, 16.0f, 14.56f, 16.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _girl!!
    }

private var _girl: ImageVector? = null
