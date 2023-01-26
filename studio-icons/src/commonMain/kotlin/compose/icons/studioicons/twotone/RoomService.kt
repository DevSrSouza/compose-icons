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

public val TwotoneGroup.RoomService: ImageVector
    get() {
        if (_roomService != null) {
            return _roomService!!
        }
        _roomService = Builder(name = "RoomService", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.58f)
                curveToRelative(-2.95f, 0.0f, -5.47f, 1.83f, -6.5f, 4.41f)
                horizontalLineToRelative(13.0f)
                curveToRelative(-1.03f, -2.58f, -3.55f, -4.41f, -6.5f, -4.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 17.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 19.0f)
                close()
                moveTo(13.84f, 7.79f)
                curveToRelative(0.1f, -0.24f, 0.16f, -0.51f, 0.16f, -0.79f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.28f, 0.06f, 0.55f, 0.16f, 0.79f)
                curveTo(6.25f, 8.6f, 3.27f, 11.93f, 3.0f, 16.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(-0.27f, -4.07f, -3.25f, -7.4f, -7.16f, -8.21f)
                close()
                moveTo(12.0f, 9.58f)
                curveToRelative(2.95f, 0.0f, 5.47f, 1.83f, 6.5f, 4.41f)
                horizontalLineToRelative(-13.0f)
                curveToRelative(1.03f, -2.58f, 3.55f, -4.41f, 6.5f, -4.41f)
                close()
            }
        }
        .build()
        return _roomService!!
    }

private var _roomService: ImageVector? = null
