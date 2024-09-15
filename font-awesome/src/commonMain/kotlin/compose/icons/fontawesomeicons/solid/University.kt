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

public val SolidGroup.University: ImageVector
    get() {
        if (_university != null) {
            return _university!!
        }
        _university = Builder(name = "University", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 128.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 6.63f, -5.37f, 12.0f, -12.0f, 12.0f)
                lineTo(60.0f, 176.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, -5.37f, -12.0f, -12.0f)
                verticalLineToRelative(-12.0f)
                lineTo(24.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.94f, -7.39f)
                lineToRelative(232.0f, -88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.12f, 0.0f)
                lineToRelative(232.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 496.0f, 128.0f)
                close()
                moveTo(472.0f, 432.0f)
                lineTo(40.0f, 432.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(464.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(96.0f, 192.0f)
                verticalLineToRelative(192.0f)
                lineTo(60.0f, 384.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(416.0f)
                verticalLineToRelative(-20.0f)
                curveToRelative(0.0f, -6.63f, -5.37f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-36.0f)
                lineTo(416.0f, 192.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(192.0f)
                horizontalLineToRelative(-64.0f)
                lineTo(288.0f, 192.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(192.0f)
                horizontalLineToRelative(-64.0f)
                lineTo(160.0f, 192.0f)
                lineTo(96.0f, 192.0f)
                close()
            }
        }
        .build()
        return _university!!
    }

private var _university: ImageVector? = null
