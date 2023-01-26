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

public val SharpGroup.ElectricMeter: ImageVector
    get() {
        if (_electricMeter != null) {
            return _electricMeter!!
        }
        _electricMeter = Builder(name = "ElectricMeter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(-4.96f, 0.0f, -9.0f, 4.04f, -9.0f, 9.0f)
                curveToRelative(0.0f, 3.91f, 2.51f, 7.24f, 6.0f, 8.47f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.06f)
                curveToRelative(0.33f, 0.04f, 0.66f, 0.06f, 1.0f, 0.06f)
                reflectiveCurveToRelative(0.67f, -0.02f, 1.0f, -0.06f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.53f)
                curveToRelative(3.49f, -1.24f, 6.0f, -4.57f, 6.0f, -8.47f)
                curveTo(21.0f, 6.04f, 16.96f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.25f, 14.0f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-1.5f, -1.5f)
                lineTo(11.0f, 14.25f)
                lineTo(9.75f, 13.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(1.5f, 1.5f)
                lineTo(13.0f, 12.75f)
                lineTo(14.25f, 14.0f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _electricMeter!!
    }

private var _electricMeter: ImageVector? = null
