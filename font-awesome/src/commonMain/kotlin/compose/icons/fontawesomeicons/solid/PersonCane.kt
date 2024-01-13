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

public val SolidGroup.PersonCane: ImageVector
    get() {
        if (_personCane != null) {
            return _personCane!!
        }
        _personCane = Builder(name = "PersonCane", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
                moveTo(264.0f, 235.3f)
                lineToRelative(47.4f, 57.1f)
                curveToRelative(11.3f, 13.6f, 31.5f, 15.5f, 45.1f, 4.2f)
                reflectiveCurveToRelative(15.5f, -31.5f, 4.2f, -45.1f)
                lineToRelative(-73.7f, -88.9f)
                curveToRelative(-18.2f, -22.0f, -45.3f, -34.7f, -73.9f, -34.7f)
                lineTo(177.1f, 127.9f)
                curveToRelative(-33.7f, 0.0f, -64.9f, 17.7f, -82.3f, 46.6f)
                lineToRelative(-58.3f, 97.0f)
                curveToRelative(-9.1f, 15.1f, -4.2f, 34.8f, 10.9f, 43.9f)
                reflectiveCurveToRelative(34.8f, 4.2f, 43.9f, -10.9f)
                lineTo(120.0f, 256.9f)
                lineTo(120.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(184.0f, 352.0f)
                horizontalLineToRelative(16.0f)
                lineTo(200.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(264.0f, 235.3f)
                close()
                moveTo(352.0f, 376.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.6f, 8.0f, 8.0f)
                lineTo(368.0f, 488.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(416.0f, 376.0f)
                curveToRelative(0.0f, -30.9f, -25.1f, -56.0f, -56.0f, -56.0f)
                reflectiveCurveToRelative(-56.0f, 25.1f, -56.0f, 56.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _personCane!!
    }

private var _personCane: ImageVector? = null
