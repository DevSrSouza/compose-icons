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

public val SolidGroup.ParachuteBox: ImageVector
    get() {
        if (_parachuteBox != null) {
            return _parachuteBox!!
        }
        _parachuteBox = Builder(name = "ParachuteBox", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(383.5f, 192.0f)
                curveToRelative(0.3f, -5.3f, 0.5f, -10.6f, 0.5f, -16.0f)
                curveToRelative(0.0f, -51.0f, -15.9f, -96.0f, -40.2f, -127.6f)
                curveTo(319.5f, 16.9f, 288.2f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(-63.5f, 16.9f, -87.8f, 48.4f)
                curveTo(143.9f, 80.0f, 128.0f, 125.0f, 128.0f, 176.0f)
                curveToRelative(0.0f, 5.4f, 0.2f, 10.7f, 0.5f, 16.0f)
                horizontalLineTo(240.0f)
                verticalLineTo(320.0f)
                horizontalLineTo(208.0f)
                curveToRelative(-7.0f, 0.0f, -13.7f, 1.5f, -19.7f, 4.2f)
                lineTo(68.2f, 192.0f)
                horizontalLineTo(96.5f)
                curveToRelative(-0.3f, -5.3f, -0.5f, -10.6f, -0.5f, -16.0f)
                curveToRelative(0.0f, -64.0f, 22.2f, -121.2f, 57.1f, -159.3f)
                curveTo(62.0f, 49.3f, 18.6f, 122.6f, 4.2f, 173.6f)
                curveTo(1.5f, 183.1f, 9.0f, 192.0f, 18.9f, 192.0f)
                horizontalLineToRelative(6.0f)
                lineTo(165.2f, 346.3f)
                curveToRelative(-3.3f, 6.5f, -5.2f, 13.9f, -5.2f, 21.7f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(368.0f)
                curveToRelative(0.0f, -7.8f, -1.9f, -15.2f, -5.2f, -21.7f)
                lineTo(487.1f, 192.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(9.9f, 0.0f, 17.4f, -8.9f, 14.7f, -18.4f)
                curveTo(493.4f, 122.6f, 450.0f, 49.3f, 358.9f, 16.7f)
                curveTo(393.8f, 54.8f, 416.0f, 112.1f, 416.0f, 176.0f)
                curveToRelative(0.0f, 5.4f, -0.2f, 10.7f, -0.5f, 16.0f)
                horizontalLineToRelative(28.3f)
                lineTo(323.7f, 324.2f)
                curveToRelative(-6.0f, -2.7f, -12.7f, -4.2f, -19.7f, -4.2f)
                horizontalLineTo(272.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(383.5f)
                close()
            }
        }
        .build()
        return _parachuteBox!!
    }

private var _parachuteBox: ImageVector? = null
