package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Girl: ImageVector
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
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(8.0f)
                lineToRelative(2.38f, -6.38f)
                curveTo(10.63f, 8.95f, 11.28f, 8.5f, 12.0f, 8.5f)
                reflectiveCurveToRelative(1.37f, 0.45f, 1.62f, 1.12f)
                lineTo(16.0f, 16.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _girl!!
    }

private var _girl: ImageVector? = null
