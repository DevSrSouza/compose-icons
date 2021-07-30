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

public val SolidGroup.HeadphonesAlt: ImageVector
    get() {
        if (_headphonesAlt != null) {
            return _headphonesAlt!!
        }
        _headphonesAlt = Builder(name = "HeadphonesAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 288.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.7f, -64.0f, 64.12f)
                verticalLineToRelative(63.76f)
                curveToRelative(0.0f, 35.41f, 28.65f, 64.12f, 64.0f, 64.12f)
                horizontalLineToRelative(16.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.36f, 32.0f, -32.06f)
                lineTo(192.0f, 320.06f)
                curveToRelative(0.0f, -17.71f, -14.33f, -32.06f, -32.0f, -32.06f)
                close()
                moveTo(368.0f, 288.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.35f, -32.0f, 32.06f)
                verticalLineToRelative(127.88f)
                curveToRelative(0.0f, 17.7f, 14.33f, 32.06f, 32.0f, 32.06f)
                horizontalLineToRelative(16.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.71f, 64.0f, -64.12f)
                verticalLineToRelative(-63.76f)
                curveToRelative(0.0f, -35.41f, -28.65f, -64.12f, -64.0f, -64.12f)
                close()
                moveTo(256.0f, 32.0f)
                curveTo(112.91f, 32.0f, 4.57f, 151.13f, 0.0f, 288.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(48.0f, 288.0f)
                curveToRelative(0.0f, -114.67f, 93.33f, -207.8f, 208.0f, -207.82f)
                curveToRelative(114.67f, 0.02f, 208.0f, 93.15f, 208.0f, 207.82f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(512.0f, 288.0f)
                curveTo(507.43f, 151.13f, 399.09f, 32.0f, 256.0f, 32.0f)
                close()
            }
        }
        .build()
        return _headphonesAlt!!
    }

private var _headphonesAlt: ImageVector? = null
