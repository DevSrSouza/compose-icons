package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.SpeakerPhone: ImageVector
    get() {
        if (_speakerPhone != null) {
            return _speakerPhone!!
        }
        _speakerPhone = Builder(name = "SpeakerPhone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(8.98f, 1.0f, 6.24f, 2.23f, 4.25f, 4.21f)
                lineToRelative(1.41f, 1.41f)
                curveTo(7.28f, 4.0f, 9.53f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(4.72f, 1.0f, 6.34f, 2.62f)
                lineToRelative(1.41f, -1.41f)
                curveTo(17.76f, 2.23f, 15.02f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(7.0f, 7.07f)
                lineTo(8.43f, 8.5f)
                curveToRelative(0.91f, -0.91f, 2.18f, -1.48f, 3.57f, -1.48f)
                reflectiveCurveToRelative(2.66f, 0.57f, 3.57f, 1.48f)
                lineTo(17.0f, 7.07f)
                curveTo(15.72f, 5.79f, 13.95f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveToRelative(-3.72f, 0.79f, -5.0f, 2.07f)
                close()
                moveTo(14.86f, 10.01f)
                lineTo(9.14f, 10.0f)
                curveTo(8.51f, 10.0f, 8.0f, 10.51f, 8.0f, 11.14f)
                verticalLineToRelative(9.71f)
                curveToRelative(0.0f, 0.63f, 0.51f, 1.14f, 1.14f, 1.14f)
                horizontalLineToRelative(5.71f)
                curveToRelative(0.63f, 0.0f, 1.14f, -0.51f, 1.14f, -1.14f)
                verticalLineToRelative(-9.71f)
                curveToRelative(0.01f, -0.63f, -0.5f, -1.13f, -1.13f, -1.13f)
                close()
                moveTo(15.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _speakerPhone!!
    }

private var _speakerPhone: ImageVector? = null
