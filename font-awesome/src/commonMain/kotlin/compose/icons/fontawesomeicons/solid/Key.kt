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

public val SolidGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 176.0f)
                curveTo(512.0f, 273.2f, 433.2f, 352.0f, 336.0f, 352.0f)
                curveToRelative(-11.22f, 0.0f, -22.19f, -1.06f, -32.83f, -3.07f)
                lineToRelative(-24.01f, 27.01f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 261.22f, 384.0f)
                horizontalLineTo(224.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 13.26f, -10.74f, 24.0f, -24.0f, 24.0f)
                horizontalLineToRelative(-40.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 13.26f, -10.74f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.74f, -24.0f, -24.0f)
                verticalLineToRelative(-78.06f)
                curveToRelative(0.0f, -6.36f, 2.53f, -12.47f, 7.03f, -16.97f)
                lineToRelative(161.8f, -161.8f)
                curveTo(163.11f, 213.81f, 160.0f, 195.27f, 160.0f, 176.0f)
                curveTo(160.0f, 78.8f, 238.8f, 0.0f, 336.0f, 0.0f)
                curveTo(433.49f, -0.0f, 512.0f, 78.51f, 512.0f, 176.0f)
                close()
                moveTo(336.0f, 128.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.49f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.49f, -48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
