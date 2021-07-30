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

public val SolidGroup.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.03f, 8.0f, 0.0f, 119.03f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(384.97f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(432.0f, 256.0f)
                curveToRelative(0.0f, 31.93f, -8.2f, 61.97f, -22.57f, 88.17f)
                lineTo(280.0f, 240.63f)
                lineTo(280.0f, 74.97f)
                curveToRelative(86.23f, 15.21f, 152.0f, 90.5f, 152.0f, 181.03f)
                close()
                moveTo(216.0f, 437.03f)
                curveToRelative(-33.86f, -5.97f, -64.49f, -21.2f, -89.29f, -43.02f)
                lineTo(216.0f, 322.57f)
                verticalLineToRelative(114.46f)
                close()
                moveTo(280.0f, 322.57f)
                lineTo(369.29f, 394.0f)
                curveToRelative(-24.8f, 21.82f, -55.43f, 37.05f, -89.29f, 43.02f)
                lineTo(280.0f, 322.57f)
                close()
                moveTo(216.0f, 74.97f)
                verticalLineToRelative(165.66f)
                lineTo(86.57f, 344.17f)
                curveTo(72.2f, 317.97f, 64.0f, 287.93f, 64.0f, 256.0f)
                curveToRelative(0.0f, -90.53f, 65.77f, -165.82f, 152.0f, -181.03f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
