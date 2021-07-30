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
                curveTo(114.52f, 32.0f, 0.0f, 146.496f, 0.0f, 288.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 17.689f, 28.622f)
                lineToRelative(14.383f, 7.191f)
                curveTo(34.083f, 431.903f, 83.421f, 480.0f, 144.0f, 480.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineTo(280.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-24.0f)
                curveToRelative(-31.342f, 0.0f, -59.671f, 12.879f, -80.0f, 33.627f)
                verticalLineTo(288.0f)
                curveToRelative(0.0f, -105.869f, 86.131f, -192.0f, 192.0f, -192.0f)
                reflectiveCurveToRelative(192.0f, 86.131f, 192.0f, 192.0f)
                verticalLineToRelative(1.627f)
                curveTo(427.671f, 268.879f, 399.342f, 256.0f, 368.0f, 256.0f)
                horizontalLineToRelative(-24.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(176.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(60.579f, 0.0f, 109.917f, -48.098f, 111.928f, -108.187f)
                lineToRelative(14.382f, -7.191f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 512.0f, 336.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -141.479f, -114.496f, -256.0f, -256.0f, -256.0f)
                close()
            }
        }
        .build()
        return _headphones!!
    }

private var _headphones: ImageVector? = null
