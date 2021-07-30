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

public val SolidGroup.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 256.0f)
                curveToRelative(44.11f, 0.0f, 80.0f, -35.89f, 80.0f, -80.0f)
                reflectiveCurveToRelative(-35.89f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveToRelative(-80.0f, 35.89f, -80.0f, 80.0f)
                reflectiveCurveToRelative(35.89f, 80.0f, 80.0f, 80.0f)
                close()
                moveTo(528.0f, 128.0f)
                lineTo(304.0f, 128.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(144.0f)
                lineTo(64.0f, 288.0f)
                lineTo(64.0f, 80.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                lineTo(16.0f, 64.0f)
                curveTo(7.16f, 64.0f, 0.0f, 71.16f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-48.0f)
                horizontalLineToRelative(512.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(640.0f, 240.0f)
                curveToRelative(0.0f, -61.86f, -50.14f, -112.0f, -112.0f, -112.0f)
                close()
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
