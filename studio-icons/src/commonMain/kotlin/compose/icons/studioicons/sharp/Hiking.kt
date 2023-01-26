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

public val SharpGroup.Hiking: ImageVector
    get() {
        if (_hiking != null) {
            return _hiking!!
        }
        _hiking = Builder(name = "Hiking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 5.5f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f)
                close()
                moveTo(17.5f, 10.78f)
                curveToRelative(-1.23f, -0.37f, -2.22f, -1.17f, -2.8f, -2.18f)
                lineToRelative(-1.0f, -1.6f)
                curveToRelative(-0.41f, -0.65f, -1.11f, -1.0f, -1.84f, -1.0f)
                curveToRelative(-0.78f, 0.0f, -1.59f, 0.5f, -1.78f, 1.44f)
                reflectiveCurveTo(7.0f, 23.0f, 7.0f, 23.0f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.8f, -8.0f)
                lineToRelative(2.1f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-2.1f, -2.0f)
                lineToRelative(0.6f, -3.0f)
                curveToRelative(1.0f, 1.15f, 2.41f, 2.01f, 4.0f, 2.34f)
                verticalLineTo(23.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(17.5f, 10.78f)
                close()
                moveTo(7.43f, 13.13f)
                lineToRelative(-3.1f, -0.6f)
                lineToRelative(1.34f, -6.87f)
                lineToRelative(3.13f, 0.61f)
                lineTo(7.43f, 13.13f)
                close()
            }
        }
        .build()
        return _hiking!!
    }

private var _hiking: ImageVector? = null
