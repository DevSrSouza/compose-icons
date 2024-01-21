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

public val SolidGroup.CentSign: ImageVector
    get() {
        if (_centSign != null) {
            return _centSign!!
        }
        _centSign = Builder(name = "CentSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(66.7f)
                curveToRelative(30.9f, 5.2f, 59.2f, 17.7f, 83.2f, 35.8f)
                curveToRelative(14.1f, 10.6f, 17.0f, 30.7f, 6.4f, 44.8f)
                reflectiveCurveToRelative(-30.7f, 17.0f, -44.8f, 6.4f)
                curveTo(279.4f, 137.5f, 252.9f, 128.0f, 224.0f, 128.0f)
                curveToRelative(-70.7f, 0.0f, -128.0f, 57.3f, -128.0f, 128.0f)
                reflectiveCurveToRelative(57.3f, 128.0f, 128.0f, 128.0f)
                curveToRelative(28.9f, 0.0f, 55.4f, -9.5f, 76.8f, -25.6f)
                curveToRelative(14.1f, -10.6f, 34.2f, -7.8f, 44.8f, 6.4f)
                reflectiveCurveToRelative(7.8f, 34.2f, -6.4f, 44.8f)
                curveToRelative(-24.0f, 18.0f, -52.4f, 30.6f, -83.2f, 35.8f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(445.3f)
                curveTo(101.2f, 430.1f, 32.0f, 351.1f, 32.0f, 256.0f)
                reflectiveCurveToRelative(69.2f, -174.1f, 160.0f, -189.3f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _centSign!!
    }

private var _centSign: ImageVector? = null
