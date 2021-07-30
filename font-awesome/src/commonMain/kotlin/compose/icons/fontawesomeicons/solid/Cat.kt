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

public val SolidGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(290.59f, 192.0f)
                curveToRelative(-20.18f, 0.0f, -106.82f, 1.98f, -162.59f, 85.95f)
                lineTo(128.0f, 192.0f)
                curveToRelative(0.0f, -52.94f, -43.06f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.33f, 32.0f, 32.0f, 32.0f)
                curveToRelative(17.64f, 0.0f, 32.0f, 14.36f, 32.0f, 32.0f)
                verticalLineToRelative(256.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(176.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-32.0f)
                lineToRelative(128.0f, -96.0f)
                verticalLineToRelative(144.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(448.0f, 289.86f)
                curveToRelative(-10.29f, 2.67f, -20.89f, 4.54f, -32.0f, 4.54f)
                curveToRelative(-61.81f, 0.0f, -113.52f, -44.05f, -125.41f, -102.4f)
                close()
                moveTo(448.0f, 96.0f)
                horizontalLineToRelative(-64.0f)
                lineToRelative(-64.0f, -64.0f)
                verticalLineToRelative(134.4f)
                curveToRelative(0.0f, 53.02f, 42.98f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -42.98f, 96.0f, -96.0f)
                lineTo(512.0f, 32.0f)
                lineToRelative(-64.0f, 64.0f)
                close()
                moveTo(376.0f, 176.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.16f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(456.0f, 176.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.16f, 16.0f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
