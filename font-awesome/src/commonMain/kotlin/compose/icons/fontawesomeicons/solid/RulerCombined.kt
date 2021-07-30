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

public val SolidGroup.RulerCombined: ImageVector
    get() {
        if (_rulerCombined != null) {
            return _rulerCombined!!
        }
        _rulerCombined = Builder(name = "RulerCombined", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 288.0f)
                horizontalLineToRelative(-56.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(-56.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(56.0f)
                lineTo(160.0f, 96.0f)
                horizontalLineToRelative(-56.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                lineTo(96.0f, 72.0f)
                curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(56.0f)
                lineTo(160.0f, 32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 0.0f)
                curveTo(14.33f, 0.0f, 0.0f, 14.33f, 0.0f, 32.0f)
                verticalLineToRelative(448.0f)
                curveToRelative(0.0f, 2.77f, 0.91f, 5.24f, 1.57f, 7.8f)
                lineTo(160.0f, 329.38f)
                lineTo(160.0f, 288.0f)
                close()
                moveTo(480.0f, 352.0f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                verticalLineToRelative(-56.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                verticalLineToRelative(-56.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                verticalLineToRelative(-56.0f)
                horizontalLineToRelative(-41.37f)
                lineTo(24.2f, 510.43f)
                curveToRelative(2.56f, 0.66f, 5.04f, 1.57f, 7.8f, 1.57f)
                horizontalLineToRelative(448.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _rulerCombined!!
    }

private var _rulerCombined: ImageVector? = null
