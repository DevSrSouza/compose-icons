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

public val SolidGroup.CediSign: ImageVector
    get() {
        if (_cediSign != null) {
            return _cediSign!!
        }
        _cediSign = Builder(name = "CediSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineTo(66.7f)
                curveTo(101.2f, 81.9f, 32.0f, 160.9f, 32.0f, 256.0f)
                reflectiveCurveToRelative(69.2f, 174.1f, 160.0f, 189.3f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(445.3f)
                curveToRelative(30.9f, -5.2f, 59.2f, -17.7f, 83.2f, -35.8f)
                curveToRelative(14.1f, -10.6f, 17.0f, -30.7f, 6.4f, -44.8f)
                reflectiveCurveToRelative(-30.7f, -17.0f, -44.8f, -6.4f)
                curveToRelative(-13.2f, 9.9f, -28.3f, 17.3f, -44.8f, 21.6f)
                verticalLineTo(132.0f)
                curveToRelative(16.4f, 4.2f, 31.6f, 11.6f, 44.8f, 21.6f)
                curveToRelative(14.1f, 10.6f, 34.2f, 7.8f, 44.8f, -6.4f)
                reflectiveCurveToRelative(7.8f, -34.2f, -6.4f, -44.8f)
                curveToRelative(-24.0f, -18.0f, -52.4f, -30.6f, -83.2f, -35.8f)
                verticalLineTo(32.0f)
                close()
                moveTo(192.0f, 132.0f)
                verticalLineTo(380.0f)
                curveToRelative(-55.2f, -14.2f, -96.0f, -64.3f, -96.0f, -124.0f)
                reflectiveCurveToRelative(40.8f, -109.8f, 96.0f, -124.0f)
                close()
            }
        }
        .build()
        return _cediSign!!
    }

private var _cediSign: ImageVector? = null
