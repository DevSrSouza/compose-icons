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

public val SharpGroup.DryCleaning: ImageVector
    get() {
        if (_dryCleaning != null) {
            return _dryCleaning!!
        }
        _dryCleaning = Builder(name = "DryCleaning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                lineToRelative(-8.0f, -3.56f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.84f, -1.66f, -3.3f, -3.56f, -2.95f)
                curveTo(10.26f, 2.27f, 9.29f, 3.22f, 9.06f, 4.4f)
                curveTo(8.76f, 5.96f, 9.66f, 7.34f, 11.0f, 7.82f)
                verticalLineToRelative(0.63f)
                lineToRelative(-8.0f, 3.56f)
                lineTo(3.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(19.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-0.7f)
                lineToRelative(7.0f, -3.11f)
                lineToRelative(7.0f, 3.11f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _dryCleaning!!
    }

private var _dryCleaning: ImageVector? = null
