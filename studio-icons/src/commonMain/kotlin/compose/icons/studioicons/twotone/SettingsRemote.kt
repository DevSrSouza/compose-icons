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

public val TwotoneGroup.SettingsRemote: ImageVector
    get() {
        if (_settingsRemote != null) {
            return _settingsRemote!!
        }
        _settingsRemote = Builder(name = "SettingsRemote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 21.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(16.0f, 10.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(14.0f, 21.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.05f, 6.05f)
                lineToRelative(1.41f, 1.41f)
                curveTo(9.37f, 6.56f, 10.62f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(2.63f, 0.56f, 3.54f, 1.46f)
                lineToRelative(1.41f, -1.41f)
                curveTo(15.68f, 4.78f, 13.93f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(-3.68f, 0.78f, -4.95f, 2.05f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(8.96f, 0.0f, 6.21f, 1.23f, 4.22f, 3.22f)
                lineToRelative(1.41f, 1.41f)
                curveTo(7.26f, 3.01f, 9.51f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(4.74f, 1.01f, 6.36f, 2.64f)
                lineToRelative(1.41f, -1.41f)
                curveTo(17.79f, 1.23f, 15.04f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _settingsRemote!!
    }

private var _settingsRemote: ImageVector? = null
