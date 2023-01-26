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

public val SharpGroup.Soap: ImageVector
    get() {
        if (_soap != null) {
            return _soap!!
        }
        _soap = Builder(name = "Soap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 6.0f)
                curveTo(14.66f, 6.0f, 15.0f, 6.34f, 15.0f, 6.75f)
                reflectiveCurveTo(14.66f, 7.5f, 14.25f, 7.5f)
                reflectiveCurveTo(13.5f, 7.16f, 13.5f, 6.75f)
                reflectiveCurveTo(13.84f, 6.0f, 14.25f, 6.0f)
                moveTo(14.25f, 4.5f)
                curveTo(13.01f, 4.5f, 12.0f, 5.51f, 12.0f, 6.75f)
                reflectiveCurveTo(13.01f, 9.0f, 14.25f, 9.0f)
                reflectiveCurveToRelative(2.25f, -1.01f, 2.25f, -2.25f)
                reflectiveCurveTo(15.49f, 4.5f, 14.25f, 4.5f)
                lineTo(14.25f, 4.5f)
                close()
                moveTo(20.0f, 5.5f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveTo(20.28f, 6.5f, 20.0f, 6.5f)
                reflectiveCurveTo(19.5f, 6.28f, 19.5f, 6.0f)
                reflectiveCurveTo(19.72f, 5.5f, 20.0f, 5.5f)
                moveTo(20.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(21.1f, 4.0f, 20.0f, 4.0f)
                lineTo(20.0f, 4.0f)
                close()
                moveTo(18.0f, 2.5f)
                curveTo(18.0f, 3.33f, 17.33f, 4.0f, 16.5f, 4.0f)
                curveTo(15.67f, 4.0f, 15.0f, 3.33f, 15.0f, 2.5f)
                reflectiveCurveTo(15.67f, 1.0f, 16.5f, 1.0f)
                curveTo(17.33f, 1.0f, 18.0f, 1.67f, 18.0f, 2.5f)
                close()
                moveTo(1.0f, 12.68f)
                verticalLineTo(23.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.86f)
                lineToRelative(1.88f, -3.3f)
                lineTo(9.12f, 5.0f)
                lineTo(1.0f, 12.68f)
                close()
            }
        }
        .build()
        return _soap!!
    }

private var _soap: ImageVector? = null
