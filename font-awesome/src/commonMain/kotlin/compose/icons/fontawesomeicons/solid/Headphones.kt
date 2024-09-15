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

public val SolidGroup.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones = Builder(name = "Headphones", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(114.52f, 32.0f, 0.0f, 146.5f, 0.0f, 288.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 17.69f, 28.62f)
                lineToRelative(14.38f, 7.19f)
                curveTo(34.08f, 431.9f, 83.42f, 480.0f, 144.0f, 480.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineTo(280.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-24.0f)
                curveToRelative(-31.34f, 0.0f, -59.67f, 12.88f, -80.0f, 33.63f)
                verticalLineTo(288.0f)
                curveToRelative(0.0f, -105.87f, 86.13f, -192.0f, 192.0f, -192.0f)
                reflectiveCurveToRelative(192.0f, 86.13f, 192.0f, 192.0f)
                verticalLineToRelative(1.63f)
                curveTo(427.67f, 268.88f, 399.34f, 256.0f, 368.0f, 256.0f)
                horizontalLineToRelative(-24.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(176.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(60.58f, 0.0f, 109.92f, -48.1f, 111.93f, -108.19f)
                lineToRelative(14.38f, -7.19f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 512.0f, 336.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -141.48f, -114.5f, -256.0f, -256.0f, -256.0f)
                close()
            }
        }
        .build()
        return _headphones!!
    }

private var _headphones: ImageVector? = null
