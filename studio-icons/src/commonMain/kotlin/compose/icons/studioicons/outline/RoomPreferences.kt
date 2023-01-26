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

public val OutlineGroup.RoomPreferences: ImageVector
    get() {
        if (_roomPreferences != null) {
            return _roomPreferences!!
        }
        _roomPreferences = Builder(name = "RoomPreferences", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.69f, 16.37f)
                lineToRelative(1.14f, -1.0f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(-1.45f, 0.49f)
                curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f)
                lineTo(19.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.3f, 1.49f)
                curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f)
                lineToRelative(-1.45f, -0.49f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(1.14f, 1.0f)
                curveToRelative(-0.08f, 0.5f, -0.08f, 0.76f, 0.0f, 1.26f)
                lineToRelative(-1.14f, 1.0f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(1.45f, -0.49f)
                curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f)
                lineTo(17.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.3f, -1.49f)
                curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f)
                lineToRelative(1.45f, 0.49f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(-1.14f, -1.0f)
                curveTo(21.77f, 17.13f, 21.77f, 16.87f, 21.69f, 16.37f)
                close()
                moveTo(18.0f, 19.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveTo(19.1f, 19.0f, 18.0f, 19.0f)
                close()
                moveTo(19.0f, 4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(12.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _roomPreferences!!
    }

private var _roomPreferences: ImageVector? = null
