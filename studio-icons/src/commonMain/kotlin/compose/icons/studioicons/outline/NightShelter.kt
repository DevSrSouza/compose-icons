package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.NightShelter: ImageVector
    get() {
        if (_nightShelter != null) {
            return _nightShelter!!
        }
        _nightShelter = Builder(name = "NightShelter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.5f)
                lineToRelative(6.0f, 4.5f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-9.0f)
                lineTo(12.0f, 5.5f)
                moveTo(12.0f, 3.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 3.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                curveTo(17.0f, 12.9f, 16.1f, 12.0f, 15.0f, 12.0f)
                close()
                moveTo(9.75f, 12.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                curveTo(8.5f, 14.44f, 9.06f, 15.0f, 9.75f, 15.0f)
                reflectiveCurveTo(11.0f, 14.44f, 11.0f, 13.75f)
                curveTo(11.0f, 13.06f, 10.44f, 12.5f, 9.75f, 12.5f)
                close()
            }
        }
        .build()
        return _nightShelter!!
    }

private var _nightShelter: ImageVector? = null
