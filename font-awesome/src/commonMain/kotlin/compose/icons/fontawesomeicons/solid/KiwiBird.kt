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

public val SolidGroup.KiwiBird: ImageVector
    get() {
        if (_kiwiBird != null) {
            return _kiwiBird!!
        }
        _kiwiBird = Builder(name = "KiwiBird", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(291.2f, 388.4f)
                curveToRelative(31.2f, -18.8f, 64.7f, -36.4f, 101.1f, -36.4f)
                horizontalLineTo(448.0f)
                curveToRelative(4.6f, 0.0f, 9.1f, -0.2f, 13.6f, -0.7f)
                lineToRelative(85.3f, 121.9f)
                curveToRelative(4.0f, 5.7f, 11.3f, 8.2f, 17.9f, 6.1f)
                reflectiveCurveToRelative(11.2f, -8.3f, 11.2f, -15.3f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -70.7f, -57.3f, -128.0f, -128.0f, -128.0f)
                horizontalLineTo(392.3f)
                curveToRelative(-36.4f, 0.0f, -69.9f, -17.6f, -101.1f, -36.4f)
                curveTo(262.3f, 42.1f, 228.3f, 32.0f, 192.0f, 32.0f)
                curveTo(86.0f, 32.0f, 0.0f, 118.0f, 0.0f, 224.0f)
                curveToRelative(0.0f, 71.1f, 38.6f, 133.1f, 96.0f, 166.3f)
                verticalLineTo(456.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(410.0f)
                curveToRelative(15.3f, 3.9f, 31.4f, 6.0f, 48.0f, 6.0f)
                curveToRelative(5.4f, 0.0f, 10.7f, -0.2f, 16.0f, -0.7f)
                verticalLineTo(456.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(405.1f)
                curveToRelative(12.4f, -4.4f, 24.2f, -10.0f, 35.2f, -16.7f)
                close()
                moveTo(448.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _kiwiBird!!
    }

private var _kiwiBird: ImageVector? = null
