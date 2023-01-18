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

public val RemixIcons.ClosedCaptioningFill: ImageVector
    get() {
        if (_closedCaptioningFill != null) {
            return _closedCaptioningFill!!
        }
        _closedCaptioningFill = Builder(name = "ClosedCaptioningFill", defaultWidth = 24.0.dp,
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
                moveTo(9.0f, 8.0f)
                curveToRelative(-2.208f, 0.0f, -4.0f, 1.792f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.792f, 4.0f, 4.0f, 4.0f)
                curveToRelative(1.1f, 0.0f, 2.1f, -0.45f, 2.828f, -1.172f)
                lineToRelative(-1.414f, -1.414f)
                curveTo(10.053f, 13.776f, 9.553f, 14.0f, 9.0f, 14.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.55f, 0.0f, 1.048f, 0.22f, 1.415f, 0.587f)
                lineToRelative(1.414f, -1.414f)
                curveTo(11.105f, 8.448f, 10.105f, 8.0f, 9.0f, 8.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveToRelative(-2.208f, 0.0f, -4.0f, 1.792f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.792f, 4.0f, 4.0f, 4.0f)
                curveToRelative(1.104f, 0.0f, 2.104f, -0.448f, 2.828f, -1.172f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(-0.362f, 0.362f, -0.862f, 0.586f, -1.414f, 0.586f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.553f, 0.0f, 1.053f, 0.224f, 1.415f, 0.587f)
                lineToRelative(1.414f, -1.414f)
                curveTo(18.105f, 8.448f, 17.105f, 8.0f, 16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _closedCaptioningFill!!
    }

private var _closedCaptioningFill: ImageVector? = null
