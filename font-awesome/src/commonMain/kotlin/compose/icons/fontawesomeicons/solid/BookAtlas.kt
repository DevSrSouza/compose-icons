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

public val SolidGroup.BookAtlas: ImageVector
    get() {
        if (_bookAtlas != null) {
            return _bookAtlas!!
        }
        _bookAtlas = Builder(name = "BookAtlas", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 43.0f, 43.0f, 0.0f, 96.0f, 0.0f)
                lineTo(384.0f, 0.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(448.0f, 352.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(384.0f, 512.0f)
                lineTo(96.0f, 512.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(0.0f, 96.0f)
                close()
                moveTo(64.0f, 416.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(352.0f, 448.0f)
                lineTo(352.0f, 384.0f)
                lineTo(96.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
                moveTo(247.4f, 283.8f)
                curveToRelative(-3.7f, 3.7f, -6.2f, 4.2f, -7.4f, 4.2f)
                reflectiveCurveToRelative(-3.7f, -0.5f, -7.4f, -4.2f)
                curveToRelative(-3.8f, -3.7f, -8.0f, -10.0f, -11.8f, -18.9f)
                curveToRelative(-6.2f, -14.5f, -10.8f, -34.3f, -12.2f, -56.9f)
                horizontalLineToRelative(63.0f)
                curveToRelative(-1.5f, 22.6f, -6.0f, 42.4f, -12.2f, 56.9f)
                curveToRelative(-3.8f, 8.9f, -8.0f, 15.2f, -11.8f, 18.9f)
                close()
                moveTo(290.1f, 273.9f)
                curveToRelative(7.3f, -18.3f, 12.0f, -41.1f, 13.4f, -65.9f)
                horizontalLineToRelative(31.1f)
                curveToRelative(-4.7f, 27.9f, -21.4f, 51.7f, -44.5f, 65.9f)
                close()
                moveTo(290.1f, 110.1f)
                curveToRelative(23.2f, 14.2f, 39.9f, 38.0f, 44.5f, 65.9f)
                lineTo(303.5f, 176.0f)
                curveToRelative(-1.4f, -24.7f, -6.1f, -47.5f, -13.4f, -65.9f)
                close()
                moveTo(368.0f, 192.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, -256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 256.0f, 0.0f)
                close()
                moveTo(145.3f, 208.0f)
                horizontalLineToRelative(31.1f)
                curveToRelative(1.4f, 24.7f, 6.1f, 47.5f, 13.4f, 65.9f)
                curveToRelative(-23.2f, -14.2f, -39.9f, -38.0f, -44.5f, -65.9f)
                close()
                moveTo(176.4f, 176.0f)
                lineTo(145.3f, 176.0f)
                curveToRelative(4.7f, -27.9f, 21.4f, -51.7f, 44.5f, -65.9f)
                curveToRelative(-7.3f, 18.3f, -12.0f, 41.1f, -13.4f, 65.9f)
                close()
                moveTo(232.5f, 100.2f)
                curveToRelative(3.7f, -3.7f, 6.2f, -4.2f, 7.4f, -4.2f)
                reflectiveCurveToRelative(3.7f, 0.5f, 7.4f, 4.2f)
                curveToRelative(3.8f, 3.7f, 8.0f, 10.0f, 11.8f, 18.9f)
                curveToRelative(6.2f, 14.5f, 10.8f, 34.3f, 12.2f, 56.9f)
                horizontalLineToRelative(-63.0f)
                curveToRelative(1.5f, -22.6f, 6.0f, -42.4f, 12.2f, -56.9f)
                curveToRelative(3.8f, -8.9f, 8.0f, -15.2f, 11.8f, -18.9f)
                close()
            }
        }
        .build()
        return _bookAtlas!!
    }

private var _bookAtlas: ImageVector? = null
