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

public val SolidGroup.IdCardAlt: ImageVector
    get() {
        if (_idCardAlt != null) {
            return _idCardAlt!!
        }
        _idCardAlt = Builder(name = "IdCardAlt", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(528.0f, 64.0f)
                lineTo(384.0f, 64.0f)
                verticalLineToRelative(96.0f)
                lineTo(192.0f, 160.0f)
                lineTo(192.0f, 64.0f)
                lineTo(48.0f, 64.0f)
                curveTo(21.5f, 64.0f, 0.0f, 85.5f, 0.0f, 112.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(480.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(576.0f, 112.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(288.0f, 224.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                close()
                moveTo(381.3f, 448.0f)
                lineTo(194.7f, 448.0f)
                curveToRelative(-10.4f, 0.0f, -18.8f, -10.0f, -15.6f, -19.8f)
                curveToRelative(8.3f, -25.6f, 32.4f, -44.2f, 60.9f, -44.2f)
                horizontalLineToRelative(8.2f)
                curveToRelative(12.3f, 5.1f, 25.7f, 8.0f, 39.8f, 8.0f)
                reflectiveCurveToRelative(27.6f, -2.9f, 39.8f, -8.0f)
                horizontalLineToRelative(8.2f)
                curveToRelative(28.4f, 0.0f, 52.5f, 18.5f, 60.9f, 44.2f)
                curveToRelative(3.2f, 9.8f, -5.2f, 19.8f, -15.6f, 19.8f)
                close()
                moveTo(352.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(128.0f)
                lineTo(352.0f, 32.0f)
                close()
            }
        }
        .build()
        return _idCardAlt!!
    }

private var _idCardAlt: ImageVector? = null
