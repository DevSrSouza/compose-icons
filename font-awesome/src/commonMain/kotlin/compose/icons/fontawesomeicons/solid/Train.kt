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

public val SolidGroup.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                verticalLineToRelative(256.0f)
                curveToRelative(0.0f, 51.815f, -61.624f, 96.0f, -130.022f, 96.0f)
                lineToRelative(62.98f, 49.721f)
                curveTo(386.905f, 502.417f, 383.562f, 512.0f, 376.0f, 512.0f)
                lineTo(72.0f, 512.0f)
                curveToRelative(-7.578f, 0.0f, -10.892f, -9.594f, -4.957f, -14.279f)
                lineTo(130.022f, 448.0f)
                curveTo(61.82f, 448.0f, 0.0f, 403.954f, 0.0f, 352.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 42.981f, 64.0f, 0.0f, 128.0f, 0.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(65.0f, 0.0f, 128.0f, 42.981f, 128.0f, 96.0f)
                close()
                moveTo(400.0f, 232.0f)
                lineTo(400.0f, 120.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                lineTo(72.0f, 96.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(304.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                close()
                moveTo(224.0f, 296.0f)
                curveToRelative(-30.928f, 0.0f, -56.0f, 25.072f, -56.0f, 56.0f)
                reflectiveCurveToRelative(25.072f, 56.0f, 56.0f, 56.0f)
                reflectiveCurveToRelative(56.0f, -25.072f, 56.0f, -56.0f)
                reflectiveCurveToRelative(-25.072f, -56.0f, -56.0f, -56.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
