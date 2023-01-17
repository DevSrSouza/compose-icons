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

public val SolidGroup.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) {
            return _bezierCurve!!
        }
        _bezierCurve = Builder(name = "BezierCurve", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 136.0f)
                lineTo(296.0f, 88.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                lineTo(296.0f, 136.0f)
                close()
                moveTo(288.0f, 32.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineToRelative(4.0f)
                lineTo(121.6f, 84.0f)
                curveTo(111.2f, 62.7f, 89.3f, 48.0f, 64.0f, 48.0f)
                curveTo(28.7f, 48.0f, 0.0f, 76.7f, 0.0f, 112.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                curveToRelative(25.3f, 0.0f, 47.2f, -14.7f, 57.6f, -36.0f)
                horizontalLineToRelative(66.9f)
                curveToRelative(-58.9f, 39.6f, -98.9f, 105.0f, -104.0f, 180.0f)
                lineTo(80.0f, 320.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(192.0f, 368.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                horizontalLineToRelative(-3.3f)
                curveToRelative(5.9f, -67.0f, 48.5f, -123.4f, 107.5f, -149.1f)
                curveToRelative(8.6f, 12.7f, 23.2f, 21.1f, 39.8f, 21.1f)
                horizontalLineToRelative(64.0f)
                curveToRelative(16.6f, 0.0f, 31.1f, -8.4f, 39.8f, -21.1f)
                curveToRelative(59.0f, 25.7f, 101.6f, 82.1f, 107.5f, 149.1f)
                lineTo(496.0f, 320.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(608.0f, 368.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-5.0f, -75.0f, -45.1f, -140.4f, -104.0f, -180.0f)
                horizontalLineToRelative(66.9f)
                curveToRelative(10.4f, 21.3f, 32.3f, 36.0f, 57.6f, 36.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                curveToRelative(-25.3f, 0.0f, -47.2f, 14.7f, -57.6f, 36.0f)
                lineTo(400.0f, 84.0f)
                lineTo(400.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(288.0f, 32.0f)
                close()
                moveTo(88.0f, 376.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                lineTo(88.0f, 424.0f)
                lineTo(88.0f, 376.0f)
                close()
                moveTo(504.0f, 424.0f)
                lineTo(504.0f, 376.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                lineTo(504.0f, 424.0f)
                close()
            }
        }
        .build()
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
