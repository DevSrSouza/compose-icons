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

public val TwotoneGroup.Adb: ImageVector
    get() {
        if (_adb != null) {
            return _adb!!
        }
        _adb = Builder(name = "Adb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 16.0f)
                curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f)
                verticalLineToRelative(-4.0f)
                lineTo(5.0f, 12.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(16.12f, 4.37f)
                lineToRelative(2.1f, -2.1f)
                lineToRelative(-0.82f, -0.83f)
                lineToRelative(-2.3f, 2.31f)
                curveTo(14.16f, 3.28f, 13.12f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(-2.16f, 0.28f, -3.09f, 0.75f)
                lineTo(6.6f, 1.44f)
                lineToRelative(-0.82f, 0.83f)
                lineToRelative(2.1f, 2.1f)
                curveTo(6.14f, 5.64f, 5.0f, 7.68f, 5.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.32f, -1.14f, -4.36f, -2.88f, -5.63f)
                close()
                moveTo(9.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(15.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _adb!!
    }

private var _adb: ImageVector? = null
