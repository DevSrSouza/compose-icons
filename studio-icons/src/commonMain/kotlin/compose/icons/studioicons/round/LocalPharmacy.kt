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

public val RoundGroup.LocalPharmacy: ImageVector
    get() {
        if (_localPharmacy != null) {
            return _localPharmacy!!
        }
        _localPharmacy = Builder(name = "LocalPharmacy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.89f, 5.0f)
                horizontalLineToRelative(-0.53f)
                lineToRelative(0.71f, -1.97f)
                curveToRelative(0.24f, -0.65f, -0.1f, -1.37f, -0.75f, -1.6f)
                curveToRelative(-0.65f, -0.24f, -1.37f, 0.1f, -1.61f, 0.75f)
                lineTo(15.69f, 5.0f)
                horizontalLineTo(5.1f)
                curveTo(3.73f, 5.0f, 2.77f, 6.34f, 3.2f, 7.63f)
                lineTo(5.0f, 13.0f)
                lineToRelative(-1.79f, 5.37f)
                curveTo(2.77f, 19.66f, 3.74f, 21.0f, 5.1f, 21.0f)
                horizontalLineToRelative(13.78f)
                curveToRelative(1.36f, 0.0f, 2.33f, -1.34f, 1.9f, -2.63f)
                lineTo(19.0f, 13.0f)
                lineToRelative(1.78f, -5.37f)
                curveTo(21.21f, 6.34f, 20.25f, 5.0f, 18.89f, 5.0f)
                close()
                moveTo(15.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _localPharmacy!!
    }

private var _localPharmacy: ImageVector? = null
