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

public val SolidGroup.UsersSlash: ImageVector
    get() {
        if (_usersSlash != null) {
            return _usersSlash!!
        }
        _usersSlash = Builder(name = "UsersSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(440.6f, 320.0f)
                horizontalLineTo(618.7f)
                curveToRelative(11.8f, 0.0f, 21.3f, -9.6f, 21.3f, -21.3f)
                curveTo(640.0f, 239.8f, 592.2f, 192.0f, 533.3f, 192.0f)
                horizontalLineTo(490.7f)
                curveToRelative(-15.9f, 0.0f, -31.0f, 3.5f, -44.6f, 9.7f)
                curveToRelative(1.3f, 7.2f, 1.9f, 14.7f, 1.9f, 22.3f)
                curveToRelative(0.0f, 30.2f, -10.5f, 58.0f, -28.0f, 79.9f)
                lineToRelative(-25.2f, -19.7f)
                curveTo(408.1f, 267.7f, 416.0f, 246.8f, 416.0f, 224.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-31.1f, 0.0f, -58.7f, 14.8f, -76.3f, 37.7f)
                lineToRelative(-40.6f, -31.8f)
                curveToRelative(13.0f, -14.2f, 20.9f, -33.1f, 20.9f, -53.9f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                curveTo(116.3f, 0.0f, 91.9f, 14.1f, 77.5f, 35.5f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(106.7f, 192.0f)
                curveTo(47.8f, 192.0f, 0.0f, 239.8f, 0.0f, 298.7f)
                curveTo(0.0f, 310.4f, 9.6f, 320.0f, 21.3f, 320.0f)
                horizontalLineTo(234.7f)
                curveToRelative(0.2f, 0.0f, 0.4f, 0.0f, 0.7f, 0.0f)
                curveToRelative(-20.6f, -18.2f, -35.2f, -42.8f, -40.8f, -70.8f)
                lineTo(121.8f, 192.0f)
                horizontalLineTo(106.7f)
                close()
                moveTo(261.3f, 352.0f)
                curveTo(187.7f, 352.0f, 128.0f, 411.7f, 128.0f, 485.3f)
                curveToRelative(0.0f, 14.7f, 11.9f, 26.7f, 26.7f, 26.7f)
                horizontalLineTo(485.3f)
                curveToRelative(10.5f, 0.0f, 19.5f, -6.0f, 23.9f, -14.8f)
                lineTo(324.9f, 352.0f)
                horizontalLineTo(261.3f)
                close()
                moveTo(512.0f, 160.0f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 512.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.0f, 160.0f)
                close()
            }
        }
        .build()
        return _usersSlash!!
    }

private var _usersSlash: ImageVector? = null
