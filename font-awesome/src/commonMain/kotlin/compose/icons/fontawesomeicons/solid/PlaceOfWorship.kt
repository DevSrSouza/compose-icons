package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PlaceOfWorship: ImageVector
    get() {
        if (_placeOfWorship != null) {
            return _placeOfWorship!!
        }
        _placeOfWorship = Builder(name = "PlaceOfWorship", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 109.3f)
                verticalLineTo(217.6f)
                lineTo(183.3f, 242.0f)
                curveToRelative(-14.5f, 8.7f, -23.3f, 24.3f, -23.3f, 41.2f)
                verticalLineTo(512.0f)
                horizontalLineToRelative(96.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(96.0f)
                verticalLineTo(283.2f)
                curveToRelative(0.0f, -16.9f, -8.8f, -32.5f, -23.3f, -41.2f)
                lineTo(416.0f, 217.6f)
                verticalLineTo(109.3f)
                curveToRelative(0.0f, -8.5f, -3.4f, -16.6f, -9.4f, -22.6f)
                lineTo(331.3f, 11.3f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0.0f)
                lineTo(233.4f, 86.6f)
                curveToRelative(-6.0f, 6.0f, -9.4f, 14.1f, -9.4f, 22.6f)
                close()
                moveTo(24.9f, 330.3f)
                curveTo(9.5f, 338.8f, 0.0f, 354.9f, 0.0f, 372.4f)
                verticalLineTo(464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(80.0f)
                verticalLineTo(273.6f)
                lineTo(24.9f, 330.3f)
                close()
                moveTo(592.0f, 512.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(372.4f)
                curveToRelative(0.0f, -17.5f, -9.5f, -33.6f, -24.9f, -42.1f)
                lineTo(512.0f, 273.6f)
                verticalLineTo(512.0f)
                horizontalLineToRelative(80.0f)
                close()
            }
        }
        .build()
        return _placeOfWorship!!
    }

private var _placeOfWorship: ImageVector? = null
