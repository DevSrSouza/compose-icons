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

public val SolidGroup.UserNinja: ImageVector
    get() {
        if (_userNinja != null) {
            return _userNinja!!
        }
        _userNinja = Builder(name = "UserNinja", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 256.0f)
                curveToRelative(-57.2f, 0.0f, -105.6f, -37.5f, -122.0f, -89.3f)
                curveToRelative(-1.1f, 1.3f, -2.2f, 2.6f, -3.5f, 3.8f)
                curveToRelative(-15.8f, 15.8f, -38.8f, 20.7f, -53.6f, 22.1f)
                curveToRelative(-8.1f, 0.8f, -14.6f, -5.7f, -13.8f, -13.8f)
                curveToRelative(1.4f, -14.7f, 6.3f, -37.8f, 22.1f, -53.6f)
                curveToRelative(5.8f, -5.8f, 12.6f, -10.1f, 19.6f, -13.4f)
                curveToRelative(-7.0f, -3.2f, -13.8f, -7.6f, -19.6f, -13.4f)
                curveTo(37.4f, 82.7f, 32.6f, 59.7f, 31.1f, 44.9f)
                curveToRelative(-0.8f, -8.1f, 5.7f, -14.6f, 13.8f, -13.8f)
                curveToRelative(14.7f, 1.4f, 37.8f, 6.3f, 53.6f, 22.1f)
                curveToRelative(4.8f, 4.8f, 8.7f, 10.4f, 11.7f, 16.1f)
                curveTo(131.4f, 28.2f, 174.4f, 0.0f, 224.0f, 0.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, 57.3f, 128.0f, 128.0f)
                reflectiveCurveToRelative(-57.3f, 128.0f, -128.0f, 128.0f)
                close()
                moveTo(0.0f, 482.3f)
                curveTo(0.0f, 399.5f, 56.4f, 330.0f, 132.8f, 309.9f)
                curveToRelative(6.0f, -1.6f, 12.2f, 0.9f, 15.9f, 5.8f)
                lineToRelative(62.5f, 83.3f)
                curveToRelative(6.4f, 8.5f, 19.2f, 8.5f, 25.6f, 0.0f)
                lineToRelative(62.5f, -83.3f)
                curveToRelative(3.7f, -4.9f, 9.9f, -7.4f, 15.9f, -5.8f)
                curveTo(391.6f, 330.0f, 448.0f, 399.5f, 448.0f, 482.3f)
                curveToRelative(0.0f, 16.4f, -13.3f, 29.7f, -29.7f, 29.7f)
                horizontalLineTo(29.7f)
                curveTo(13.3f, 512.0f, 0.0f, 498.7f, 0.0f, 482.3f)
                close()
                moveTo(160.0f, 96.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(288.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(160.0f)
                close()
            }
        }
        .build()
        return _userNinja!!
    }

private var _userNinja: ImageVector? = null
