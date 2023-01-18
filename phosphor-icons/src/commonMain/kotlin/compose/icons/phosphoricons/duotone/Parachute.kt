package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Parachute: ImageVector
    get() {
        if (_parachute != null) {
            return _parachute!!
        }
        _parachute = Builder(name = "Parachute", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                reflectiveCurveTo(88.0f, 48.0f, 88.0f, 120.0f)
                lineTo(32.0f, 120.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 24.0f)
                reflectiveCurveToRelative(40.0f, 24.0f, 40.0f, 96.0f)
                horizontalLineToRelative(56.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 120.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 16.0f)
                horizontalLineToRelative(0.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 24.0f, 120.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 3.2f, 6.4f)
                horizontalLineToRelative(0.0f)
                lineTo(120.0f, 196.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(136.0f, 196.0f)
                lineToRelative(92.8f, -69.6f)
                horizontalLineToRelative(0.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 232.0f, 120.0f)
                close()
                moveTo(215.6f, 112.0f)
                lineTo(175.8f, 112.0f)
                curveToRelative(-1.5f, -37.9f, -13.9f, -62.4f, -25.1f, -77.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 215.6f, 112.0f)
                close()
                moveTo(128.0f, 34.0f)
                arcToRelative(79.2f, 79.2f, 0.0f, false, true, 13.9f, 16.3f)
                curveToRelative(7.6f, 11.6f, 16.5f, 31.6f, 17.9f, 61.7f)
                lineTo(96.2f, 112.0f)
                curveToRelative(1.4f, -30.1f, 10.3f, -50.1f, 17.9f, -61.7f)
                arcTo(76.5f, 76.5f, 0.0f, false, true, 128.0f, 34.0f)
                close()
                moveTo(154.4f, 128.0f)
                lineTo(128.0f, 175.5f)
                lineTo(101.6f, 128.0f)
                close()
                moveTo(83.3f, 128.0f)
                lineTo(102.8f, 163.1f)
                lineTo(56.0f, 128.0f)
                close()
                moveTo(172.7f, 128.0f)
                lineTo(200.0f, 128.0f)
                lineToRelative(-46.8f, 35.1f)
                close()
                moveTo(105.3f, 35.0f)
                curveTo(94.1f, 49.6f, 81.7f, 74.1f, 80.2f, 112.0f)
                lineTo(40.4f, 112.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 105.3f, 35.0f)
                close()
            }
        }
        .build()
        return _parachute!!
    }

private var _parachute: ImageVector? = null
