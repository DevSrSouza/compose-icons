package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ClosedCaptioningLine: ImageVector
    get() {
        if (_closedCaptioningLine != null) {
            return _closedCaptioningLine!!
        }
        _closedCaptioningLine = Builder(name = "ClosedCaptioningLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 5.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveToRelative(1.105f, 0.0f, 2.105f, 0.448f, 2.829f, 1.173f)
                lineToRelative(-1.414f, 1.414f)
                curveTo(10.053f, 10.224f, 9.553f, 10.0f, 9.0f, 10.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.553f, 0.0f, 1.053f, -0.224f, 1.414f, -0.586f)
                lineToRelative(1.414f, 1.414f)
                curveTo(11.104f, 15.552f, 10.104f, 16.0f, 9.0f, 16.0f)
                curveToRelative(-2.208f, 0.0f, -4.0f, -1.792f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.792f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveToRelative(1.105f, 0.0f, 2.105f, 0.448f, 2.829f, 1.173f)
                lineToRelative(-1.414f, 1.414f)
                curveTo(17.053f, 10.224f, 16.553f, 10.0f, 16.0f, 10.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.552f, 0.0f, 1.052f, -0.224f, 1.414f, -0.586f)
                lineToRelative(1.414f, 1.414f)
                curveTo(18.104f, 15.552f, 17.104f, 16.0f, 16.0f, 16.0f)
                curveToRelative(-2.208f, 0.0f, -4.0f, -1.792f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.792f, -4.0f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _closedCaptioningLine!!
    }

private var _closedCaptioningLine: ImageVector? = null
