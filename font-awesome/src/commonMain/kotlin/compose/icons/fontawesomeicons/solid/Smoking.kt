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

public val SolidGroup.Smoking: ImageVector
    get() {
        if (_smoking != null) {
            return _smoking!!
        }
        _smoking = Builder(name = "Smoking", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 32.0f)
                lineTo(448.0f, 43.0f)
                curveToRelative(0.0f, 38.2f, 15.2f, 74.8f, 42.2f, 101.8f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(21.0f, 21.0f, 32.8f, 49.5f, 32.8f, 79.2f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(480.0f, 245.0f)
                curveToRelative(0.0f, -12.7f, -5.1f, -24.9f, -14.1f, -33.9f)
                lineToRelative(-21.0f, -21.0f)
                curveTo(405.9f, 151.1f, 384.0f, 98.1f, 384.0f, 43.0f)
                lineTo(384.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                close()
                moveTo(576.0f, 256.0f)
                lineTo(576.0f, 245.0f)
                curveToRelative(0.0f, -38.2f, -15.2f, -74.8f, -42.2f, -101.8f)
                lineToRelative(-21.0f, -21.0f)
                curveToRelative(-21.0f, -21.0f, -32.8f, -49.5f, -32.8f, -79.2f)
                lineTo(480.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(544.0f, 43.0f)
                curveToRelative(0.0f, 12.7f, 5.1f, 24.9f, 14.1f, 33.9f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(39.0f, 39.0f, 60.9f, 91.9f, 60.9f, 147.1f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(0.0f, 416.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineTo(416.0f, 352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 416.0f)
                close()
                moveTo(224.0f, 416.0f)
                verticalLineToRelative(32.0f)
                lineTo(384.0f, 448.0f)
                lineTo(384.0f, 416.0f)
                lineTo(224.0f, 416.0f)
                close()
                moveTo(512.0f, 352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(480.0f, 384.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(608.0f, 352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(576.0f, 384.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _smoking!!
    }

private var _smoking: ImageVector? = null
