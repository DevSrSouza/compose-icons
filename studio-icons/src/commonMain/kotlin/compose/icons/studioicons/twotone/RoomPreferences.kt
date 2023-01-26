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

public val TwotoneGroup.RoomPreferences: ImageVector
    get() {
        if (_roomPreferences != null) {
            return _roomPreferences!!
        }
        _roomPreferences = Builder(name = "RoomPreferences", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 12.11f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(4.29f)
                curveTo(11.1f, 18.37f, 11.0f, 17.7f, 11.0f, 17.0f)
                curveTo(11.0f, 15.09f, 11.76f, 13.37f, 13.0f, 12.11f)
                close()
                moveTo(10.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(7.0f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(7.11f)
                curveToRelative(0.57f, -0.59f, 1.25f, -1.07f, 2.0f, -1.42f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.26f)
                curveToRelative(-0.42f, -0.6f, -0.75f, -1.28f, -0.97f, -2.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(21.69f, 17.63f)
                lineToRelative(1.14f, 1.0f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(-1.45f, -0.49f)
                curveToRelative(-0.32f, 0.27f, -0.68f, 0.48f, -1.08f, 0.63f)
                lineTo(19.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.3f, -1.49f)
                curveToRelative(-0.4f, -0.15f, -0.76f, -0.36f, -1.08f, -0.63f)
                lineToRelative(-1.45f, 0.49f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(1.14f, -1.0f)
                curveToRelative(-0.08f, -0.5f, -0.08f, -0.76f, 0.0f, -1.26f)
                lineToRelative(-1.14f, -1.0f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(1.45f, 0.49f)
                curveToRelative(0.32f, -0.27f, 0.68f, -0.48f, 1.08f, -0.63f)
                lineTo(17.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.3f, 1.49f)
                curveToRelative(0.4f, 0.15f, 0.76f, 0.36f, 1.08f, 0.63f)
                lineToRelative(1.45f, -0.49f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(-1.14f, 1.0f)
                curveTo(21.77f, 16.87f, 21.77f, 17.13f, 21.69f, 17.63f)
                close()
                moveTo(20.0f, 17.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveTo(20.0f, 18.1f, 20.0f, 17.0f)
                close()
            }
        }
        .build()
        return _roomPreferences!!
    }

private var _roomPreferences: ImageVector? = null
