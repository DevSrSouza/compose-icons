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

public val RoundGroup.NightShelter: ImageVector
    get() {
        if (_nightShelter != null) {
            return _nightShelter!!
        }
        _nightShelter = Builder(name = "NightShelter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8f, 3.9f)
                lineToRelative(-6.0f, 4.5f)
                curveTo(4.3f, 8.78f, 4.0f, 9.37f, 4.0f, 10.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f)
                lineToRelative(-6.0f, -4.5f)
                curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f)
                close()
                moveTo(9.75f, 12.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveTo(10.44f, 15.0f, 9.75f, 15.0f)
                reflectiveCurveTo(8.5f, 14.44f, 8.5f, 13.75f)
                reflectiveCurveTo(9.06f, 12.5f, 9.75f, 12.5f)
                close()
                moveTo(16.5f, 18.0f)
                lineTo(16.5f, 18.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(1.0f)
                curveTo(8.0f, 17.78f, 7.78f, 18.0f, 7.5f, 18.0f)
                horizontalLineToRelative(0.0f)
                curveTo(7.22f, 18.0f, 7.0f, 17.78f, 7.0f, 17.5f)
                verticalLineToRelative(-6.0f)
                curveTo(7.0f, 11.22f, 7.22f, 11.0f, 7.5f, 11.0f)
                horizontalLineToRelative(0.0f)
                curveTo(7.78f, 11.0f, 8.0f, 11.22f, 8.0f, 11.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(3.5f)
                curveTo(17.0f, 17.78f, 16.78f, 18.0f, 16.5f, 18.0f)
                close()
            }
        }
        .build()
        return _nightShelter!!
    }

private var _nightShelter: ImageVector? = null
