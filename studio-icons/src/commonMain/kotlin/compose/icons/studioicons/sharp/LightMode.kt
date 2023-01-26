package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.LightMode: ImageVector
    get() {
        if (_lightMode != null) {
            return _lightMode!!
        }
        _lightMode = Builder(name = "LightMode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(14.76f, 7.0f, 12.0f, 7.0f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(11.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(1.0f)
                lineTo(11.0f, 1.0f)
                close()
                moveTo(11.0f, 19.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                lineTo(11.0f, 19.0f)
                close()
                moveTo(23.0f, 11.0f)
                lineToRelative(-4.0f, 0.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(4.0f, 0.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(5.0f, 11.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(4.0f, 0.0f)
                lineTo(5.0f, 11.0f)
                close()
                moveTo(16.24f, 17.66f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.47f, -2.47f)
                lineTo(16.24f, 17.66f)
                close()
                moveTo(3.87f, 5.28f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.28f, 3.87f)
                lineTo(3.87f, 5.28f)
                close()
                moveTo(6.34f, 16.24f)
                lineToRelative(-2.47f, 2.47f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.47f, -2.47f)
                lineTo(6.34f, 16.24f)
                close()
                moveTo(18.72f, 3.87f)
                lineToRelative(-2.47f, 2.47f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.47f, -2.47f)
                lineTo(18.72f, 3.87f)
                close()
            }
        }
        .build()
        return _lightMode!!
    }

private var _lightMode: ImageVector? = null
