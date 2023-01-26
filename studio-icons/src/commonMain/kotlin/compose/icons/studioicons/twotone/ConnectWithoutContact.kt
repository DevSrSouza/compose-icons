package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ConnectWithoutContact: ImageVector
    get() {
        if (_connectWithoutContact != null) {
            return _connectWithoutContact!!
        }
        _connectWithoutContact = Builder(name = "ConnectWithoutContact", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                horizontalLineTo(9.0f)
                curveToRelative(0.0f, -4.97f, 4.03f, -9.0f, 9.0f, -9.0f)
                verticalLineToRelative(2.0f)
                curveTo(14.13f, 7.0f, 11.0f, 10.13f, 11.0f, 14.0f)
                close()
                moveTo(18.0f, 11.0f)
                verticalLineTo(9.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveTo(15.0f, 12.34f, 16.34f, 11.0f, 18.0f, 11.0f)
                close()
                moveTo(7.0f, 4.0f)
                curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveTo(3.0f, 2.89f, 3.0f, 4.0f)
                reflectiveCurveToRelative(0.89f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveTo(7.0f, 5.11f, 7.0f, 4.0f)
                close()
                moveTo(11.45f, 4.5f)
                horizontalLineToRelative(-2.0f)
                curveTo(9.21f, 5.92f, 7.99f, 7.0f, 6.5f, 7.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(2.67f, 7.0f, 2.0f, 7.67f, 2.0f, 8.5f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(8.74f)
                curveTo(9.86f, 8.15f, 11.25f, 6.51f, 11.45f, 4.5f)
                close()
                moveTo(19.0f, 17.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f)
                reflectiveCurveTo(17.89f, 17.0f, 19.0f, 17.0f)
                close()
                moveTo(20.5f, 18.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.49f, 0.0f, -2.71f, -1.08f, -2.95f, -2.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.2f, 2.01f, 1.59f, 3.65f, 3.45f, 4.24f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.5f)
                curveTo(22.0f, 18.67f, 21.33f, 18.0f, 20.5f, 18.0f)
                close()
            }
        }
        .build()
        return _connectWithoutContact!!
    }

private var _connectWithoutContact: ImageVector? = null
