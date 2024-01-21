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

public val SolidGroup.HelicopterSymbol: ImageVector
    get() {
        if (_helicopterSymbol != null) {
            return _helicopterSymbol!!
        }
        _helicopterSymbol = Builder(name = "HelicopterSymbol", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(445.3f, 224.0f)
                lineTo(510.0f, 224.0f)
                curveTo(495.6f, 108.2f, 403.8f, 16.4f, 288.0f, 2.0f)
                lineTo(288.0f, 66.7f)
                curveTo(368.4f, 80.1f, 431.9f, 143.6f, 445.3f, 224.0f)
                close()
                moveTo(510.0f, 288.0f)
                lineTo(445.3f, 288.0f)
                curveTo(431.9f, 368.4f, 368.4f, 431.9f, 288.0f, 445.4f)
                lineTo(288.0f, 510.0f)
                curveToRelative(115.8f, -14.4f, 207.6f, -106.2f, 222.0f, -222.0f)
                close()
                moveTo(2.0f, 288.0f)
                curveTo(16.4f, 403.8f, 108.2f, 495.6f, 224.0f, 510.0f)
                lineTo(224.0f, 445.4f)
                curveTo(143.6f, 431.9f, 80.1f, 368.4f, 66.7f, 288.0f)
                lineTo(2.0f, 288.0f)
                close()
                moveTo(2.0f, 224.0f)
                lineTo(66.7f, 224.0f)
                curveTo(80.1f, 143.6f, 143.6f, 80.1f, 224.0f, 66.7f)
                lineTo(224.0f, 2.0f)
                curveTo(108.2f, 16.4f, 16.4f, 108.2f, 2.0f, 224.0f)
                close()
                moveTo(208.0f, 160.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(144.0f, 352.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(208.0f, 288.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(368.0f, 160.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                lineTo(208.0f, 224.0f)
                lineTo(208.0f, 160.0f)
                close()
            }
        }
        .build()
        return _helicopterSymbol!!
    }

private var _helicopterSymbol: ImageVector? = null
