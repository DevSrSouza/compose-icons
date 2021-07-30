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

public val SolidGroup.VrCardboard: ImageVector
    get() {
        if (_vrCardboard != null) {
            return _vrCardboard!!
        }
        _vrCardboard = Builder(name = "VrCardboard", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(608.0f, 64.0f)
                lineTo(32.0f, 64.0f)
                curveTo(14.33f, 64.0f, 0.0f, 78.33f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(160.22f)
                curveToRelative(25.19f, 0.0f, 48.03f, -14.77f, 58.36f, -37.74f)
                lineToRelative(27.74f, -61.64f)
                curveTo(286.21f, 331.08f, 302.35f, 320.0f, 320.0f, 320.0f)
                reflectiveCurveToRelative(33.79f, 11.08f, 41.68f, 28.62f)
                lineToRelative(27.74f, 61.64f)
                curveTo(399.75f, 433.23f, 422.6f, 448.0f, 447.78f, 448.0f)
                lineTo(608.0f, 448.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(640.0f, 96.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(160.0f, 304.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, -28.65f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.65f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.65f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.65f, 64.0f, -64.0f, 64.0f)
                close()
                moveTo(480.0f, 304.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, -28.65f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.65f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.65f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.65f, 64.0f, -64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _vrCardboard!!
    }

private var _vrCardboard: ImageVector? = null
