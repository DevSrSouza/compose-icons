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

public val SharpGroup.PersonalInjury: ImageVector
    get() {
        if (_personalInjury != null) {
            return _personalInjury!!
        }
        _personalInjury = Builder(name = "PersonalInjury", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 6.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveTo(8.0f, 8.21f, 8.0f, 6.0f)
                close()
                moveTo(17.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineToRelative(0.0f, -4.78f)
                curveToRelative(0.0f, -1.12f, -0.61f, -2.15f, -1.61f, -2.66f)
                curveToRelative(-0.43f, -0.22f, -0.9f, -0.43f, -1.39f, -0.62f)
                lineTo(17.0f, 22.0f)
                close()
                moveTo(12.34f, 17.0f)
                lineTo(15.0f, 11.33f)
                curveTo(14.07f, 11.12f, 13.07f, 11.0f, 12.0f, 11.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(4.61f, 13.07f, 4.0f, 14.1f, 4.0f, 15.22f)
                lineTo(4.0f, 22.0f)
                horizontalLineToRelative(2.34f)
                curveTo(6.12f, 21.55f, 6.0f, 21.04f, 6.0f, 20.5f)
                curveTo(6.0f, 18.57f, 7.57f, 17.0f, 9.5f, 17.0f)
                horizontalLineTo(12.34f)
                close()
                moveTo(10.0f, 22.0f)
                lineToRelative(1.41f, -3.0f)
                horizontalLineTo(9.5f)
                curveTo(8.67f, 19.0f, 8.0f, 19.67f, 8.0f, 20.5f)
                reflectiveCurveTo(8.67f, 22.0f, 9.5f, 22.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _personalInjury!!
    }

private var _personalInjury: ImageVector? = null
