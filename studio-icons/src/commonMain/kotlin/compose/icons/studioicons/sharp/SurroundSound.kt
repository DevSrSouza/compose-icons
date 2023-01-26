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

public val SharpGroup.SurroundSound: ImageVector
    get() {
        if (_surroundSound != null) {
            return _surroundSound!!
        }
        _surroundSound = Builder(name = "SurroundSound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(7.76f, 16.24f)
                lineToRelative(-1.41f, 1.41f)
                curveTo(4.78f, 16.1f, 4.0f, 14.05f, 4.0f, 12.0f)
                reflectiveCurveToRelative(0.78f, -4.1f, 2.34f, -5.66f)
                lineToRelative(1.41f, 1.41f)
                curveTo(6.59f, 8.93f, 6.0f, 10.46f, 6.0f, 12.0f)
                reflectiveCurveTo(6.59f, 15.07f, 7.76f, 16.24f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveTo(14.21f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(17.66f, 17.66f)
                lineToRelative(-1.41f, -1.41f)
                curveTo(17.41f, 15.07f, 18.0f, 13.54f, 18.0f, 12.0f)
                reflectiveCurveToRelative(-0.59f, -3.07f, -1.76f, -4.24f)
                lineToRelative(1.41f, -1.41f)
                curveTo(19.22f, 7.9f, 20.0f, 9.95f, 20.0f, 12.0f)
                reflectiveCurveTo(19.22f, 16.1f, 17.66f, 17.66f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _surroundSound!!
    }

private var _surroundSound: ImageVector? = null
