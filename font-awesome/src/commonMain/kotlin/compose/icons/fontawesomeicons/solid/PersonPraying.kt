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

public val SolidGroup.PersonPraying: ImageVector
    get() {
        if (_personPraying != null) {
            return _personPraying!!
        }
        _personPraying = Builder(name = "PersonPraying", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 64.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 224.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 128.0f, 0.0f)
                close()
                moveTo(232.7f, 264.0f)
                lineToRelative(22.9f, 31.5f)
                curveToRelative(6.5f, 8.9f, 16.3f, 14.7f, 27.2f, 16.1f)
                reflectiveCurveToRelative(21.9f, -1.7f, 30.4f, -8.7f)
                lineToRelative(88.0f, -72.0f)
                curveToRelative(17.1f, -14.0f, 19.6f, -39.2f, 5.6f, -56.3f)
                reflectiveCurveToRelative(-39.2f, -19.6f, -56.3f, -5.6f)
                lineToRelative(-55.2f, 45.2f)
                lineToRelative(-26.2f, -36.0f)
                curveTo(253.6f, 156.7f, 228.6f, 144.0f, 202.0f, 144.0f)
                curveToRelative(-30.9f, 0.0f, -59.2f, 17.1f, -73.6f, 44.4f)
                lineTo(79.8f, 280.9f)
                curveToRelative(-20.2f, 38.5f, -9.4f, 85.9f, 25.6f, 111.8f)
                lineTo(158.6f, 432.0f)
                horizontalLineTo(72.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                reflectiveCurveToRelative(17.9f, 40.0f, 40.0f, 40.0f)
                horizontalLineTo(280.0f)
                curveToRelative(17.3f, 0.0f, 32.6f, -11.1f, 38.0f, -27.5f)
                reflectiveCurveToRelative(-0.3f, -34.4f, -14.2f, -44.7f)
                lineTo(187.7f, 354.0f)
                lineToRelative(45.0f, -90.0f)
                close()
            }
        }
        .build()
        return _personPraying!!
    }

private var _personPraying: ImageVector? = null
